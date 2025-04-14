/**
 * Copyright 2019-2025 BlockChyp, Inc. All rights reserved. Use of this code is governed
 * by a license that can be found in the LICENSE file.
 *
 * This file was generated automatically by the BlockChyp SDK Generator. Changes to this
 * file will be lost every time the code is regenerated.
 */

package com.blockchyp.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

/**
 * Models information about payments against an invoice.
 */
public class InvoicePayment {

     private String id;

     private Date timestamp;

     private String transactionType;

     private String paymentType;

     private String authCode;

     private String maskedPan;

     private boolean pending;

     private boolean approved;

     private String responseDescription;

     private float amount;

     private String amountFormatted;

    /**
     * Sets the line item id.
     * @param value the line item id.
     */
     public void setId(String value) {
          this.id = value;
     }

    /**
     * Gets the line item id.
     * @return the line item id.
     */
     @JsonProperty("id")
     public String getId() {
          return this.id;
     }

    /**
     * Sets timestamp the payment was authorized.
     * @param value timestamp the payment was authorized.
     */
     public void setTimestamp(Date value) {
          this.timestamp = value;
     }

    /**
     * Gets timestamp the payment was authorized.
     * @return timestamp the payment was authorized.
     */
     @JsonProperty("timestamp")
     public Date getTimestamp() {
          return this.timestamp;
     }

    /**
     * Sets the type of disbursement transaction.
     * @param value the type of disbursement transaction.
     */
     public void setTransactionType(String value) {
          this.transactionType = value;
     }

    /**
     * Gets the type of disbursement transaction.
     * @return the type of disbursement transaction.
     */
     @JsonProperty("transactionType")
     public String getTransactionType() {
          return this.transactionType;
     }

    /**
     * Sets the payment method used to fund the disbursement.
     * @param value the payment method used to fund the disbursement.
     */
     public void setPaymentType(String value) {
          this.paymentType = value;
     }

    /**
     * Gets the payment method used to fund the disbursement.
     * @return the payment method used to fund the disbursement.
     */
     @JsonProperty("paymentType")
     public String getPaymentType() {
          return this.paymentType;
     }

    /**
     * Sets the auth code associated with credit card payment methods.
     * @param value the auth code associated with credit card payment methods.
     */
     public void setAuthCode(String value) {
          this.authCode = value;
     }

    /**
     * Gets the auth code associated with credit card payment methods.
     * @return the auth code associated with credit card payment methods.
     */
     @JsonProperty("authCode")
     public String getAuthCode() {
          return this.authCode;
     }

    /**
     * Sets the masked account number into which funds were deposited.
     * @param value the masked account number into which funds were deposited.
     */
     public void setMaskedPan(String value) {
          this.maskedPan = value;
     }

    /**
     * Gets the masked account number into which funds were deposited.
     * @return the masked account number into which funds were deposited.
     */
     @JsonProperty("maskedPan")
     public String getMaskedPan() {
          return this.maskedPan;
     }

    /**
     * Sets that payment is still pending.
     * @param value that payment is still pending.
     */
     public void setPending(boolean value) {
          this.pending = value;
     }

    /**
     * Gets that payment is still pending.
     * @return that payment is still pending.
     */
     @JsonProperty("pending")
     public boolean isPending() {
          return this.pending;
     }

    /**
     * Sets that payment is approved.
     * @param value that payment is approved.
     */
     public void setApproved(boolean value) {
          this.approved = value;
     }

    /**
     * Gets that payment is approved.
     * @return that payment is approved.
     */
     @JsonProperty("approved")
     public boolean isApproved() {
          return this.approved;
     }

    /**
     * Sets a response description from the disbursement payment platform, in any.
     * @param value a response description from the disbursement payment platform, in
     * any.
     */
     public void setResponseDescription(String value) {
          this.responseDescription = value;
     }

    /**
     * Gets a response description from the disbursement payment platform, in any.
     * @return a response description from the disbursement payment platform, in any.
     */
     @JsonProperty("responseDescription")
     public String getResponseDescription() {
          return this.responseDescription;
     }

    /**
     * Sets the amount disbursed in floating point format.
     * @param value the amount disbursed in floating point format.
     */
     public void setAmount(float value) {
          this.amount = value;
     }

    /**
     * Gets the amount disbursed in floating point format.
     * @return the amount disbursed in floating point format.
     */
     @JsonProperty("amount")
     public float getAmount() {
          return this.amount;
     }

    /**
     * Sets the currency formatted form of amount.
     * @param value the currency formatted form of amount.
     */
     public void setAmountFormatted(String value) {
          this.amountFormatted = value;
     }

    /**
     * Gets the currency formatted form of amount.
     * @return the currency formatted form of amount.
     */
     @JsonProperty("amountFormatted")
     public String getAmountFormatted() {
          return this.amountFormatted;
     }

}
