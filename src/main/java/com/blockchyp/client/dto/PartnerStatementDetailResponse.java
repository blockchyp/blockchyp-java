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
 * Models a response to retrieve detailed partner statement information.
 */
@SuppressWarnings({"rawtypes", "unchecked"})
public class PartnerStatementDetailResponse implements IAbstractAcknowledgement {

     private boolean success;

     private String error;

     private String responseDescription;

     private String id;

     private String partnerId;

     private String partnerName;

     private Date statementDate;

     private float totalVolume;

     private String totalVolumeFormatted;

     private int transactionCount;

     private float partnerCommission;

     private String partnerCommissionFormatted;

     private float partnerCommissionsOnVolume;

     private String partnerCommissionsOnVolumeFormatted;

     private String status;

     private Collection<PartnerStatementLineItem> lineItems;

     private Collection<PartnerStatementAdjustment> adjustments;

     private Collection<PartnerStatementDisbursement> disbursements;

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
     * Sets optional start date filter for batch history.
     * @param value optional start date filter for batch history.
     */
     public void setId(String value) {
          this.id = value;
     }

    /**
     * Gets optional start date filter for batch history.
     * @return optional start date filter for batch history.
     */
     @SerializedName("id")
     public String getId() {
          return this.id;
     }

    /**
     * Sets the id of the partner associated with the statement.
     * @param value the id of the partner associated with the statement.
     */
     public void setPartnerId(String value) {
          this.partnerId = value;
     }

    /**
     * Gets the id of the partner associated with the statement.
     * @return the id of the partner associated with the statement.
     */
     @SerializedName("partnerId")
     public String getPartnerId() {
          return this.partnerId;
     }

    /**
     * Sets the name of the partner associated with the statement.
     * @param value the name of the partner associated with the statement.
     */
     public void setPartnerName(String value) {
          this.partnerName = value;
     }

    /**
     * Gets the name of the partner associated with the statement.
     * @return the name of the partner associated with the statement.
     */
     @SerializedName("partnerName")
     public String getPartnerName() {
          return this.partnerName;
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
     @SerializedName("statementDate")
     public Date getStatementDate() {
          return this.statementDate;
     }

    /**
     * Sets total volume in numeric format.
     * @param value total volume in numeric format.
     */
     public void setTotalVolume(float value) {
          this.totalVolume = value;
     }

    /**
     * Gets total volume in numeric format.
     * @return total volume in numeric format.
     */
     @SerializedName("totalVolume")
     public float getTotalVolume() {
          return this.totalVolume;
     }

    /**
     * Sets the string formatted total volume on the statement.
     * @param value the string formatted total volume on the statement.
     */
     public void setTotalVolumeFormatted(String value) {
          this.totalVolumeFormatted = value;
     }

    /**
     * Gets the string formatted total volume on the statement.
     * @return the string formatted total volume on the statement.
     */
     @SerializedName("totalVolumeFormatted")
     public String getTotalVolumeFormatted() {
          return this.totalVolumeFormatted;
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
     @SerializedName("transactionCount")
     public int getTransactionCount() {
          return this.transactionCount;
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
     @SerializedName("partnerCommission")
     public float getPartnerCommission() {
          return this.partnerCommission;
     }

    /**
     * Sets the string formatted partner commission on the statement.
     * @param value the string formatted partner commission on the statement.
     */
     public void setPartnerCommissionFormatted(String value) {
          this.partnerCommissionFormatted = value;
     }

    /**
     * Gets the string formatted partner commission on the statement.
     * @return the string formatted partner commission on the statement.
     */
     @SerializedName("partnerCommissionFormatted")
     public String getPartnerCommissionFormatted() {
          return this.partnerCommissionFormatted;
     }

    /**
     * Sets the partner commission earned on the portfolio during the statement period as
     * a ratio against volume.
     * @param value the partner commission earned on the portfolio during the statement
     * period as a ratio against volume.
     */
     public void setPartnerCommissionsOnVolume(float value) {
          this.partnerCommissionsOnVolume = value;
     }

    /**
     * Gets the partner commission earned on the portfolio during the statement period as
     * a ratio against volume.
     * @return the partner commission earned on the portfolio during the statement
     * period as a ratio against volume.
     */
     @SerializedName("partnerCommissionsOnVolume")
     public float getPartnerCommissionsOnVolume() {
          return this.partnerCommissionsOnVolume;
     }

    /**
     * Sets the string formatted version of partner commissions as a percentage of
     * volume.
     * @param value the string formatted version of partner commissions as a percentage
     * of volume.
     */
     public void setPartnerCommissionsOnVolumeFormatted(String value) {
          this.partnerCommissionsOnVolumeFormatted = value;
     }

    /**
     * Gets the string formatted version of partner commissions as a percentage of
     * volume.
     * @return the string formatted version of partner commissions as a percentage of
     * volume.
     */
     @SerializedName("partnerCommissionsOnVolumeFormatted")
     public String getPartnerCommissionsOnVolumeFormatted() {
          return this.partnerCommissionsOnVolumeFormatted;
     }

    /**
     * Sets the status of the statement.
     * @param value the status of the statement.
     */
     public void setStatus(String value) {
          this.status = value;
     }

    /**
     * Gets the status of the statement.
     * @return the status of the statement.
     */
     @SerializedName("status")
     public String getStatus() {
          return this.status;
     }

    /**
     * Sets the line item detail associated with the statement.
     * @param value the line item detail associated with the statement.
     */
     public void setLineItems(Collection<PartnerStatementLineItem> value) {
          this.lineItems = value;
     }

    /**
     * Gets the line item detail associated with the statement.
     * @return the line item detail associated with the statement.
     */
     @SerializedName("lineItems")
     public Collection<PartnerStatementLineItem> getLineItems() {
          return this.lineItems;
     }

    /**
     * Sets the list of adjustments made against the statement, if any.
     * @param value the list of adjustments made against the statement, if any.
     */
     public void setAdjustments(Collection<PartnerStatementAdjustment> value) {
          this.adjustments = value;
     }

    /**
     * Gets the list of adjustments made against the statement, if any.
     * @return the list of adjustments made against the statement, if any.
     */
     @SerializedName("adjustments")
     public Collection<PartnerStatementAdjustment> getAdjustments() {
          return this.adjustments;
     }

    /**
     * Sets the list of partner disbursements made against the partner statement.
     * @param value the list of partner disbursements made against the partner
     * statement.
     */
     public void setDisbursements(Collection<PartnerStatementDisbursement> value) {
          this.disbursements = value;
     }

    /**
     * Gets the list of partner disbursements made against the partner statement.
     * @return the list of partner disbursements made against the partner statement.
     */
     @SerializedName("disbursements")
     public Collection<PartnerStatementDisbursement> getDisbursements() {
          return this.disbursements;
     }

    /**
     * Adds a the line item detail associated with the statement.
     * @param value the line item detail associated with the statement.
     */
     public void addLineItem(PartnerStatementLineItem value) {
          if (this.lineItems == null) {
               this.lineItems = new ArrayList();
          }
          this.lineItems.add(value);
     }

    /**
     * Adds a the list of adjustments made against the statement, if any.
     * @param value the list of adjustments made against the statement, if any.
     */
     public void addAdjustment(PartnerStatementAdjustment value) {
          if (this.adjustments == null) {
               this.adjustments = new ArrayList();
          }
          this.adjustments.add(value);
     }

    /**
     * Adds a the list of partner disbursements made against the partner statement.
     * @param value the list of partner disbursements made against the partner
     * statement.
     */
     public void addDisbursement(PartnerStatementDisbursement value) {
          if (this.disbursements == null) {
               this.disbursements = new ArrayList();
          }
          this.disbursements.add(value);
     }

}
