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
 * Models a customer record.
 */
@SuppressWarnings({"rawtypes", "unchecked"})
public class Customer {

     private String id;

     private String customerRef;

     private String firstName;

     private String lastName;

     private String companyName;

     private String emailAddress;

     private String smsNumber;

     private Collection<CustomerToken> paymentMethods;

    /**
     * Sets BlockChyp assigned customer id.
     * @param value BlockChyp assigned customer id.
     */
     public void setId(String value) {
          this.id = value;
     }

    /**
     * Gets BlockChyp assigned customer id.
     * @return BlockChyp assigned customer id.
     */
     @SerializedName("id")
     public String getId() {
          return this.id;
     }

    /**
     * Sets optional customer ref that can be used for the client's system's customer id.
     * @param value optional customer ref that can be used for the client's system's
     * customer id.
     */
     public void setCustomerRef(String value) {
          this.customerRef = value;
     }

    /**
     * Gets optional customer ref that can be used for the client's system's customer id.
     * @return optional customer ref that can be used for the client's system's customer
     * id.
     */
     @SerializedName("customerRef")
     public String getCustomerRef() {
          return this.customerRef;
     }

    /**
     * Sets customer's first name.
     * @param value customer's first name.
     */
     public void setFirstName(String value) {
          this.firstName = value;
     }

    /**
     * Gets customer's first name.
     * @return customer's first name.
     */
     @SerializedName("firstName")
     public String getFirstName() {
          return this.firstName;
     }

    /**
     * Sets customer's last name.
     * @param value customer's last name.
     */
     public void setLastName(String value) {
          this.lastName = value;
     }

    /**
     * Gets customer's last name.
     * @return customer's last name.
     */
     @SerializedName("lastName")
     public String getLastName() {
          return this.lastName;
     }

    /**
     * Sets customer's company name.
     * @param value customer's company name.
     */
     public void setCompanyName(String value) {
          this.companyName = value;
     }

    /**
     * Gets customer's company name.
     * @return customer's company name.
     */
     @SerializedName("companyName")
     public String getCompanyName() {
          return this.companyName;
     }

    /**
     * Sets customer's email address.
     * @param value customer's email address.
     */
     public void setEmailAddress(String value) {
          this.emailAddress = value;
     }

    /**
     * Gets customer's email address.
     * @return customer's email address.
     */
     @SerializedName("emailAddress")
     public String getEmailAddress() {
          return this.emailAddress;
     }

    /**
     * Sets customer's SMS or mobile number.
     * @param value customer's SMS or mobile number.
     */
     public void setSmsNumber(String value) {
          this.smsNumber = value;
     }

    /**
     * Gets customer's SMS or mobile number.
     * @return customer's SMS or mobile number.
     */
     @SerializedName("smsNumber")
     public String getSmsNumber() {
          return this.smsNumber;
     }

    /**
     * Sets model saved payment methods associated with a customer.
     * @param value model saved payment methods associated with a customer.
     */
     public void setPaymentMethods(Collection<CustomerToken> value) {
          this.paymentMethods = value;
     }

    /**
     * Gets model saved payment methods associated with a customer.
     * @return model saved payment methods associated with a customer.
     */
     @SerializedName("paymentMethods")
     public Collection<CustomerToken> getPaymentMethods() {
          return this.paymentMethods;
     }

    /**
     * Adds a model saved payment methods associated with a customer.
     * @param value model saved payment methods associated with a customer.
     */
     public void addPaymentMethod(CustomerToken value) {
          if (this.paymentMethods == null) {
               this.paymentMethods = new ArrayList();
          }
          this.paymentMethods.add(value);
     }

}
