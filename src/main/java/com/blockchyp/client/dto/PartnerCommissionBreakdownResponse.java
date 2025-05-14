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
 * Models detailed information about how partner commissions were calculated for a
 * statement.
 */
@SuppressWarnings({"rawtypes", "unchecked"})
public class PartnerCommissionBreakdownResponse implements IAbstractAcknowledgement {

     private boolean success;

     private String error;

     private String responseDescription;

     private String invoiceId;

     private String partnerName;

     private String partnerStatementId;

     private Date partnerStatementDate;

     private String merchantId;

     private String merchantCompanyName;

     private String merchantDbaName;

     private float grandTotal;

     private String grandTotalFormatted;

     private float totalFees;

     private String totalFeesFormatted;

     private float totalDue;

     private String totalDueFormatted;

     private float totalVolume;

     private String totalVolumeFormatted;

     private int totalTransactions;

     private float partnerResidual;

     private String partnerResidualFormatted;

     private float interchange;

     private String interchangeFormatted;

     private float assessments;

     private String assessmentsFormatted;

     private float totalPassthrough;

     private String totalPassthroughFormatted;

     private float totalNonPassthrough;

     private String totalNonPassthroughFormatted;

     private float totalCardBrandFees;

     private String totalCardBrandFeesFormatted;

     private float totalBuyRate;

     private String totalBuyRateFormatted;

     private float buyRateBeforePassthrough;

     private String buyRateBeforePassthroughFormatted;

     private float netMarkup;

     private String netMarkupFormatted;

     private float partnerNonPassthroughShare;

     private String partnerNonPassthroughShareFormatted;

     private float chargebackFees;

     private String chargebackFeesFormatted;

     private int chargebackCount;

     private float partnerPercentage;

     private String partnerPercentageFormatted;

     private Collection<BuyRateLineItem> buyRateLineItems;

     private Collection<AggregateBillingLineItem> revenueDetails;

     private Collection<AggregateBillingLineItem> cardBrandCostDetails;

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
     * Sets the invoice (statement id) for which the commissions were calculated.
     * @param value the invoice (statement id) for which the commissions were
     * calculated.
     */
     public void setInvoiceId(String value) {
          this.invoiceId = value;
     }

    /**
     * Gets the invoice (statement id) for which the commissions were calculated.
     * @return the invoice (statement id) for which the commissions were calculated.
     */
     @SerializedName("invoiceId")
     public String getInvoiceId() {
          return this.invoiceId;
     }

    /**
     * Sets the partner name.
     * @param value the partner name.
     */
     public void setPartnerName(String value) {
          this.partnerName = value;
     }

    /**
     * Gets the partner name.
     * @return the partner name.
     */
     @SerializedName("partnerName")
     public String getPartnerName() {
          return this.partnerName;
     }

    /**
     * Sets the partner statement id.
     * @param value the partner statement id.
     */
     public void setPartnerStatementId(String value) {
          this.partnerStatementId = value;
     }

    /**
     * Gets the partner statement id.
     * @return the partner statement id.
     */
     @SerializedName("partnerStatementId")
     public String getPartnerStatementId() {
          return this.partnerStatementId;
     }

    /**
     * Sets the partner statement date.
     * @param value the partner statement date.
     */
     public void setPartnerStatementDate(Date value) {
          this.partnerStatementDate = value;
     }

    /**
     * Gets the partner statement date.
     * @return the partner statement date.
     */
     @SerializedName("partnerStatementDate")
     public Date getPartnerStatementDate() {
          return this.partnerStatementDate;
     }

    /**
     * Sets the merchant id.
     * @param value the merchant id.
     */
     public void setMerchantId(String value) {
          this.merchantId = value;
     }

    /**
     * Gets the merchant id.
     * @return the merchant id.
     */
     @SerializedName("merchantId")
     public String getMerchantId() {
          return this.merchantId;
     }

    /**
     * Sets the merchant's corporate name.
     * @param value the merchant's corporate name.
     */
     public void setMerchantCompanyName(String value) {
          this.merchantCompanyName = value;
     }

    /**
     * Gets the merchant's corporate name.
     * @return the merchant's corporate name.
     */
     @SerializedName("merchantCompanyName")
     public String getMerchantCompanyName() {
          return this.merchantCompanyName;
     }

    /**
     * Sets the merchant's dba name.
     * @param value the merchant's dba name.
     */
     public void setMerchantDbaName(String value) {
          this.merchantDbaName = value;
     }

    /**
     * Gets the merchant's dba name.
     * @return the merchant's dba name.
     */
     @SerializedName("merchantDbaName")
     public String getMerchantDbaName() {
          return this.merchantDbaName;
     }

    /**
     * Sets the grand total.
     * @param value the grand total.
     */
     public void setGrandTotal(float value) {
          this.grandTotal = value;
     }

    /**
     * Gets the grand total.
     * @return the grand total.
     */
     @SerializedName("grandTotal")
     public float getGrandTotal() {
          return this.grandTotal;
     }

    /**
     * Sets the currency formatted grand total.
     * @param value the currency formatted grand total.
     */
     public void setGrandTotalFormatted(String value) {
          this.grandTotalFormatted = value;
     }

    /**
     * Gets the currency formatted grand total.
     * @return the currency formatted grand total.
     */
     @SerializedName("grandTotalFormatted")
     public String getGrandTotalFormatted() {
          return this.grandTotalFormatted;
     }

    /**
     * Sets the total fees.
     * @param value the total fees.
     */
     public void setTotalFees(float value) {
          this.totalFees = value;
     }

    /**
     * Gets the total fees.
     * @return the total fees.
     */
     @SerializedName("totalFees")
     public float getTotalFees() {
          return this.totalFees;
     }

    /**
     * Sets the currency formatted total fees.
     * @param value the currency formatted total fees.
     */
     public void setTotalFeesFormatted(String value) {
          this.totalFeesFormatted = value;
     }

    /**
     * Gets the currency formatted total fees.
     * @return the currency formatted total fees.
     */
     @SerializedName("totalFeesFormatted")
     public String getTotalFeesFormatted() {
          return this.totalFeesFormatted;
     }

    /**
     * Sets the total due the partner for this merchant statement.
     * @param value the total due the partner for this merchant statement.
     */
     public void setTotalDue(float value) {
          this.totalDue = value;
     }

    /**
     * Gets the total due the partner for this merchant statement.
     * @return the total due the partner for this merchant statement.
     */
     @SerializedName("totalDue")
     public float getTotalDue() {
          return this.totalDue;
     }

    /**
     * Sets the currency formatted total due the partner for this merchant statement.
     * @param value the currency formatted total due the partner for this merchant
     * statement.
     */
     public void setTotalDueFormatted(String value) {
          this.totalDueFormatted = value;
     }

    /**
     * Gets the currency formatted total due the partner for this merchant statement.
     * @return the currency formatted total due the partner for this merchant statement.
     */
     @SerializedName("totalDueFormatted")
     public String getTotalDueFormatted() {
          return this.totalDueFormatted;
     }

    /**
     * Sets the total volume during the statement period.
     * @param value the total volume during the statement period.
     */
     public void setTotalVolume(float value) {
          this.totalVolume = value;
     }

    /**
     * Gets the total volume during the statement period.
     * @return the total volume during the statement period.
     */
     @SerializedName("totalVolume")
     public float getTotalVolume() {
          return this.totalVolume;
     }

    /**
     * Sets the currency formatted total volume during the statement period.
     * @param value the currency formatted total volume during the statement period.
     */
     public void setTotalVolumeFormatted(String value) {
          this.totalVolumeFormatted = value;
     }

    /**
     * Gets the currency formatted total volume during the statement period.
     * @return the currency formatted total volume during the statement period.
     */
     @SerializedName("totalVolumeFormatted")
     public String getTotalVolumeFormatted() {
          return this.totalVolumeFormatted;
     }

    /**
     * Sets the total number of transactions processed during the statement period.
     * @param value the total number of transactions processed during the statement
     * period.
     */
     public void setTotalTransactions(int value) {
          this.totalTransactions = value;
     }

    /**
     * Gets the total number of transactions processed during the statement period.
     * @return the total number of transactions processed during the statement period.
     */
     @SerializedName("totalTransactions")
     public int getTotalTransactions() {
          return this.totalTransactions;
     }

    /**
     * Sets the residual earned by the partner.
     * @param value the residual earned by the partner.
     */
     public void setPartnerResidual(float value) {
          this.partnerResidual = value;
     }

    /**
     * Gets the residual earned by the partner.
     * @return the residual earned by the partner.
     */
     @SerializedName("partnerResidual")
     public float getPartnerResidual() {
          return this.partnerResidual;
     }

    /**
     * Sets the currency formatted residual earned by the partner.
     * @param value the currency formatted residual earned by the partner.
     */
     public void setPartnerResidualFormatted(String value) {
          this.partnerResidualFormatted = value;
     }

    /**
     * Gets the currency formatted residual earned by the partner.
     * @return the currency formatted residual earned by the partner.
     */
     @SerializedName("partnerResidualFormatted")
     public String getPartnerResidualFormatted() {
          return this.partnerResidualFormatted;
     }

    /**
     * Sets the total interchange charged during the statement period.
     * @param value the total interchange charged during the statement period.
     */
     public void setInterchange(float value) {
          this.interchange = value;
     }

    /**
     * Gets the total interchange charged during the statement period.
     * @return the total interchange charged during the statement period.
     */
     @SerializedName("interchange")
     public float getInterchange() {
          return this.interchange;
     }

    /**
     * Sets the currency formatted total interchange charged during the statement
     * period.
     * @param value the currency formatted total interchange charged during the
     * statement period.
     */
     public void setInterchangeFormatted(String value) {
          this.interchangeFormatted = value;
     }

    /**
     * Gets the currency formatted total interchange charged during the statement
     * period.
     * @return the currency formatted total interchange charged during the statement
     * period.
     */
     @SerializedName("interchangeFormatted")
     public String getInterchangeFormatted() {
          return this.interchangeFormatted;
     }

    /**
     * Sets the total assessments charged during the statement period.
     * @param value the total assessments charged during the statement period.
     */
     public void setAssessments(float value) {
          this.assessments = value;
     }

    /**
     * Gets the total assessments charged during the statement period.
     * @return the total assessments charged during the statement period.
     */
     @SerializedName("assessments")
     public float getAssessments() {
          return this.assessments;
     }

    /**
     * Sets the currency formatted assessments charged during the statement period.
     * @param value the currency formatted assessments charged during the statement
     * period.
     */
     public void setAssessmentsFormatted(String value) {
          this.assessmentsFormatted = value;
     }

    /**
     * Gets the currency formatted assessments charged during the statement period.
     * @return the currency formatted assessments charged during the statement period.
     */
     @SerializedName("assessmentsFormatted")
     public String getAssessmentsFormatted() {
          return this.assessmentsFormatted;
     }

    /**
     * Sets the total of passthrough costs.
     * @param value the total of passthrough costs.
     */
     public void setTotalPassthrough(float value) {
          this.totalPassthrough = value;
     }

    /**
     * Gets the total of passthrough costs.
     * @return the total of passthrough costs.
     */
     @SerializedName("totalPassthrough")
     public float getTotalPassthrough() {
          return this.totalPassthrough;
     }

    /**
     * Sets the currency formatted total of passthrough costs.
     * @param value the currency formatted total of passthrough costs.
     */
     public void setTotalPassthroughFormatted(String value) {
          this.totalPassthroughFormatted = value;
     }

    /**
     * Gets the currency formatted total of passthrough costs.
     * @return the currency formatted total of passthrough costs.
     */
     @SerializedName("totalPassthroughFormatted")
     public String getTotalPassthroughFormatted() {
          return this.totalPassthroughFormatted;
     }

    /**
     * Sets the total of non passthrough costs.
     * @param value the total of non passthrough costs.
     */
     public void setTotalNonPassthrough(float value) {
          this.totalNonPassthrough = value;
     }

    /**
     * Gets the total of non passthrough costs.
     * @return the total of non passthrough costs.
     */
     @SerializedName("totalNonPassthrough")
     public float getTotalNonPassthrough() {
          return this.totalNonPassthrough;
     }

    /**
     * Sets the currency formatted total of non passthrough costs.
     * @param value the currency formatted total of non passthrough costs.
     */
     public void setTotalNonPassthroughFormatted(String value) {
          this.totalNonPassthroughFormatted = value;
     }

    /**
     * Gets the currency formatted total of non passthrough costs.
     * @return the currency formatted total of non passthrough costs.
     */
     @SerializedName("totalNonPassthroughFormatted")
     public String getTotalNonPassthroughFormatted() {
          return this.totalNonPassthroughFormatted;
     }

    /**
     * Sets the total of all card brand fees.
     * @param value the total of all card brand fees.
     */
     public void setTotalCardBrandFees(float value) {
          this.totalCardBrandFees = value;
     }

    /**
     * Gets the total of all card brand fees.
     * @return the total of all card brand fees.
     */
     @SerializedName("totalCardBrandFees")
     public float getTotalCardBrandFees() {
          return this.totalCardBrandFees;
     }

    /**
     * Sets the currency formatted total of all card brand fees.
     * @param value the currency formatted total of all card brand fees.
     */
     public void setTotalCardBrandFeesFormatted(String value) {
          this.totalCardBrandFeesFormatted = value;
     }

    /**
     * Gets the currency formatted total of all card brand fees.
     * @return the currency formatted total of all card brand fees.
     */
     @SerializedName("totalCardBrandFeesFormatted")
     public String getTotalCardBrandFeesFormatted() {
          return this.totalCardBrandFeesFormatted;
     }

    /**
     * Sets the total buy rate.
     * @param value the total buy rate.
     */
     public void setTotalBuyRate(float value) {
          this.totalBuyRate = value;
     }

    /**
     * Gets the total buy rate.
     * @return the total buy rate.
     */
     @SerializedName("totalBuyRate")
     public float getTotalBuyRate() {
          return this.totalBuyRate;
     }

    /**
     * Sets the currency formatted total buy rate.
     * @param value the currency formatted total buy rate.
     */
     public void setTotalBuyRateFormatted(String value) {
          this.totalBuyRateFormatted = value;
     }

    /**
     * Gets the currency formatted total buy rate.
     * @return the currency formatted total buy rate.
     */
     @SerializedName("totalBuyRateFormatted")
     public String getTotalBuyRateFormatted() {
          return this.totalBuyRateFormatted;
     }

    /**
     * Sets the total buy rate before passthrough costs.
     * @param value the total buy rate before passthrough costs.
     */
     public void setBuyRateBeforePassthrough(float value) {
          this.buyRateBeforePassthrough = value;
     }

    /**
     * Gets the total buy rate before passthrough costs.
     * @return the total buy rate before passthrough costs.
     */
     @SerializedName("buyRateBeforePassthrough")
     public float getBuyRateBeforePassthrough() {
          return this.buyRateBeforePassthrough;
     }

    /**
     * Sets the currency formatted total buy rate before passthrough costs.
     * @param value the currency formatted total buy rate before passthrough costs.
     */
     public void setBuyRateBeforePassthroughFormatted(String value) {
          this.buyRateBeforePassthroughFormatted = value;
     }

    /**
     * Gets the currency formatted total buy rate before passthrough costs.
     * @return the currency formatted total buy rate before passthrough costs.
     */
     @SerializedName("buyRateBeforePassthroughFormatted")
     public String getBuyRateBeforePassthroughFormatted() {
          return this.buyRateBeforePassthroughFormatted;
     }

    /**
     * Sets the net markup split between BlockChyp and the partner.
     * @param value the net markup split between BlockChyp and the partner.
     */
     public void setNetMarkup(float value) {
          this.netMarkup = value;
     }

    /**
     * Gets the net markup split between BlockChyp and the partner.
     * @return the net markup split between BlockChyp and the partner.
     */
     @SerializedName("netMarkup")
     public float getNetMarkup() {
          return this.netMarkup;
     }

    /**
     * Sets the currency formatted net markup split between BlockChyp and the partner.
     * @param value the currency formatted net markup split between BlockChyp and the
     * partner.
     */
     public void setNetMarkupFormatted(String value) {
          this.netMarkupFormatted = value;
     }

    /**
     * Gets the currency formatted net markup split between BlockChyp and the partner.
     * @return the currency formatted net markup split between BlockChyp and the
     * partner.
     */
     @SerializedName("netMarkupFormatted")
     public String getNetMarkupFormatted() {
          return this.netMarkupFormatted;
     }

    /**
     * Sets the partner's total share of non passthrough hard costs.
     * @param value the partner's total share of non passthrough hard costs.
     */
     public void setPartnerNonPassthroughShare(float value) {
          this.partnerNonPassthroughShare = value;
     }

    /**
     * Gets the partner's total share of non passthrough hard costs.
     * @return the partner's total share of non passthrough hard costs.
     */
     @SerializedName("partnerNonPassthroughShare")
     public float getPartnerNonPassthroughShare() {
          return this.partnerNonPassthroughShare;
     }

    /**
     * Sets the currency formatted partner's total share of non passthrough hard costs.
     * @param value the currency formatted partner's total share of non passthrough hard
     * costs.
     */
     public void setPartnerNonPassthroughShareFormatted(String value) {
          this.partnerNonPassthroughShareFormatted = value;
     }

    /**
     * Gets the currency formatted partner's total share of non passthrough hard costs.
     * @return the currency formatted partner's total share of non passthrough hard
     * costs.
     */
     @SerializedName("partnerNonPassthroughShareFormatted")
     public String getPartnerNonPassthroughShareFormatted() {
          return this.partnerNonPassthroughShareFormatted;
     }

    /**
     * Sets the total of chargeback fees assessed during the statement period.
     * @param value the total of chargeback fees assessed during the statement period.
     */
     public void setChargebackFees(float value) {
          this.chargebackFees = value;
     }

    /**
     * Gets the total of chargeback fees assessed during the statement period.
     * @return the total of chargeback fees assessed during the statement period.
     */
     @SerializedName("chargebackFees")
     public float getChargebackFees() {
          return this.chargebackFees;
     }

    /**
     * Sets the currency formatted total of chargeback fees assessed during the
     * statement period.
     * @param value the currency formatted total of chargeback fees assessed during the
     * statement period.
     */
     public void setChargebackFeesFormatted(String value) {
          this.chargebackFeesFormatted = value;
     }

    /**
     * Gets the currency formatted total of chargeback fees assessed during the
     * statement period.
     * @return the currency formatted total of chargeback fees assessed during the
     * statement period.
     */
     @SerializedName("chargebackFeesFormatted")
     public String getChargebackFeesFormatted() {
          return this.chargebackFeesFormatted;
     }

    /**
     * Sets the total number of chargebacks during the period.
     * @param value the total number of chargebacks during the period.
     */
     public void setChargebackCount(int value) {
          this.chargebackCount = value;
     }

    /**
     * Gets the total number of chargebacks during the period.
     * @return the total number of chargebacks during the period.
     */
     @SerializedName("chargebackCount")
     public int getChargebackCount() {
          return this.chargebackCount;
     }

    /**
     * Sets the partner's share of markup.
     * @param value the partner's share of markup.
     */
     public void setPartnerPercentage(float value) {
          this.partnerPercentage = value;
     }

    /**
     * Gets the partner's share of markup.
     * @return the partner's share of markup.
     */
     @SerializedName("partnerPercentage")
     public float getPartnerPercentage() {
          return this.partnerPercentage;
     }

    /**
     * Sets the currency formatted partner's share of markup.
     * @param value the currency formatted partner's share of markup.
     */
     public void setPartnerPercentageFormatted(String value) {
          this.partnerPercentageFormatted = value;
     }

    /**
     * Gets the currency formatted partner's share of markup.
     * @return the currency formatted partner's share of markup.
     */
     @SerializedName("partnerPercentageFormatted")
     public String getPartnerPercentageFormatted() {
          return this.partnerPercentageFormatted;
     }

    /**
     * Sets the list of line items documenting how the total buy rate was calculated.
     * @param value the list of line items documenting how the total buy rate was
     * calculated.
     */
     public void setBuyRateLineItems(Collection<BuyRateLineItem> value) {
          this.buyRateLineItems = value;
     }

    /**
     * Gets the list of line items documenting how the total buy rate was calculated.
     * @return the list of line items documenting how the total buy rate was calculated.
     */
     @SerializedName("buyRateLineItems")
     public Collection<BuyRateLineItem> getBuyRateLineItems() {
          return this.buyRateLineItems;
     }

    /**
     * Sets the list of detail lines describing how revenue was calculated and collected
     * by the sponsor bank.
     * @param value the list of detail lines describing how revenue was calculated and
     * collected by the sponsor bank.
     */
     public void setRevenueDetails(Collection<AggregateBillingLineItem> value) {
          this.revenueDetails = value;
     }

    /**
     * Gets the list of detail lines describing how revenue was calculated and collected
     * by the sponsor bank.
     * @return the list of detail lines describing how revenue was calculated and
     * collected by the sponsor bank.
     */
     @SerializedName("revenueDetails")
     public Collection<AggregateBillingLineItem> getRevenueDetails() {
          return this.revenueDetails;
     }

    /**
     * Sets the nested list of costs levied by the card brands, grouped by card brand and
     * type.
     * @param value the nested list of costs levied by the card brands, grouped by card
     * brand and type.
     */
     public void setCardBrandCostDetails(Collection<AggregateBillingLineItem> value) {
          this.cardBrandCostDetails = value;
     }

    /**
     * Gets the nested list of costs levied by the card brands, grouped by card brand and
     * type.
     * @return the nested list of costs levied by the card brands, grouped by card brand and
     * type.
     */
     @SerializedName("cardBrandCostDetails")
     public Collection<AggregateBillingLineItem> getCardBrandCostDetails() {
          return this.cardBrandCostDetails;
     }

    /**
     * Adds a the list of line items documenting how the total buy rate was calculated.
     * @param value the list of line items documenting how the total buy rate was
     * calculated.
     */
     public void addBuyRateLineItem(BuyRateLineItem value) {
          if (this.buyRateLineItems == null) {
               this.buyRateLineItems = new ArrayList();
          }
          this.buyRateLineItems.add(value);
     }

    /**
     * Adds a the list of detail lines describing how revenue was calculated and collected
     * by the sponsor bank.
     * @param value the list of detail lines describing how revenue was calculated and
     * collected by the sponsor bank.
     */
     public void addRevenueDetail(AggregateBillingLineItem value) {
          if (this.revenueDetails == null) {
               this.revenueDetails = new ArrayList();
          }
          this.revenueDetails.add(value);
     }

    /**
     * Adds a the nested list of costs levied by the card brands, grouped by card brand and
     * type.
     * @param value the nested list of costs levied by the card brands, grouped by card
     * brand and type.
     */
     public void addCardBrandCostDetail(AggregateBillingLineItem value) {
          if (this.cardBrandCostDetails == null) {
               this.cardBrandCostDetails = new ArrayList();
          }
          this.cardBrandCostDetails.add(value);
     }

}
