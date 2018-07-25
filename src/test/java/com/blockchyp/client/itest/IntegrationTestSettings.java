package com.blockchyp.client.itest;

public class IntegrationTestSettings {
    
    private String gatewayHost;
    private String defaultTerminalName;
    private String defaultTerminalAddress;
    private String apiId;
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
    public String getApiId() {
        return apiId;
    }
    public void setApiId(String apiId) {
        this.apiId = apiId;
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
