package com.blockchyp.client.dto;


/**
 * Models the amount data for transaction responses that have associated currency amounts.
 * 
 */
public class ApprovalResponseWithAmounts extends ApprovalResponse {

    private boolean partialAuth;
    private String altCurrency;
    private String currencyCode;
    private String requestedAmount;
    private String authorizedAmount;
    private String tipAmount;
    private String taxAmount;

    /**
     * Returns true if this was a partial authorization.
     * @return if true, the authorized amount is less than the requested amount.
     */
    public boolean isPartialAuth() {
        return partialAuth;
    }

    /**
     * Sets the partial auth flag.
     * @param partialAuth if true, the authorized amount is less than the requested amount.
     */
    public void setPartialAuth(boolean partialAuth) {
        this.partialAuth = partialAuth;
    }

    /**
     * Returns alternate currency code, if relevant.  This would typically be returned
     * if the user opted to pay in cryptocurrency.
     * @return alt currency code (e.g. BTC)
     */
    public String getAltCurrency() {
        return altCurrency;
    }

    /**
     * Sets alternate currency code if selected by the consumer.
     * @param altCurrency alt currency code.
     */
    public void setAltCurrency(String altCurrency) {
        this.altCurrency = altCurrency;
    }

    /**
     * Returns the currency code.
     * @return three character ISO currency code (e.g. "USD")
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the currency code.
     * @param currencyCode three character ISO currency code (e.g. "USD")
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * Returns the requested amount.
     * @return the requested amount.
     */
    public String getRequestedAmount() {
        return requestedAmount;
    }

    /**
     * Sets the requested amount.
     * @param requestedAmount requested amount.
     */
    public void setRequestedAmount(String requestedAmount) {
        this.requestedAmount = requestedAmount;
    }

    /**
     * Returns the authorized amount.  Might differ from requested amount in the event of a partial auth.
     * @return authorized amount.
     */
    public String getAuthorizedAmount() {
        return authorizedAmount;
    }

    /**
     * Sets the authorized amount.  Might differ from requested amount in the event of a partial auth.
     * 
     * @param authorizedAmount authorized amount.
     */
    public void setAuthorizedAmount(String authorizedAmount) {
        this.authorizedAmount = authorizedAmount;
    }

    /**
     * Returns the tip amount.
     * @return the tip amount.
     */
    public String getTipAmount() {
        return tipAmount;
    }

    /**
     * Sets the tip amount.
     * @param tipAmount tip amount.
     */
    public void setTipAmount(String tipAmount) {
        this.tipAmount = tipAmount;
    }

    /**
     * Returns tax amount.
     * @return tax amount.
     */
    public String getTaxAmount() {
        return taxAmount;
    }

    /**
     * Sets the tax amount.
     * @param taxAmount tax amount.
     */
    public void setTaxAmount(String taxAmount) {
        this.taxAmount = taxAmount;
    }

}
