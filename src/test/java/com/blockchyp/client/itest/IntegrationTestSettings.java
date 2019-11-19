package com.blockchyp.client.itest;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class IntegrationTestSettings {

    private String gatewayUrl;
    private String testGatewayUrl;
    private String defaultTerminalName;
    private String defaultTerminalAddress;
    private String apiKey;
    private String bearerToken;
    private String signingKey;

    @JsonProperty("gateway")
    public String getGatewayUrl() {
        return gatewayUrl;
    }

    public void setGatewayUrl(String gatewayUrl) {
        this.gatewayUrl = gatewayUrl;
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

    @JsonProperty("testGateway")
    public String getTestGatewayUrl() {
        return testGatewayUrl;
    }

    public void setTestGatewayUrl(String testGatewayUrl) {
        this.testGatewayUrl = testGatewayUrl;
    }



}
