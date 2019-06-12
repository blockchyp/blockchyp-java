package com.blockchyp.client;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.httpclient.ConnectTimeoutException;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.DeleteMethod;
import org.apache.commons.httpclient.methods.EntityEnclosingMethod;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.PutMethod;
import org.apache.commons.httpclient.methods.StringRequestEntity;
import org.apache.commons.lang.StringUtils;
import org.bouncycastle.util.encoders.Hex;

import com.blockchyp.client.crypto.CryptoUtils;
import com.blockchyp.client.dto.APICredentials;
import com.blockchyp.client.dto.Acknowledgement;
import com.blockchyp.client.dto.AuthorizationRequest;
import com.blockchyp.client.dto.AuthorizationResponse;
import com.blockchyp.client.dto.BooleanPromptRequest;
import com.blockchyp.client.dto.BooleanPromptResponse;
import com.blockchyp.client.dto.CaptureRequest;
import com.blockchyp.client.dto.CaptureResponse;
import com.blockchyp.client.dto.ClearTerminalRequest;
import com.blockchyp.client.dto.CloseBatchRequest;
import com.blockchyp.client.dto.CloseBatchResponse;
import com.blockchyp.client.dto.CoreRequest;
import com.blockchyp.client.dto.HeartbeatResponse;
import com.blockchyp.client.dto.ITerminalReference;
import com.blockchyp.client.dto.MessageRequest;
import com.blockchyp.client.dto.PingRequest;
import com.blockchyp.client.dto.RefundRequest;
import com.blockchyp.client.dto.TerminalRequest;
import com.blockchyp.client.dto.TerminalRouteResponse;
import com.blockchyp.client.dto.TextPromptRequest;
import com.blockchyp.client.dto.TextPromptResponse;
import com.blockchyp.client.dto.TransactionDisplayRequest;
import com.blockchyp.client.dto.VoidRequest;
import com.blockchyp.client.dto.VoidResponse;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;


/**
 * This is the main class Java developers will interact with.  You can instantiate this class directly or use it with a dependency 
 * injection framework like Spring or Dropwizard.  Most developers will only need to inject credentials, but you may also want to override 
 * default endpoints if you're targeting non production BlockChyp systems (which is unlikely).
 * 
 * You can inject settings via the constructors or via setters depending on your preferences.
 * 
 * You'll also notice that we're not using generics or any features from Java 1.7 or later.  This is just to maintain as much backward compatibility
 * as possible with older systems (1.6 or later).  The underlying REST API's are invoked using commons-httpclient 3.1 and we use Jackson for json serialization.
 * 
 * @author jeffreydpayne
 *
 */

public class BlockChypClient {
    
	
	static final public String OFFLINE_CACHE = ".blockchyp_routes";
	static final public String OFFLINE_FIXED_KEY = "cb22789c9d5c344a10e0474f134db39e25eb3bbf5a1b1a5e89b507f15ea9519c";
	static final public long MS_PER_HOUR = 3600000;
    

	private String gatewayHost = "https://api.blockchyp.com";
    private String testGatewayHost = "https://test.blockchyp.com";
    private GatewayCredentials defaultCredentials;
    
    @SuppressWarnings("rawtypes")
	private Map routeCache = new HashMap();
    
    private boolean offlineRouteCacheEnabled = true;
    
    private String offlineRouteCacheLocation = null;
    
    private int connectionTimeout = 0;
    
    private int timeout = 0;
    
    private ObjectMapper objectMapper;
    
    private HttpClient gatewayClient;
    
    private HttpClient terminalClient;
    
    public BlockChypClient() {
        initObjectMapper();
    }
    
    public BlockChypClient(String gatewayHost) {
        this();
        this.gatewayHost = gatewayHost;
    }
    
    public BlockChypClient(GatewayCredentials defaultCredentials) {
        this();
        this.defaultCredentials = defaultCredentials;
    }
    
    public BlockChypClient(String gatewayHost, GatewayCredentials defaultCredentials) {
        this();
        this.gatewayHost = gatewayHost;
        this.defaultCredentials = defaultCredentials;
    }
    
    public BlockChypClient(String gatewayHost, String testGatewayHost, GatewayCredentials defaultCredentials) {
        this();
        this.gatewayHost = gatewayHost;
        this.testGatewayHost = testGatewayHost;
        this.defaultCredentials = defaultCredentials;
    }
    
    public void setGatewayHost(String gatewayHost) {
		this.gatewayHost = gatewayHost;
	}

	public void setTestGatewayHost(String testGatewayHost) {
		this.testGatewayHost = testGatewayHost;
	}

	public void setDefaultCredentials(GatewayCredentials defaultCredentials) {
		this.defaultCredentials = defaultCredentials;
	}
    
    public void setOfflineRouteCacheEnabled(boolean offlineRouteCacheEnabled) {
		this.offlineRouteCacheEnabled = offlineRouteCacheEnabled;
	}

	protected void initObjectMapper() {
        objectMapper = new com.fasterxml.jackson.databind.ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }
    

    public HeartbeatResponse heartbeat(boolean test) throws Exception {
        
        return (HeartbeatResponse)getGateway("/api/heartbeat", test, HeartbeatResponse.class);
        
    }
    
    
    public Acknowledgement ping(PingRequest request) throws Exception {
        
        return (Acknowledgement)postTerminal("/api/test", request, Acknowledgement.class);
        
    }
    
    public AuthorizationResponse charge(AuthorizationRequest request) throws Exception {
        
    	if (isTerminalRouted(request)) {
    		return (AuthorizationResponse)postTerminal("/api/charge", request, AuthorizationResponse.class);
    	} else {
    		return (AuthorizationResponse)postGateway("/api/charge", request, AuthorizationResponse.class);
    	}
        
    }
    
    public AuthorizationResponse reverse(AuthorizationRequest request) throws Exception {
        
    	return (AuthorizationResponse)postGateway("/api/reverse", request, AuthorizationResponse.class);
        
    }
    
    
    public CloseBatchResponse closeBatch(CloseBatchRequest request) throws Exception {
        
    	return (CloseBatchResponse)postGateway("/api/close-batch", request, CloseBatchResponse.class);
        
    }
    
    public AuthorizationResponse refund(RefundRequest request) throws Exception {
    	
    	if (isTerminalRouted(request)) {
    		return (AuthorizationResponse)postTerminal("/api/refund", request, AuthorizationResponse.class);
    	} else {
    		return (AuthorizationResponse)postGateway("/api/refund", request, AuthorizationResponse.class);
    	}
        
    }
    
    public AuthorizationResponse preauth(AuthorizationRequest request) throws Exception {
    	
    	if (isTerminalRouted(request)) {
    		return (AuthorizationResponse)postTerminal("/api/preauth", request, AuthorizationResponse.class);
    	} else {
    		return (AuthorizationResponse)postGateway("/api/preauth", request, AuthorizationResponse.class);
    	}
        
    }
    
    public Acknowledgement message(MessageRequest request) throws Exception {
    	
    	if (isTerminalRouted(request)) {
    		return (Acknowledgement)postTerminal("/api/message", request, Acknowledgement.class);
    	} else {
    		return (Acknowledgement)postGateway("/api/message", request, Acknowledgement.class);
    	}
        
    }
    
    
    
    public TextPromptResponse textPrompt(TextPromptRequest request) throws Exception {
    	
    	if (isTerminalRouted(request)) {
    		return (TextPromptResponse)postTerminal("/api/text-prompt", request, TextPromptResponse.class);
    	} else {
    		return (TextPromptResponse)postGateway("/api/text-prompt", request, TextPromptResponse.class);
    	}
        
    }
    
    
    public BooleanPromptResponse booleanPrompt(BooleanPromptRequest request) throws Exception {
    	
    	if (isTerminalRouted(request)) {
    		return (BooleanPromptResponse)postTerminal("/api/boolean-prompt", request, BooleanPromptResponse.class);
    	} else {
    		return (BooleanPromptResponse)postGateway("/api/boolean-prompt", request, BooleanPromptResponse.class);
    	}
        
    }
    
    
    public Acknowledgement newTransactionDisplay(TransactionDisplayRequest request) throws Exception {
    	
    	if (isTerminalRouted(request)) {
    		return (Acknowledgement)postTerminal("/api/txdisplay", request, Acknowledgement.class);
    	} else {
    		return (Acknowledgement)postGateway("/api/terminal-txdisplay", request, Acknowledgement.class);
    	}
        
    }
    
    
    public Acknowledgement clear(ClearTerminalRequest request) throws Exception {
    	
    	if (isTerminalRouted(request)) {
    		return (Acknowledgement)postTerminal("/api/clear", request, Acknowledgement.class);
    	} else {
    		return (Acknowledgement)postGateway("/api/terminal-clear", request, Acknowledgement.class);
    	}
        
    }
    
    
    
    public Acknowledgement updateTransactionDisplay(TransactionDisplayRequest request) throws Exception {
    	
    	if (isTerminalRouted(request)) {
    		return (Acknowledgement)putTerminal("/api/txdisplay", request, Acknowledgement.class);
    	} else {
    		return (Acknowledgement)putGateway("/api/terminal-txdisplay", request, Acknowledgement.class);
    	}
        
    }
    
    
    public CaptureResponse capture(CaptureRequest request) throws Exception {
        
        return (CaptureResponse)postGateway("/api/capture", request, CaptureResponse.class);
        
    }
    
    public VoidResponse voidTx(VoidRequest request) throws Exception {
        
        return (VoidResponse)postGateway("/api/void", request, VoidResponse.class);
        
    }
    
    protected APICredentials decrypt(APICredentials creds) {
    	CryptoUtils crypto = CryptoUtils.getInstance();
    	
    	APICredentials results = new APICredentials();
    	
    	byte[] key = deriveOfflineKey();
    	try {
    		
    		results.setApiKey(crypto.decrypt(creds.getApiKey(), key));
    		results.setBearerToken(crypto.decrypt(creds.getBearerToken(), key));
    		results.setSigningKey(crypto.decrypt(creds.getSigningKey(), key));
    		
    	} catch (Exception e) {
    		throw new RuntimeException(e);
    	}
    	
    	return results;
    }
    
    protected APICredentials encrypt(APICredentials creds) {
    	
    	CryptoUtils crypto = CryptoUtils.getInstance();
    	
    	APICredentials results = new APICredentials();
    	
    	byte[] key = deriveOfflineKey();
    	try {
    		results.setApiKey(crypto.encrypt(creds.getApiKey(), key));
    		results.setBearerToken(crypto.encrypt(creds.getBearerToken(), key));
    		results.setSigningKey(crypto.encrypt(creds.getSigningKey(), key));
    	} catch (Exception e) {
    		throw new RuntimeException(e);
    	}
    	
    	return results;
    }
    
    protected byte[] deriveOfflineKey() {
    	
    	MessageDigest md = DigestUtils.getSha1Digest();
    	md.digest(Hex.decode(OFFLINE_FIXED_KEY));
    	return Arrays.copyOfRange(md.digest(Hex.decode(defaultCredentials.getSigningKey())), 0, 16);    	
    	
    }
    
	protected TerminalRouteResponse routeCacheGet(String terminalName) {
    	
    	TerminalRouteResponse route = (TerminalRouteResponse)routeCache.get(toTerminalRouteKey(terminalName));
        if (route != null) {
            return route;
        }
        
        if (offlineRouteCacheEnabled) {
        	route = getOfflineCache(terminalName);
        }
    	
    	return route;
    }
    
    @SuppressWarnings({ "unchecked" })
	protected TerminalRouteResponse routeCachePut(TerminalRouteResponse route) {
  
        routeCache.put(defaultCredentials.getApiKey() + route.getTerminalName(), route);

    	if (offlineRouteCacheEnabled) {
    		try {
    			//we clone this because we're going to store a version of it with transient creds encrypted
	    		TerminalRouteResponse offlineRoute = (TerminalRouteResponse)BeanUtils.cloneBean(route);
	    		offlineRoute.setTransientCredentials(encrypt(route.getTransientCredentials()));
	    		
	    		File offlineFile = new File(resolveOfflineRouteCacheLocation(route.getTerminalName()));
	    		FileWriter writer = new FileWriter(offlineFile);
	    		objectMapper.writeValue(writer, offlineRoute);
	    		
    		} catch (Exception e) {
    			throw new RuntimeException(e);
    		}
    		
    	}
    	return null;
    }
    
    protected String toTerminalRouteKey(String terminalName)  {
    	
    	return defaultCredentials.getApiKey() + terminalName;
    	
    }
    
	protected TerminalRouteResponse resolveTerminalRoute(String terminalName) {
		
		if (StringUtils.isEmpty(terminalName)) {
			return null;
		}
        
        TerminalRouteResponse route = routeCacheGet(terminalName);
        
        TerminalRouteResponse fallbackRoute = null;  //fallback to stale cache if route lookup fails
        
        if (route != null) {
        	fallbackRoute = route;
        	long expiry = route.getTimestamp().getTime() + 3600000;
        	if (System.currentTimeMillis() > expiry) {
        		route = null;
        	}	
        }
        
        if (route == null) {
        	try {
        		route = (TerminalRouteResponse)getGateway("/api/terminal-route?terminal=" + URLEncoder.encode(terminalName, "UTF-8"), false, TerminalRouteResponse.class);
	            if (route != null) {
	            	route.setTimestamp(new Date());
	            	routeCachePut(route);
	            }
	        }
        	catch (ConnectTimeoutException e) {
        		e.printStackTrace();
        		return fallbackRoute;
        	}
        	catch (Exception e) {
	            throw new RuntimeException(e);
	        }
        }
        
        return route;
        
        
    }
    
    protected HttpClient getGatewayClient() {
    	if (gatewayClient == null) {
    		gatewayClient = new HttpClient();
    		if (connectionTimeout > 0) {
    			gatewayClient.getHttpConnectionManager().getParams().setConnectionTimeout(connectionTimeout);  
    		}
    		if (timeout > 0) {
    			gatewayClient.getHttpConnectionManager().getParams().setSoTimeout(timeout);
    		}
    	}
    	return gatewayClient;
    }
    
    protected HttpClient getTerminalClient() {
    	if (terminalClient == null) {
    		terminalClient = new HttpClient();
    		if (connectionTimeout > 0) {
    			terminalClient.getHttpConnectionManager().getParams().setConnectionTimeout(connectionTimeout);  
    		}
    		if (timeout > 0) {
    			terminalClient.getHttpConnectionManager().getParams().setSoTimeout(timeout);
    		}
    	}
    	return terminalClient;
    }
    
    
    protected String resolveTerminalHost(TerminalRouteResponse route) {
        
        return "http://" + route.getIpAddress() + ":8080";
        
    }
    
    protected String toFullyQualifiedTerminalPath(TerminalRouteResponse route, String path) {
        
        return resolveTerminalHost(route) + path;
        
    }
    
    protected boolean isTerminalRouted(ITerminalReference terminalName)  {
    	
    	
    	TerminalRouteResponse route = resolveTerminalRoute(terminalName.getTerminalName());
    	
    	return StringUtils.isNotEmpty(terminalName.getTerminalName()) && !route.isCloudRelayEnabled();
    	
    }
    
    @SuppressWarnings({ "rawtypes" })
	protected Object cloudRelay(String path, Object request, Class responseType) throws Exception {
    	
    	return null;
    	
    }
    
    @SuppressWarnings({ "rawtypes", "unchecked" })
	protected Object finishTerminalRequest(TerminalRouteResponse route, Object request, EntityEnclosingMethod method, Class responseType) throws Exception {
    	
    	
    	TerminalRequest termRequest = newTerminalRequestForRoute(route);
        termRequest.setRequest(request);

        
        HttpClient client = getGatewayClient();
        StringRequestEntity requestEntity = new StringRequestEntity(
        		objectMapper.writeValueAsString(termRequest),
        	    "application/json",
        	    "UTF-8");
        
        method.setRequestEntity(requestEntity);

        try {
        	int status = client.executeMethod(method);
        	if (status != HttpStatus.SC_OK) {
        		throw new IOException(method.getStatusText());
        	}
        	return objectMapper.readValue(method.getResponseBodyAsStream(), responseType);
        }
        finally {
        	method.releaseConnection();
        }
        
    	
    	
    }
    
    @SuppressWarnings({ "rawtypes" })
   	protected Object putTerminal(String path, Object request, Class responseType) throws Exception {
    	
    	String terminalName = null;
		if (request instanceof ITerminalReference) {
			ITerminalReference ref = (ITerminalReference)request;
			terminalName = ref.getTerminalName();
		}

        TerminalRouteResponse route = resolveTerminalRoute(terminalName);

        PutMethod method = new PutMethod(resolveTerminalHost(route) + path);
       
        return finishTerminalRequest(route, request, method, responseType);
    	
    	
    	
    }
    
    protected TerminalRequest newTerminalRequestForRoute(TerminalRouteResponse route) {
    	
    	TerminalRequest termRequest = new TerminalRequest();

    	if ( (route.getTransientCredentials() != null) && StringUtils.isNotEmpty(route.getTransientCredentials().getApiKey())) {
    		termRequest.setApiKey(route.getTransientCredentials().getApiKey());
	        termRequest.setBearerToken(route.getTransientCredentials().getBearerToken());
	        termRequest.setSigningKey(route.getTransientCredentials().getSigningKey());
    	} else {
	        termRequest.setApiKey(defaultCredentials.getApiKey());
	        termRequest.setBearerToken(defaultCredentials.getBearerToken());
	        termRequest.setSigningKey(defaultCredentials.getSigningKey());
    	}
    	
    	return termRequest;
    	
    	
    }
    
    @SuppressWarnings({ "rawtypes", "unchecked" })
	protected Object deleteTerminal(String path, ITerminalReference request, Class responseType) throws Exception {
    	
    	
        TerminalRouteResponse route = resolveTerminalRoute(request.getTerminalName());

        DeleteMethod method = new DeleteMethod(resolveTerminalHost(route) + path);
       

    	TerminalRequest termRequest = newTerminalRequestForRoute(route);
    	
        termRequest.setRequest(request);

        
        HttpClient client = getGatewayClient();

        try {
        	int status = client.executeMethod(method);
        	if (status != HttpStatus.SC_OK) {
        		throw new IOException(method.getStatusText());
        	}
        	return objectMapper.readValue(method.getResponseBodyAsStream(), responseType);
        }
        finally {
        	method.releaseConnection();
        }
        
    }
    
    
    @SuppressWarnings({ "rawtypes" })
	protected Object postTerminal(String path, Object request, Class responseType) throws Exception {
    	
    	String terminalName = null;
		if (request instanceof ITerminalReference) {
			ITerminalReference ref = (ITerminalReference)request;
			terminalName = ref.getTerminalName();
		}

        TerminalRouteResponse route = resolveTerminalRoute(terminalName);

        PostMethod method = new PostMethod(resolveTerminalHost(route) + path);
       
        return finishTerminalRequest(route, request, method, responseType);
        
    }
    
    @SuppressWarnings({ "rawtypes" })
	protected Object getGateway(String path, boolean test, Class responseType) throws Exception {
        
       return getGateway(path, test, responseType, timeout);
        
    }

    
    @SuppressWarnings({ "rawtypes" })
	protected Object getGateway(String path, boolean test, Class responseType, int timeout) throws Exception {
        

        HttpMethod method = new GetMethod(toFullyQualifiedGatewayPath(path, test));
        if (timeout > 0) {
        	method.getParams().setSoTimeout(timeout);
        }
        return finishGatewayRequest(method, responseType);
        
        
    }
     
    @SuppressWarnings({ "unchecked", "rawtypes" })
	protected Object finishGatewayRequest(HttpMethod method, Class responseType) throws Exception {
    	
    	
    	HttpClient client = getGatewayClient();
    	
        Map headers = new HashMap();
        if (defaultCredentials != null) {
            headers = CryptoUtils.getInstance().generateApiHeaders(
            		defaultCredentials.getApiKey(), 
            		defaultCredentials.getBearerToken(), 
            		defaultCredentials.getSigningKey()
            	);  	
        }
    	
    	
        Iterator itr = headers.keySet().iterator();
        while (itr.hasNext()) {
			String key = (String)itr.next();
			String value = (String)headers.get(key);
			method.addRequestHeader(key, value);
        }
        try {
         	int status = client.executeMethod(method);
         	if (status == HttpStatus.SC_FORBIDDEN) {
         		//check clock drift
         	}
         	if (status != HttpStatus.SC_OK) {
         		throw new IOException(method.getStatusText());
         	}
         	return objectMapper.readValue(method.getResponseBodyAsStream(), responseType);
        }
        finally {
         	method.releaseConnection();
        }
    }
    
    @SuppressWarnings({ "rawtypes" })
	protected Object postGateway(String path, CoreRequest request, Class responseClass) throws Exception {

        
        PostMethod method = new PostMethod(toFullyQualifiedGatewayPath(path, request.isTest()));
        StringRequestEntity requestEntity = new StringRequestEntity(
        		objectMapper.writeValueAsString(request),
        	    "application/json",
        	    "UTF-8");
        
        method.setRequestEntity(requestEntity);
        
        return finishGatewayRequest(method, responseClass);
        
    }
    
    
    @SuppressWarnings({ "rawtypes" })
	protected Object putGateway(String path, CoreRequest request, Class responseClass) throws Exception {
        
        
        PutMethod method = new PutMethod(toFullyQualifiedGatewayPath(path, request.isTest()));
        StringRequestEntity requestEntity = new StringRequestEntity(
        		objectMapper.writeValueAsString(request),
        	    "application/json",
        	    "UTF-8");
        
        method.setRequestEntity(requestEntity);
        
        return finishGatewayRequest(method, responseClass);
        
    }
    
    protected String resolveOfflineRouteCacheLocation(String terminalName) {
    	
    	
    	if (offlineRouteCacheLocation != null) {
    		return offlineRouteCacheLocation + "_" + StringUtils.replaceChars(toTerminalRouteKey(terminalName), " ", "_");
    	}
    	else {
    		String temp = System.getProperty("java.io.tmpdir");
    		if (!StringUtils.endsWith(temp, String.valueOf(File.separatorChar))) {
    			temp = temp + File.separatorChar;
    		}
    		return temp +  OFFLINE_CACHE + "_" + StringUtils.replaceChars(toTerminalRouteKey(terminalName), " ", "_");
    	}
    	
    }
    
    public TerminalRouteResponse getOfflineCache(String terminalName) {
    	
    	File file = new File(resolveOfflineRouteCacheLocation(terminalName));
    	
    	if (!file.exists()) {
    		return null;
    	}
    	
    	try {
    		TerminalRouteResponse route = objectMapper.readValue(file, TerminalRouteResponse.class);
    		route.setTransientCredentials(decrypt(route.getTransientCredentials()));
    		return route;   		
    	} catch (Exception e) {
    		throw new RuntimeException(e);
    	}
    	
    }
    
    public String getOfflineRouteCacheLocation() {
		return offlineRouteCacheLocation;
	}

	public void setOfflineRouteCacheLocation(String offlineRouteCacheLocation) {
		this.offlineRouteCacheLocation = offlineRouteCacheLocation;
	}

	protected String toFullyQualifiedGatewayPath(String path, boolean test) {
    	if (test) {
    		return this.testGatewayHost + path;
    	} else {
    		return this.gatewayHost + path;
    	}
    }
    
}
