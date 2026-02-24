/**
 * Copyright 2019-2026 BlockChyp, Inc. All rights reserved. Use of this code is governed
 * by a license that can be found in the LICENSE file.
 *
 * This file was generated automatically by the BlockChyp SDK Generator. Changes to this
 * file will be lost every time the code is regenerated.
 */

package com.blockchyp.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Models merchant settings and configuration.
 */
public class MerchantSettings {

     private String account;

     private String gateway;

     private boolean surchargingEnabled;

     private float customSurchargePercent;

     private boolean reducedRate;

     private boolean inversePricingEnabled;

     private float creditDiscountRate;

     private String acquiringSolution;

     private boolean acceptDebit;

     private StateCheckSettings stateCheckSettings;

    /**
     * Sets the merchant account identifier.
     * @param value the merchant account identifier.
     */
     public void setAccount(String value) {
          this.account = value;
     }

    /**
     * Gets the merchant account identifier.
     * @return the merchant account identifier.
     */
     @JsonProperty("account")
     public String getAccount() {
          return this.account;
     }

    /**
     * Sets the gateway identifier.
     * @param value the gateway identifier.
     */
     public void setGateway(String value) {
          this.gateway = value;
     }

    /**
     * Gets the gateway identifier.
     * @return the gateway identifier.
     */
     @JsonProperty("gateway")
     public String getGateway() {
          return this.gateway;
     }

    /**
     * Sets whether surcharging is enabled for the merchant.
     * @param value whether surcharging is enabled for the merchant.
     */
     public void setSurchargingEnabled(boolean value) {
          this.surchargingEnabled = value;
     }

    /**
     * Gets whether surcharging is enabled for the merchant.
     * @return whether surcharging is enabled for the merchant.
     */
     @JsonProperty("surchargingEnabled")
     public boolean isSurchargingEnabled() {
          return this.surchargingEnabled;
     }

    /**
     * Sets the custom surcharge percentage, if applicable.
     * @param value the custom surcharge percentage, if applicable.
     */
     public void setCustomSurchargePercent(float value) {
          this.customSurchargePercent = value;
     }

    /**
     * Gets the custom surcharge percentage, if applicable.
     * @return the custom surcharge percentage, if applicable.
     */
     @JsonProperty("customSurchargePercent")
     public float getCustomSurchargePercent() {
          return this.customSurchargePercent;
     }

    /**
     * Sets if reduced rate pricing is enabled.
     * @param value if reduced rate pricing is enabled.
     */
     public void setReducedRate(boolean value) {
          this.reducedRate = value;
     }

    /**
     * Gets if reduced rate pricing is enabled.
     * @return if reduced rate pricing is enabled.
     */
     @JsonProperty("reducedRate")
     public boolean isReducedRate() {
          return this.reducedRate;
     }

    /**
     * Sets if inverse pricing is enabled.
     * @param value if inverse pricing is enabled.
     */
     public void setInversePricingEnabled(boolean value) {
          this.inversePricingEnabled = value;
     }

    /**
     * Gets if inverse pricing is enabled.
     * @return if inverse pricing is enabled.
     */
     @JsonProperty("inversePricingEnabled")
     public boolean isInversePricingEnabled() {
          return this.inversePricingEnabled;
     }

    /**
     * Sets the credit discount rate, if applicable.
     * @param value the credit discount rate, if applicable.
     */
     public void setCreditDiscountRate(float value) {
          this.creditDiscountRate = value;
     }

    /**
     * Gets the credit discount rate, if applicable.
     * @return the credit discount rate, if applicable.
     */
     @JsonProperty("creditDiscountRate")
     public float getCreditDiscountRate() {
          return this.creditDiscountRate;
     }

    /**
     * Sets the acquiring solution identifier.
     * @param value the acquiring solution identifier.
     */
     public void setAcquiringSolution(String value) {
          this.acquiringSolution = value;
     }

    /**
     * Gets the acquiring solution identifier.
     * @return the acquiring solution identifier.
     */
     @JsonProperty("acquiringSolution")
     public String getAcquiringSolution() {
          return this.acquiringSolution;
     }

    /**
     * Sets whether the merchant accepts debit cards.
     * @param value whether the merchant accepts debit cards.
     */
     public void setAcceptDebit(boolean value) {
          this.acceptDebit = value;
     }

    /**
     * Gets whether the merchant accepts debit cards.
     * @return whether the merchant accepts debit cards.
     */
     @JsonProperty("acceptDebit")
     public boolean isAcceptDebit() {
          return this.acceptDebit;
     }

    /**
     * Sets state check settings for the merchant.
     * @param value state check settings for the merchant.
     */
     public void setStateCheckSettings(StateCheckSettings value) {
          this.stateCheckSettings = value;
     }

    /**
     * Gets state check settings for the merchant.
     * @return state check settings for the merchant.
     */
     @JsonProperty("stateCheckSettings")
     public StateCheckSettings getStateCheckSettings() {
          return this.stateCheckSettings;
     }

}
