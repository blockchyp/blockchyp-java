package com.blockchyp.client;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.StringRequestEntity;
import org.apache.commons.lang.StringUtils;

import com.blockchyp.client.crypto.CryptoUtils;
import com.blockchyp.client.dto.Acknowledgement;
import com.blockchyp.client.dto.AuthorizationRequest;
import com.blockchyp.client.dto.AuthorizationResponse;
import com.blockchyp.client.dto.BooleanPromptRequest;
import com.blockchyp.client.dto.BooleanPromptResponse;
import com.blockchyp.client.dto.CaptureRequest;
import com.blockchyp.client.dto.CaptureResponse;
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
    
    
    public void setGatewayHost(String gatewayHost) {
		this.gatewayHost = gatewayHost;
	}

	public void setTestGatewayHost(String testGatewayHost) {
		this.testGatewayHost = testGatewayHost;
	}

	public void setDefaultCredentials(GatewayCredentials defaultCredentials) {
		this.defaultCredentials = defaultCredentials;
	}

	private String gatewayHost = "https://api.blockchyp.com";
    private String testGatewayHost = "https://test.blockchyp.com";
    private GatewayCredentials defaultCredentials;
    @SuppressWarnings("rawtypes")
	private Map routeCache = new HashMap();
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
    
    public CaptureResponse capture(CaptureRequest request) throws Exception {
        
        return (CaptureResponse)postGateway("/api/capture", request, CaptureResponse.class);
        
    }
    
    public VoidResponse voidTx(VoidRequest request) throws Exception {
        
        return (VoidResponse)postGateway("/api/void", request, VoidResponse.class);
        
    }
    
    
    @SuppressWarnings({ "rawtypes", "unchecked" })
	protected TerminalRouteResponse resolveTerminalRoute(String terminalName) {
        
        TerminalRouteResponse route = null;
        Map apiRoutes = (Map)routeCache.get(defaultCredentials.getApiKey());
        if (apiRoutes != null) {
            route = (TerminalRouteResponse)apiRoutes.get(terminalName);
        }
        if (route != null) {
            return route;
        }
        
        try {
            route = (TerminalRouteResponse)getGateway("/api/terminal-route?terminal=" + URLEncoder.encode(terminalName, "UTF-8"), false, TerminalRouteResponse.class);
            if (apiRoutes == null) {
                apiRoutes = new HashMap();
                routeCache.put(defaultCredentials.getApiKey(), apiRoutes);
            }
            apiRoutes.put(terminalName, route);
            
            return route;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        
        
        
    }
    
    protected HttpClient getGatewayClient() {
    	if (gatewayClient == null) {
    		gatewayClient = new HttpClient();
    	}
    	return gatewayClient;
    }
    
    protected HttpClient getTerminalClient() {
    	if (terminalClient == null) {
    		terminalClient = new HttpClient();
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
    	
    	return StringUtils.isNotEmpty(terminalName.getTerminalName());
    	
    }
    
    @SuppressWarnings({ "rawtypes" })
	protected Object cloudRelay(String path, Object request, Class responseType) throws Exception {
    	
    	return null;
    	
    }
    
    
    @SuppressWarnings({ "rawtypes", "unchecked" })
	protected Object postTerminal(String path, Object request, Class responseType) throws Exception {
    	
    	
    	String terminalName = null;
    	
		if (request instanceof ITerminalReference) {
			ITerminalReference ref = (ITerminalReference)request;
			terminalName = ref.getTerminalName();
			if (!isTerminalRouted(ref)) {
				return cloudRelay(path, request, responseType);
			}
		}

    	TerminalRequest termRequest = new TerminalRequest();

        termRequest.setApiKey(defaultCredentials.getApiKey());
        termRequest.setBearerToken(defaultCredentials.getBearerToken());
        termRequest.setSigningKey(defaultCredentials.getSigningKey());
        termRequest.setRequest(request);
        
        TerminalRouteResponse route = resolveTerminalRoute(terminalName);

        
        HttpClient client = getGatewayClient();
        PostMethod method = new PostMethod(resolveTerminalHost(route) + path);
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
        	
        	System.out.println(method.getResponseBodyAsString());
        	return objectMapper.readValue(method.getResponseBodyAsStream(), responseType);
        }
        finally {
        	method.releaseConnection();
        }
        
    }

    
    @SuppressWarnings({ "rawtypes" })
	protected Object getGateway(String path, boolean test, Class responseType) throws Exception {
        

        HttpMethod method = new GetMethod(toFullyQualifiedGatewayPath(path, test));
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
         		System.out.println(method.getResponseBodyAsString());
         		throw new IOException(method.getStatusText());
         	}
         	System.out.println(method.getResponseBodyAsString());
         	return objectMapper.readValue(method.getResponseBodyAsStream(), responseType);
        }
        finally {
         	method.releaseConnection();
        }
    }
    
    @SuppressWarnings({ "rawtypes" })
	protected Object postGateway(String path, CoreRequest request, Class responseClass) throws Exception {
    	
    	
    	System.out.println(toFullyQualifiedGatewayPath(path, request.isTest()));
        
        
        PostMethod method = new PostMethod(toFullyQualifiedGatewayPath(path, request.isTest()));
        StringRequestEntity requestEntity = new StringRequestEntity(
        		objectMapper.writeValueAsString(request),
        	    "application/json",
        	    "UTF-8");
        
        method.setRequestEntity(requestEntity);
        
        return finishGatewayRequest(method, responseClass);
        
    }
    
    protected String toFullyQualifiedGatewayPath(String path, boolean test) {
    	if (test) {
    		return this.testGatewayHost + path;
    	} else {
    		return this.gatewayHost + path;
    	}
    }
    

}
