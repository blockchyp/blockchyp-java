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

/**
 * Models a response to an invoice list request.
 */
@SuppressWarnings({"rawtypes", "unchecked"})
public class MerchantInvoiceListResponse implements IAbstractAcknowledgement {

     private boolean success;

     private String error;

     private String responseDescription;

     private Collection<MerchantInvoiceSummary> invoices;

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
     * Sets the list of invoices returned by the request.
     * @param value the list of invoices returned by the request.
     */
     public void setInvoices(Collection<MerchantInvoiceSummary> value) {
          this.invoices = value;
     }

    /**
     * Gets the list of invoices returned by the request.
     * @return the list of invoices returned by the request.
     */
     @SerializedName("invoices")
     public Collection<MerchantInvoiceSummary> getInvoices() {
          return this.invoices;
     }

    /**
     * Adds a the list of invoices returned by the request.
     * @param value the list of invoices returned by the request.
     */
     public void addInvoice(MerchantInvoiceSummary value) {
          if (this.invoices == null) {
               this.invoices = new ArrayList();
          }
          this.invoices.add(value);
     }

}
