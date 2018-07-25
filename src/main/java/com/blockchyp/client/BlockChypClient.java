package com.blockchyp.client;

import java.io.IOException;

import com.blockchyp.client.dto.HeartbeatResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.ObjectMapper;
import com.mashape.unirest.http.Unirest;

public class BlockChypClient {
    
    
    private String gatewayHost = "https://api.blockchyp.com";
    private GatewayCredentials defaultCredentials;
    
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
    
    protected <T> T getFromGateway(String path, GatewayCredentials credentials, Class<T> responseType) throws Exception {
        
        HttpResponse<T> response = Unirest.get(this.toFullyQualifiedGatewayPath(path)).asObject(responseType);
        
        if (response.getStatus() != 200) {
            throw new IllegalStateException(response.getStatusText());
        }
        
        return response.getBody();
        
    }
    
    protected String toFullyQualifiedGatewayPath(String path) {
        return this.gatewayHost + path;
    }
    

}
