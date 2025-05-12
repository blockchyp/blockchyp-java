package com.blockchyp.client;

import java.util.Date;

import com.blockchyp.client.dto.Acknowledgement;

/**
 * Models metadata about a terminal route, including it's location on the local network
 * and transient credentials.
 * 
 */

public class TerminalRouteResponse extends Acknowledgement {

    private boolean success;
    private String error;
    private boolean exists;
    private String terminalName;
    private String ipAddress;
    private boolean cloudRelayEnabled;
    private APICredentials transientCredentials;
    private String publicKey;
    private RawPublicKey rawKey;
    private Date timestamp;
    
    /**
     * Gets the success flag.
     * @return true if the API call succeeded.
     */
    public boolean isSuccess() {
        return success;
    }

    /**
     * Sets the success flag.
     * 
     * @param success true if the API call succeeded.
     */
    public void setSuccess(boolean success) {
        this.success = success;
    }

    /**
     * Gets a narrative description of the error, if any.
     * @return narrative description of any error.
     */
    public String getError() {
        return error;
    }

    /**
     * Sets a narrative description of the error, if any.
     * @param error narrative description of any error.
     */
    public void setError(String error) {
        this.error = error;
    }

    /**
     * Echoes back the terminal name for the route lookup.
     * @return name of the terminal assigned at activation.
     */
    public String getTerminalName() {
        return terminalName;
    }

    /**
     * Sets the terminal name.
     * @param terminalName name of the terminal assigned at activation.
     */
    public void setTerminalName(String terminalName) {
        this.terminalName = terminalName;
    }

    /**
     * Returns the current local IP address of the terminal on its local subnet. Updated every hour.
     * @return  standard IPv4 IP address.
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * Sets the local IP address.
     * @param ipAddress standard IPv4 IP address.
     */
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }
    
    /**
     * Gets the public key of the terminal.  This can be used to verify the digital signature of a terminal response and
     * detect man in the middle attacks.
     * 
     * @return Base58 encoded compressed public key.
     */
    public String getPublicKey() {
        return publicKey;
    }

    /**
     * Sets the compressed public key for the terminal.
     * @param publicKey Base58 encoded compressed public key.
     */
    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    /**
     * Gets the raw public key of the terminal.  This is for situations where working with the compressed and
     * encoded public key is too difficult.
     * @return Elliptic Curve Public Key.
     */
    public RawPublicKey getRawKey() {
        return rawKey;
    }

    /**
     * Sets the raw public key of the terminal.
     * @param rawKey Elliptic Curve Public Key.
     */
    public void setRawKey(RawPublicKey rawKey) {
        this.rawKey = rawKey;
    }

    /**
     * Gets the exists flag.
     * @return true if the terminal exists.
     */
    public boolean isExists() {
        return exists;
    }

    /**
     * Sets the exists flag.
     * @param exists true if the terminal exists.
     */
    public void setExists(boolean exists) {
        this.exists = exists;
    }

    /**
     * Returns the cloud relay flag.  If true, then all requests for the terminal are relayed through the 
     * payment gateway instead of sent over the local network.  This would typically be done in situations
     * where the terminal and the client application are on difference subnets.
     * @return true if cloud relay is enabled.
     */
    public boolean isCloudRelayEnabled() {
        return cloudRelayEnabled;
    }

    /**
     * Sets the cloud relay flag.
     * @param cloudRelayEnabled true if cloud relay is enabled.
     */
    public void setCloudRelayEnabled(boolean cloudRelayEnabled) {
        this.cloudRelayEnabled = cloudRelayEnabled;
    }

    /**
     * Gets transient credentials to be used with the terminal route.
     * @return {@link APICredentials}
     */
    public APICredentials getTransientCredentials() {
        return transientCredentials;
    }

    /**
     * Sets transient credentials to be used with the terminal route.  Transient credentials protect your root credentials
     * in situations where https communication with the local terminal is not feasible.
     * 
     * @param transientCredentials {@link APICredentials}
     */
    public void setTransientCredentials(APICredentials transientCredentials) {
        this.transientCredentials = transientCredentials;
    }

    /**
     * Gets the timestamp associated with the route request.  Used for cache expiry.
     * @return date and time the route request was processed.
     */
    public Date getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the timestamp associated with the route request.  Used for cache expiry.
     * @param timestamp date and time the route request was processed.
     */
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getUri(String path) {
        return "https://" + this.ipAddress + path;
    }

}
