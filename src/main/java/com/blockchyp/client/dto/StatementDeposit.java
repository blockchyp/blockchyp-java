/**
 * Copyright 2019-2025 BlockChyp, Inc. All rights reserved. Use of this code is governed
 * by a license that can be found in the LICENSE file.
 *
 * This file was generated automatically by the BlockChyp SDK Generator. Changes to this
 * file will be lost every time the code is regenerated.
 */

package com.blockchyp.client.dto;

import com.google.gson.annotations.SerializedName;


/**
 * Models information about merchant deposits during a statement period.
 */
public class StatementDeposit {

     private String id;

     private int transactionCount;

     private String batchId;

     private float feesPaid;

     private String feesPaidFormatted;

     private float netDeposit;

     private String netDepositFormatted;

     private float totalSales;

     private String totalSalesFormatted;

     private float totalRefunds;

     private String totalRefundsFormatted;

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
     @SerializedName("id")
     public String getId() {
          return this.id;
     }

    /**
     * Sets the number of transactions in the batch for which funds were deposited.
     * @param value the number of transactions in the batch for which funds were
     * deposited.
     */
     public void setTransactionCount(int value) {
          this.transactionCount = value;
     }

    /**
     * Gets the number of transactions in the batch for which funds were deposited.
     * @return the number of transactions in the batch for which funds were deposited.
     */
     @SerializedName("transactionCount")
     public int getTransactionCount() {
          return this.transactionCount;
     }

    /**
     * Sets the batch id associated with the deposit.
     * @param value the batch id associated with the deposit.
     */
     public void setBatchId(String value) {
          this.batchId = value;
     }

    /**
     * Gets the batch id associated with the deposit.
     * @return the batch id associated with the deposit.
     */
     @SerializedName("batchId")
     public String getBatchId() {
          return this.batchId;
     }

    /**
     * Sets the prepaid fees associated with the batch.
     * @param value the prepaid fees associated with the batch.
     */
     public void setFeesPaid(float value) {
          this.feesPaid = value;
     }

    /**
     * Gets the prepaid fees associated with the batch.
     * @return the prepaid fees associated with the batch.
     */
     @SerializedName("feesPaid")
     public float getFeesPaid() {
          return this.feesPaid;
     }

    /**
     * Sets the currency formatted form of prepaid fees.
     * @param value the currency formatted form of prepaid fees.
     */
     public void setFeesPaidFormatted(String value) {
          this.feesPaidFormatted = value;
     }

    /**
     * Gets the currency formatted form of prepaid fees.
     * @return the currency formatted form of prepaid fees.
     */
     @SerializedName("feesPaidFormatted")
     public String getFeesPaidFormatted() {
          return this.feesPaidFormatted;
     }

    /**
     * Sets the net deposit released to the merchant.
     * @param value the net deposit released to the merchant.
     */
     public void setNetDeposit(float value) {
          this.netDeposit = value;
     }

    /**
     * Gets the net deposit released to the merchant.
     * @return the net deposit released to the merchant.
     */
     @SerializedName("netDeposit")
     public float getNetDeposit() {
          return this.netDeposit;
     }

    /**
     * Sets the currency formatted net deposit released to the merchant.
     * @param value the currency formatted net deposit released to the merchant.
     */
     public void setNetDepositFormatted(String value) {
          this.netDepositFormatted = value;
     }

    /**
     * Gets the currency formatted net deposit released to the merchant.
     * @return the currency formatted net deposit released to the merchant.
     */
     @SerializedName("netDepositFormatted")
     public String getNetDepositFormatted() {
          return this.netDepositFormatted;
     }

    /**
     * Sets the total sales in the batch.
     * @param value the total sales in the batch.
     */
     public void setTotalSales(float value) {
          this.totalSales = value;
     }

    /**
     * Gets the total sales in the batch.
     * @return the total sales in the batch.
     */
     @SerializedName("totalSales")
     public float getTotalSales() {
          return this.totalSales;
     }

    /**
     * Sets the currency formatted total sales in the batch.
     * @param value the currency formatted total sales in the batch.
     */
     public void setTotalSalesFormatted(String value) {
          this.totalSalesFormatted = value;
     }

    /**
     * Gets the currency formatted total sales in the batch.
     * @return the currency formatted total sales in the batch.
     */
     @SerializedName("totalSalesFormatted")
     public String getTotalSalesFormatted() {
          return this.totalSalesFormatted;
     }

    /**
     * Sets the total refunds in the batch.
     * @param value the total refunds in the batch.
     */
     public void setTotalRefunds(float value) {
          this.totalRefunds = value;
     }

    /**
     * Gets the total refunds in the batch.
     * @return the total refunds in the batch.
     */
     @SerializedName("totalRefunds")
     public float getTotalRefunds() {
          return this.totalRefunds;
     }

    /**
     * Sets the currency formatted total refunds in the batch.
     * @param value the currency formatted total refunds in the batch.
     */
     public void setTotalRefundsFormatted(String value) {
          this.totalRefundsFormatted = value;
     }

    /**
     * Gets the currency formatted total refunds in the batch.
     * @return the currency formatted total refunds in the batch.
     */
     @SerializedName("totalRefundsFormatted")
     public String getTotalRefundsFormatted() {
          return this.totalRefundsFormatted;
     }

}
