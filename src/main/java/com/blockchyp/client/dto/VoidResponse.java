/**
 * Copyright 2019-2025 BlockChyp, Inc. All rights reserved. Use of this code is governed
 * by a license that can be found in the LICENSE file.
 *
 * This file was generated automatically by the BlockChyp SDK Generator. Changes to this
 * file will be lost every time the code is regenerated.
 */

package com.blockchyp.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Collection;

/**
 * The response to a void request.
 */
@SuppressWarnings({"rawtypes", "unchecked"})
public class VoidResponse implements IAbstractAcknowledgement, IApprovalResponse, ICoreResponse, IPaymentMethodResponse, ISignatureResponse {

     private boolean success;

     private String error;

     private String responseDescription;

     private boolean approved;

     private String authCode;

     private String authResponseCode;

     private String transactionId;

     private String batchId;

     private String transactionRef;

     private String transactionType;

     private String timestamp;

     private String tickBlock;

     private boolean test;

     private String destinationAccount;

     private String sig;

     private String token;

     private String entryMethod;

     private String paymentType;

     private String network;

     private String logo;

     private String maskedPan;

     private String publicKey;

     private boolean ScopeAlert;

     private String cardHolder;

     private String expMonth;

     private String expYear;

     private AvsResponse avsResponse;

     private String cvvResponse;

     private ReceiptSuggestions receiptSuggestions;

     private Customer customer;

     private Collection<Customer> customers;

     private String sigFile;

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
     * Sets that the transaction was approved.
     * @param value that the transaction was approved.
     */
     public void setApproved(boolean value) {
          this.approved = value;
     }

    /**
     * Gets that the transaction was approved.
     * @return that the transaction was approved.
     */
     @JsonProperty("approved")
     public boolean isApproved() {
          return this.approved;
     }

    /**
     * Sets the auth code from the payment network.
     * @param value the auth code from the payment network.
     */
     public void setAuthCode(String value) {
          this.authCode = value;
     }

    /**
     * Gets the auth code from the payment network.
     * @return the auth code from the payment network.
     */
     @JsonProperty("authCode")
     public String getAuthCode() {
          return this.authCode;
     }

    /**
     * Sets the code returned by the terminal or the card issuer to indicate the
     * disposition of the message.
     * @param value the code returned by the terminal or the card issuer to indicate the
     * disposition of the message.
     */
     public void setAuthResponseCode(String value) {
          this.authResponseCode = value;
     }

    /**
     * Gets the code returned by the terminal or the card issuer to indicate the
     * disposition of the message.
     * @return the code returned by the terminal or the card issuer to indicate the
     * disposition of the message.
     */
     @JsonProperty("authResponseCode")
     public String getAuthResponseCode() {
          return this.authResponseCode;
     }

    /**
     * Sets the ID assigned to the transaction.
     * @param value the ID assigned to the transaction.
     */
     public void setTransactionId(String value) {
          this.transactionId = value;
     }

    /**
     * Gets the ID assigned to the transaction.
     * @return the ID assigned to the transaction.
     */
     @JsonProperty("transactionId")
     public String getTransactionId() {
          return this.transactionId;
     }

    /**
     * Sets the ID assigned to the batch.
     * @param value the ID assigned to the batch.
     */
     public void setBatchId(String value) {
          this.batchId = value;
     }

    /**
     * Gets the ID assigned to the batch.
     * @return the ID assigned to the batch.
     */
     @JsonProperty("batchId")
     public String getBatchId() {
          return this.batchId;
     }

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
     * @return the transaction reference string assigned to the transaction request. If
     * no transaction ref was assiged on the request, then the gateway will randomly
     * generate one.
     */
     @JsonProperty("transactionRef")
     public String getTransactionRef() {
          return this.transactionRef;
     }

    /**
     * Sets the type of transaction.
     * @param value the type of transaction.
     */
     public void setTransactionType(String value) {
          this.transactionType = value;
     }

    /**
     * Gets the type of transaction.
     * @return the type of transaction.
     */
     @JsonProperty("transactionType")
     public String getTransactionType() {
          return this.transactionType;
     }

    /**
     * Sets the timestamp of the transaction.
     * @param value the timestamp of the transaction.
     */
     public void setTimestamp(String value) {
          this.timestamp = value;
     }

    /**
     * Gets the timestamp of the transaction.
     * @return the timestamp of the transaction.
     */
     @JsonProperty("timestamp")
     public String getTimestamp() {
          return this.timestamp;
     }

    /**
     * Sets the hash of the last tick block.
     * @param value the hash of the last tick block.
     */
     public void setTickBlock(String value) {
          this.tickBlock = value;
     }

    /**
     * Gets the hash of the last tick block.
     * @return the hash of the last tick block.
     */
     @JsonProperty("tickBlock")
     public String getTickBlock() {
          return this.tickBlock;
     }

    /**
     * Sets that the transaction was processed on the test gateway.
     * @param value that the transaction was processed on the test gateway.
     */
     public void setTest(boolean value) {
          this.test = value;
     }

    /**
     * Gets that the transaction was processed on the test gateway.
     * @return that the transaction was processed on the test gateway.
     */
     @JsonProperty("test")
     public boolean isTest() {
          return this.test;
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
     * Sets the ECC signature of the response.
     * @param value the ECC signature of the response. Can be used to ensure that it was
     * signed by the terminal and detect man-in-the middle attacks.
     */
     public void setSig(String value) {
          this.sig = value;
     }

    /**
     * Gets the ECC signature of the response.
     * @return the ECC signature of the response. Can be used to ensure that it was signed by
     * the terminal and detect man-in-the middle attacks.
     */
     @JsonProperty("sig")
     public String getSig() {
          return this.sig;
     }

    /**
     * Sets the payment token, if the payment was enrolled in the vault.
     * @param value the payment token, if the payment was enrolled in the vault.
     */
     public void setToken(String value) {
          this.token = value;
     }

    /**
     * Gets the payment token, if the payment was enrolled in the vault.
     * @return the payment token, if the payment was enrolled in the vault.
     */
     @JsonProperty("token")
     public String getToken() {
          return this.token;
     }

    /**
     * Sets the entry method for the transaction (CHIP, MSR, KEYED, etc).
     * @param value the entry method for the transaction (CHIP, MSR, KEYED, etc).
     */
     public void setEntryMethod(String value) {
          this.entryMethod = value;
     }

    /**
     * Gets the entry method for the transaction (CHIP, MSR, KEYED, etc).
     * @return the entry method for the transaction (CHIP, MSR, KEYED, etc).
     */
     @JsonProperty("entryMethod")
     public String getEntryMethod() {
          return this.entryMethod;
     }

    /**
     * Sets the card brand (VISA, MC, AMEX, DEBIT, etc).
     * @param value the card brand (VISA, MC, AMEX, DEBIT, etc).
     */
     public void setPaymentType(String value) {
          this.paymentType = value;
     }

    /**
     * Gets the card brand (VISA, MC, AMEX, DEBIT, etc).
     * @return the card brand (VISA, MC, AMEX, DEBIT, etc).
     */
     @JsonProperty("paymentType")
     public String getPaymentType() {
          return this.paymentType;
     }

    /**
     * Sets provides network level detail on how a transaction was routed, especially for
     * debit transactions.
     * @param value provides network level detail on how a transaction was routed,
     * especially for debit transactions.
     */
     public void setNetwork(String value) {
          this.network = value;
     }

    /**
     * Gets provides network level detail on how a transaction was routed, especially for
     * debit transactions.
     * @return provides network level detail on how a transaction was routed, especially
     * for debit transactions.
     */
     @JsonProperty("network")
     public String getNetwork() {
          return this.network;
     }

    /**
     * Sets identifies the card association based on bin number.
     * @param value identifies the card association based on bin number. Used primarily
     * used to indicate the major logo on a card, even when debit transactions are routed on
     * a different network.
     */
     public void setLogo(String value) {
          this.logo = value;
     }

    /**
     * Gets identifies the card association based on bin number.
     * @return identifies the card association based on bin number. Used primarily used
     * to indicate the major logo on a card, even when debit transactions are routed on a
     * different network.
     */
     @JsonProperty("logo")
     public String getLogo() {
          return this.logo;
     }

    /**
     * Sets the masked primary account number.
     * @param value the masked primary account number.
     */
     public void setMaskedPan(String value) {
          this.maskedPan = value;
     }

    /**
     * Gets the masked primary account number.
     * @return the masked primary account number.
     */
     @JsonProperty("maskedPan")
     public String getMaskedPan() {
          return this.maskedPan;
     }

    /**
     * Sets the BlockChyp public key if the user presented a BlockChyp payment card.
     * @param value the BlockChyp public key if the user presented a BlockChyp payment
     * card.
     */
     public void setPublicKey(String value) {
          this.publicKey = value;
     }

    /**
     * Gets the BlockChyp public key if the user presented a BlockChyp payment card.
     * @return the BlockChyp public key if the user presented a BlockChyp payment card.
     */
     @JsonProperty("publicKey")
     public String getPublicKey() {
          return this.publicKey;
     }

    /**
     * Sets that the transaction did something that would put the system in PCI scope.
     * @param value that the transaction did something that would put the system in PCI
     * scope.
     */
     public void setScopeAlert(boolean value) {
          this.ScopeAlert = value;
     }

    /**
     * Gets that the transaction did something that would put the system in PCI scope.
     * @return that the transaction did something that would put the system in PCI scope.
     */
     @JsonProperty("ScopeAlert")
     public boolean isScopeAlert() {
          return this.ScopeAlert;
     }

    /**
     * Sets the cardholder name.
     * @param value the cardholder name.
     */
     public void setCardHolder(String value) {
          this.cardHolder = value;
     }

    /**
     * Gets the cardholder name.
     * @return the cardholder name.
     */
     @JsonProperty("cardHolder")
     public String getCardHolder() {
          return this.cardHolder;
     }

    /**
     * Sets the card expiration month in MM format.
     * @param value the card expiration month in MM format.
     */
     public void setExpMonth(String value) {
          this.expMonth = value;
     }

    /**
     * Gets the card expiration month in MM format.
     * @return the card expiration month in MM format.
     */
     @JsonProperty("expMonth")
     public String getExpMonth() {
          return this.expMonth;
     }

    /**
     * Sets the card expiration year in YY format.
     * @param value the card expiration year in YY format.
     */
     public void setExpYear(String value) {
          this.expYear = value;
     }

    /**
     * Gets the card expiration year in YY format.
     * @return the card expiration year in YY format.
     */
     @JsonProperty("expYear")
     public String getExpYear() {
          return this.expYear;
     }

    /**
     * Sets address verification results if address information was submitted.
     * @param value address verification results if address information was submitted.
     */
     public void setAvsResponse(AvsResponse value) {
          this.avsResponse = value;
     }

    /**
     * Gets address verification results if address information was submitted.
     * @return address verification results if address information was submitted.
     */
     @JsonProperty("avsResponse")
     public AvsResponse getAvsResponse() {
          return this.avsResponse;
     }

    /**
     * Sets the CVV verification result if CVV was submitted.
     * @param value the CVV verification result if CVV was submitted.
     */
     public void setCvvResponse(String value) {
          this.cvvResponse = value;
     }

    /**
     * Gets the CVV verification result if CVV was submitted.
     * @return the CVV verification result if CVV was submitted.
     */
     @JsonProperty("cvvResponse")
     public String getCvvResponse() {
          return this.cvvResponse;
     }

    /**
     * Sets suggested receipt fields.
     * @param value suggested receipt fields.
     */
     public void setReceiptSuggestions(ReceiptSuggestions value) {
          this.receiptSuggestions = value;
     }

    /**
     * Gets suggested receipt fields.
     * @return suggested receipt fields.
     */
     @JsonProperty("receiptSuggestions")
     public ReceiptSuggestions getReceiptSuggestions() {
          return this.receiptSuggestions;
     }

    /**
     * Sets customer data, if any.
     * @param value customer data, if any. Preserved for reverse compatibility.
     */
     public void setCustomer(Customer value) {
          this.customer = value;
     }

    /**
     * Gets customer data, if any.
     * @return customer data, if any. Preserved for reverse compatibility.
     */
     @JsonProperty("customer")
     public Customer getCustomer() {
          return this.customer;
     }

    /**
     * Sets customer data, if any.
     * @param value customer data, if any.
     */
     public void setCustomers(Collection<Customer> value) {
          this.customers = value;
     }

    /**
     * Gets customer data, if any.
     * @return customer data, if any.
     */
     @JsonProperty("customers")
     public Collection<Customer> getCustomers() {
          return this.customers;
     }

    /**
     * Sets the hex encoded signature data.
     * @param value the hex encoded signature data.
     */
     public void setSigFile(String value) {
          this.sigFile = value;
     }

    /**
     * Gets the hex encoded signature data.
     * @return the hex encoded signature data.
     */
     @JsonProperty("sigFile")
     public String getSigFile() {
          return this.sigFile;
     }

    /**
     * Adds a customer data, if any.
     * @param value customer data, if any.
     */
     public void addCustomer(Customer value) {
          if (this.customers == null) {
               this.customers = new ArrayList();
          }
          this.customers.add(value);
     }

}
