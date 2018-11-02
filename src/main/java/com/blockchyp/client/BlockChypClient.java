package com.blockchyp.client;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import com.blockchyp.client.crypto.CryptoUtils;
import com.blockchyp.client.dto.Acknowledgement;
import com.blockchyp.client.dto.ChargeRequest;
import com.blockchyp.client.dto.ChargeResponse;
import com.blockchyp.client.dto.HeartbeatResponse;
import com.blockchyp.client.dto.TerminalRequest;
import com.blockchyp.client.dto.TerminalRouteResponse;
import com.blockchyp.client.dto.TerminalSessionKey;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.ObjectMapper;
import com.mashape.unirest.http.Unirest;

public class BlockChypClient {
    
    
    private String gatewayHost = "https://api.blockchyp.com";
    private GatewayCredentials defaultCredentials;
    private Map<String, Map<String, TerminalRouteResponse>> routeCache = new HashMap<>();
    private com.fasterxml.jackson.databind.ObjectMapper objectMapper;
    
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
    
    protected void initObjectMapper() {
        objectMapper = new com.fasterxml.jackson.databind.ObjectMapper();
        Unirest.setTimeouts(30000, 30000);
        Unirest.setObjectMapper(new ObjectMapper() {
            private com.fasterxml.jackson.databind.ObjectMapper jacksonObjectMapper
                        = new com.fasterxml.jackson.databind.ObjectMapper();

            public <T> T readValue(String value, Class<T> valueType) {
                try {
                    return jacksonObjectMapper.readValue(value, valueType);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            public String writeValue(Object value) {
                try {
                    return jacksonObjectMapper.writeValueAsString(value);
                } catch (JsonProcessingException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        
    }
    
    public HeartbeatResponse heartbeat() throws Exception {
        
        return heartbeat(defaultCredentials);
        
    }
    

    public HeartbeatResponse heartbeat(GatewayCredentials credentials) throws Exception {
        
        return getFromGateway("/api/heartbeat", credentials, HeartbeatResponse.class);
        
    }
    
    public Acknowledgement heartbeat(String terminalName) throws Exception {
        
        return test(terminalName, defaultCredentials);
        
    }
    
    public Acknowledgement test(String terminalName, GatewayCredentials credentials) throws Exception {
        
        return postTerminal(terminalName, "/api/test", new TerminalRequest(credentials), Acknowledgement.class);
        
    }
    
    public ChargeResponse charge(String terminalName, ChargeRequest request) throws Exception {
        
        return postTerminal(terminalName, "/api/charge", request, ChargeResponse.class);
        
    }
    
    public ChargeResponse preauth(String terminalName, ChargeRequest request) throws Exception {
        
        return postTerminal(terminalName, "/api/preauth", request, ChargeResponse.class);
        
    }
    
    
    protected TerminalRouteResponse resolveTerminalRoute(String terminalName, GatewayCredentials credentials) {
        
        TerminalRouteResponse route = null;
        Map<String, TerminalRouteResponse> apiRoutes = routeCache.get(credentials.getApiKey());
        if (apiRoutes != null) {
            route = apiRoutes.get(terminalName);
        }
        if (route != null) {
            return route;
        }
        
        try {
            route = getFromGateway("/api/terminal-route?terminal=" + URLEncoder.encode(terminalName, "UTF-8"), credentials, TerminalRouteResponse.class);
            if (apiRoutes == null) {
                apiRoutes = new HashMap<>();
                routeCache.put(credentials.getApiKey(), apiRoutes);
            }
            apiRoutes.put(terminalName, route);
            
            return route;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        
        
        
    }
    
    
    protected String resolveTerminalHost(TerminalRouteResponse route) {
        
        return "http://" + route.getIpAddress() + ":8080";
        
    }
    
    protected String toFullyQualifiedTerminalPath(TerminalRouteResponse route, String path) {
        
        return resolveTerminalHost(route) + path;
        
    }
    
    
    protected <T> T postTerminal(String terminalName, String path, TerminalRequest request, Class<T> responseType) {
        
        if (request.getCredentials() == null) {
            request.setCredentials(defaultCredentials);
            request.setApiKey(defaultCredentials.getApiKey());
            request.setBearerToken(defaultCredentials.getBearerToken());
            request.setSigningKey(defaultCredentials.getSigningKey());
        }
        
        TerminalRouteResponse route = resolveTerminalRoute(terminalName, request.getCredentials());
        
        Map<String, String> headers = new HashMap<>();
        
        
        headers.put("Content-Type", "application/octet-stream");
        
        try {
            
            String body = objectMapper.writeValueAsString(request);

            HttpResponse<String> response = Unirest.post(toFullyQualifiedTerminalPath(route, path)).headers(headers).body(body).asString();
            
            if (response.getStatus() != 200) {
                throw new IllegalStateException(response.getStatusText());
            }

            String json = response.getBody();

            return objectMapper.readValue(json, responseType);
            
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        
    }
    
    protected <T> T getFromGateway(String path, GatewayCredentials credentials, Class<T> responseType) throws Exception {
        
        Map<String, String> headers = new HashMap<>();
        if (credentials != null) {
            headers = CryptoUtils.getInstance().generateApiHeaders(credentials.getApiKey(), credentials.getBearerToken(), credentials.getSigningKey());
        }
                
        HttpResponse<T> response = Unirest.get(this.toFullyQualifiedGatewayPath(path)).headers(headers).asObject(responseType);
        
        if (response.getStatus() != 200) {
            throw new IllegalStateException(response.getStatusText());
        }
        
        return response.getBody();
        
    }
    
    protected String toFullyQualifiedGatewayPath(String path) {
        return this.gatewayHost + path;
    }
    

}
