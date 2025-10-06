/**
 * Copyright 2019-2025 BlockChyp, Inc. All rights reserved. Use of this code is governed
 * by a license that can be found in the LICENSE file.
 *
 * This file was generated automatically by the BlockChyp SDK Generator. Changes to this
 * file will be lost every time the code is regenerated.
 */

package com.blockchyp.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Updates a payment token.
 */
public class UpdateTokenRequest implements ITimeoutRequest {

     private int timeout;

     private boolean test;

     private String token;

     private String accountHolderType;

     private String accountType;

     private String bankName;

     private String cardHolderName;

     private String expiryMonth;

     private String expiryYear;

     private String address;

     private String postalCode;

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
     * Sets the token to update.
     * @param value the token to update.
     */
     public void setToken(String value) {
          this.token = value;
     }

    /**
     * Gets the token to update.
     * @return the token to update.
     */
     @JsonProperty("token")
     public String getToken() {
          return this.token;
     }

    /**
     * Sets bank account holder type (personal or business).
     * @param value bank account holder type (personal or business).
     */
     public void setAccountHolderType(String value) {
          this.accountHolderType = value;
     }

    /**
     * Gets bank account holder type (personal or business).
     * @return bank account holder type (personal or business).
     */
     @JsonProperty("accountHolderType")
     public String getAccountHolderType() {
          return this.accountHolderType;
     }

    /**
     * Sets bank account type (checking or saving).
     * @param value bank account type (checking or saving).
     */
     public void setAccountType(String value) {
          this.accountType = value;
     }

    /**
     * Gets bank account type (checking or saving).
     * @return bank account type (checking or saving).
     */
     @JsonProperty("accountType")
     public String getAccountType() {
          return this.accountType;
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
     * Sets card holder name.
     * @param value card holder name.
     */
     public void setCardHolderName(String value) {
          this.cardHolderName = value;
     }

    /**
     * Gets card holder name.
     * @return card holder name.
     */
     @JsonProperty("cardHolderName")
     public String getCardHolderName() {
          return this.cardHolderName;
     }

    /**
     * Sets expiry month.
     * @param value expiry month.
     */
     public void setExpiryMonth(String value) {
          this.expiryMonth = value;
     }

    /**
     * Gets expiry month.
     * @return expiry month.
     */
     @JsonProperty("expiryMonth")
     public String getExpiryMonth() {
          return this.expiryMonth;
     }

    /**
     * Sets expiry year.
     * @param value expiry year.
     */
     public void setExpiryYear(String value) {
          this.expiryYear = value;
     }

    /**
     * Gets expiry year.
     * @return expiry year.
     */
     @JsonProperty("expiryYear")
     public String getExpiryYear() {
          return this.expiryYear;
     }

    /**
     * Sets address.
     * @param value address.
     */
     public void setAddress(String value) {
          this.address = value;
     }

    /**
     * Gets address.
     * @return address.
     */
     @JsonProperty("address")
     public String getAddress() {
          return this.address;
     }

    /**
     * Sets postal code.
     * @param value postal code.
     */
     public void setPostalCode(String value) {
          this.postalCode = value;
     }

    /**
     * Gets postal code.
     * @return postal code.
     */
     @JsonProperty("postalCode")
     public String getPostalCode() {
          return this.postalCode;
     }

}
