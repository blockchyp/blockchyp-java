package com.blockchyp.client.dto;

import java.util.Date;
import java.util.Map;

/**
 * Models the response to a close batch request.
 * 
 */

public class CloseBatchResponse extends Acknowledgement {

    private Date timestamp;
    private boolean success;
    private String currencyCode;
    private String capturedTotal;
    private String openPreauths;
    @SuppressWarnings("rawtypes")
    private Map cardBrands;


    /**
     * Returns the timestamp on the server at the time the heartbeat request was processed.
     * @return java.util.Date
     */
    public Date getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the timestamp.
     * @param timestamp java.util.Date
     */
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * Returns the success flag.
     * @return success flag.
     */
    public boolean isSuccess() {
        return success;
    }


    /**
     * Sets the success flag.
     * @param success success flag.
     */
    public void setSuccess(boolean success) {
        this.success = success;
    }

    /**
     * Returns the currency code for this batch.
     * @return ISO currency code.
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the currency code.
     * @param currencyCode ISO currency code.
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * Returns the total captured amount for the batch.  Should be the expected deposit amount.
     * @return captured total.
     */
    public String getCapturedTotal() {
        return capturedTotal;
    }

    /**
     * Sets the captured total.
     * @param capturedTotal captured total.
     */
    public void setCapturedTotal(String capturedTotal) {
        this.capturedTotal = capturedTotal;
    }

    /**
     * Returns the total of preauths opened for this batch that were not captured.
     * @return open preauth total.
     */
    public String getOpenPreauths() {
        return openPreauths;
    }

    /**
     * Sets the open preauth total.
     * @param openPreauths open peauth total.
     */
    public void setOpenPreauths(String openPreauths) {
        this.openPreauths = openPreauths;
    }

    /**
     * Returns captured totals by card brand.
     * @return captured totals grouped by card brand.
     */
    @SuppressWarnings("rawtypes")
    public Map getCardBrands() {
        return cardBrands;
    }

    /**
     * Sets captured totals by card brands map.
     * @param cardBrands captured totals grouped by card brand.
     */
    @SuppressWarnings("rawtypes")
    public void setCardBrands(Map cardBrands) {
        this.cardBrands = cardBrands;
    }

}
