/**
 * Copyright 2019-2022 BlockChyp, Inc. All rights reserved. Use of this code is governed
 * by a license that can be found in the LICENSE file.
 *
 * This file was generated automatically by the BlockChyp SDK Generator. Changes to this
 * file will be lost every time the code is regenerated.
 */

package com.blockchyp.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * The information needed to capture a preauth.
 */
public class CaptureRequest implements ITimeoutRequest, ICoreRequest, IPreviousTransaction, IRequestAmount, ISubtotals {

     private int timeout;

     private boolean test;

     private String transactionRef;

     private boolean async;

     private boolean queue;

     private boolean waitForRemovedCard;

     private boolean force;

     private String orderRef;

     private String destinationAccount;

     private String transactionId;

     private String currencyCode;

     private String amount;

     private boolean taxExempt;

     private boolean surcharge;

     private boolean cashDiscount;

     private String tipAmount;

     private String taxAmount;

     private String fsaEligibleAmount;

     private String hsaEligibleAmount;

     private String ebtEligibleAmount;

    /**
     * Sets the request timeout in seconds.
     * @param value the request timeout in seconds.
     */
     public void setTimeout(int value) {
          this.timeout = value;
     }

    /**
     * Gets the request timeout in seconds.
     * @return the request timeout in seconds.
     */
     @JsonProperty("timeout")
     public int getTimeout() {
          return this.timeout;
     }

    /**
     * Sets whether or not to route transaction to the test gateway.
     * @param value whether or not to route transaction to the test gateway.
     */
     public void setTest(boolean value) {
          this.test = value;
     }

    /**
     * Gets whether or not to route transaction to the test gateway.
     * @return whether or not to route transaction to the test gateway.
     */
     @JsonProperty("test")
     public boolean isTest() {
          return this.test;
     }

    /**
     * Sets a user-assigned reference that can be used to recall or reverse transactions.
     * @param value a user-assigned reference that can be used to recall or reverse
     * transactions.
     */
     public void setTransactionRef(String value) {
          this.transactionRef = value;
     }

    /**
     * Gets a user-assigned reference that can be used to recall or reverse transactions.
     * @return a user-assigned reference that can be used to recall or reverse
     * transactions.
     */
     @JsonProperty("transactionRef")
     public String getTransactionRef() {
          return this.transactionRef;
     }

    /**
     * Sets defers the response to the transaction and returns immediately.
     * @param value defers the response to the transaction and returns immediately.
     * Callers should retrive the transaction result using the Transaction Status API.
     */
     public void setAsync(boolean value) {
          this.async = value;
     }

    /**
     * Gets defers the response to the transaction and returns immediately.
     * @return defers the response to the transaction and returns immediately. Callers
     * should retrive the transaction result using the Transaction Status API.
     */
     @JsonProperty("async")
     public boolean isAsync() {
          return this.async;
     }

    /**
     * Sets adds the transaction to the queue and returns immediately.
     * @param value adds the transaction to the queue and returns immediately. Callers
     * should retrive the transaction result using the Transaction Status API.
     */
     public void setQueue(boolean value) {
          this.queue = value;
     }

    /**
     * Gets adds the transaction to the queue and returns immediately.
     * @return adds the transaction to the queue and returns immediately. Callers should
     * retrive the transaction result using the Transaction Status API.
     */
     @JsonProperty("queue")
     public boolean isQueue() {
          return this.queue;
     }

    /**
     * Sets whether or not the request should block until all cards have been removed from
     * the card reader.
     * @param value whether or not the request should block until all cards have been
     * removed from the card reader.
     */
     public void setWaitForRemovedCard(boolean value) {
          this.waitForRemovedCard = value;
     }

    /**
     * Gets whether or not the request should block until all cards have been removed from
     * the card reader.
     * @return whether or not the request should block until all cards have been removed
     * from the card reader.
     */
     @JsonProperty("waitForRemovedCard")
     public boolean isWaitForRemovedCard() {
          return this.waitForRemovedCard;
     }

    /**
     * Sets override any in-progress transactions.
     * @param value override any in-progress transactions.
     */
     public void setForce(boolean value) {
          this.force = value;
     }

    /**
     * Gets override any in-progress transactions.
     * @return override any in-progress transactions.
     */
     @JsonProperty("force")
     public boolean isForce() {
          return this.force;
     }

    /**
     * Sets an identifier from an external point of sale system.
     * @param value an identifier from an external point of sale system.
     */
     public void setOrderRef(String value) {
          this.orderRef = value;
     }

    /**
     * Gets an identifier from an external point of sale system.
     * @return an identifier from an external point of sale system.
     */
     @JsonProperty("orderRef")
     public String getOrderRef() {
          return this.orderRef;
     }

    /**
     * Sets the settlement account for merchants with split settlements.
     * @param value the settlement account for merchants with split settlements.
     */
     public void setDestinationAccount(String value) {
          this.destinationAccount = value;
     }

    /**
     * Gets the settlement account for merchants with split settlements.
     * @return the settlement account for merchants with split settlements.
     */
     @JsonProperty("destinationAccount")
     public String getDestinationAccount() {
          return this.destinationAccount;
     }

    /**
     * Sets the ID of the previous transaction being referenced.
     * @param value the ID of the previous transaction being referenced.
     */
     public void setTransactionId(String value) {
          this.transactionId = value;
     }

    /**
     * Gets the ID of the previous transaction being referenced.
     * @return the ID of the previous transaction being referenced.
     */
     @JsonProperty("transactionId")
     public String getTransactionId() {
          return this.transactionId;
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
     * Sets the requested amount.
     * @param value the requested amount.
     */
     public void setAmount(String value) {
          this.amount = value;
     }

    /**
     * Gets the requested amount.
     * @return the requested amount.
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
     * Sets a flag to add a surcharge to the transaction to cover credit card fees, if
     * permitted.
     * @param value a flag to add a surcharge to the transaction to cover credit card fees,
     * if permitted.
     */
     public void setSurcharge(boolean value) {
          this.surcharge = value;
     }

    /**
     * Gets a flag to add a surcharge to the transaction to cover credit card fees, if
     * permitted.
     * @return a flag to add a surcharge to the transaction to cover credit card fees, if
     * permitted.
     */
     @JsonProperty("surcharge")
     public boolean isSurcharge() {
          return this.surcharge;
     }

    /**
     * Sets a flag that applies a discount to negate the surcharge for debit transactions
     * or other surcharge ineligible payment methods.
     * @param value a flag that applies a discount to negate the surcharge for debit
     * transactions or other surcharge ineligible payment methods.
     */
     public void setCashDiscount(boolean value) {
          this.cashDiscount = value;
     }

    /**
     * Gets a flag that applies a discount to negate the surcharge for debit transactions
     * or other surcharge ineligible payment methods.
     * @return a flag that applies a discount to negate the surcharge for debit
     * transactions or other surcharge ineligible payment methods.
     */
     @JsonProperty("cashDiscount")
     public boolean isCashDiscount() {
          return this.cashDiscount;
     }

    /**
     * Sets the tip amount.
     * @param value the tip amount.
     */
     public void setTipAmount(String value) {
          this.tipAmount = value;
     }

    /**
     * Gets the tip amount.
     * @return the tip amount.
     */
     @JsonProperty("tipAmount")
     public String getTipAmount() {
          return this.tipAmount;
     }

    /**
     * Sets the tax amount.
     * @param value the tax amount.
     */
     public void setTaxAmount(String value) {
          this.taxAmount = value;
     }

    /**
     * Gets the tax amount.
     * @return the tax amount.
     */
     @JsonProperty("taxAmount")
     public String getTaxAmount() {
          return this.taxAmount;
     }

    /**
     * Sets the amount of the transaction that should be charged to an FSA card.
     * @param value the amount of the transaction that should be charged to an FSA card.
     * This amount may be less than the transaction total, in which case only this amount
     * will be charged if an FSA card is presented. If the FSA amount is paid on an FSA card,
     * then the FSA amount authorized will be indicated on the response.
     */
     public void setFsaEligibleAmount(String value) {
          this.fsaEligibleAmount = value;
     }

    /**
     * Gets the amount of the transaction that should be charged to an FSA card.
     * @return the amount of the transaction that should be charged to an FSA card. This
     * amount may be less than the transaction total, in which case only this amount will be
     * charged if an FSA card is presented. If the FSA amount is paid on an FSA card, then the
     * FSA amount authorized will be indicated on the response.
     */
     @JsonProperty("fsaEligibleAmount")
     public String getFsaEligibleAmount() {
          return this.fsaEligibleAmount;
     }

    /**
     * Sets the amount of the transaction that should be charged to an HSA card.
     * @param value the amount of the transaction that should be charged to an HSA card.
     */
     public void setHsaEligibleAmount(String value) {
          this.hsaEligibleAmount = value;
     }

    /**
     * Gets the amount of the transaction that should be charged to an HSA card.
     * @return the amount of the transaction that should be charged to an HSA card.
     */
     @JsonProperty("hsaEligibleAmount")
     public String getHsaEligibleAmount() {
          return this.hsaEligibleAmount;
     }

    /**
     * Sets the amount of the transaction that should be charged to an EBT card.
     * @param value the amount of the transaction that should be charged to an EBT card.
     */
     public void setEbtEligibleAmount(String value) {
          this.ebtEligibleAmount = value;
     }

    /**
     * Gets the amount of the transaction that should be charged to an EBT card.
     * @return the amount of the transaction that should be charged to an EBT card.
     */
     @JsonProperty("ebtEligibleAmount")
     public String getEbtEligibleAmount() {
          return this.ebtEligibleAmount;
     }

}
