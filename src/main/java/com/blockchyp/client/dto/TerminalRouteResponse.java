package com.blockchyp.client.dto;

import java.util.Date;

public class TerminalRouteResponse extends Acknowledgement {
    
	private boolean exists;
    private String terminalName;
    private String ipAddress;
    private boolean cloudRelayEnabled;
    private APICredentials transientCredentials;
    private String publicKey;
    private RawPublicKey rawKey;
    private Date timestamp;
    
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
    public RawPublicKey getRawKey() {
        return rawKey;
    }
    public void setRawKey(RawPublicKey rawKey) {
        this.rawKey = rawKey;
    }
	public boolean isExists() {
		return exists;
	}
	public void setExists(boolean exists) {
		this.exists = exists;
	}
	public boolean isCloudRelayEnabled() {
		return cloudRelayEnabled;
	}
	public void setCloudRelayEnabled(boolean cloudRelayEnabled) {
		this.cloudRelayEnabled = cloudRelayEnabled;
	}
	public APICredentials getTransientCredentials() {
		return transientCredentials;
	}
	public void setTransientCredentials(APICredentials transientCredentials) {
		this.transientCredentials = transientCredentials;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
    
    

}
