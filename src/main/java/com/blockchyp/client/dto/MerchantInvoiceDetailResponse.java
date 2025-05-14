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
 * Models detailed merchant invoice or statement information.
 */
@SuppressWarnings({"rawtypes", "unchecked"})
public class MerchantInvoiceDetailResponse implements IAbstractAcknowledgement {

     private boolean success;

     private String error;

     private String responseDescription;

     private String id;

     private String merchantId;

     private String corporateName;

     private String dbaName;

     private Date dateCreated;

     private String status;

     private String invoiceType;

     private String pricingType;

     private boolean paid;

     private float grandTotal;

     private String grandTotalFormatted;

     private float subtotal;

     private String subotalFormatted;

     private float taxTotal;

     private String taxTotalFormatted;

     private float shippingCost;

     private String shippingCostFormatted;

     private float balanceDue;

     private String balanceDueFormatted;

     private Address shippingAddress;

     private Address billingAddress;

     private Collection<InvoiceLineItem> lineItems;

     private Collection<InvoicePayment> payments;

     private Collection<StatementDeposit> deposits;

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
     * Sets the id of the merchant associated with the statement.
     * @param value the id of the merchant associated with the statement.
     */
     public void setMerchantId(String value) {
          this.merchantId = value;
     }

    /**
     * Gets the id of the merchant associated with the statement.
     * @return the id of the merchant associated with the statement.
     */
     @SerializedName("merchantId")
     public String getMerchantId() {
          return this.merchantId;
     }

    /**
     * Sets the corporate name of the merchant associated with the statement.
     * @param value the corporate name of the merchant associated with the statement.
     */
     public void setCorporateName(String value) {
          this.corporateName = value;
     }

    /**
     * Gets the corporate name of the merchant associated with the statement.
     * @return the corporate name of the merchant associated with the statement.
     */
     @SerializedName("corporateName")
     public String getCorporateName() {
          return this.corporateName;
     }

    /**
     * Sets the dba name of the merchant associated with the statement.
     * @param value the dba name of the merchant associated with the statement.
     */
     public void setDbaName(String value) {
          this.dbaName = value;
     }

    /**
     * Gets the dba name of the merchant associated with the statement.
     * @return the dba name of the merchant associated with the statement.
     */
     @SerializedName("dbaName")
     public String getDbaName() {
          return this.dbaName;
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
     * Sets the current status of the invoice.
     * @param value the current status of the invoice.
     */
     public void setStatus(String value) {
          this.status = value;
     }

    /**
     * Gets the current status of the invoice.
     * @return the current status of the invoice.
     */
     @SerializedName("status")
     public String getStatus() {
          return this.status;
     }

    /**
     * Sets the type of invoice (statement or invoice).
     * @param value the type of invoice (statement or invoice).
     */
     public void setInvoiceType(String value) {
          this.invoiceType = value;
     }

    /**
     * Gets the type of invoice (statement or invoice).
     * @return the type of invoice (statement or invoice).
     */
     @SerializedName("invoiceType")
     public String getInvoiceType() {
          return this.invoiceType;
     }

    /**
     * Sets the type of pricing used for the invoice (typically flat rate or or interchange
     * plus).
     * @param value the type of pricing used for the invoice (typically flat rate or or
     * interchange plus).
     */
     public void setPricingType(String value) {
          this.pricingType = value;
     }

    /**
     * Gets the type of pricing used for the invoice (typically flat rate or or interchange
     * plus).
     * @return the type of pricing used for the invoice (typically flat rate or or
     * interchange plus).
     */
     @SerializedName("pricingType")
     public String getPricingType() {
          return this.pricingType;
     }

    /**
     * Sets whether or not the invoice has been paid.
     * @param value whether or not the invoice has been paid.
     */
     public void setPaid(boolean value) {
          this.paid = value;
     }

    /**
     * Gets whether or not the invoice has been paid.
     * @return whether or not the invoice has been paid.
     */
     @SerializedName("paid")
     public boolean isPaid() {
          return this.paid;
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
     * Sets the subtotal before shipping and tax.
     * @param value the subtotal before shipping and tax.
     */
     public void setSubtotal(float value) {
          this.subtotal = value;
     }

    /**
     * Gets the subtotal before shipping and tax.
     * @return the subtotal before shipping and tax.
     */
     @SerializedName("subtotal")
     public float getSubtotal() {
          return this.subtotal;
     }

    /**
     * Sets the string formatted subtotal before shipping and tax.
     * @param value the string formatted subtotal before shipping and tax.
     */
     public void setSubotalFormatted(String value) {
          this.subotalFormatted = value;
     }

    /**
     * Gets the string formatted subtotal before shipping and tax.
     * @return the string formatted subtotal before shipping and tax.
     */
     @SerializedName("subotalFormatted")
     public String getSubotalFormatted() {
          return this.subotalFormatted;
     }

    /**
     * Sets the total sales tax.
     * @param value the total sales tax.
     */
     public void setTaxTotal(float value) {
          this.taxTotal = value;
     }

    /**
     * Gets the total sales tax.
     * @return the total sales tax.
     */
     @SerializedName("taxTotal")
     public float getTaxTotal() {
          return this.taxTotal;
     }

    /**
     * Sets the string formatted total sales tax.
     * @param value the string formatted total sales tax.
     */
     public void setTaxTotalFormatted(String value) {
          this.taxTotalFormatted = value;
     }

    /**
     * Gets the string formatted total sales tax.
     * @return the string formatted total sales tax.
     */
     @SerializedName("taxTotalFormatted")
     public String getTaxTotalFormatted() {
          return this.taxTotalFormatted;
     }

    /**
     * Sets the total cost of shipping.
     * @param value the total cost of shipping.
     */
     public void setShippingCost(float value) {
          this.shippingCost = value;
     }

    /**
     * Gets the total cost of shipping.
     * @return the total cost of shipping.
     */
     @SerializedName("shippingCost")
     public float getShippingCost() {
          return this.shippingCost;
     }

    /**
     * Sets the string formatted total cost of shipping.
     * @param value the string formatted total cost of shipping.
     */
     public void setShippingCostFormatted(String value) {
          this.shippingCostFormatted = value;
     }

    /**
     * Gets the string formatted total cost of shipping.
     * @return the string formatted total cost of shipping.
     */
     @SerializedName("shippingCostFormatted")
     public String getShippingCostFormatted() {
          return this.shippingCostFormatted;
     }

    /**
     * Sets the total unpaid balance on the invoice.
     * @param value the total unpaid balance on the invoice.
     */
     public void setBalanceDue(float value) {
          this.balanceDue = value;
     }

    /**
     * Gets the total unpaid balance on the invoice.
     * @return the total unpaid balance on the invoice.
     */
     @SerializedName("balanceDue")
     public float getBalanceDue() {
          return this.balanceDue;
     }

    /**
     * Sets the string formatted unpaid balance on the invoice.
     * @param value the string formatted unpaid balance on the invoice.
     */
     public void setBalanceDueFormatted(String value) {
          this.balanceDueFormatted = value;
     }

    /**
     * Gets the string formatted unpaid balance on the invoice.
     * @return the string formatted unpaid balance on the invoice.
     */
     @SerializedName("balanceDueFormatted")
     public String getBalanceDueFormatted() {
          return this.balanceDueFormatted;
     }

    /**
     * Sets the shipping or physical address associated with the invoice.
     * @param value the shipping or physical address associated with the invoice.
     */
     public void setShippingAddress(Address value) {
          this.shippingAddress = value;
     }

    /**
     * Gets the shipping or physical address associated with the invoice.
     * @return the shipping or physical address associated with the invoice.
     */
     @SerializedName("shippingAddress")
     public Address getShippingAddress() {
          return this.shippingAddress;
     }

    /**
     * Sets the billing or mailing address associated with the invoice.
     * @param value the billing or mailing address associated with the invoice.
     */
     public void setBillingAddress(Address value) {
          this.billingAddress = value;
     }

    /**
     * Gets the billing or mailing address associated with the invoice.
     * @return the billing or mailing address associated with the invoice.
     */
     @SerializedName("billingAddress")
     public Address getBillingAddress() {
          return this.billingAddress;
     }

    /**
     * Sets the list of line item details associated with the invoice.
     * @param value the list of line item details associated with the invoice.
     */
     public void setLineItems(Collection<InvoiceLineItem> value) {
          this.lineItems = value;
     }

    /**
     * Gets the list of line item details associated with the invoice.
     * @return the list of line item details associated with the invoice.
     */
     @SerializedName("lineItems")
     public Collection<InvoiceLineItem> getLineItems() {
          return this.lineItems;
     }

    /**
     * Sets the list of payments collected against the invoice.
     * @param value the list of payments collected against the invoice.
     */
     public void setPayments(Collection<InvoicePayment> value) {
          this.payments = value;
     }

    /**
     * Gets the list of payments collected against the invoice.
     * @return the list of payments collected against the invoice.
     */
     @SerializedName("payments")
     public Collection<InvoicePayment> getPayments() {
          return this.payments;
     }

    /**
     * Sets the list of merchant settlements disbursed during the statement period.
     * @param value the list of merchant settlements disbursed during the statement
     * period.
     */
     public void setDeposits(Collection<StatementDeposit> value) {
          this.deposits = value;
     }

    /**
     * Gets the list of merchant settlements disbursed during the statement period.
     * @return the list of merchant settlements disbursed during the statement period.
     */
     @SerializedName("deposits")
     public Collection<StatementDeposit> getDeposits() {
          return this.deposits;
     }

    /**
     * Adds a the list of line item details associated with the invoice.
     * @param value the list of line item details associated with the invoice.
     */
     public void addLineItem(InvoiceLineItem value) {
          if (this.lineItems == null) {
               this.lineItems = new ArrayList();
          }
          this.lineItems.add(value);
     }

    /**
     * Adds a the list of payments collected against the invoice.
     * @param value the list of payments collected against the invoice.
     */
     public void addPayment(InvoicePayment value) {
          if (this.payments == null) {
               this.payments = new ArrayList();
          }
          this.payments.add(value);
     }

    /**
     * Adds a the list of merchant settlements disbursed during the statement period.
     * @param value the list of merchant settlements disbursed during the statement
     * period.
     */
     public void addDeposit(StatementDeposit value) {
          if (this.deposits == null) {
               this.deposits = new ArrayList();
          }
          this.deposits.add(value);
     }

}
