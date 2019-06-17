package com.blockchyp.client.dto;

import java.util.Map;

/**
 * Models the full detail needed for authorization requests.
 */

public class AuthorizationRequest extends PaymentRequest {

    private boolean enroll;
    private String description;
    private boolean promptForTip;

    @SuppressWarnings("rawtypes")
    private Map altPrices;

    /**
     * Returns the enroll flag.
     * @return - the enroll flag.
     */
    public boolean isEnroll() {
        return enroll;
    }

    /**
     * Sets the enroll flag.  If set, the payment method will be enrolled in the token vault after
     * authorization.
     * @param enroll the enroll flag.
     */
    public void setEnroll(boolean enroll) {
        this.enroll = enroll;
    }

    /**
     * Returns the transaction description.
     * @return transaction description.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the transaction description.
     * 
     * @param description transaction description.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Returns the prompt for tip flag.
     * @return prompt for tip flag.
     */
    public boolean isPromptForTip() {
        return promptForTip;
    }

    /**
     * Sets the prompt for tip flag.  This will cause the terminal to capture a tip amount 
     * from the user before starting the transaction.
     *  
     * @param promptForTip prompt for tip flag.
     */
    public void setPromptForTip(boolean promptForTip) {
        this.promptForTip = promptForTip;
    }

    /**
     * Returns a map of alternate currencies to their prices in each currency.  Used
     * to support cryptocurrencies.
     * 
     * @return a Map of strings to strings.  In Java 1.7, it would be Map&lt;String, String&gt;.
     */
    @SuppressWarnings("rawtypes")
    public Map getAltPrices() {
        return altPrices;
    }

    /**
     * A Map&lt;String, String&gt; that maps alternate currencies to their prices in each currency.  Used
     * to support cryptocurrencies.
     * 
     * @param altPrices - a Map of strings to strings.  In Java 1.7, it would be Map&lt;String, String&gt;.
     */
    @SuppressWarnings("rawtypes")
    public void setAltPrices(Map altPrices) {
        this.altPrices = altPrices;
    }

}
