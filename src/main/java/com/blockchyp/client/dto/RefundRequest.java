package com.blockchyp.client.dto;

/**
 * This class models information needed to process refunds.
 * Similar to payment requests except that it's possible (and recommended)
 * for refunds to reference a transaction instead of providing card data.
 * 
 */

public class RefundRequest extends PaymentRequest {

    private String transactionId;

    /**
     * Gets the id of the transaction being refunded.
     * @return - id of a previous transaction to be refunded.
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the id of the transaction being refunded.
     * @param transactionId - id of a previous transaction to be refunded.
     */
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

}
