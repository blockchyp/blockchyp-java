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
 * Models a customer token.
 */
@SuppressWarnings({"rawtypes", "unchecked"})
public class CustomerToken {

     private String token;

     private String maskedPan;

     private String expiryMonth;

     private String expiryYear;

     private String paymentType;

     private String accountType;

     private String accountHolderType;

     private String bankName;

     private String routingNumber;

     private String tokenHash;

     private String bin;

     private Collection<Customer> customers;

    /**
     * Sets BlockChyp assigned customer id.
     * @param value BlockChyp assigned customer id.
     */
     public void setToken(String value) {
          this.token = value;
     }

    /**
     * Gets BlockChyp assigned customer id.
     * @return BlockChyp assigned customer id.
     */
     @JsonProperty("token")
     public String getToken() {
          return this.token;
     }

    /**
     * Sets masked primary account number.
     * @param value masked primary account number.
     */
     public void setMaskedPan(String value) {
          this.maskedPan = value;
     }

    /**
     * Gets masked primary account number.
     * @return masked primary account number.
     */
     @JsonProperty("maskedPan")
     public String getMaskedPan() {
          return this.maskedPan;
     }

    /**
     * Sets expiration month.
     * @param value expiration month.
     */
     public void setExpiryMonth(String value) {
          this.expiryMonth = value;
     }

    /**
     * Gets expiration month.
     * @return expiration month.
     */
     @JsonProperty("expiryMonth")
     public String getExpiryMonth() {
          return this.expiryMonth;
     }

    /**
     * Sets expiration month.
     * @param value expiration month.
     */
     public void setExpiryYear(String value) {
          this.expiryYear = value;
     }

    /**
     * Gets expiration month.
     * @return expiration month.
     */
     @JsonProperty("expiryYear")
     public String getExpiryYear() {
          return this.expiryYear;
     }

    /**
     * Sets payment type.
     * @param value payment type.
     */
     public void setPaymentType(String value) {
          this.paymentType = value;
     }

    /**
     * Gets payment type.
     * @return payment type.
     */
     @JsonProperty("paymentType")
     public String getPaymentType() {
          return this.paymentType;
     }

    /**
     * Sets bank account type (checking, saving).
     * @param value bank account type (checking, saving).
     */
     public void setAccountType(String value) {
          this.accountType = value;
     }

    /**
     * Gets bank account type (checking, saving).
     * @return bank account type (checking, saving).
     */
     @JsonProperty("accountType")
     public String getAccountType() {
          return this.accountType;
     }

    /**
     * Sets bank account holder type (personal, business).
     * @param value bank account holder type (personal, business).
     */
     public void setAccountHolderType(String value) {
          this.accountHolderType = value;
     }

    /**
     * Gets bank account holder type (personal, business).
     * @return bank account holder type (personal, business).
     */
     @JsonProperty("accountHolderType")
     public String getAccountHolderType() {
          return this.accountHolderType;
     }

    /**
     * Sets bank name.
     * @param value bank name.
     */
     public void setBankName(String value) {
          this.bankName = value;
     }

    /**
     * Gets bank name.
     * @return bank name.
     */
     @JsonProperty("bankName")
     public String getBankName() {
          return this.bankName;
     }

    /**
     * Sets routing number.
     * @param value routing number.
     */
     public void setRoutingNumber(String value) {
          this.routingNumber = value;
     }

    /**
     * Gets routing number.
     * @return routing number.
     */
     @JsonProperty("routingNumber")
     public String getRoutingNumber() {
          return this.routingNumber;
     }

    /**
     * Sets token hash (generated with a static salt, Merchant ID, Registration Date and
     * PAN.
     * @param value token hash (generated with a static salt, Merchant ID, Registration
     * Date and PAN.
     */
     public void setTokenHash(String value) {
          this.tokenHash = value;
     }

    /**
     * Gets token hash (generated with a static salt, Merchant ID, Registration Date and
     * PAN.
     * @return token hash (generated with a static salt, Merchant ID, Registration Date
     * and PAN.
     */
     @JsonProperty("tokenHash")
     public String getTokenHash() {
          return this.tokenHash;
     }

    /**
     * Sets card bin.
     * @param value card bin.
     */
     public void setBin(String value) {
          this.bin = value;
     }

    /**
     * Gets card bin.
     * @return card bin.
     */
     @JsonProperty("bin")
     public String getBin() {
          return this.bin;
     }

    /**
     * Sets models customer records associated with a payment token.
     * @param value models customer records associated with a payment token.
     */
     public void setCustomers(Collection<Customer> value) {
          this.customers = value;
     }

    /**
     * Gets models customer records associated with a payment token.
     * @return models customer records associated with a payment token.
     */
     @JsonProperty("customers")
     public Collection<Customer> getCustomers() {
          return this.customers;
     }

    /**
     * Adds a models customer records associated with a payment token.
     * @param value models customer records associated with a payment token.
     */
     public void addCustomer(Customer value) {
          if (this.customers == null) {
               this.customers = new ArrayList();
          }
          this.customers.add(value);
     }

}
