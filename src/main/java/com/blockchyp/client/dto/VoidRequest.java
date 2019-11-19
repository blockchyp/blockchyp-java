package com.blockchyp.client.dto;

/**
 * Voids a previous transaction in the current batch.
 * 
 */

public class VoidRequest extends CoreRequest {

    private String transactionId;


    /**
     * Returns the transaction id being captured.
     * @return transaction id.
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the transaction id for the previous transaction being captured. Required.
     * @param transactionId transaction id.
     */
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

}
