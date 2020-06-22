/**
 * Copyright 2019 BlockChyp, Inc. All rights reserved. Use of this code is governed by a
 * license that can be found in the LICENSE file.
 *
 * This file was generated automatically. Changes to this file will be lost every time the
 * code is regenerated.
 */

package com.blockchyp.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Models a response for details about a single batch.
 */
@SuppressWarnings({"rawtypes", "unchecked"})
public class MerchantProfileResponse implements IAbstractAcknowledgement {

     private boolean success;

     private String error;

     private String responseDescription;

     private boolean test;

     private String merchantId;

     private String companyName;

     private String locationName;

     private String storeNumber;

     private String timeZone;

     private String batchCloseTime;

     private boolean autoBatchClose;

     private boolean pinEnabled;

     private boolean cashBackEnabled;

     private boolean storeAndForwardEnabled;

     private String storeAndForwardFloorLimit;

     private Collection<BankAccount> bankAccounts;

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
     @JsonProperty("success")
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
     @JsonProperty("error")
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
     @JsonProperty("responseDescription")
     public String getResponseDescription() {
          return this.responseDescription;
     }

    /**
     * Sets that the response came from the test gateway.
     * @param value that the response came from the test gateway.
     */
     public void setTest(boolean value) {
          this.test = value;
     }

    /**
     * Gets that the response came from the test gateway.
     * @return that the response came from the test gateway.
     */
     @JsonProperty("test")
     public boolean isTest() {
          return this.test;
     }

    /**
     * Sets merchant id.
     * @param value merchant id.
     */
     public void setMerchantId(String value) {
          this.merchantId = value;
     }

    /**
     * Gets merchant id.
     * @return merchant id.
     */
     @JsonProperty("merchantId")
     public String getMerchantId() {
          return this.merchantId;
     }

    /**
     * Sets company name.
     * @param value company name.
     */
     public void setCompanyName(String value) {
          this.companyName = value;
     }

    /**
     * Gets company name.
     * @return company name.
     */
     @JsonProperty("companyName")
     public String getCompanyName() {
          return this.companyName;
     }

    /**
     * Sets location name.
     * @param value location name.
     */
     public void setLocationName(String value) {
          this.locationName = value;
     }

    /**
     * Gets location name.
     * @return location name.
     */
     @JsonProperty("locationName")
     public String getLocationName() {
          return this.locationName;
     }

    /**
     * Sets store number.
     * @param value store number.
     */
     public void setStoreNumber(String value) {
          this.storeNumber = value;
     }

    /**
     * Gets store number.
     * @return store number.
     */
     @JsonProperty("storeNumber")
     public String getStoreNumber() {
          return this.storeNumber;
     }

    /**
     * Sets merchant's local time zone.
     * @param value merchant's local time zone.
     */
     public void setTimeZone(String value) {
          this.timeZone = value;
     }

    /**
     * Gets merchant's local time zone.
     * @return merchant's local time zone.
     */
     @JsonProperty("timeZone")
     public String getTimeZone() {
          return this.timeZone;
     }

    /**
     * Sets batch close time in the merchant's time zone.
     * @param value batch close time in the merchant's time zone.
     */
     public void setBatchCloseTime(String value) {
          this.batchCloseTime = value;
     }

    /**
     * Gets batch close time in the merchant's time zone.
     * @return batch close time in the merchant's time zone.
     */
     @JsonProperty("batchCloseTime")
     public String getBatchCloseTime() {
          return this.batchCloseTime;
     }

    /**
     * Sets flag indicating whether or not the batch automatically closes.
     * @param value flag indicating whether or not the batch automatically closes.
     */
     public void setAutoBatchClose(boolean value) {
          this.autoBatchClose = value;
     }

    /**
     * Gets flag indicating whether or not the batch automatically closes.
     * @return flag indicating whether or not the batch automatically closes.
     */
     @JsonProperty("autoBatchClose")
     public boolean isAutoBatchClose() {
          return this.autoBatchClose;
     }

    /**
     * Sets flag indicating whether or not pin entry is enabled.
     * @param value flag indicating whether or not pin entry is enabled.
     */
     public void setPinEnabled(boolean value) {
          this.pinEnabled = value;
     }

    /**
     * Gets flag indicating whether or not pin entry is enabled.
     * @return flag indicating whether or not pin entry is enabled.
     */
     @JsonProperty("pinEnabled")
     public boolean isPinEnabled() {
          return this.pinEnabled;
     }

    /**
     * Sets flag indicating whether or not cash back is enabled.
     * @param value flag indicating whether or not cash back is enabled.
     */
     public void setCashBackEnabled(boolean value) {
          this.cashBackEnabled = value;
     }

    /**
     * Gets flag indicating whether or not cash back is enabled.
     * @return flag indicating whether or not cash back is enabled.
     */
     @JsonProperty("cashBackEnabled")
     public boolean isCashBackEnabled() {
          return this.cashBackEnabled;
     }

    /**
     * Sets flag indicating whether or not store and forward is enabled.
     * @param value flag indicating whether or not store and forward is enabled.
     */
     public void setStoreAndForwardEnabled(boolean value) {
          this.storeAndForwardEnabled = value;
     }

    /**
     * Gets flag indicating whether or not store and forward is enabled.
     * @return flag indicating whether or not store and forward is enabled.
     */
     @JsonProperty("storeAndForwardEnabled")
     public boolean isStoreAndForwardEnabled() {
          return this.storeAndForwardEnabled;
     }

    /**
     * Sets floor limit for store and forward transactions.
     * @param value floor limit for store and forward transactions.
     */
     public void setStoreAndForwardFloorLimit(String value) {
          this.storeAndForwardFloorLimit = value;
     }

    /**
     * Gets floor limit for store and forward transactions.
     * @return floor limit for store and forward transactions.
     */
     @JsonProperty("storeAndForwardFloorLimit")
     public String getStoreAndForwardFloorLimit() {
          return this.storeAndForwardFloorLimit;
     }

    /**
     * Sets bank accounts for split bank account merchants.
     * @param value bank accounts for split bank account merchants.
     */
     public void setBankAccounts(Collection<BankAccount> value) {
          this.bankAccounts = value;
     }

    /**
     * Gets bank accounts for split bank account merchants.
     * @return bank accounts for split bank account merchants.
     */
     @JsonProperty("bankAccounts")
     public Collection<BankAccount> getBankAccounts() {
          return this.bankAccounts;
     }

    /**
     * Adds a bank accounts for split bank account merchants.
     * @param value bank accounts for split bank account merchants.
     */
     public void addBankAccount(BankAccount value) {
          if (this.bankAccounts == null) {
               this.bankAccounts = new ArrayList();
          }
          this.bankAccounts.add(value);
     }

}
