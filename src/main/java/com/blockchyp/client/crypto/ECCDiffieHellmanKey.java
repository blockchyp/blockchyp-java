package com.blockchyp.client.crypto;

public class ECCDiffieHellmanKey {
    
    private String publicKeyFormat;
    private String privateKeyFormat;
    private String publicKey;
    private String privateKey;


    public String getPublicKey() {
        return publicKey;
    }
    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }
    public String getPrivateKey() {
        return privateKey;
    }
    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }
    public String getPublicKeyFormat() {
        return publicKeyFormat;
    }
    public void setPublicKeyFormat(String publicKeyFormat) {
        this.publicKeyFormat = publicKeyFormat;
    }
    public String getPrivateKeyFormat() {
        return privateKeyFormat;
    }
    public void setPrivateKeyFormat(String privateKeyFormat) {
        this.privateKeyFormat = privateKeyFormat;
    }
    
    

}
