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
import org.apache.commons.httpclient.methods.EntityEnclosingMethod;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.PutMethod;
import org.apache.commons.httpclient.methods.StringRequestEntity;
import org.apache.commons.io.FileUtils;
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
import com.blockchyp.client.dto.PaymentRequest;
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
 * This is the main class Java developers will interact with. You can
 * instantiate this class directly or use it with a dependency injection
 * framework like Spring or Dropwizard. Most developers will only need to inject
 * credentials, but you may also want to override default endpoints if you're
 * targeting non production BlockChyp systems (which is unlikely).
 * 
 * You can inject settings via the constructors or via setters depending on your
 * preferences.
 * 
 * You'll also notice that we're not using generics or any features from Java
 * 1.7 or later. This is just to maintain as much backward compatibility as
 * possible with older systems (1.6 or later). The underlying REST API's are
 * invoked using commons-httpclient 3.1 and we use Jackson for json
 * serialization.
 * 
 * Most internal methods are scoped as protected in order to give developers the
 * ability to override things if they need special behavior of have weird
 * classpath issues.
 * 
 * @author jeffreydpayne
 *
 */

public class BlockChypClient {

    public static final String OFFLINE_CACHE = ".blockchyp_routes";
    public static final String OFFLINE_FIXED_KEY = "cb22789c9d5c344a10e0474f134db39e25eb3bbf5a1b1a5e89b507f15ea9519c";
    public static final long MS_PER_HOUR = 3600000;

    private String gatewayHost = "https://api.blockchyp.com";
    private String testGatewayHost = "https://test.blockchyp.com";
    private APICredentials defaultCredentials;
    private PaymentLogger paymentLogger = new SystemOutPaymentLogger();

    @SuppressWarnings("rawtypes")
    private Map routeCache = new HashMap();

    private boolean offlineRouteCacheEnabled = true;

    private String offlineRouteCacheLocation = null;

    private int connectionTimeout = 0;

    private int timeout = 0;

    private ObjectMapper objectMapper;

    private HttpClient gatewayClient;

    private HttpClient terminalClient;
    
    private boolean terminalHttps = false;

    /**
     * Default constructor.
     */
    public BlockChypClient() {
        initObjectMapper();
    }

    /**
     * Provided as a convenience to support constructor based dependency injection.
     * 
     * @param gatewayHost - alternate gateway endpoint.
     */  
    public BlockChypClient(String gatewayHost) {
        this();
        this.gatewayHost = gatewayHost;
    }

    /**
     * Provided as a convenience to support constructor based dependency injection.
     * 
     * @param defaultCredentials - {@link APICredentials}
     */
    public BlockChypClient(APICredentials defaultCredentials) {
        this();
        this.defaultCredentials = defaultCredentials;
    }

    /**
     * Provided as a convenience to support constructor based dependency injection.
     * 
     * @param gatewayHost - alternate gateway endpoint.
     * @param defaultCredentials - {@link APICredentials}
     */
    public BlockChypClient(String gatewayHost, APICredentials defaultCredentials) {
        this();
        this.gatewayHost = gatewayHost;
        this.defaultCredentials = defaultCredentials;
    }

    /**
     * Provided as a convenience to support constructor based dependency injection.
     * 
     * @param gatewayHost - alternate gateway endpoint.
     * @param testGatewayHost - alternate gateway endpoint.
     * @param defaultCredentials - {@link APICredentials}
     */
    public BlockChypClient(String gatewayHost, String testGatewayHost, APICredentials defaultCredentials) {
        this();
        this.gatewayHost = gatewayHost;
        this.testGatewayHost = testGatewayHost;
        this.defaultCredentials = defaultCredentials;
    }
    
    /**
     * Used to override the live gateway host.  Unless you work at BlockChyp, you probably
     * won't ever need to do this.
     * 
     * @param gatewayHost - alternate gateway endpoint.
     */

    public void setGatewayHost(String gatewayHost) {
        this.gatewayHost = gatewayHost;
    }
    

    /**
     * Used to override the test gateway host.  Unless you work at BlockChyp, you probably
     * won't ever need to do this.
     * 
     * @param testGatewayHost - alternate gateway endpoint.
     */
    public void setTestGatewayHost(String testGatewayHost) {
        this.testGatewayHost = testGatewayHost;
    }

    /**
     * Sets the default root api credentials for the client.
     * @param defaultCredentials - {@link APICredentials}
     */
    public void setDefaultCredentials(APICredentials defaultCredentials) {
        this.defaultCredentials = defaultCredentials;
    }

    /**
     * Enables or disables offline terminal route caching.  Offline route caching is really meant 
     * as a defense for situations where developers are creating new BlockChypClient instances
     * over and over for each request and therefore making the in memory cache useless.  The
     * BlockChypClient is thread safe so we encourage you to only create once instance and share it 
     * for all requests.  If you're doing this, you can safely disable offline route caching
     * and we recommend it.  Defaults to enabled.
     *  
     * @param offlineRouteCacheEnabled - true if offline route caching is enabled.
     */
    public void setOfflineRouteCacheEnabled(boolean offlineRouteCacheEnabled) {
        this.offlineRouteCacheEnabled = offlineRouteCacheEnabled;
    }

    /**
     * Sets the payment logger.  Can be used override that default
     * System.out based logging.
     * @param paymentLogger - an implementation of {@link PaymentLogger}
     */
    public void setPaymentLogger(PaymentLogger paymentLogger) {
        this.paymentLogger = paymentLogger;
    }

    /**
     * Initializes the JSON encoder and parser.
     */
    protected void initObjectMapper() {
        objectMapper = new com.fasterxml.jackson.databind.ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    /**
     * Tests communication with the Gateway.  If Authentication is successful, a merchantPk value
     * is returned.
     * @param test - whether or not to route the the transaction to the test gateway.
     * @return {@link Acknowledgement}
     * @throws Exception - exception if any errors occurred processing the request.
     */
    public HeartbeatResponse heartbeat(boolean test) throws Exception {

        return (HeartbeatResponse) getGateway("/api/heartbeat", test, HeartbeatResponse.class);

    }

    /**
     * Tests local communication with a terminal.
     * @param request {@link PingRequest}
     * @return {@link Acknowledgement}
     * @throws Exception - exception if any errors occurred processing the request.
     */
    public Acknowledgement ping(PingRequest request) throws Exception {

        return (Acknowledgement) postTerminal("/api/test", request, Acknowledgement.class);

    }

    /**
     * Performs a standard auth and capture.
     * @param request {@link AuthorizationRequest}
     * @return {@link AuthorizationResponse}
     * @throws Exception - exception if any errors occurred processing the request.
     */
    public AuthorizationResponse charge(AuthorizationRequest request) throws Exception {

        populateSignatureOptions(request);

        AuthorizationResponse response;

        if (isTerminalRouted(request)) {
            response = (AuthorizationResponse) postTerminal("/api/charge", request, AuthorizationResponse.class);
        } else {
            response = (AuthorizationResponse) postGateway("/api/charge", request, AuthorizationResponse.class);
        }

        dumpSignatureFile(request, response);

        return response;

    }

    /**
     * Executes a time out reversal.  You should use this API in situations where your requests for 
     * authorizations time out or give ambiguous results.  Must be done within two minutes of the original
     * authorization.  Will help prevent double charge issues.
     * To use this method, you'll need to provide a transationRef value to uniquely identify 
     * your transactions.  It's designed such that you can take the original AuthorizationRequest you
     * assembled for the charge or preauth and just resend it as a reverse.  Bear in mind that terminals
     * always automatically reverse transactions if there's trouble with terminal to gateway communication
     * or the customer doesn't provide a signature when signatures are required.
     * 
     * @param request {@link AuthorizationRequest}
     * @return {@link AuthorizationResponse}
     * @throws Exception - exception if any errors occurred processing the request.
     */
    public AuthorizationResponse reverse(AuthorizationRequest request) throws Exception {

        return (AuthorizationResponse) postGateway("/api/reverse", request, AuthorizationResponse.class);

    }

    /**
     * Executes a manual batch close.  BlockChyp defaults to automatically closing batches at 3 AM in the
     * merchant's local time zone.  You can turn this off and batch manually if you want.  You might need
     * to do this for preauth based businesses (restaurants and bars) with unusual hours.
     * @param request {@link CloseBatchRequest}
     * @return {@link CloseBatchResponse}
     * @throws Exception - exception if any errors occurred processing the request.
     */
    public CloseBatchResponse closeBatch(CloseBatchRequest request) throws Exception {

        return (CloseBatchResponse) postGateway("/api/close-batch", request, CloseBatchResponse.class);

    }

    /**
     * Refunds a transaction.  You can execute a full or partial refund referencing a previous transaction.
     * You can also do a free range refund without referencing a previous transactions, but please, pretty 
     * please, don't do this.  Basing a refund on a previous transaction is way more secure.
     * @param request {@link RefundRequest}
     * @return {@link AuthorizationResponse}
     * @throws Exception - exception if any errors occurred processing the request.
     */
    public AuthorizationResponse refund(RefundRequest request) throws Exception {

        populateSignatureOptions(request);

        AuthorizationResponse response;

        if (isTerminalRouted(request)) {
            response = (AuthorizationResponse) postTerminal("/api/refund", request, AuthorizationResponse.class);
        } else {
            response = (AuthorizationResponse) postGateway("/api/refund", request, AuthorizationResponse.class);
        }

        dumpSignatureFile(request, response);

        return response;

    }

    /**
     * Preauthorizes a transaction.  Must be captured later.
     * @param request {@link AuthorizationRequest}
     * @return {@link AuthorizationResponse}
     * @throws Exception - exception if any errors occurred processing the request.
     */
    public AuthorizationResponse preauth(AuthorizationRequest request) throws Exception {

        populateSignatureOptions(request);

        AuthorizationResponse response;

        if (isTerminalRouted(request)) {
            response = (AuthorizationResponse) postTerminal("/api/preauth", request, AuthorizationResponse.class);
        } else {
            response = (AuthorizationResponse) postGateway("/api/preauth", request, AuthorizationResponse.class);
        }

        dumpSignatureFile(request, response);

        return response;

    }

    /**
     * Displays a text message on the terminal screen.
     * @param request {@link MessageRequest}
     * @return {@link Acknowledgement}
     * @throws Exception - exception if any errors occurred processing the request.
     */
    public Acknowledgement message(MessageRequest request) throws Exception {

        if (isTerminalRouted(request)) {
            return (Acknowledgement) postTerminal("/api/message", request, Acknowledgement.class);
        } else {
            return (Acknowledgement) postGateway("/api/message", request, Acknowledgement.class);
        }

    }

    /**
     * Captures text input from the user. This can be used for things like email addresses, phone numbers,
     * and loyalty program numbers.  You have to specify a promptType in the request since free form
     * prompt text isn't permitted for text input prompts per PCI.
     * @param request {@link TextPromptRequest}
     * @return {@link TextPromptResponse}
     * @throws Exception - exception if any errors occurred processing the request.
     */
    public TextPromptResponse textPrompt(TextPromptRequest request) throws Exception {

        if (isTerminalRouted(request)) {
            return (TextPromptResponse) postTerminal("/api/text-prompt", request, TextPromptResponse.class);
        } else {
            return (TextPromptResponse) postGateway("/api/text-prompt", request, TextPromptResponse.class);
        }

    }

    /**
     * Asks the user a yes or no question.  You can use this for things like suggestive selling.  You can also 
     * use this for surveys, but BlockChyp does have  built in survey feature that your merchants
     * can use without any coding needed. 
     * @param request {@link BooleanPromptRequest}
     * @return {@link BooleanPromptResponse}
     * @throws Exception - exception if any errors occurred processing the request.
     */
    public BooleanPromptResponse booleanPrompt(BooleanPromptRequest request) throws Exception {

        if (isTerminalRouted(request)) {
            return (BooleanPromptResponse) postTerminal("/api/boolean-prompt", request, BooleanPromptResponse.class);
        } else {
            return (BooleanPromptResponse) postGateway("/api/boolean-prompt", request, BooleanPromptResponse.class);
        }

    }

    /**
     * Resets the line item display.  This will clear any existing line items and start over.  Use 
     * this method if you need to delete line items.
     * @param request {@link TransactionDisplayRequest}
     * @return {@link Acknowledgement}
     * @throws Exception - exception if any errors occurred processing the request.
     */
    public Acknowledgement newTransactionDisplay(TransactionDisplayRequest request) throws Exception {

        if (isTerminalRouted(request)) {
            return (Acknowledgement) postTerminal("/api/txdisplay", request, Acknowledgement.class);
        } else {
            return (Acknowledgement) postGateway("/api/terminal-txdisplay", request, Acknowledgement.class);
        }

    }

    /**
     * Clears the terminal of any in progress transactions or line item information.  Returns it to the idle state.
     * @param request {@link ClearTerminalRequest}
     * @return {@link Acknowledgement}
     * @throws Exception - exception if any errors occurred processing the request.
     */
    public Acknowledgement clear(ClearTerminalRequest request) throws Exception {

        if (isTerminalRouted(request)) {
            return (Acknowledgement) postTerminal("/api/clear", request, Acknowledgement.class);
        } else {
            return (Acknowledgement) postGateway("/api/terminal-clear", request, Acknowledgement.class);
        }

    }

    /**
     * Updates the line item display.  This will add new line items to the terminal and update totals.
     * @param request {@link TransactionDisplayRequest}
     * @return {@link Acknowledgement}
     * @throws Exception - exception if any errors occurred processing the request.
     */
    public Acknowledgement updateTransactionDisplay(TransactionDisplayRequest request) throws Exception {

        if (isTerminalRouted(request)) {
            return (Acknowledgement) putTerminal("/api/txdisplay", request, Acknowledgement.class);
        } else {
            return (Acknowledgement) putGateway("/api/terminal-txdisplay", request, Acknowledgement.class);
        }

    }

    /**
     * Captures a preauth.  Captures are always routed to the gateway.
     * @param request {@link CaptureRequest}
     * @return {@link CaptureResponse}
     * @throws Exception - exception if any errors occurred processing the request.
     */
    public CaptureResponse capture(CaptureRequest request) throws Exception {

        return (CaptureResponse) postGateway("/api/capture", request, CaptureResponse.class);

    }

    /**
     * Voids a transaction.  Voids are always routed to the gateway.
     * @param request {@link VoidRequest}
     * @return {@link VoidResponse}
     * @throws Exception - exception if any errors occurred processing the request.
     */
    public VoidResponse voidTx(VoidRequest request) throws Exception {

        return (VoidResponse) postGateway("/api/void", request, VoidResponse.class);

    }

    /**
     * Decrypts API credentials using the offline cache key.
     * @param creds - blockchyp API credentials.
     * @return - a decrypted copy of the original credentials.
     */
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

    /**
     * Encrypts API credentials using the offline cache key.
     * @param creds - blockchyp API credentials.
     * @return - an encrypted copy of the original credentials.
     */
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

    /**
     * Generates the encryption key used for offline cache records.
     * @return - the key in bytes.
     */
    protected byte[] deriveOfflineKey() {

        MessageDigest md = DigestUtils.getSha1Digest();
        md.digest(Hex.decode(OFFLINE_FIXED_KEY));
        return Arrays.copyOfRange(md.digest(Hex.decode(defaultCredentials.getSigningKey())), 0, CryptoUtils.AES_KEY_SIZE_IN_BYTES);

    }

    /**
     * Looks up a terminal route from the cache.
     * @param terminalName - terminal name assigned at activation.
     * @return - the terminal route record.
     */
    protected TerminalRouteResponse routeCacheGet(String terminalName) {

        TerminalRouteResponse route = (TerminalRouteResponse) routeCache.get(toTerminalRouteKey(terminalName));
        if (route != null) {
            paymentLogger.debug("Memory Route Cache Hit: " + terminalName);
            return route;
        }

        if (offlineRouteCacheEnabled) {
            route = getOfflineCache(terminalName);
            if (route != null) {
                routeCachePut(route);
            }
        }

        return route;
    }

    /**
     * Puts a terminal route in the cache (both caches).
     * @param route - the terminal route record.
     */
    @SuppressWarnings({ "unchecked" })
    protected void routeCachePut(TerminalRouteResponse route) {

        routeCache.put(defaultCredentials.getApiKey() + route.getTerminalName(), route);

        if (offlineRouteCacheEnabled) {
            try {
                // we clone this because we're going to store a version of it with transient
                // creds encrypted
                TerminalRouteResponse offlineRoute = (TerminalRouteResponse) BeanUtils.cloneBean(route);
                offlineRoute.setTransientCredentials(encrypt(route.getTransientCredentials()));

                File offlineFile = new File(resolveOfflineRouteCacheLocation(route.getTerminalName()));
                FileWriter writer = new FileWriter(offlineFile);
                objectMapper.writeValue(writer, offlineRoute);

            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        }
    }

    /**
     * Creates a cache key for terminal routes.
     * @param terminalName - terminal name.
     * @return - terminal cache key.
     */
    protected String toTerminalRouteKey(String terminalName) {

        return defaultCredentials.getApiKey() + terminalName;

    }

    /**
     * This method is used to setup sensible defaults for local signature file
     * dumps. For example, if the sig file is provided without a format, it's
     * possible to infer a format from the file extension. Note that we don't
     * validate that the file format is supported. We leave that to the terminal
     * firmware in order to prevent SDK updates being needed when file format
     * support in the firmware changes.
     * 
     * @param request {@link PaymentRequest}
     */

    protected void populateSignatureOptions(PaymentRequest request) {

        if (StringUtils.isNotEmpty(request.getSigFile()) && StringUtils.isEmpty(request.getSigFormat())) {
            String[] tokens = StringUtils.split(request.getSigFile(), ".");
            if (tokens.length > 1) {
                request.setSigFormat(tokens[tokens.length - 1]);
            }
        }

    }

    /**
     * Writes the signature to a file if a signature is present and the caller has
     * requested it. Notice this does not throw exceptions because if this methods
     * gets called a transaction has already been authorized and we wouldn't want
     * the client application to error out here.
     * 
     * @param request {@link PaymentRequest}
     * @param response {@link AuthorizationResponse}
     */
    protected void dumpSignatureFile(PaymentRequest request, AuthorizationResponse response) {

        if (StringUtils.isEmpty(response.getSigFile())) {
            return;
        }

        if (StringUtils.isEmpty(request.getSigFile())) {
            return;
        }

        try {
            byte[] sigBinary = Hex.decode(response.getSigFile());
            FileUtils.writeByteArrayToFile(new File(request.getSigFile()), sigBinary);
        } catch (Exception e) {
            paymentLogger.error("Exception storing signature file", e);
        }

    }

    /**
     * Finds the terminal route record for the given terminal name.
     * First the local in memory cache is checked, then the offline cache (if enabled).
     * If the first two cache lookups come up empty or the cache is over an hour old,
     * the gateway route API is invoked.  If we have a stale cache entry and the 
     * gateway route lookup fails or times out, we fall back to the stale cache entry.
     * @param terminalName - name of the terminal assigned at activation.
     * @return - the terminal route record.
     */
    protected TerminalRouteResponse resolveTerminalRoute(String terminalName) {

        if (StringUtils.isEmpty(terminalName)) {
            return null;
        }

        TerminalRouteResponse route = routeCacheGet(terminalName);

        TerminalRouteResponse fallbackRoute = null; // fallback to stale cache if route lookup fails

        if (route != null) {
            fallbackRoute = route;
            long expiry = route.getTimestamp().getTime() + MS_PER_HOUR;
            if (System.currentTimeMillis() > expiry) {
                paymentLogger.debug("Ignoring stale route in memory route cache.");
                route = null;
            }
        }

        if (route == null) {
            try {
                route = (TerminalRouteResponse) getGateway(
                        "/api/terminal-route?terminal=" + URLEncoder.encode(terminalName, "UTF-8"), false,
                        TerminalRouteResponse.class);
                if (route != null) {
                    route.setTimestamp(new Date());
                    routeCachePut(route);
                }
            } catch (ConnectTimeoutException e) {
                e.printStackTrace();
                return fallbackRoute;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        return route;

    }

    /**
     * Returns the gateway client singleton.
     * @return - HttpClient configured for gateway requests.
     */
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

    /**
     * Returns the terminal client singleton.
     * @return - HttpClient configured for terminal requests.
     */
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

    
    /**
     * Assembles the scheme, ip address, and port number bits of a terminal url.
     * @param route - the terminal route record.
     * @return - scheme, ip addres, and port number.
     */
    protected String resolveTerminalHost(TerminalRouteResponse route) {
         
        //Note: our terminals don't actually run Java, but port 8080 should make you feel at home.
        return (isTerminalHttps() ? "https://" : "http://") + route.getIpAddress() + ":8080";

    }

    /**
     * Assembles a full path to the terminal for an api call.
     * @param route - the terminal route record.
     * @param path - api path relative to the root (e.g. "/api/charge")
     * @return - the fully qualified URI.
     */
    protected String toFullyQualifiedTerminalPath(TerminalRouteResponse route, String path) {

        return resolveTerminalHost(route) + path;

    }

    /**
     * Returns true if transaction for the given terminal reference should be routed over the local subnet.
     * @param terminalName - reference to the terminal.
     * @return true, if terminal (local subnet) routed.
     */
    protected boolean isTerminalRouted(ITerminalReference terminalName) {

        TerminalRouteResponse route = resolveTerminalRoute(terminalName.getTerminalName());

        return StringUtils.isNotEmpty(terminalName.getTerminalName()) && !route.isCloudRelayEnabled();

    }


    /**
     * This handles all the common logic associated with processing terminal http requests.
     * @param route - the terminal route record
     * @param request - the request payload, if put or post
     * @param method - the HttpMethod prepopulated
     * @param responseType - expected response type.
     * @return - a response of type specified by responseClass
     * @throws Exception - exception if any errors occurred processing the request.
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    protected Object finishTerminalRequest(TerminalRouteResponse route, Object request, EntityEnclosingMethod method,
            Class responseType) throws Exception {

        TerminalRequest termRequest = newTerminalRequestForRoute(route);
        termRequest.setRequest(request);

        HttpClient client = getGatewayClient();
        StringRequestEntity requestEntity = new StringRequestEntity(objectMapper.writeValueAsString(termRequest),
                "application/json", "UTF-8");

        method.setRequestEntity(requestEntity);

        paymentLogger.debug("Terminal: " + method.getURI().toString());

        try {
            int status = client.executeMethod(method);
            if (status != HttpStatus.SC_OK) {
                throw new IOException(method.getStatusText());
            }
            return objectMapper.readValue(method.getResponseBodyAsStream(), responseType);
        } finally {
            method.releaseConnection();
        }

    }

    /**
     * Executes a put http request against the terminal API.
     * @param path - api path relative to the root (e.g. "/api/charge")
     * @param request - the request payload object.
     * @param responseType - expected response type.
     * @return - a response of type specified by responseClass
     * @throws Exception - exception if any errors occurred processing the request.
     */
    @SuppressWarnings({ "rawtypes" })
    protected Object putTerminal(String path, Object request, Class responseType) throws Exception {

        String terminalName = null;
        if (request instanceof ITerminalReference) {
            ITerminalReference ref = (ITerminalReference) request;
            terminalName = ref.getTerminalName();
        }

        TerminalRouteResponse route = resolveTerminalRoute(terminalName);

        PutMethod method = new PutMethod(resolveTerminalHost(route) + path);

        return finishTerminalRequest(route, request, method, responseType);

    }

    /**
     * Assembles a new terminal request and populates the credentials, using transient 
     * credentials if available.
     * @param route - the terminal route record.
     * @return {@link TerminalRequest}
     */
    protected TerminalRequest newTerminalRequestForRoute(TerminalRouteResponse route) {

        TerminalRequest termRequest = new TerminalRequest();

        if ((route.getTransientCredentials() != null) &&
                StringUtils.isNotEmpty(route.getTransientCredentials().getApiKey())) {
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

    /**
     * Posts an http request to the terminal API.
     * @param path - api path relative to the root (e.g. "/api/charge")
     * @param request - the request payload object.
     * @param responseType - expected response type.
     * @return - a response of type specified by responseClass
     * @throws Exception - exception if any errors occurred processing the request.
     */
    @SuppressWarnings({ "rawtypes" })
    protected Object postTerminal(String path, Object request, Class responseType) throws Exception {

        String terminalName = null;
        if (request instanceof ITerminalReference) {
            ITerminalReference ref = (ITerminalReference) request;
            terminalName = ref.getTerminalName();
        }

        TerminalRouteResponse route = resolveTerminalRoute(terminalName);

        PostMethod method = new PostMethod(resolveTerminalHost(route) + path);

        return finishTerminalRequest(route, request, method, responseType);

    }
    
    /**
     * Executes an http get request against the gateway with a timeout override.
     * @param path - api path relative to the root (e.g. "/api/heartbeat")
     * @param test - whether or not this request should go to the test gateway
     * @param responseType - expected response type.
     * @return - a response of type specified by responseClass
     * @throws Exception - exception if any errors occurred processing the request.
     */
    @SuppressWarnings({ "rawtypes" })
    protected Object getGateway(String path, boolean test, Class responseType) throws Exception {

        return getGateway(path, test, responseType, timeout);

    }

    /**
     * Executes an http get request against the gateway with a timeout override.
     * @param path - api path relative to the root (e.g. "/api/heartbeat")
     * @param test - whether or not this request should go to the test gateway
     * @param responseType - expected response type.
     * @param requestTimeout - timeout for the request in milliseconds
     * @return - a response of type specified by responseClass
     * @throws Exception - exception if any errors occurred processing the request.
     */
    @SuppressWarnings({ "rawtypes" })
    protected Object getGateway(String path, boolean test, Class responseType, int requestTimeout) throws Exception {

        HttpMethod method = new GetMethod(toFullyQualifiedGatewayPath(path, test));
        if (requestTimeout > 0) {
            method.getParams().setSoTimeout(requestTimeout);
        }
        return finishGatewayRequest(method, responseType);

    }

    /**
     * Executes a previously assembled HttpMethod against the gateway.  Aggregates common logic
     * associated with hitting the gateway.
     * @param method - the HttpMethod to execute.
     * @param responseType - expected response type.
     * @return - a response of type specified by responseClass
     * @throws Exception - exception if any errors occurred processing the request.
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
    protected Object finishGatewayRequest(HttpMethod method, Class responseType) throws Exception {

        HttpClient client = getGatewayClient();

        Map headers = new HashMap();
        if (defaultCredentials != null) {
            headers = CryptoUtils.getInstance().generateApiHeaders(defaultCredentials.getApiKey(),
                    defaultCredentials.getBearerToken(), defaultCredentials.getSigningKey());
        }

        paymentLogger.debug("Gateway: " + method.getURI().toString());

        Iterator itr = headers.keySet().iterator();
        while (itr.hasNext()) {
            String key = (String) itr.next();
            String value = (String) headers.get(key);
            method.addRequestHeader(key, value);
        }
        try {
            int status = client.executeMethod(method);
            if (status == HttpStatus.SC_FORBIDDEN) {
                // check clock drift
                paymentLogger.info("Checking clock drift");
            }
            if (status != HttpStatus.SC_OK) {
                throw new IOException(method.getStatusText());
            }
            return objectMapper.readValue(method.getResponseBodyAsStream(), responseType);
        } finally {
            method.releaseConnection();
        }
    }

    /**
     * Executes a post HTTP request against the gateway.
     * @param path - api path from root (e.g. "/api/charge")
     * @param request - the request object.
     * @param responseClass - expected response type.
     * @return - a response of type specified by responseClass
     * @throws Exception - exception if any errors occurred processing the request.
     */
    @SuppressWarnings({ "rawtypes" })
    protected Object postGateway(String path, CoreRequest request, Class responseClass) throws Exception {

        PostMethod method = new PostMethod(toFullyQualifiedGatewayPath(path, request.isTest()));
        StringRequestEntity requestEntity = new StringRequestEntity(objectMapper.writeValueAsString(request),
                "application/json", "UTF-8");

        method.setRequestEntity(requestEntity);

        return finishGatewayRequest(method, responseClass);

    }

    /**
     * Executes a put HTTP request against the gateway.
     * @param path - api path from root (e.g. "/api/charge")
     * @param request - the request object.
     * @param responseClass - expected response type.
     * @return - a reponse of type specified by responseClass
     * @throws Exception - exception if any errors occurred processing the request.
     */
    @SuppressWarnings({ "rawtypes" })
    protected Object putGateway(String path, CoreRequest request, Class responseClass) throws Exception {

        PutMethod method = new PutMethod(toFullyQualifiedGatewayPath(path, request.isTest()));
        StringRequestEntity requestEntity = new StringRequestEntity(objectMapper.writeValueAsString(request),
                "application/json", "UTF-8");

        method.setRequestEntity(requestEntity);

        return finishGatewayRequest(method, responseClass);

    }

    /**
     * Returns the offline cache location.  This will be the value of offlineRouteCacheLocation if specified
     * and the operation system default tmp folder otherwise.
     * 
     * @param terminalName - the target terminal name.
     * @return - local path.
     */
    protected String resolveOfflineRouteCacheLocation(String terminalName) {

        if (offlineRouteCacheLocation != null) {
            return offlineRouteCacheLocation + "_" +
                    StringUtils.replaceChars(toTerminalRouteKey(terminalName), " ", "_");
        } else {
            String temp = System.getProperty("java.io.tmpdir");
            if (!StringUtils.endsWith(temp, String.valueOf(File.separatorChar))) {
                temp = temp + File.separatorChar;
            }
            return temp + OFFLINE_CACHE + "_" + StringUtils.replaceChars(toTerminalRouteKey(terminalName), " ", "_");
        }

    }

    /**
     * Returns the route stored in the offline cache for the given terminal.
     * @param terminalName - the target terminal name.
     * @return - terminal route, null if not found.
     */
    public TerminalRouteResponse getOfflineCache(String terminalName) {

        File file = new File(resolveOfflineRouteCacheLocation(terminalName));

        paymentLogger.debug("Checking Offline Route Cache: " + file.getAbsolutePath());

        if (!file.exists()) {
            paymentLogger.debug("Offline Route Cache Miss: " + terminalName);
            return null;
        }

        try {
            TerminalRouteResponse route = objectMapper.readValue(file, TerminalRouteResponse.class);
            route.setTransientCredentials(decrypt(route.getTransientCredentials()));
            paymentLogger.debug("Offline Route Cache Hit: " + terminalName);
            return route;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    /**
     * Returns the offline route cache location.
     * @return - offline route cache location.
     */
    public String getOfflineRouteCacheLocation() {
        return offlineRouteCacheLocation;
    }

    /**
     * Sets the offline route cache location if you want to override the default.  Defaults 
     * to your operation system's tmp file location.
     * @param offlineRouteCacheLocation - offline route cache location.
     */
    public void setOfflineRouteCacheLocation(String offlineRouteCacheLocation) {
        this.offlineRouteCacheLocation = offlineRouteCacheLocation;
    }

    /**
     * Converts path to the fully qualified URL for a gateway API call.
     * @param path - path relative to the root (e.g. "/api/charge")
     * @param test - whether or not this should route to the test transaction.
     * @return - fully qualified URI.
     */
    protected String toFullyQualifiedGatewayPath(String path, boolean test) {
        if (test) {
            return this.testGatewayHost + path;
        } else {
            return this.gatewayHost + path;
        }
    }

    /**
     * Gets the terminal https flag.  The Java SDK defaults to using http for 
     * terminal communication because installing custom root certificate authorities
     * in Java is quite tricky and cannot be done programatically.  We strongly 
     * recommend that all developers install our root CA in your local keystores
     * and then turn https on in production.
     * 
     * Our terminal root CA can be found here: https://docs.blockchyp.com/rest-api/terminal/index.html#ssl-tls
     * 
     * @return - https flag.
     */
    public boolean isTerminalHttps() {
        return terminalHttps;
    }

    /**
     * Sets the terminal https flag.  The Java SDK defaults to using http for 
     * terminal communication because installing custom root certificate authorities
     * in Java is quite tricky and cannot be done programatically.  We strongly 
     * recommend that all developers install our root CA in your local keystores
     * and then turn https on in production.
     * 
     * Our terminal root CA can be found here: https://docs.blockchyp.com/rest-api/terminal/index.html#ssl-tls
     * 
     * @param terminalHttps - https flag.
     */
    public void setTerminalHttps(boolean terminalHttps) {
        this.terminalHttps = terminalHttps;
    }

}
