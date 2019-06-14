package com.blockchyp.client.dto;

/**
 * Models the information needed to capture a preauthorization.
 */
public class CaptureRequest extends AmountRequest {

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
     * @param transactionId - transaction id.
     */
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

}
