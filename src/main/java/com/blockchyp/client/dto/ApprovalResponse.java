package com.blockchyp.client.dto;

/**
 * This is a primitive base class for responses that include some kind of network approval information.
 * 
 */
public class ApprovalResponse extends CoreResponse {

    private boolean approved;
    private String authCode;
    private String sigFile;

    /**
     * Returns the approved flag.
     * @return if true, the transaction was approved.
     */
    public boolean isApproved() {
        return approved;
    }

    /**
     * Sets the approved flag.
     * @param approved - if true, the transaction was approved.
     */
    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    /**
     * Returns the auth code from the payment network.
     * @return - network auth code.
     */
    public String getAuthCode() {
        return authCode;
    }

    /**
     * Sets the auth code from the payment network.
     * @param authCode - network auth code.
     */
    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    /**
     * Returns the sig file data if requested.  The request specifies a format or filename.
     * @return - signature file data in hex.
     */
    public String getSigFile() {
        return sigFile;
    }

    /**
     * Sets the signature file hex.
     * @param sigFile - signature file data in hex.
     */
    public void setSigFile(String sigFile) {
        this.sigFile = sigFile;
    }

}
