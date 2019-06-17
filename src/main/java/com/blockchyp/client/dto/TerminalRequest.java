package com.blockchyp.client.dto;

/**
 * This class is used to wrap conventional transaction requests with an outer structure that adds API credentials.
 * This is done because the terminal talks to the gateway directly and will need to generate gateway API headers.
 * 
 * The credentials should almost always be transient credentials.
 * 
 */
public class TerminalRequest {

    private String apiKey;
    private String bearerToken;
    private String signingKey;
    private Object request;

    /**
     * Returns the API key.
     * @return the API key.
     */
    public String getApiKey() {
        return apiKey;
    }

    /**
     * Sets the API key.
     * @param apiKey the API key.
     */
    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    /**
     * Returns the bearer token.
     * @return bearer token.
     */
    public String getBearerToken() {
        return bearerToken;
    }

    /**
     * Sets the bearer token.
     * @param bearerToken the bearer token.
     */
    public void setBearerToken(String bearerToken) {
        this.bearerToken = bearerToken;
    }

    /**
     * Returns the signing key.
     * @return the signing key.
     */
    public String getSigningKey() {
        return signingKey;
    }

    /**
     * Sets the signing key.
     * @param signingKey the signing key.
     */
    public void setSigningKey(String signingKey) {
        this.signingKey = signingKey;
    }

    /**
     * Returns the underlying request object.
     * @return the underlying request. 
     */
    public Object getRequest() {
        return request;
    }

    /**
     * Sets the underlying request.
     * @param request the underlying request.
     */
    public void setRequest(Object request) {
        this.request = request;
    }

}
