package com.blockchyp.client;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class IntegrationTestSettings {
    
    private String gatewayHost;
    private String testGatewayHost;
    private String defaultTerminalName;
    private String defaultTerminalAddress;
    private String apiKey;
    private String bearerToken;
    private String signingKey;
    public String getGatewayHost() {
        return gatewayHost;
    }
    public void setGatewayHost(String gatewayHost) {
        this.gatewayHost = gatewayHost;
    }
    public String getDefaultTerminalName() {
        return defaultTerminalName;
    }
    public void setDefaultTerminalName(String defaultTerminalName) {
        this.defaultTerminalName = defaultTerminalName;
    }
    public String getDefaultTerminalAddress() {
        return defaultTerminalAddress;
    }
    public void setDefaultTerminalAddress(String defaultTerminalAddress) {
        this.defaultTerminalAddress = defaultTerminalAddress;
    }
    public String getApiKey() {
        return apiKey;
    }
    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
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
    public String getTestGatewayHost() {
        return testGatewayHost;
    }
    public void setTestGatewayHost(String testGatewayHost) {
        this.testGatewayHost = testGatewayHost;
    }
    
    

}
