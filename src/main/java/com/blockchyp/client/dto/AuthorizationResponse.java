package com.blockchyp.client.dto;

/**
 * Models a terminal authorization response.
 * 
 */
public class AuthorizationResponse extends ApprovalResponseWithPaymentMethod {

    private boolean storeAndForward;

    /**
     * Gets the store and forward flag.
     * @return if true, the associated transaction is was flagged for store and forward due to network problems.
     */
    public boolean isStoreAndForward() {
        return storeAndForward;
    }

    /**
     * Sets the store and forward flag.
     * @param storeAndForward if true, the associated transaction is was flagged for store and forward due to network problems.
     */
    public void setStoreAndForward(boolean storeAndForward) {
        this.storeAndForward = storeAndForward;
    }

}
