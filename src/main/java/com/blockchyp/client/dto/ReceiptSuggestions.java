package com.blockchyp.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This class models information we recommend you put on your receipts.
 * 
 */

public class ReceiptSuggestions {

    private String aid;

    private String arqc;

    private String iad;

    private String arc;

    private String tc;

    private String tsi;

    private String terminalId;

    private String merchantName;

    private String merchantKey;

    private String applicationLabel;

    private boolean requestSignature;

    private String maskedPan;

    private String authorizedAmount;

    private String transactionType;

    private String entryMethod;

    private boolean pinVerified;

    private String cashBackAmount;

    /**
     * Returns EMV issuer application data, a mysterious value the card issuer sends with every EMV transaction.
     * @return issuer application data.
     */
    @JsonProperty("IAD")
    public String getIad() {
        return iad;
    }

    /**
     * Sets the Issuer Application Data tag.
     * @param iad issuer application data.
     */
    public void setIad(String iad) {
        this.iad = iad;
    }

    /**
     * Gets the EMV authorization response code (Tag 8A).  This is the EMV response returned by the 
     * payment network.
     * 
     * @return application response code.
     */
    @JsonProperty("ARC")
    public String getArc() {
        return arc;
    }

    /**
     * Sets EMV authorization response Code.
     * @param arc authorization response code.
     */
    public void setArc(String arc) {
        this.arc = arc;
    }

    /**
     * Returns the EMV Transaction Status Information Tag (Tag 9B).
     * This is a bitfield indicating what type of risk management and security checks the terminal
     * did during the transaction.  Recommended for receipts, but not required.
     * @return transaction status information.
     */
    @JsonProperty("TSI")
    public String getTsi() {
        return tsi;
    }

    /**
     * Sets the EMV transaction status information tag.
     * @param tsi transaction status information.
     */
    public void setTsi(String tsi) {
        this.tsi = tsi;
    }

    /**
     * Returns the terminal id.  Required on receipts.
     * @return terminal identifier.
     */
    public String getTerminalId() {
        return terminalId;
    }

    /**
     * Sets the terminal identifier.
     * @param terminalId terminal identifier.
     */
    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    /**
     * Returns the name of the merchant.  Required on receipts.
     * @return merchant's business name.
     */
    public String getMerchantName() {
        return merchantName;
    }

    /**
     * Sets the merchant name.
     * @param merchantName merchant's business name.
     */
    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    /**
     * Returns a partially masked merchant key in order to ensure compliance with 
     * EMV receipt requirements.
     * @return merchant identifier required on receipts.
     */
    public String getMerchantKey() {
        return merchantKey;
    }

    /**
     * Sets the merchant key.
     * @param merchantKey merchant identifier required on receipts.
     */
    public void setMerchantKey(String merchantKey) {
        this.merchantKey = merchantKey;
    }

    /**
     * Returns the application label.  This is usually a description of the AID. ("US Common Debit", etc.)
     * @return label associated with the AID.
     */
    public String getApplicationLabel() {
        return applicationLabel;
    }

    /**
     * Sets the application label.
     * @param applicationLabel label associated with the AID.
     */
    public void setApplicationLabel(String applicationLabel) {
        this.applicationLabel = applicationLabel;
    }

    /**
     * Gets the request signature flag.
     * @return if true, a signature is required for this transaction.
     */
    public boolean isRequestSignature() {
        return requestSignature;
    }

    /**
     * Sets the request signature flag.
     * @param requestSignature if true, a signature is required for this transaction.
     */
    public void setRequestSignature(boolean requestSignature) {
        this.requestSignature = requestSignature;
    }

    /**
     * Returns the amount authorized by the network.  Could be less than the requested amount for partial gift cards, etc.
     * @return authorized transaction amount.
     */
    public String getAuthorizedAmount() {
        return authorizedAmount;
    }

    /**
     * Sets the authorized amount as a localized string.
     * @param authorizedAmount authorized transaction amount.
     */
    public void setAuthorizedAmount(String authorizedAmount) {
        this.authorizedAmount = authorizedAmount;
    }

    /**
     * Returns the transaction type. (CHARGE, PREAUTH, REFUND, etc.)
     * @return the transaction type code.
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
     * Returns the EMV application identifier.  This is required on receipts for all EMV transactions.
     * @return EMV application identifier.
     */
    @JsonProperty("AID")
    public String getAid() {
        return aid;
    }

    /**
     * Sets the EMV application identifier.
     * @param aid EMV application identifier.
     */
    public void setAid(String aid) {
        this.aid = aid;
    }

    /**
     * Gets the masked PAN.  This is the last four of the card number prepended with * characters.
     * @return masked PAN.
     */
    public String getMaskedPan() {
        return maskedPan;
    }

    /**
     * Sets the masked primary account number. 
     * @param maskedPan masked primary account number.
     */
    public void setMaskedPan(String maskedPan) {
        this.maskedPan = maskedPan;
    }

    /**
     * Gets the EMV transaction certificate.  This is another kind of digital signature typically used for offline authorizations.
     * @return Transaction Certificate.
     */
    @JsonProperty("TC")
    public String getTc() {
        return tc;
    }

    /**
     * Sets the EMV transaction certificate.
     * @param tc Transaction Certificate.
     */
    public void setTc(String tc) {
        this.tc = tc;
    }

    /**
     * Gets the ARQC, the application request cryptogram.  This is a digital fingerprint for an online EMV transaction.
     * @return Application Request Cryptogram 
     */
    @JsonProperty("ARQC")
    public String getArqc() {
        return arqc;
    }

    /**
     * Sets the ARQC.
     * @param arqc Application Request Cryptogram 
     */
    public void setArqc(String arqc) {
        this.arqc = arqc;
    }

    /**
     * Gets whether or not PIN verification was performed.
     * @return whether or not PIN verification was performed
     */
    public boolean isPinVerified() {
        return pinVerified;
    }

    /**
     * Sets whether or not PIN verification was performed.
     * @param pinVerified whether or not PIN verification was performed
     */
    public void setPinVerified(boolean pinVerified) {
        this.pinVerified = pinVerified;
    }

    /**
     * Gets the authorized cash back amount.
     * @return the authorized cash back amount.
     */
    public String getCashBackAmount() {
        return cashBackAmount;
    }

    /**
     * Sets the authorized cash back amount.
     * @param cashBackAmount the authorized cash back amount.
     */
    public void setCashBackAmount(String cashBackAmount) {
        this.cashBackAmount = cashBackAmount;
    }

}
