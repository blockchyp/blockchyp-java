package com.blockchyp.client.dto;

public class KeyExchangeRequest {
    private String publicKey;
    private String handshake;

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public String getHandshake() {
        return handshake;
    }

    public void setHandshake(String handshake) {
        this.handshake = handshake;
    }
    
    
    
}
