package com.blockchyp.client;

import java.util.Map;

import com.google.gson.annotations.SerializedName;

public class IntegrationTestSettings {

    @SerializedName("gatewayHost")
    private String gatewayHost;

    @SerializedName("testGatewayHost")
    private String testGatewayHost;

    @SerializedName("dashboardHost")
    private String dashboardHost;

    @SerializedName("defaultTerminalName")
    private String defaultTerminalName;

    @SerializedName("defaultTerminalAddress")
    private String defaultTerminalAddress;

    @SerializedName("apiKey")
    private String apiKey;

    @SerializedName("bearerToken")
    private String bearerToken;

    @SerializedName("signingKey")
    private String signingKey;

    @SerializedName("profiles")
    private Map<String, TestAPICredentials> profiles;

    public Map<String, TestAPICredentials> getProfiles() {
        return profiles;
    }

    public void setProfiles(Map<String, TestAPICredentials> profiles) {
        this.profiles = profiles;
    }

    public String getDashboardHost() {
        return dashboardHost;
    }

    public void setDashboardHost(String dashboardHost) {
        this.dashboardHost = dashboardHost;
    }

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

    public TestAPICredentials getProfile(String profile) {
        if (profile.equals("")) {
            TestAPICredentials creds = new TestAPICredentials();
            creds.apiKey = getApiKey();
            creds.bearerToken = getBearerToken();
            creds.signingKey = getSigningKey();
            return creds;
        }
        return profiles.get(profile);
    }

    public static class TestAPICredentials {

        @SerializedName("apiKey")
        private String apiKey;

        @SerializedName("bearerToken")
        private String bearerToken;

        @SerializedName("signingKey")
        private String signingKey;

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
    }
}
