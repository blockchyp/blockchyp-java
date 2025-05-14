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
 * Models basic information about a merchant invoice for use in list or search results.
 */
public class MerchantInvoiceSummary {

     private String id;

     private Date dateCreated;

     private float grandTotal;

     private String grandTotalFormatted;

     private String status;

     private String invoiceType;

     private boolean paid;

    /**
     * Sets the id owner of the invoice.
     * @param value the id owner of the invoice.
     */
     public void setId(String value) {
          this.id = value;
     }

    /**
     * Gets the id owner of the invoice.
     * @return the id owner of the invoice.
     */
     @SerializedName("id")
     public String getId() {
          return this.id;
     }

    /**
     * Sets the date the statement was generated.
     * @param value the date the statement was generated.
     */
     public void setDateCreated(Date value) {
          this.dateCreated = value;
     }

    /**
     * Gets the date the statement was generated.
     * @return the date the statement was generated.
     */
     @SerializedName("dateCreated")
     public Date getDateCreated() {
          return this.dateCreated;
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
     * Sets the string formatted grand total.
     * @param value the string formatted grand total.
     */
     public void setGrandTotalFormatted(String value) {
          this.grandTotalFormatted = value;
     }

    /**
     * Gets the string formatted grand total.
     * @return the string formatted grand total.
     */
     @SerializedName("grandTotalFormatted")
     public String getGrandTotalFormatted() {
          return this.grandTotalFormatted;
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
     * Sets identifies the invoice type.
     * @param value identifies the invoice type.
     */
     public void setInvoiceType(String value) {
          this.invoiceType = value;
     }

    /**
     * Gets identifies the invoice type.
     * @return identifies the invoice type.
     */
     @SerializedName("invoiceType")
     public String getInvoiceType() {
          return this.invoiceType;
     }

    /**
     * Sets whether or not the invoice had been paid.
     * @param value whether or not the invoice had been paid.
     */
     public void setPaid(boolean value) {
          this.paid = value;
     }

    /**
     * Gets whether or not the invoice had been paid.
     * @return whether or not the invoice had been paid.
     */
     @SerializedName("paid")
     public boolean isPaid() {
          return this.paid;
     }

}
