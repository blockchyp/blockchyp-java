package com.blockchyp.client.dto;

/**
 * Adds amount information to requests that require amounts to be specified.
 * 
 * @author jeffreydpayne
 *
 */

public class AmountRequest extends CoreRequest {

    private String currencyCode;
    private String amount;
    private boolean taxExempt;
    private String tipAmount;
    private String taxAmount;

    /**
     * Returns the currency code.
     * @return - ISO currency code.
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the currency code.
     * @param currencyCode - ISO currency code.
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * Returns the transaction amount.
     * @return - requested amount.
     */
    public String getAmount() {
        return amount;
    }

    /**
     * Sets the requested transaction amount.
     * @param amount - requested amount.
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }
    
    
    /**
     * Returns the tax exempt flag.
     * @return - tax exempt flag.
     */
    public boolean isTaxExempt() {
        return taxExempt;
    }

    /**
     * Sets the tax exempt flag.  Needed only for tax exempt Level 2 processing.
     * @param taxExempt - tax exempt flag.
     */
    public void setTaxExempt(boolean taxExempt) {
        this.taxExempt = taxExempt;
    }

    /**
     * Returns the tip amount.
     * @return - tip amount.
     */
    public String getTipAmount() {
        return tipAmount;
    }

    /**
     * Sets the tip amount, if there is one.
     * @param tipAmount - tip amount.
     */
    public void setTipAmount(String tipAmount) {
        this.tipAmount = tipAmount;
    }

    /**
     * Returns the tax amount.
     * @return tax amount.
     */
    public String getTaxAmount() {
        return taxAmount;
    }

    /**
     * Sets tax amount.  Required for level 2 and 3 processing.
     * @param taxAmount - tax amount
     */
    public void setTaxAmount(String taxAmount) {
        this.taxAmount = taxAmount;
    }

}
