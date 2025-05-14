/**
 * Copyright 2019-2025 BlockChyp, Inc. All rights reserved. Use of this code is governed
 * by a license that can be found in the LICENSE file.
 *
 * This file was generated automatically by the BlockChyp SDK Generator. Changes to this
 * file will be lost every time the code is regenerated.
 */

package com.blockchyp.client.dto;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

/**
 * Models a request to retrieve a list of partner statements.
 */
public class MerchantInvoiceListRequest implements ITimeoutRequest {

     private int timeout;

     private boolean test;

     private String merchantId;

     private String invoiceType;

     private Date startDate;

     private Date endDate;

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
     @SerializedName("timeout")
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
     @SerializedName("test")
     public boolean isTest() {
          return this.test;
     }

    /**
     * Sets optional merchant id for partner scoped requests.
     * @param value optional merchant id for partner scoped requests.
     */
     public void setMerchantId(String value) {
          this.merchantId = value;
     }

    /**
     * Gets optional merchant id for partner scoped requests.
     * @return optional merchant id for partner scoped requests.
     */
     @SerializedName("merchantId")
     public String getMerchantId() {
          return this.merchantId;
     }

    /**
     * Sets optional type to filter normal invoices vs statements.
     * @param value optional type to filter normal invoices vs statements.
     */
     public void setInvoiceType(String value) {
          this.invoiceType = value;
     }

    /**
     * Gets optional type to filter normal invoices vs statements.
     * @return optional type to filter normal invoices vs statements.
     */
     @SerializedName("invoiceType")
     public String getInvoiceType() {
          return this.invoiceType;
     }

    /**
     * Sets optional start date filter for batch history.
     * @param value optional start date filter for batch history.
     */
     public void setStartDate(Date value) {
          this.startDate = value;
     }

    /**
     * Gets optional start date filter for batch history.
     * @return optional start date filter for batch history.
     */
     @SerializedName("startDate")
     public Date getStartDate() {
          return this.startDate;
     }

    /**
     * Sets optional end date filter for batch history.
     * @param value optional end date filter for batch history.
     */
     public void setEndDate(Date value) {
          this.endDate = value;
     }

    /**
     * Gets optional end date filter for batch history.
     * @return optional end date filter for batch history.
     */
     @SerializedName("endDate")
     public Date getEndDate() {
          return this.endDate;
     }

}
