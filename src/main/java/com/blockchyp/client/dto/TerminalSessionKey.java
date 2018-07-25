package com.blockchyp.client.dto;

public class TerminalSessionKey {

    private String privateKey;
    private String publicKey;
    private String derivedKey;
    public String getPrivateKey() {
        return privateKey;
    }
    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }
    public String getPublicKey() {
        return publicKey;
    }
    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }
    public String getDerivedKey() {
        return derivedKey;
    }
    public void setDerivedKey(String derivedKey) {
        this.derivedKey = derivedKey;
    }
    
    
    
}
