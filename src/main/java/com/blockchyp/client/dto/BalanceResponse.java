package com.blockchyp.client.dto;

/**
 * The response to a balance inquiry.
 *
 */
public class BalanceResponse extends Acknowledgement {

    private String remainingBalance;
    private String responseDescription;
    private String transactionType;
    private String tickBlock;
    private boolean test;
    private String sig;
    private String token;
    private String entryMethod;
    private String paymentType;
    private String maskedPan;
    private String publicKey;
    private boolean scopeAlert;
    private String cardHolder;
    private ReceiptSuggestions receiptSuggestions;

    /**
     * Gets the remaining balance on the payment method.
     * @return the remaining balance on the payment method.
     */
    public String getRemainingBalance() {
        return remainingBalance;
    }

    /**
     * Sets the remaining balance on the payment method.
     * @param remainingBalance the remaining balance on the payment method.
     */
    public void setRemainingBalance(String remainingBalance) {
        this.remainingBalance = remainingBalance;
    }

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

    /**
     * Sets the token if the transaction was an enrolling transaction. 
     * @return reusable payment token.
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the token if the transaction was an enrolling transaction.
     * @param token reusable payment token.
     */
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * Returns the entry method for a transaction.  This would be things like MSR, CHIP, KEYED, etc. 
     * @return transaction entry method code.
     */
    public String getEntryMethod() {
        return entryMethod;
    }

    /**
     * Sets the entry method for the transactions.
     * @param entryMethod transaction entry method code.
     */
    public void setEntryMethod(String entryMethod) {
        this.entryMethod = entryMethod;
    }

    /**
     * Returns the masked version of the PAN.
     * @return masked primary account number.
     */
    public String getMaskedPan() {
        return maskedPan;
    }

    /**
     * Sets the masked version of the PAN.
     * @param maskedPan masked primary account number.
     */
    public void setMaskedPan(String maskedPan) {
        this.maskedPan = maskedPan;
    }

    /**
     * Returns the blockchain public key if the user presented a BlockChyp payment card.
     * This would take the place of the PAN for BlockChyp gift cards.
     * @return blockchain public key.
     */
    public String getPublicKey() {
        return publicKey;
    }

    /**
     * Sets the payment method public key, if it's a blockchain method.
     * @param publicKey blockchain public key.
     */
    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    /**
     * Returns true if the transaction did something that would put the system in PCI scope.
     * @return scope alert flag.
     */
    public boolean isScopeAlert() {
        return scopeAlert;
    }

    /**
     * Sets the scope alert flag.
     * @param scopeAlert scope alert flag.
     */
    public void setScopeAlert(boolean scopeAlert) {
        this.scopeAlert = scopeAlert;
    }

    /**
     * Returns cardholder name.
     * @return card holder's name.
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
