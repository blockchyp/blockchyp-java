/**
 * Copyright 2019-2025 BlockChyp, Inc. All rights reserved. Use of this code is governed
 * by a license that can be found in the LICENSE file.
 *
 * This file was generated automatically by the BlockChyp SDK Generator. Changes to this
 * file will be lost every time the code is regenerated.
 */

package com.blockchyp.client.dto;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 * Models the status of a payment link.
 */
@SuppressWarnings({"rawtypes", "unchecked"})
public class PaymentLinkStatusResponse implements IAbstractAcknowledgement {

     private boolean success;

     private String error;

     private String responseDescription;

     private String linkCode;

     private String merchantId;

     private String customerId;

     private String transactionRef;

     private String orderRef;

     private boolean taxExempt;

     private String amount;

     private String taxAmount;

     private String subject;

     private String transactionId;

     private String description;

     private Date expiration;

     private Date dateCreated;

     private TransactionDisplayTransaction transactionDetails;

     private String status;

     private String tcAlias;

     private String tcName;

     private String tcContent;

     private boolean cashierFacing;

     private boolean enroll;

     private boolean enrollOnly;

     private AuthorizationResponse lastTransaction;

     private Collection<AuthorizationResponse> transactionHistory;

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
     @SerializedName("success")
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
     @SerializedName("error")
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
     @SerializedName("responseDescription")
     public String getResponseDescription() {
          return this.responseDescription;
     }

    /**
     * Sets the code used to retrieve the payment link.
     * @param value the code used to retrieve the payment link.
     */
     public void setLinkCode(String value) {
          this.linkCode = value;
     }

    /**
     * Gets the code used to retrieve the payment link.
     * @return the code used to retrieve the payment link.
     */
     @SerializedName("linkCode")
     public String getLinkCode() {
          return this.linkCode;
     }

    /**
     * Sets the BlockChyp merchant id associated with a payment link.
     * @param value the BlockChyp merchant id associated with a payment link.
     */
     public void setMerchantId(String value) {
          this.merchantId = value;
     }

    /**
     * Gets the BlockChyp merchant id associated with a payment link.
     * @return the BlockChyp merchant id associated with a payment link.
     */
     @SerializedName("merchantId")
     public String getMerchantId() {
          return this.merchantId;
     }

    /**
     * Sets the customer id associated with a payment link.
     * @param value the customer id associated with a payment link.
     */
     public void setCustomerId(String value) {
          this.customerId = value;
     }

    /**
     * Gets the customer id associated with a payment link.
     * @return the customer id associated with a payment link.
     */
     @SerializedName("customerId")
     public String getCustomerId() {
          return this.customerId;
     }

    /**
     * Sets the user's internal reference for any transaction that may occur.
     * @param value the user's internal reference for any transaction that may occur.
     */
     public void setTransactionRef(String value) {
          this.transactionRef = value;
     }

    /**
     * Gets the user's internal reference for any transaction that may occur.
     * @return the user's internal reference for any transaction that may occur.
     */
     @SerializedName("transactionRef")
     public String getTransactionRef() {
          return this.transactionRef;
     }

    /**
     * Sets the user's internal reference for an order.
     * @param value the user's internal reference for an order.
     */
     public void setOrderRef(String value) {
          this.orderRef = value;
     }

    /**
     * Gets the user's internal reference for an order.
     * @return the user's internal reference for an order.
     */
     @SerializedName("orderRef")
     public String getOrderRef() {
          return this.orderRef;
     }

    /**
     * Sets that the order is tax exempt.
     * @param value that the order is tax exempt.
     */
     public void setTaxExempt(boolean value) {
          this.taxExempt = value;
     }

    /**
     * Gets that the order is tax exempt.
     * @return that the order is tax exempt.
     */
     @SerializedName("taxExempt")
     public boolean isTaxExempt() {
          return this.taxExempt;
     }

    /**
     * Sets that the amount to collect via the payment link.
     * @param value that the amount to collect via the payment link.
     */
     public void setAmount(String value) {
          this.amount = value;
     }

    /**
     * Gets that the amount to collect via the payment link.
     * @return that the amount to collect via the payment link.
     */
     @SerializedName("amount")
     public String getAmount() {
          return this.amount;
     }

    /**
     * Sets the sales tax to be collected via the payment link.
     * @param value the sales tax to be collected via the payment link.
     */
     public void setTaxAmount(String value) {
          this.taxAmount = value;
     }

    /**
     * Gets the sales tax to be collected via the payment link.
     * @return the sales tax to be collected via the payment link.
     */
     @SerializedName("taxAmount")
     public String getTaxAmount() {
          return this.taxAmount;
     }

    /**
     * Sets subject for email notifications.
     * @param value subject for email notifications.
     */
     public void setSubject(String value) {
          this.subject = value;
     }

    /**
     * Gets subject for email notifications.
     * @return subject for email notifications.
     */
     @SerializedName("subject")
     public String getSubject() {
          return this.subject;
     }

    /**
     * Sets id of the most recent transaction associated with the link.
     * @param value id of the most recent transaction associated with the link.
     */
     public void setTransactionId(String value) {
          this.transactionId = value;
     }

    /**
     * Gets id of the most recent transaction associated with the link.
     * @return id of the most recent transaction associated with the link.
     */
     @SerializedName("transactionId")
     public String getTransactionId() {
          return this.transactionId;
     }

    /**
     * Sets description associated with the payment link.
     * @param value description associated with the payment link.
     */
     public void setDescription(String value) {
          this.description = value;
     }

    /**
     * Gets description associated with the payment link.
     * @return description associated with the payment link.
     */
     @SerializedName("description")
     public String getDescription() {
          return this.description;
     }

    /**
     * Sets date and time the link will expire.
     * @param value date and time the link will expire.
     */
     public void setExpiration(Date value) {
          this.expiration = value;
     }

    /**
     * Gets date and time the link will expire.
     * @return date and time the link will expire.
     */
     @SerializedName("expiration")
     public Date getExpiration() {
          return this.expiration;
     }

    /**
     * Sets date and time the link was created.
     * @param value date and time the link was created.
     */
     public void setDateCreated(Date value) {
          this.dateCreated = value;
     }

    /**
     * Gets date and time the link was created.
     * @return date and time the link was created.
     */
     @SerializedName("dateCreated")
     public Date getDateCreated() {
          return this.dateCreated;
     }

    /**
     * Sets line item level data if provided.
     * @param value line item level data if provided.
     */
     public void setTransactionDetails(TransactionDisplayTransaction value) {
          this.transactionDetails = value;
     }

    /**
     * Gets line item level data if provided.
     * @return line item level data if provided.
     */
     @SerializedName("transactionDetails")
     public TransactionDisplayTransaction getTransactionDetails() {
          return this.transactionDetails;
     }

    /**
     * Sets the current status of the payment link.
     * @param value the current status of the payment link.
     */
     public void setStatus(String value) {
          this.status = value;
     }

    /**
     * Gets the current status of the payment link.
     * @return the current status of the payment link.
     */
     @SerializedName("status")
     public String getStatus() {
          return this.status;
     }

    /**
     * Sets alias for any terms and conditions language associated with the link.
     * @param value alias for any terms and conditions language associated with the link.
     */
     public void setTcAlias(String value) {
          this.tcAlias = value;
     }

    /**
     * Gets alias for any terms and conditions language associated with the link.
     * @return alias for any terms and conditions language associated with the link.
     */
     @SerializedName("tcAlias")
     public String getTcAlias() {
          return this.tcAlias;
     }

    /**
     * Sets name of any terms and conditions agreements associated with the payment link.
     * @param value name of any terms and conditions agreements associated with the
     * payment link.
     */
     public void setTcName(String value) {
          this.tcName = value;
     }

    /**
     * Gets name of any terms and conditions agreements associated with the payment link.
     * @return name of any terms and conditions agreements associated with the payment
     * link.
     */
     @SerializedName("tcName")
     public String getTcName() {
          return this.tcName;
     }

    /**
     * Sets full text of any terms and conditions language associated with the agreement.
     * @param value full text of any terms and conditions language associated with the
     * agreement.
     */
     public void setTcContent(String value) {
          this.tcContent = value;
     }

    /**
     * Gets full text of any terms and conditions language associated with the agreement.
     * @return full text of any terms and conditions language associated with the
     * agreement.
     */
     @SerializedName("tcContent")
     public String getTcContent() {
          return this.tcContent;
     }

    /**
     * Sets that the link is intended for internal use by the merchant.
     * @param value that the link is intended for internal use by the merchant.
     */
     public void setCashierFacing(boolean value) {
          this.cashierFacing = value;
     }

    /**
     * Gets that the link is intended for internal use by the merchant.
     * @return that the link is intended for internal use by the merchant.
     */
     @SerializedName("cashierFacing")
     public boolean isCashierFacing() {
          return this.cashierFacing;
     }

    /**
     * Sets that the payment method should be enrolled in the token vault.
     * @param value that the payment method should be enrolled in the token vault.
     */
     public void setEnroll(boolean value) {
          this.enroll = value;
     }

    /**
     * Gets that the payment method should be enrolled in the token vault.
     * @return that the payment method should be enrolled in the token vault.
     */
     @SerializedName("enroll")
     public boolean isEnroll() {
          return this.enroll;
     }

    /**
     * Sets that the link should only be used for enrollment in the token vault without any
     * underlying payment transaction.
     * @param value that the link should only be used for enrollment in the token vault
     * without any underlying payment transaction.
     */
     public void setEnrollOnly(boolean value) {
          this.enrollOnly = value;
     }

    /**
     * Gets that the link should only be used for enrollment in the token vault without any
     * underlying payment transaction.
     * @return that the link should only be used for enrollment in the token vault without
     * any underlying payment transaction.
     */
     @SerializedName("enrollOnly")
     public boolean isEnrollOnly() {
          return this.enrollOnly;
     }

    /**
     * Sets returns details about the last transaction status.
     * @param value returns details about the last transaction status.
     */
     public void setLastTransaction(AuthorizationResponse value) {
          this.lastTransaction = value;
     }

    /**
     * Gets returns details about the last transaction status.
     * @return returns details about the last transaction status.
     */
     @SerializedName("lastTransaction")
     public AuthorizationResponse getLastTransaction() {
          return this.lastTransaction;
     }

    /**
     * Sets returns a list of transactions associated with the link, including any
     * declines.
     * @param value returns a list of transactions associated with the link, including
     * any declines.
     */
     public void setTransactionHistory(Collection<AuthorizationResponse> value) {
          this.transactionHistory = value;
     }

    /**
     * Gets returns a list of transactions associated with the link, including any
     * declines.
     * @return returns a list of transactions associated with the link, including any
     * declines.
     */
     @SerializedName("transactionHistory")
     public Collection<AuthorizationResponse> getTransactionHistory() {
          return this.transactionHistory;
     }

    /**
     * Adds a returns a list of transactions associated with the link, including any
     * declines.
     * @param value returns a list of transactions associated with the link, including
     * any declines.
     */
     public void addTransactionHistory(AuthorizationResponse value) {
          if (this.transactionHistory == null) {
               this.transactionHistory = new ArrayList();
          }
          this.transactionHistory.add(value);
     }

}
