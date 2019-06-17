package com.blockchyp.client.dto;

/**
 * Models common information for all SDK requests.
 * 
 */
public class CoreRequest {


    private String transactionRef;
    private String destinationAccount;
    private boolean test;
    private int timeout;

    /**
     * Returns the transaction ref value.
     * @return - developer provided transaction id.
     */
    public String getTransactionRef() {
        return transactionRef;
    
    }

    /**
     * Sets the transaction ref value.  This is intended for your own identifiers.
     * @param transactionRef developer provided transaction id.
     */
    public void setTransactionRef(String transactionRef) {
        this.transactionRef = transactionRef;
    }

    /**
     * Returns the settlement account id.
     * @return settlement account id.
     */
    public String getDestinationAccount() {
        return destinationAccount;
    }

    /**
     * Sets the settlement account for merchants with split settlement enabled (not common).
     * @param destinationAccount settlement account id.
     */
    public void setDestinationAccount(String destinationAccount) {
        this.destinationAccount = destinationAccount;
    }

    /**
     * Sets the transaction test flag.
     * @return if true, the transaction will be routed to the test gateway.
     */
    public boolean isTest() {
        return test;
    }

    /**
     * Sets the test transaction flag.
     * @param test if true, the transaction will be routed to the test gateway.
     */
    public void setTest(boolean test) {
        this.test = test;
    }

    /**
     * Returns the request timeout.
     * @return timeout in ms.
     */
    public int getTimeout() {
        return timeout;
    }

    /**
     * Sets the request timeout.
     * @param timeout timeout in ms.
     */
    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }
    

}
