package com.blockchyp.client.dto;

/**
 * Models elements almost all API responses have in common.
 * 
 */
public class CoreResponse {

    private String responseDescription;
    private String transactionId;
    private String batchId;
    private String transactionRef;
    private String transactionType;
    private String timestamp;
    private String tickBlock;
    private boolean test;
    private String sig;

    /**
     * Returns the response description. This will return extra detail if a transaction is not approved.
     * @return response description.
     */
    public String getResponseDescription() {
        return responseDescription;
    }

    /**
     * Sets the response description.
     * @param responseDescription response description.
     */
    public void setResponseDescription(String responseDescription) {
        this.responseDescription = responseDescription;
    }

    /**
     * Returns the transaction id assigned to the transaction.
     * @return transaction id.
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the transaction id.
     * @param transactionId transaction id.
     */
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * Returns the batch id assigned to the transaction.
     * @return transaction id.
     */
    public String getBatchId() {
        return batchId;
    }

    /**
     * Sets the batch id.
     * @param batchId batch id.
     */
    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    /**
     * Echoes back the transaction ref from the original request. 
     * @return transaction ref.
     */
    public String getTransactionRef() {
        return transactionRef;
    }

    /**
     * Sets the transaction ref.
     * @param transactionRef transaction ref.
     */
    public void setTransactionRef(String transactionRef) {
        this.transactionRef = transactionRef;
    }

    /**
     * Echoes back the transaction type from the original request.
     * @return transaction type.
     */
    public String getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the transaction type.
     * @param transactionType transaction type.
     */
    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    /**
     * Returns the timestamp on the server at the time the heartbeat request was processed.
     * @return java.util.Date
     */
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the timestamp.
     * @param timestamp java.util.Date
     */
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * Returns the last tick block hash.
     * @return tick block hash.
     */
    public String getTickBlock() {
        return tickBlock;
    }

    /**
     * Hash of the latest tick block.  This is essentially a blockchain timestamp.
     * @param tickBlock the tick block hash.
     */
    public void setTickBlock(String tickBlock) {
        this.tickBlock = tickBlock;
    }

    /**
     * Echoes back the test flag set on the original request.
     * @return the test flag.
     */
    public boolean isTest() {
        return test;
    }

    /**
     * Sets the test flag.
     * @param test the test flag.
     */
    public void setTest(boolean test) {
        this.test = test;
    }

    /**
     * Returns the ECC signature of the response.  Can be used to ensure it was signed by the terminal
     * and detect man in the middle attacks.
     * 
     * @return ECCDSA signature in hex format.
     */
    public String getSig() {
        return sig;
    }

    /**
     * Sets the response signature.
     * @param sig ECCDSA signature in hex format.
     */
    public void setSig(String sig) {
        this.sig = sig;
    }

}
