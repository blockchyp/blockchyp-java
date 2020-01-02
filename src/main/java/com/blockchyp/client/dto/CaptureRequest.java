/**
 * Copyright 2019 BlockChyp, Inc. All rights reserved. Use of this code is governed by a
 * license that can be found in the LICENSE file.
 *
 * This file was generated automatically. Changes to this file will be lost every time the
 * code is regenerated.
 */
package com.blockchyp.client.dto;


/**
 * The information needed to capture a preauth.
 */
public class CaptureRequest implements ICoreRequest, IPreviousTransaction, IRequestAmount, ISubtotals {

     private String transactionRef;

     private String orderRef;

     private String destinationAccount;

     private boolean test;

     private int timeout;

     private String transactionId;

     private String currencyCode;

     private String amount;

     private boolean taxExempt;

     private String tipAmount;

     private String taxAmount;

     private String cashBackAmount;

     private String fsaEligibleAmount;

     private String hsaEligibleAmount;

     private String ebtEligibleAmount;

     /**
      * Sets the transaction reference string assigned to the transaction request.
      * @param value the transaction reference string assigned to the transaction
      * request. If no transaction ref was assiged on the request, then the gateway will
      * randomly generate one.
      */
     public void setTransactionRef(String value) {
          this.transactionRef = value;
     }

     /**
      * Gets the transaction reference string assigned to the transaction request.
      * @return the transaction reference string assigned to the transaction request.
      * If no transaction ref was assiged on the request, then the gateway will randomly
      * generate one.
      */
     public String getTransactionRef() {
          return this.transactionRef;
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
     public String getDestinationAccount() {
          return this.destinationAccount;
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
     public boolean isTest() {
          return this.test;
     }

     /**
      * Sets the request timeout in milliseconds.
      * @param value the request timeout in milliseconds.
      */
     public void setTimeout(int value) {
          this.timeout = value;
     }

     /**
      * Gets the request timeout in milliseconds.
      * @return the request timeout in milliseconds.
      */
     public int getTimeout() {
          return this.timeout;
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
     public boolean isTaxExempt() {
          return this.taxExempt;
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
     public String getTaxAmount() {
          return this.taxAmount;
     }

     /**
      * Sets the amount of cash back requested.
      * @param value the amount of cash back requested.
      */
     public void setCashBackAmount(String value) {
          this.cashBackAmount = value;
     }

     /**
      * Gets the amount of cash back requested.
      * @return the amount of cash back requested.
      */
     public String getCashBackAmount() {
          return this.cashBackAmount;
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
      * amount may be less than the transaction total, in which case only this amount will
      * be charged if an FSA card is presented. If the FSA amount is paid on an FSA card, then
      * the FSA amount authorized will be indicated on the response.
      */
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
     public String getEbtEligibleAmount() {
          return this.ebtEligibleAmount;
     }

}
