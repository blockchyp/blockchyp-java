package com.blockchyp.client.dto;

public class KeyExchangeResponse {
    
    private String publicKey;
    private String sig;
    private RawSignature rawSig;
    public String getPublicKey() {
        return publicKey;
    }
    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }
    public String getSig() {
        return sig;
    }
    public void setSig(String sig) {
        this.sig = sig;
    }
    public RawSignature getRawSig() {
        return rawSig;
    }
    public void setRawSig(RawSignature rawSig) {
        this.rawSig = rawSig;
    }
    
    

}
