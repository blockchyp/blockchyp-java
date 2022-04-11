/**
 * Copyright 2019 BlockChyp, Inc. All rights reserved. Use of this code is governed by a
 * license that can be found in the LICENSE file.
 *
 * This file was generated automatically. Changes to this file will be lost every time the
 * code is regenerated.
 */

package com.blockchyp.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import com.blockchyp.client.dto.AvsResponse;
import java.util.ArrayList;
import java.util.Collection;

/**
 * The response to an authorization request.
 */
@SuppressWarnings({"rawtypes", "unchecked"})
public class AuthorizationResponse implements IAbstractAcknowledgement, IApprovalResponse, ICoreResponse, IPaymentAmounts, ICryptocurrencyResponse, IPaymentMethodResponse, ISignatureResponse {

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

     private boolean partialAuth;

     private boolean altCurrency;

     private boolean fsaAuth;

     private String currencyCode;

     private String requestedAmount;

     private String authorizedAmount;

     private String remainingBalance;

     private String tipAmount;

     private String taxAmount;

     private String requestedCashBackAmount;

     private String authorizedCashBackAmount;

     private boolean confirmed;

     private String cryptoAuthorizedAmount;

     private String cryptoNetworkFee;

     private String cryptocurrency;

     private String cryptoNetwork;

     private String cryptoReceiveAddress;

     private String cryptoBlock;

     private String cryptoTransactionId;

     private String cryptoPaymentRequest;

     private String cryptoStatus;

     private String token;

     private String entryMethod;

     private String paymentType;

     private String maskedPan;

     private String publicKey;

     private boolean ScopeAlert;

     private String cardHolder;

     private String expMonth;

     private String expYear;

     private AvsResponse avsResponse;

     private ReceiptSuggestions receiptSuggestions;

     private Customer customer;

     private Collection<Customer> customers;

     private String sigFile;

     private WhiteListedCard whiteListedCard;

     private boolean storeAndForward;

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
     * Sets whether or not the transaction was approved for a partial amount.
     * @param value whether or not the transaction was approved for a partial amount.
     */
     public void setPartialAuth(boolean value) {
          this.partialAuth = value;
     }

    /**
     * Gets whether or not the transaction was approved for a partial amount.
     * @return whether or not the transaction was approved for a partial amount.
     */
     @JsonProperty("partialAuth")
     public boolean isPartialAuth() {
          return this.partialAuth;
     }

    /**
     * Sets whether or not an alternate currency was used.
     * @param value whether or not an alternate currency was used.
     */
     public void setAltCurrency(boolean value) {
          this.altCurrency = value;
     }

    /**
     * Gets whether or not an alternate currency was used.
     * @return whether or not an alternate currency was used.
     */
     @JsonProperty("altCurrency")
     public boolean isAltCurrency() {
          return this.altCurrency;
     }

    /**
     * Sets whether or not a request was settled on an FSA card.
     * @param value whether or not a request was settled on an FSA card.
     */
     public void setFsaAuth(boolean value) {
          this.fsaAuth = value;
     }

    /**
     * Gets whether or not a request was settled on an FSA card.
     * @return whether or not a request was settled on an FSA card.
     */
     @JsonProperty("fsaAuth")
     public boolean isFsaAuth() {
          return this.fsaAuth;
     }

    /**
     * Sets the currency code used for the transaction.
     * @param value the currency code used for the transaction.
     */
     public void setCurrencyCode(String value) {
          this.currencyCode = value;
     }

    /**
     * Gets the currency code used for the transaction.
     * @return the currency code used for the transaction.
     */
     @JsonProperty("currencyCode")
     public String getCurrencyCode() {
          return this.currencyCode;
     }

    /**
     * Sets the requested amount.
     * @param value the requested amount.
     */
     public void setRequestedAmount(String value) {
          this.requestedAmount = value;
     }

    /**
     * Gets the requested amount.
     * @return the requested amount.
     */
     @JsonProperty("requestedAmount")
     public String getRequestedAmount() {
          return this.requestedAmount;
     }

    /**
     * Sets the authorized amount.
     * @param value the authorized amount. May not match the requested amount in the event
     * of a partial auth.
     */
     public void setAuthorizedAmount(String value) {
          this.authorizedAmount = value;
     }

    /**
     * Gets the authorized amount.
     * @return the authorized amount. May not match the requested amount in the event of a
     * partial auth.
     */
     @JsonProperty("authorizedAmount")
     public String getAuthorizedAmount() {
          return this.authorizedAmount;
     }

    /**
     * Sets the remaining balance on the payment method.
     * @param value the remaining balance on the payment method.
     */
     public void setRemainingBalance(String value) {
          this.remainingBalance = value;
     }

    /**
     * Gets the remaining balance on the payment method.
     * @return the remaining balance on the payment method.
     */
     @JsonProperty("remainingBalance")
     public String getRemainingBalance() {
          return this.remainingBalance;
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
     * Sets the cash back amount the customer requested during the transaction.
     * @param value the cash back amount the customer requested during the transaction.
     */
     public void setRequestedCashBackAmount(String value) {
          this.requestedCashBackAmount = value;
     }

    /**
     * Gets the cash back amount the customer requested during the transaction.
     * @return the cash back amount the customer requested during the transaction.
     */
     @JsonProperty("requestedCashBackAmount")
     public String getRequestedCashBackAmount() {
          return this.requestedCashBackAmount;
     }

    /**
     * Sets the amount of cash back authorized by the gateway.
     * @param value the amount of cash back authorized by the gateway. This amount will be
     * the entire amount requested, or zero.
     */
     public void setAuthorizedCashBackAmount(String value) {
          this.authorizedCashBackAmount = value;
     }

    /**
     * Gets the amount of cash back authorized by the gateway.
     * @return the amount of cash back authorized by the gateway. This amount will be the
     * entire amount requested, or zero.
     */
     @JsonProperty("authorizedCashBackAmount")
     public String getAuthorizedCashBackAmount() {
          return this.authorizedCashBackAmount;
     }

    /**
     * Sets that the transaction has met the standard criteria for confirmation on the
     * network.
     * @param value that the transaction has met the standard criteria for confirmation
     * on the network. (For example, 6 confirmations for level one bitcoin.)
     */
     public void setConfirmed(boolean value) {
          this.confirmed = value;
     }

    /**
     * Gets that the transaction has met the standard criteria for confirmation on the
     * network.
     * @return that the transaction has met the standard criteria for confirmation on the
     * network. (For example, 6 confirmations for level one bitcoin.)
     */
     @JsonProperty("confirmed")
     public boolean isConfirmed() {
          return this.confirmed;
     }

    /**
     * Sets the amount submitted to the blockchain.
     * @param value the amount submitted to the blockchain.
     */
     public void setCryptoAuthorizedAmount(String value) {
          this.cryptoAuthorizedAmount = value;
     }

    /**
     * Gets the amount submitted to the blockchain.
     * @return the amount submitted to the blockchain.
     */
     @JsonProperty("cryptoAuthorizedAmount")
     public String getCryptoAuthorizedAmount() {
          return this.cryptoAuthorizedAmount;
     }

    /**
     * Sets the network level fee assessed for the transaction denominated in
     * cryptocurrency.
     * @param value the network level fee assessed for the transaction denominated in
     * cryptocurrency. This fee goes to channel operators and crypto miners, not
     * BlockChyp.
     */
     public void setCryptoNetworkFee(String value) {
          this.cryptoNetworkFee = value;
     }

    /**
     * Gets the network level fee assessed for the transaction denominated in
     * cryptocurrency.
     * @return the network level fee assessed for the transaction denominated in
     * cryptocurrency. This fee goes to channel operators and crypto miners, not
     * BlockChyp.
     */
     @JsonProperty("cryptoNetworkFee")
     public String getCryptoNetworkFee() {
          return this.cryptoNetworkFee;
     }

    /**
     * Sets the three letter cryptocurrency code used for the transactions.
     * @param value the three letter cryptocurrency code used for the transactions.
     */
     public void setCryptocurrency(String value) {
          this.cryptocurrency = value;
     }

    /**
     * Gets the three letter cryptocurrency code used for the transactions.
     * @return the three letter cryptocurrency code used for the transactions.
     */
     @JsonProperty("cryptocurrency")
     public String getCryptocurrency() {
          return this.cryptocurrency;
     }

    /**
     * Sets whether or not the transaction was processed on the level one or level two
     * network.
     * @param value whether or not the transaction was processed on the level one or level
     * two network.
     */
     public void setCryptoNetwork(String value) {
          this.cryptoNetwork = value;
     }

    /**
     * Gets whether or not the transaction was processed on the level one or level two
     * network.
     * @return whether or not the transaction was processed on the level one or level two
     * network.
     */
     @JsonProperty("cryptoNetwork")
     public String getCryptoNetwork() {
          return this.cryptoNetwork;
     }

    /**
     * Sets the address on the crypto network the transaction was sent to.
     * @param value the address on the crypto network the transaction was sent to.
     */
     public void setCryptoReceiveAddress(String value) {
          this.cryptoReceiveAddress = value;
     }

    /**
     * Gets the address on the crypto network the transaction was sent to.
     * @return the address on the crypto network the transaction was sent to.
     */
     @JsonProperty("cryptoReceiveAddress")
     public String getCryptoReceiveAddress() {
          return this.cryptoReceiveAddress;
     }

    /**
     * Sets hash or other identifier that identifies the block on the cryptocurrency
     * network, if available or relevant.
     * @param value hash or other identifier that identifies the block on the
     * cryptocurrency network, if available or relevant.
     */
     public void setCryptoBlock(String value) {
          this.cryptoBlock = value;
     }

    /**
     * Gets hash or other identifier that identifies the block on the cryptocurrency
     * network, if available or relevant.
     * @return hash or other identifier that identifies the block on the cryptocurrency
     * network, if available or relevant.
     */
     @JsonProperty("cryptoBlock")
     public String getCryptoBlock() {
          return this.cryptoBlock;
     }

    /**
     * Sets hash or other transaction identifier that identifies the transaction on the
     * cryptocurrency network, if available or relevant.
     * @param value hash or other transaction identifier that identifies the
     * transaction on the cryptocurrency network, if available or relevant.
     */
     public void setCryptoTransactionId(String value) {
          this.cryptoTransactionId = value;
     }

    /**
     * Gets hash or other transaction identifier that identifies the transaction on the
     * cryptocurrency network, if available or relevant.
     * @return hash or other transaction identifier that identifies the transaction on
     * the cryptocurrency network, if available or relevant.
     */
     @JsonProperty("cryptoTransactionId")
     public String getCryptoTransactionId() {
          return this.cryptoTransactionId;
     }

    /**
     * Sets the payment request URI used for the transaction, if available.
     * @param value the payment request URI used for the transaction, if available.
     */
     public void setCryptoPaymentRequest(String value) {
          this.cryptoPaymentRequest = value;
     }

    /**
     * Gets the payment request URI used for the transaction, if available.
     * @return the payment request URI used for the transaction, if available.
     */
     @JsonProperty("cryptoPaymentRequest")
     public String getCryptoPaymentRequest() {
          return this.cryptoPaymentRequest;
     }

    /**
     * Sets used for additional status information related to crypto transactions.
     * @param value used for additional status information related to crypto
     * transactions.
     */
     public void setCryptoStatus(String value) {
          this.cryptoStatus = value;
     }

    /**
     * Gets used for additional status information related to crypto transactions.
     * @return used for additional status information related to crypto transactions.
     */
     @JsonProperty("cryptoStatus")
     public String getCryptoStatus() {
          return this.cryptoStatus;
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
     * Sets the card brand (VISA, MC, AMEX, etc).
     * @param value the card brand (VISA, MC, AMEX, etc).
     */
     public void setPaymentType(String value) {
          this.paymentType = value;
     }

    /**
     * Gets the card brand (VISA, MC, AMEX, etc).
     * @return the card brand (VISA, MC, AMEX, etc).
     */
     @JsonProperty("paymentType")
     public String getPaymentType() {
          return this.paymentType;
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
     * Sets card BIN ranges can be whitelisted so that they are read instead of being
     * processed directly.
     * @param value card BIN ranges can be whitelisted so that they are read instead of
     * being processed directly. This is useful for integration with legacy gift card
     * systems.
     */
     public void setWhiteListedCard(WhiteListedCard value) {
          this.whiteListedCard = value;
     }

    /**
     * Gets card BIN ranges can be whitelisted so that they are read instead of being
     * processed directly.
     * @return card BIN ranges can be whitelisted so that they are read instead of being
     * processed directly. This is useful for integration with legacy gift card systems.
     */
     @JsonProperty("whiteListedCard")
     public WhiteListedCard getWhiteListedCard() {
          return this.whiteListedCard;
     }

    /**
     * Sets that the transaction was flagged for store and forward due to network
     * problems.
     * @param value that the transaction was flagged for store and forward due to network
     * problems.
     */
     public void setStoreAndForward(boolean value) {
          this.storeAndForward = value;
     }

    /**
     * Gets that the transaction was flagged for store and forward due to network
     * problems.
     * @return that the transaction was flagged for store and forward due to network
     * problems.
     */
     @JsonProperty("storeAndForward")
     public boolean isStoreAndForward() {
          return this.storeAndForward;
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
