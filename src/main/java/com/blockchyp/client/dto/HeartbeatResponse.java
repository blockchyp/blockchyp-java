package com.blockchyp.client.dto;

import java.util.Date;

/**
 * This class models heartbeat responses. The heartbeat API always returns a
 * response unless you provided invalid credentials. If you send no credentials,
 * you'll get a response, but without a merchant public key. The idea here is to
 * make it easy to troubleshoot and test the authentication code.
 * 
 */
public class HeartbeatResponse extends Acknowledgement {

    /**
     * The current time as returned by the BlockChyp gateway.
     */
    private Date timestamp;


    private String clockchain;
    private String latestTick;

    private String merchantPk;

    /**
     * Returns the timestamp on the server at the time the heartbeat request was processed.
     * @return java.util.Date
     */
    public Date getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the timestamp.
     * @param timestamp java.util.Date
     */
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * Gets the hash of the latest tick block on the clockchain.
     * @return tick block hash.
     */
    public String getLatestTick() {
        return latestTick;
    }

    /**
     * Sets the hash of the latest tick block on the clockchain.
     * @param latestTick tick block hash.
     */
    public void setLatestTick(String latestTick) {
        this.latestTick = latestTick;
    }

    /**
     * Gets the public key of the clockchain. This is blockchain stuff you don't really
     * need to worry about. This is a Base 58 encoded and compressed Elliptic Curve Public Key.
     * 
     * For the production clockchain this is always
     * '3cuhsckVUd9HzMjbdUSW17aY5kCcm1d6YAphJMUwmtXRj7WLyU'.
     * 
     * @return Base58 encoded public key of the clock chain.
     */
    public String getClockchain() {
        return clockchain;
    }

    /**
     * Sets the public key of the clockchain.
     * @param clockchain Base58 encoded and compressed ECC public key.
     */
    public void setClockchain(String clockchain) {
        this.clockchain = clockchain;
    }

    /**
     * Gets the public key for the merchant's blockchain.
     * @return Base58 encoded and compressed ECC public key.
     */
    public String getMerchantPk() {
        return merchantPk;
    }

    /**
     * Sets the public key of the merchant's blockchain.
     * @param merchantPk Base58 encoded and compressed ECC public key.
     */
    public void setMerchantPk(String merchantPk) {
        this.merchantPk = merchantPk;
    }

}
