package com.blockchyp.client.dto;

public class TerminalRouteResponse extends Acknowledgement {
    
    private String terminalName;
    private String ipAddress;
    private String publicKey;
    private TerminalKey rawKey;
    public String getTerminalName() {
        return terminalName;
    }
    public void setTerminalName(String terminalName) {
        this.terminalName = terminalName;
    }
    public String getIpAddress() {
        return ipAddress;
    }
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }
    public String getPublicKey() {
        return publicKey;
    }
    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }
    public TerminalKey getRawKey() {
        return rawKey;
    }
    public void setRawKey(TerminalKey rawKey) {
        this.rawKey = rawKey;
    }
    
    

}
