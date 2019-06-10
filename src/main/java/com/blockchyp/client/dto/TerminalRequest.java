package com.blockchyp.client.dto;

public class TerminalRequest {
    
    private String apiKey;
    private String bearerToken;
    private String signingKey;
    private Object request;
    
    public TerminalRequest() {
        
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

	public Object getRequest() {
		return request;
	}

	public void setRequest(Object request) {
		this.request = request;
	}


}
