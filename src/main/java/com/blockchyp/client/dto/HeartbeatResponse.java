package com.blockchyp.client.dto;

import java.util.Date;

/**
 * This class models heartbeat responses. The heartbeat API always returns a response unless
 * you provided invalid credentials.  If you send no credentials, you'll get a response, but without
 * a merchant public key.  The idea here is to make it easy to troubleshoot and test the authentication
 * code.
 * 
 * @author jeffreydpayne
 *
 */
public class HeartbeatResponse extends Acknowledgement {
    
	/** 
	 * The current time as returned by the BlockChyp gateway.
	 */
    private Date timestamp;
    
    /**
     * The public key of the clockchain.  This is blockchain stuff you don't really need to worry about.
     * For the production blockchain this is always '3cuhsckVUd9HzMjbdUSW17aY5kCcm1d6YAphJMUwmtXRj7WLyU'.
     * 
     */
    private String clockchain;
    
    /**
     * Hash of the latest clockchain tick block.  This is blockchain time.
     */
    private String latestTick;
    
    /**
     * The blockchain public key of the merchant account your credentials resolved to.
     */
    private String merchantPk;
    
    
    public Date getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
    public String getLatestTick() {
        return latestTick;
    }
    public void setLatestTick(String latestTick) {
        this.latestTick = latestTick;
    }
	public String getClockchain() {
		return clockchain;
	}
	public void setClockchain(String clockchain) {
		this.clockchain = clockchain;
	}
	public String getMerchantPk() {
		return merchantPk;
	}
	public void setMerchantPk(String merchantPk) {
		this.merchantPk = merchantPk;
	}


    
    

}
