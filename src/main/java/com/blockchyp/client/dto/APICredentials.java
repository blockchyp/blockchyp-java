package com.blockchyp.client.dto;

/**
 * Encapsulates the big three BlockChyp API credentials.
 * 
 */
public class APICredentials {

    private String apiKey;
    private String bearerToken;
    private String signingKey;


    /**
     * Default constructor.
     */
    public APICredentials() {

    }


    /**
     * Alternate constructor that initializes all the credential fields.
     * @param apiKey the API key
     * @param bearerToken the bearer token
     * @param signingKey the signing key.
     */
    public APICredentials(String apiKey, String bearerToken, String signingKey) {
        super();
        this.apiKey = apiKey;
        this.bearerToken = bearerToken;
        this.signingKey = signingKey;
    }



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
     * @return the bearer token.
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
     * Returns the signing key.  This is used to build HMAC signatures for API requests.
     * @return signing key.
     */
    public String getSigningKey() {
        return signingKey;
    }

    /**
     * Sets the signing key.
     * @param signingKey signing key.
     */
    public void setSigningKey(String signingKey) {
        this.signingKey = signingKey;
    }

}
