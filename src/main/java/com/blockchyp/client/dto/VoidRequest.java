package com.blockchyp.client.dto;

/**
 * Voids a previous transaction in the current batch.
 * 
 */

public class VoidRequest extends CoreRequest {

    private String token;
    private String entryMethod;
    private String paymentType;
    private String maskedPan;
    private String publicKey;
    private boolean scopeAlert;
    private String cardHolder;
    private ReceiptSuggestions receiptSuggestions;
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

    /**
     * Sets the token if the transaction was an enrolling transaction. 
     * @return - reusable payment token.
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the token if the transaction was an enrolling transaction.
     * @param token - reusable payment token.
     */
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * Returns the entry method for a transaction.  This would be things like MSR, CHIP, KEYED, etc. 
     * @return - transaction entry method code.
     */
    public String getEntryMethod() {
        return entryMethod;
    }

    /**
     * Sets the entry method for the transactions.
     * @param entryMethod - transaction entry method code.
     */
    public void setEntryMethod(String entryMethod) {
        this.entryMethod = entryMethod;
    }

    /**
     * Returns the payment type.  This would be the card brand (VISA, MC, AMEX, etc.)
     * @return - payment type.
     */
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * Sets the payment type.  This would be the card brand (VISA, MC, AMEX, etc.)
     * @param paymentType - payment type.
     */
    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    /**
     * Returns the masked version of the PAN.
     * @return maksed primary account number.
     */
    public String getMaskedPan() {
        return maskedPan;
    }

    /**
     * Sets the masked version of the pan.
     * @param maskedPan - masked primary account number.
     */
    public void setMaskedPan(String maskedPan) {
        this.maskedPan = maskedPan;
    }

    /**
     * Returns the blockchain public key if the user presented a BlockChyp payment card.
     * This would take the place of PAN for BlockChyp gift cards.
     * @return - blockchain public key.
     */
    public String getPublicKey() {
        return publicKey;
    }

    /**
     * Sets the payment method public key, if it's a blockchain method.
     * @param publicKey - blockchain public key.
     */
    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    /**
     * Returns true if the transaction did something that would put the system in PCI scope.
     * @return - scope alert flag.
     */
    public boolean isScopeAlert() {
        return scopeAlert;
    }

    /**
     * Sets the scope alert flag.
     * @param scopeAlert - scope alert flag.
     */
    public void setScopeAlert(boolean scopeAlert) {
        this.scopeAlert = scopeAlert;
    }
    
    /**
     * Returns cardholder name.
     * @return - card holder's name.
     */
    public String getCardHolder() {
        return cardHolder;
    }

    /**
     * Sets cardholder name.
     * @param cardHolder card holder's name.
     */
    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    /**
     * Returns receipt suggestions.
     * @return {@link ReceiptSuggestions}
     */
    public ReceiptSuggestions getReceiptSuggestions() {
        return receiptSuggestions;
    }

    /**
     * Sets receipt suggestions.
     * @param receiptSuggestions {@link ReceiptSuggestions}
     */
    public void setReceiptSuggestions(ReceiptSuggestions receiptSuggestions) {
        this.receiptSuggestions = receiptSuggestions;
    }

}
