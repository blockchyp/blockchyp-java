/**
 * Copyright 2019-2026 BlockChyp, Inc. All rights reserved. Use of this code is governed
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
 * Models a surcharge review request.
 */
@SuppressWarnings({"rawtypes", "unchecked"})
public class SurchargeReviewRequest implements ITimeoutRequest {

     private int timeout;

     private boolean test;

     private String cardNumber;

     private String token;

     private String amount;

     private String surchargeRate;

     private String debitTransFee;

     private String debitDiscountRate;

     private String surchargePolicy;

     private Collection<String> excludedMerchantStates;

     private String zip;

     private String state;

     private boolean exemptForeignCards;

     private String surchargingMode;

     private String pricingPlan;

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
     * Sets the card number for the pricing request.
     * @param value the card number for the pricing request.
     */
     public void setCardNumber(String value) {
          this.cardNumber = value;
     }

    /**
     * Gets the card number for the pricing request.
     * @return the card number for the pricing request.
     */
     @JsonProperty("cardNumber")
     public String getCardNumber() {
          return this.cardNumber;
     }

    /**
     * Sets the payment token.
     * @param value the payment token.
     */
     public void setToken(String value) {
          this.token = value;
     }

    /**
     * Gets the payment token.
     * @return the payment token.
     */
     @JsonProperty("token")
     public String getToken() {
          return this.token;
     }

    /**
     * Sets the transaction amount.
     * @param value the transaction amount.
     */
     public void setAmount(String value) {
          this.amount = value;
     }

    /**
     * Gets the transaction amount.
     * @return the transaction amount.
     */
     @JsonProperty("amount")
     public String getAmount() {
          return this.amount;
     }

    /**
     * Sets the surcharge rate.
     * @param value the surcharge rate.
     */
     public void setSurchargeRate(String value) {
          this.surchargeRate = value;
     }

    /**
     * Gets the surcharge rate.
     * @return the surcharge rate.
     */
     @JsonProperty("surchargeRate")
     public String getSurchargeRate() {
          return this.surchargeRate;
     }

    /**
     * Sets the debit transaction fee.
     * @param value the debit transaction fee.
     */
     public void setDebitTransFee(String value) {
          this.debitTransFee = value;
     }

    /**
     * Gets the debit transaction fee.
     * @return the debit transaction fee.
     */
     @JsonProperty("debitTransFee")
     public String getDebitTransFee() {
          return this.debitTransFee;
     }

    /**
     * Sets the debit discount rate.
     * @param value the debit discount rate.
     */
     public void setDebitDiscountRate(String value) {
          this.debitDiscountRate = value;
     }

    /**
     * Gets the debit discount rate.
     * @return the debit discount rate.
     */
     @JsonProperty("debitDiscountRate")
     public String getDebitDiscountRate() {
          return this.debitDiscountRate;
     }

    /**
     * Sets the surcharge policy.
     * @param value the surcharge policy.
     */
     public void setSurchargePolicy(String value) {
          this.surchargePolicy = value;
     }

    /**
     * Gets the surcharge policy.
     * @return the surcharge policy.
     */
     @JsonProperty("surchargePolicy")
     public String getSurchargePolicy() {
          return this.surchargePolicy;
     }

    /**
     * Sets the list of excluded merchant states.
     * @param value the list of excluded merchant states.
     */
     public void setExcludedMerchantStates(Collection<String> value) {
          this.excludedMerchantStates = value;
     }

    /**
     * Gets the list of excluded merchant states.
     * @return the list of excluded merchant states.
     */
     @JsonProperty("excludedMerchantStates")
     public Collection<String> getExcludedMerchantStates() {
          return this.excludedMerchantStates;
     }

    /**
     * Sets the zip code.
     * @param value the zip code.
     */
     public void setZip(String value) {
          this.zip = value;
     }

    /**
     * Gets the zip code.
     * @return the zip code.
     */
     @JsonProperty("zip")
     public String getZip() {
          return this.zip;
     }

    /**
     * Sets the state or province.
     * @param value the state or province.
     */
     public void setState(String value) {
          this.state = value;
     }

    /**
     * Gets the state or province.
     * @return the state or province.
     */
     @JsonProperty("state")
     public String getState() {
          return this.state;
     }

    /**
     * Sets if foreign cards are exempt.
     * @param value if foreign cards are exempt.
     */
     public void setExemptForeignCards(boolean value) {
          this.exemptForeignCards = value;
     }

    /**
     * Gets if foreign cards are exempt.
     * @return if foreign cards are exempt.
     */
     @JsonProperty("exemptForeignCards")
     public boolean isExemptForeignCards() {
          return this.exemptForeignCards;
     }

    /**
     * Sets the surcharging mode.
     * @param value the surcharging mode.
     */
     public void setSurchargingMode(String value) {
          this.surchargingMode = value;
     }

    /**
     * Gets the surcharging mode.
     * @return the surcharging mode.
     */
     @JsonProperty("surchargingMode")
     public String getSurchargingMode() {
          return this.surchargingMode;
     }

    /**
     * Sets the pricing plan.
     * @param value the pricing plan.
     */
     public void setPricingPlan(String value) {
          this.pricingPlan = value;
     }

    /**
     * Gets the pricing plan.
     * @return the pricing plan.
     */
     @JsonProperty("pricingPlan")
     public String getPricingPlan() {
          return this.pricingPlan;
     }

    /**
     * Adds a the list of excluded merchant states.
     * @param value the list of excluded merchant states.
     */
     public void addExcludedMerchantState(String value) {
          if (this.excludedMerchantStates == null) {
               this.excludedMerchantStates = new ArrayList();
          }
          this.excludedMerchantStates.add(value);
     }

}
