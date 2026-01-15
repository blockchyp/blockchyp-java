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
 * Models a the response to a pricing policy request.
 */
public class PricingPolicyResponse implements IAbstractAcknowledgement {

     private boolean success;

     private String error;

     private String responseDescription;

     private String id;

     private String partnerId;

     private String merchantId;

     private boolean enabled;

     private String timestamp;

     private String description;

     private String policyType;

     private String partnerMarkupSplit;

     private PricePoint standardFlatRate;

     private PricePoint debitFlatRate;

     private PricePoint ecommerceFlatRate;

     private PricePoint keyedFlatRate;

     private PricePoint premiumFlatRate;

     private PricePoint standardInterchangeMarkup;

     private PricePoint debitInterchangeMarkup;

     private PricePoint ecommerceInterchangeMarkup;

     private PricePoint keyedInterchangeMarkup;

     private PricePoint premiumInterchangeMarkup;

     private PricePoint standardTransactionFee;

     private PricePoint debitTransactionFee;

     private PricePoint ecommerceTransactionFee;

     private PricePoint keyedTransactionFee;

     private PricePoint premiumTransactionFee;

     private PricePoint ebtTransactionFee;

     private PricePoint monthlyFee;

     private PricePoint annualFee;

     private PricePoint chargebackFee;

     private PricePoint avsFee;

     private PricePoint batchFee;

     private PricePoint voiceAuthFee;

     private PricePoint accountSetupFee;

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
     * Sets the id owner of the pricing policy.
     * @param value the id owner of the pricing policy.
     */
     public void setId(String value) {
          this.id = value;
     }

    /**
     * Gets the id owner of the pricing policy.
     * @return the id owner of the pricing policy.
     */
     @JsonProperty("id")
     public String getId() {
          return this.id;
     }

    /**
     * Sets the id of the partner associated with this pricing policy.
     * @param value the id of the partner associated with this pricing policy.
     */
     public void setPartnerId(String value) {
          this.partnerId = value;
     }

    /**
     * Gets the id of the partner associated with this pricing policy.
     * @return the id of the partner associated with this pricing policy.
     */
     @JsonProperty("partnerId")
     public String getPartnerId() {
          return this.partnerId;
     }

    /**
     * Sets the id of the merchant associated with this pricing policy.
     * @param value the id of the merchant associated with this pricing policy.
     */
     public void setMerchantId(String value) {
          this.merchantId = value;
     }

    /**
     * Gets the id of the merchant associated with this pricing policy.
     * @return the id of the merchant associated with this pricing policy.
     */
     @JsonProperty("merchantId")
     public String getMerchantId() {
          return this.merchantId;
     }

    /**
     * Sets whether or not a pricing policy is enabled.
     * @param value whether or not a pricing policy is enabled.
     */
     public void setEnabled(boolean value) {
          this.enabled = value;
     }

    /**
     * Gets whether or not a pricing policy is enabled.
     * @return whether or not a pricing policy is enabled.
     */
     @JsonProperty("enabled")
     public boolean isEnabled() {
          return this.enabled;
     }

    /**
     * Sets the date and time when the pricing policy was created.
     * @param value the date and time when the pricing policy was created.
     */
     public void setTimestamp(String value) {
          this.timestamp = value;
     }

    /**
     * Gets the date and time when the pricing policy was created.
     * @return the date and time when the pricing policy was created.
     */
     @JsonProperty("timestamp")
     public String getTimestamp() {
          return this.timestamp;
     }

    /**
     * Sets the description of the pricing policy.
     * @param value the description of the pricing policy.
     */
     public void setDescription(String value) {
          this.description = value;
     }

    /**
     * Gets the description of the pricing policy.
     * @return the description of the pricing policy.
     */
     @JsonProperty("description")
     public String getDescription() {
          return this.description;
     }

    /**
     * Sets type of pricing policy (flat vs interchange).
     * @param value type of pricing policy (flat vs interchange).
     */
     public void setPolicyType(String value) {
          this.policyType = value;
     }

    /**
     * Gets type of pricing policy (flat vs interchange).
     * @return type of pricing policy (flat vs interchange).
     */
     @JsonProperty("policyType")
     public String getPolicyType() {
          return this.policyType;
     }

    /**
     * Sets the percentage split of the of buy rate markup with BlockChyp.
     * @param value the percentage split of the of buy rate markup with BlockChyp.
     */
     public void setPartnerMarkupSplit(String value) {
          this.partnerMarkupSplit = value;
     }

    /**
     * Gets the percentage split of the of buy rate markup with BlockChyp.
     * @return the percentage split of the of buy rate markup with BlockChyp.
     */
     @JsonProperty("partnerMarkupSplit")
     public String getPartnerMarkupSplit() {
          return this.partnerMarkupSplit;
     }

    /**
     * Sets the flat rate percentage for standard card present transactions.
     * @param value the flat rate percentage for standard card present transactions.
     */
     public void setStandardFlatRate(PricePoint value) {
          this.standardFlatRate = value;
     }

    /**
     * Gets the flat rate percentage for standard card present transactions.
     * @return the flat rate percentage for standard card present transactions.
     */
     @JsonProperty("standardFlatRate")
     public PricePoint getStandardFlatRate() {
          return this.standardFlatRate;
     }

    /**
     * Sets the flat rate percentage for debit card transactions.
     * @param value the flat rate percentage for debit card transactions.
     */
     public void setDebitFlatRate(PricePoint value) {
          this.debitFlatRate = value;
     }

    /**
     * Gets the flat rate percentage for debit card transactions.
     * @return the flat rate percentage for debit card transactions.
     */
     @JsonProperty("debitFlatRate")
     public PricePoint getDebitFlatRate() {
          return this.debitFlatRate;
     }

    /**
     * Sets the flat rate percentage for ecommerce transactions.
     * @param value the flat rate percentage for ecommerce transactions.
     */
     public void setEcommerceFlatRate(PricePoint value) {
          this.ecommerceFlatRate = value;
     }

    /**
     * Gets the flat rate percentage for ecommerce transactions.
     * @return the flat rate percentage for ecommerce transactions.
     */
     @JsonProperty("ecommerceFlatRate")
     public PricePoint getEcommerceFlatRate() {
          return this.ecommerceFlatRate;
     }

    /**
     * Sets the flat rate percentage for keyed/manual transactions.
     * @param value the flat rate percentage for keyed/manual transactions.
     */
     public void setKeyedFlatRate(PricePoint value) {
          this.keyedFlatRate = value;
     }

    /**
     * Gets the flat rate percentage for keyed/manual transactions.
     * @return the flat rate percentage for keyed/manual transactions.
     */
     @JsonProperty("keyedFlatRate")
     public PricePoint getKeyedFlatRate() {
          return this.keyedFlatRate;
     }

    /**
     * Sets the flat rate percentage for premium (high rewards) card transactions.
     * @param value the flat rate percentage for premium (high rewards) card
     * transactions.
     */
     public void setPremiumFlatRate(PricePoint value) {
          this.premiumFlatRate = value;
     }

    /**
     * Gets the flat rate percentage for premium (high rewards) card transactions.
     * @return the flat rate percentage for premium (high rewards) card transactions.
     */
     @JsonProperty("premiumFlatRate")
     public PricePoint getPremiumFlatRate() {
          return this.premiumFlatRate;
     }

    /**
     * Sets the interchange markup percentage for standard card present transactions.
     * @param value the interchange markup percentage for standard card present
     * transactions.
     */
     public void setStandardInterchangeMarkup(PricePoint value) {
          this.standardInterchangeMarkup = value;
     }

    /**
     * Gets the interchange markup percentage for standard card present transactions.
     * @return the interchange markup percentage for standard card present
     * transactions.
     */
     @JsonProperty("standardInterchangeMarkup")
     public PricePoint getStandardInterchangeMarkup() {
          return this.standardInterchangeMarkup;
     }

    /**
     * Sets the interchange markup percentage for debit card transactions.
     * @param value the interchange markup percentage for debit card transactions.
     */
     public void setDebitInterchangeMarkup(PricePoint value) {
          this.debitInterchangeMarkup = value;
     }

    /**
     * Gets the interchange markup percentage for debit card transactions.
     * @return the interchange markup percentage for debit card transactions.
     */
     @JsonProperty("debitInterchangeMarkup")
     public PricePoint getDebitInterchangeMarkup() {
          return this.debitInterchangeMarkup;
     }

    /**
     * Sets the interchange markup percentage for ecommerce transactions.
     * @param value the interchange markup percentage for ecommerce transactions.
     */
     public void setEcommerceInterchangeMarkup(PricePoint value) {
          this.ecommerceInterchangeMarkup = value;
     }

    /**
     * Gets the interchange markup percentage for ecommerce transactions.
     * @return the interchange markup percentage for ecommerce transactions.
     */
     @JsonProperty("ecommerceInterchangeMarkup")
     public PricePoint getEcommerceInterchangeMarkup() {
          return this.ecommerceInterchangeMarkup;
     }

    /**
     * Sets the interchange markup percentage for keyed/manual transactions.
     * @param value the interchange markup percentage for keyed/manual transactions.
     */
     public void setKeyedInterchangeMarkup(PricePoint value) {
          this.keyedInterchangeMarkup = value;
     }

    /**
     * Gets the interchange markup percentage for keyed/manual transactions.
     * @return the interchange markup percentage for keyed/manual transactions.
     */
     @JsonProperty("keyedInterchangeMarkup")
     public PricePoint getKeyedInterchangeMarkup() {
          return this.keyedInterchangeMarkup;
     }

    /**
     * Sets the interchange markup percentage for premium (high rewards) card
     * transactions.
     * @param value the interchange markup percentage for premium (high rewards) card
     * transactions.
     */
     public void setPremiumInterchangeMarkup(PricePoint value) {
          this.premiumInterchangeMarkup = value;
     }

    /**
     * Gets the interchange markup percentage for premium (high rewards) card
     * transactions.
     * @return the interchange markup percentage for premium (high rewards) card
     * transactions.
     */
     @JsonProperty("premiumInterchangeMarkup")
     public PricePoint getPremiumInterchangeMarkup() {
          return this.premiumInterchangeMarkup;
     }

    /**
     * Sets the transaction fee for standard card present transactions.
     * @param value the transaction fee for standard card present transactions.
     */
     public void setStandardTransactionFee(PricePoint value) {
          this.standardTransactionFee = value;
     }

    /**
     * Gets the transaction fee for standard card present transactions.
     * @return the transaction fee for standard card present transactions.
     */
     @JsonProperty("standardTransactionFee")
     public PricePoint getStandardTransactionFee() {
          return this.standardTransactionFee;
     }

    /**
     * Sets the transaction fee for debit card transactions.
     * @param value the transaction fee for debit card transactions.
     */
     public void setDebitTransactionFee(PricePoint value) {
          this.debitTransactionFee = value;
     }

    /**
     * Gets the transaction fee for debit card transactions.
     * @return the transaction fee for debit card transactions.
     */
     @JsonProperty("debitTransactionFee")
     public PricePoint getDebitTransactionFee() {
          return this.debitTransactionFee;
     }

    /**
     * Sets the transaction fee for ecommerce transactions.
     * @param value the transaction fee for ecommerce transactions.
     */
     public void setEcommerceTransactionFee(PricePoint value) {
          this.ecommerceTransactionFee = value;
     }

    /**
     * Gets the transaction fee for ecommerce transactions.
     * @return the transaction fee for ecommerce transactions.
     */
     @JsonProperty("ecommerceTransactionFee")
     public PricePoint getEcommerceTransactionFee() {
          return this.ecommerceTransactionFee;
     }

    /**
     * Sets the transaction fee for keyed/manual transactions.
     * @param value the transaction fee for keyed/manual transactions.
     */
     public void setKeyedTransactionFee(PricePoint value) {
          this.keyedTransactionFee = value;
     }

    /**
     * Gets the transaction fee for keyed/manual transactions.
     * @return the transaction fee for keyed/manual transactions.
     */
     @JsonProperty("keyedTransactionFee")
     public PricePoint getKeyedTransactionFee() {
          return this.keyedTransactionFee;
     }

    /**
     * Sets the transaction fee for premium (high rewards) card transactions.
     * @param value the transaction fee for premium (high rewards) card transactions.
     */
     public void setPremiumTransactionFee(PricePoint value) {
          this.premiumTransactionFee = value;
     }

    /**
     * Gets the transaction fee for premium (high rewards) card transactions.
     * @return the transaction fee for premium (high rewards) card transactions.
     */
     @JsonProperty("premiumTransactionFee")
     public PricePoint getPremiumTransactionFee() {
          return this.premiumTransactionFee;
     }

    /**
     * Sets the transaction fee for EBT card transactions.
     * @param value the transaction fee for EBT card transactions.
     */
     public void setEbtTransactionFee(PricePoint value) {
          this.ebtTransactionFee = value;
     }

    /**
     * Gets the transaction fee for EBT card transactions.
     * @return the transaction fee for EBT card transactions.
     */
     @JsonProperty("ebtTransactionFee")
     public PricePoint getEbtTransactionFee() {
          return this.ebtTransactionFee;
     }

    /**
     * Sets a flat fee charged per month.
     * @param value a flat fee charged per month.
     */
     public void setMonthlyFee(PricePoint value) {
          this.monthlyFee = value;
     }

    /**
     * Gets a flat fee charged per month.
     * @return a flat fee charged per month.
     */
     @JsonProperty("monthlyFee")
     public PricePoint getMonthlyFee() {
          return this.monthlyFee;
     }

    /**
     * Sets a flat fee charged per year.
     * @param value a flat fee charged per year.
     */
     public void setAnnualFee(PricePoint value) {
          this.annualFee = value;
     }

    /**
     * Gets a flat fee charged per year.
     * @return a flat fee charged per year.
     */
     @JsonProperty("annualFee")
     public PricePoint getAnnualFee() {
          return this.annualFee;
     }

    /**
     * Sets the fee per dispute or chargeback.
     * @param value the fee per dispute or chargeback.
     */
     public void setChargebackFee(PricePoint value) {
          this.chargebackFee = value;
     }

    /**
     * Gets the fee per dispute or chargeback.
     * @return the fee per dispute or chargeback.
     */
     @JsonProperty("chargebackFee")
     public PricePoint getChargebackFee() {
          return this.chargebackFee;
     }

    /**
     * Sets the fee per address verification operation.
     * @param value the fee per address verification operation.
     */
     public void setAvsFee(PricePoint value) {
          this.avsFee = value;
     }

    /**
     * Gets the fee per address verification operation.
     * @return the fee per address verification operation.
     */
     @JsonProperty("avsFee")
     public PricePoint getAvsFee() {
          return this.avsFee;
     }

    /**
     * Sets the fee per batch.
     * @param value the fee per batch.
     */
     public void setBatchFee(PricePoint value) {
          this.batchFee = value;
     }

    /**
     * Gets the fee per batch.
     * @return the fee per batch.
     */
     @JsonProperty("batchFee")
     public PricePoint getBatchFee() {
          return this.batchFee;
     }

    /**
     * Sets the voice authorization fee.
     * @param value the voice authorization fee.
     */
     public void setVoiceAuthFee(PricePoint value) {
          this.voiceAuthFee = value;
     }

    /**
     * Gets the voice authorization fee.
     * @return the voice authorization fee.
     */
     @JsonProperty("voiceAuthFee")
     public PricePoint getVoiceAuthFee() {
          return this.voiceAuthFee;
     }

    /**
     * Sets the one time account setup fee.
     * @param value the one time account setup fee.
     */
     public void setAccountSetupFee(PricePoint value) {
          this.accountSetupFee = value;
     }

    /**
     * Gets the one time account setup fee.
     * @return the one time account setup fee.
     */
     @JsonProperty("accountSetupFee")
     public PricePoint getAccountSetupFee() {
          return this.accountSetupFee;
     }

}
