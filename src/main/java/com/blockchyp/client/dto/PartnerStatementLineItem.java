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
 * Models line item level data for a partner statement.
 */
public class PartnerStatementLineItem {

     private String id;

     private String invoiceId;

     private float totalFees;

     private String totalFeesFormatted;

     private float totalFeesOnVolume;

     private String totalFeesOnVolumeFormatted;

     private String merchantId;

     private String merchantName;

     private String dbaName;

     private Date statementDate;

     private float volume;

     private String volumeFormatted;

     private int transactionCount;

     private float interchange;

     private String interchangeFormatted;

     private float interchangeOnVolume;

     private String interchangeOnVolumeFormatted;

     private float assessments;

     private String assessmentsFormatted;

     private float assessmentsOnVolume;

     private String assessmentsOnVolumeFormatted;

     private float partnerCommission;

     private String partnerCommissionFormatted;

     private float buyRate;

     private String buyRateFormatted;

     private float hardCosts;

     private String hardCostsFormatted;

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
     * Sets the invoice id for the underlying merchant statement.
     * @param value the invoice id for the underlying merchant statement.
     */
     public void setInvoiceId(String value) {
          this.invoiceId = value;
     }

    /**
     * Gets the invoice id for the underlying merchant statement.
     * @return the invoice id for the underlying merchant statement.
     */
     @JsonProperty("invoiceId")
     public String getInvoiceId() {
          return this.invoiceId;
     }

    /**
     * Sets the total fees charged to the merchant.
     * @param value the total fees charged to the merchant.
     */
     public void setTotalFees(float value) {
          this.totalFees = value;
     }

    /**
     * Gets the total fees charged to the merchant.
     * @return the total fees charged to the merchant.
     */
     @JsonProperty("totalFees")
     public float getTotalFees() {
          return this.totalFees;
     }

    /**
     * Sets the total fees charge formatted as a currency string.
     * @param value the total fees charge formatted as a currency string.
     */
     public void setTotalFeesFormatted(String value) {
          this.totalFeesFormatted = value;
     }

    /**
     * Gets the total fees charge formatted as a currency string.
     * @return the total fees charge formatted as a currency string.
     */
     @JsonProperty("totalFeesFormatted")
     public String getTotalFeesFormatted() {
          return this.totalFeesFormatted;
     }

    /**
     * Sets the total fees charged to the merchant as ratio of volume.
     * @param value the total fees charged to the merchant as ratio of volume.
     */
     public void setTotalFeesOnVolume(float value) {
          this.totalFeesOnVolume = value;
     }

    /**
     * Gets the total fees charged to the merchant as ratio of volume.
     * @return the total fees charged to the merchant as ratio of volume.
     */
     @JsonProperty("totalFeesOnVolume")
     public float getTotalFeesOnVolume() {
          return this.totalFeesOnVolume;
     }

    /**
     * Sets the total fees charged to the merchant as percentage of volume.
     * @param value the total fees charged to the merchant as percentage of volume.
     */
     public void setTotalFeesOnVolumeFormatted(String value) {
          this.totalFeesOnVolumeFormatted = value;
     }

    /**
     * Gets the total fees charged to the merchant as percentage of volume.
     * @return the total fees charged to the merchant as percentage of volume.
     */
     @JsonProperty("totalFeesOnVolumeFormatted")
     public String getTotalFeesOnVolumeFormatted() {
          return this.totalFeesOnVolumeFormatted;
     }

    /**
     * Sets the id of the merchant.
     * @param value the id of the merchant.
     */
     public void setMerchantId(String value) {
          this.merchantId = value;
     }

    /**
     * Gets the id of the merchant.
     * @return the id of the merchant.
     */
     @JsonProperty("merchantId")
     public String getMerchantId() {
          return this.merchantId;
     }

    /**
     * Sets the corporate name of the merchant.
     * @param value the corporate name of the merchant.
     */
     public void setMerchantName(String value) {
          this.merchantName = value;
     }

    /**
     * Gets the corporate name of the merchant.
     * @return the corporate name of the merchant.
     */
     @JsonProperty("merchantName")
     public String getMerchantName() {
          return this.merchantName;
     }

    /**
     * Sets the dba name of the merchant.
     * @param value the dba name of the merchant.
     */
     public void setDbaName(String value) {
          this.dbaName = value;
     }

    /**
     * Gets the dba name of the merchant.
     * @return the dba name of the merchant.
     */
     @JsonProperty("dbaName")
     public String getDbaName() {
          return this.dbaName;
     }

    /**
     * Sets the date the statement was generated.
     * @param value the date the statement was generated.
     */
     public void setStatementDate(Date value) {
          this.statementDate = value;
     }

    /**
     * Gets the date the statement was generated.
     * @return the date the statement was generated.
     */
     @JsonProperty("statementDate")
     public Date getStatementDate() {
          return this.statementDate;
     }

    /**
     * Sets volume in numeric format.
     * @param value volume in numeric format.
     */
     public void setVolume(float value) {
          this.volume = value;
     }

    /**
     * Gets volume in numeric format.
     * @return volume in numeric format.
     */
     @JsonProperty("volume")
     public float getVolume() {
          return this.volume;
     }

    /**
     * Sets the string formatted total volume on the statement.
     * @param value the string formatted total volume on the statement.
     */
     public void setVolumeFormatted(String value) {
          this.volumeFormatted = value;
     }

    /**
     * Gets the string formatted total volume on the statement.
     * @return the string formatted total volume on the statement.
     */
     @JsonProperty("volumeFormatted")
     public String getVolumeFormatted() {
          return this.volumeFormatted;
     }

    /**
     * Sets the total volume on the statement.
     * @param value the total volume on the statement.
     */
     public void setTransactionCount(int value) {
          this.transactionCount = value;
     }

    /**
     * Gets the total volume on the statement.
     * @return the total volume on the statement.
     */
     @JsonProperty("transactionCount")
     public int getTransactionCount() {
          return this.transactionCount;
     }

    /**
     * Sets the total interchange fees incurred this period.
     * @param value the total interchange fees incurred this period.
     */
     public void setInterchange(float value) {
          this.interchange = value;
     }

    /**
     * Gets the total interchange fees incurred this period.
     * @return the total interchange fees incurred this period.
     */
     @JsonProperty("interchange")
     public float getInterchange() {
          return this.interchange;
     }

    /**
     * Sets the currency formatted form of interchange.
     * @param value the currency formatted form of interchange.
     */
     public void setInterchangeFormatted(String value) {
          this.interchangeFormatted = value;
     }

    /**
     * Gets the currency formatted form of interchange.
     * @return the currency formatted form of interchange.
     */
     @JsonProperty("interchangeFormatted")
     public String getInterchangeFormatted() {
          return this.interchangeFormatted;
     }

    /**
     * Sets the total interchange as a ratio on volume incurred this period.
     * @param value the total interchange as a ratio on volume incurred this period.
     */
     public void setInterchangeOnVolume(float value) {
          this.interchangeOnVolume = value;
     }

    /**
     * Gets the total interchange as a ratio on volume incurred this period.
     * @return the total interchange as a ratio on volume incurred this period.
     */
     @JsonProperty("interchangeOnVolume")
     public float getInterchangeOnVolume() {
          return this.interchangeOnVolume;
     }

    /**
     * Sets the total interchange as a percentage of volume.
     * @param value the total interchange as a percentage of volume.
     */
     public void setInterchangeOnVolumeFormatted(String value) {
          this.interchangeOnVolumeFormatted = value;
     }

    /**
     * Gets the total interchange as a percentage of volume.
     * @return the total interchange as a percentage of volume.
     */
     @JsonProperty("interchangeOnVolumeFormatted")
     public String getInterchangeOnVolumeFormatted() {
          return this.interchangeOnVolumeFormatted;
     }

    /**
     * Sets the total card brand assessments fees incurred this period.
     * @param value the total card brand assessments fees incurred this period.
     */
     public void setAssessments(float value) {
          this.assessments = value;
     }

    /**
     * Gets the total card brand assessments fees incurred this period.
     * @return the total card brand assessments fees incurred this period.
     */
     @JsonProperty("assessments")
     public float getAssessments() {
          return this.assessments;
     }

    /**
     * Sets the currency formatted form of card brand assessments.
     * @param value the currency formatted form of card brand assessments.
     */
     public void setAssessmentsFormatted(String value) {
          this.assessmentsFormatted = value;
     }

    /**
     * Gets the currency formatted form of card brand assessments.
     * @return the currency formatted form of card brand assessments.
     */
     @JsonProperty("assessmentsFormatted")
     public String getAssessmentsFormatted() {
          return this.assessmentsFormatted;
     }

    /**
     * Sets the total card brand assessments as a ratio on volume incurred this period.
     * @param value the total card brand assessments as a ratio on volume incurred this
     * period.
     */
     public void setAssessmentsOnVolume(float value) {
          this.assessmentsOnVolume = value;
     }

    /**
     * Gets the total card brand assessments as a ratio on volume incurred this period.
     * @return the total card brand assessments as a ratio on volume incurred this period.
     */
     @JsonProperty("assessmentsOnVolume")
     public float getAssessmentsOnVolume() {
          return this.assessmentsOnVolume;
     }

    /**
     * Sets the total card brand assessments as a percentage of volume.
     * @param value the total card brand assessments as a percentage of volume.
     */
     public void setAssessmentsOnVolumeFormatted(String value) {
          this.assessmentsOnVolumeFormatted = value;
     }

    /**
     * Gets the total card brand assessments as a percentage of volume.
     * @return the total card brand assessments as a percentage of volume.
     */
     @JsonProperty("assessmentsOnVolumeFormatted")
     public String getAssessmentsOnVolumeFormatted() {
          return this.assessmentsOnVolumeFormatted;
     }

    /**
     * Sets the commission earned on the portfolio during the statement period.
     * @param value the commission earned on the portfolio during the statement period.
     */
     public void setPartnerCommission(float value) {
          this.partnerCommission = value;
     }

    /**
     * Gets the commission earned on the portfolio during the statement period.
     * @return the commission earned on the portfolio during the statement period.
     */
     @JsonProperty("partnerCommission")
     public float getPartnerCommission() {
          return this.partnerCommission;
     }

    /**
     * Sets the string formatted total volume on the statement.
     * @param value the string formatted total volume on the statement.
     */
     public void setPartnerCommissionFormatted(String value) {
          this.partnerCommissionFormatted = value;
     }

    /**
     * Gets the string formatted total volume on the statement.
     * @return the string formatted total volume on the statement.
     */
     @JsonProperty("partnerCommissionFormatted")
     public String getPartnerCommissionFormatted() {
          return this.partnerCommissionFormatted;
     }

    /**
     * Sets the total fees charge to the partner due to buy rates.
     * @param value the total fees charge to the partner due to buy rates.
     */
     public void setBuyRate(float value) {
          this.buyRate = value;
     }

    /**
     * Gets the total fees charge to the partner due to buy rates.
     * @return the total fees charge to the partner due to buy rates.
     */
     @JsonProperty("buyRate")
     public float getBuyRate() {
          return this.buyRate;
     }

    /**
     * Sets the currency formatted form of partner buy rate.
     * @param value the currency formatted form of partner buy rate.
     */
     public void setBuyRateFormatted(String value) {
          this.buyRateFormatted = value;
     }

    /**
     * Gets the currency formatted form of partner buy rate.
     * @return the currency formatted form of partner buy rate.
     */
     @JsonProperty("buyRateFormatted")
     public String getBuyRateFormatted() {
          return this.buyRateFormatted;
     }

    /**
     * Sets refers to card brand fees shared between BlockChyp and the partner.
     * @param value refers to card brand fees shared between BlockChyp and the partner.
     */
     public void setHardCosts(float value) {
          this.hardCosts = value;
     }

    /**
     * Gets refers to card brand fees shared between BlockChyp and the partner.
     * @return refers to card brand fees shared between BlockChyp and the partner.
     */
     @JsonProperty("hardCosts")
     public float getHardCosts() {
          return this.hardCosts;
     }

    /**
     * Sets the currency formatted form of hard costs.
     * @param value the currency formatted form of hard costs.
     */
     public void setHardCostsFormatted(String value) {
          this.hardCostsFormatted = value;
     }

    /**
     * Gets the currency formatted form of hard costs.
     * @return the currency formatted form of hard costs.
     */
     @JsonProperty("hardCostsFormatted")
     public String getHardCostsFormatted() {
          return this.hardCostsFormatted;
     }

}
