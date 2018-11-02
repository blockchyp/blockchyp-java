package com.blockchyp.client.dto;

import com.blockchyp.client.GatewayCredentials;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class TerminalRequest {
    
    private String apiKey;
    private String bearerToken;
    private String signingKey;
    private GatewayCredentials creds;
    
    public TerminalRequest() {
        
    }
    
    public TerminalRequest(GatewayCredentials creds) {
        this.creds = creds;
        this.apiKey = creds.getApiKey();
        this.bearerToken = creds.getBearerToken();
        this.signingKey = creds.getSigningKey();
    }
    
    @JsonIgnore
    public GatewayCredentials getCredentials() {
        return creds;
    }
    
    public void setCredentials(GatewayCredentials creds) {
        this.creds = creds;
    }
    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public GatewayCredentials getCreds() {
        return creds;
    }

    public void setCreds(GatewayCredentials creds) {
        this.creds = creds;
    }

    public String getBearerToken() {
        return bearerToken;
    }
    public void setBearerToken(String bearerToken) {
        this.bearerToken = bearerToken;
    }
    public String getSigningKey() {
        return signingKey;
    }
    public void setSigningKey(String signingKey) {
        this.signingKey = signingKey;
    }


}
