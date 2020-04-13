/**
 * Copyright 2019 BlockChyp, Inc. All rights reserved. Use of this code is governed by a
 * license that can be found in the LICENSE file.
 *
 * This file was generated automatically. Changes to this file will be lost every time the
 * code is regenerated.
 */

package com.blockchyp.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Models the results of a cash discount calculation.
 */
public class CashDiscountResponse implements IAbstractAcknowledgement {

     private boolean success;

     private String error;

     private String responseDescription;

     private String currencyCode;

     private String amount;

     private boolean taxExempt;

     private String surcharge;

     private String cashDiscount;

    /**
     * Sets whether or not the request succeeded.
     * @param value whether or not the request succeeded.
     */
     public void setSuccess(boolean value) {
          this.success = value;
     }

    /**
     * Gets whether or not the request succeeded.
     * @return whether or not the request succeeded.
     */
     @JsonProperty("success")
     public boolean isSuccess() {
          return this.success;
     }

    /**
     * Sets the error, if an error occurred.
     * @param value the error, if an error occurred.
     */
     public void setError(String value) {
          this.error = value;
     }

    /**
     * Gets the error, if an error occurred.
     * @return the error, if an error occurred.
     */
     @JsonProperty("error")
     public String getError() {
          return this.error;
     }

    /**
     * Sets a narrative description of the transaction result.
     * @param value a narrative description of the transaction result.
     */
     public void setResponseDescription(String value) {
          this.responseDescription = value;
     }

    /**
     * Gets a narrative description of the transaction result.
     * @return a narrative description of the transaction result.
     */
     @JsonProperty("responseDescription")
     public String getResponseDescription() {
          return this.responseDescription;
     }

    /**
     * Sets the transaction currency code.
     * @param value the transaction currency code.
     */
     public void setCurrencyCode(String value) {
          this.currencyCode = value;
     }

    /**
     * Gets the transaction currency code.
     * @return the transaction currency code.
     */
     @JsonProperty("currencyCode")
     public String getCurrencyCode() {
          return this.currencyCode;
     }

    /**
     * Sets the new calculated total amount.
     * @param value the new calculated total amount.
     */
     public void setAmount(String value) {
          this.amount = value;
     }

    /**
     * Gets the new calculated total amount.
     * @return the new calculated total amount.
     */
     @JsonProperty("amount")
     public String getAmount() {
          return this.amount;
     }

    /**
     * Sets that the request is tax exempt.
     * @param value that the request is tax exempt. Only required for tax exempt level 2
     * processing.
     */
     public void setTaxExempt(boolean value) {
          this.taxExempt = value;
     }

    /**
     * Gets that the request is tax exempt.
     * @return that the request is tax exempt. Only required for tax exempt level 2
     * processing.
     */
     @JsonProperty("taxExempt")
     public boolean isTaxExempt() {
          return this.taxExempt;
     }

    /**
     * Sets the normal surcharge for a transaction.
     * @param value the normal surcharge for a transaction. Will only be returned if an
     * offsetting cash discount is also returned.
     */
     public void setSurcharge(String value) {
          this.surcharge = value;
     }

    /**
     * Gets the normal surcharge for a transaction.
     * @return the normal surcharge for a transaction. Will only be returned if an
     * offsetting cash discount is also returned.
     */
     @JsonProperty("surcharge")
     public String getSurcharge() {
          return this.surcharge;
     }

    /**
     * Sets the cash discount.
     * @param value the cash discount. Will not be returned in surcharge only mode.
     */
     public void setCashDiscount(String value) {
          this.cashDiscount = value;
     }

    /**
     * Gets the cash discount.
     * @return the cash discount. Will not be returned in surcharge only mode.
     */
     @JsonProperty("cashDiscount")
     public String getCashDiscount() {
          return this.cashDiscount;
     }

}
