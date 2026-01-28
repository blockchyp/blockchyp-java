/**
 * Copyright 2019-2026 BlockChyp, Inc. All rights reserved. Use of this code is governed
 * by a license that can be found in the LICENSE file.
 *
 * This file was generated automatically by the BlockChyp SDK Generator. Changes to this
 * file will be lost every time the code is regenerated.
 */

package com.blockchyp.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

/**
 * Models a basic information about partner statements for use in list or search results.
 */
public class PartnerStatementSummary {

     private String id;

     private Date statementDate;

     private float totalVolume;

     private String totalVolumeFormatted;

     private int transactionCount;

     private float partnerCommission;

     private String partnerCommissionFormatted;

     private String status;

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
     @JsonProperty("totalVolume")
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
     @JsonProperty("totalVolumeFormatted")
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
     @JsonProperty("transactionCount")
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
     @JsonProperty("status")
     public String getStatus() {
          return this.status;
     }

}
