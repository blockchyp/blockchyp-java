/**
 * Copyright 2019-2026 BlockChyp, Inc. All rights reserved. Use of this code is governed
 * by a license that can be found in the LICENSE file.
 *
 * This file was generated automatically by the BlockChyp SDK Generator. Changes to this
 * file will be lost every time the code is regenerated.
 */

package com.blockchyp.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

/**
 * Details about a merchant board platform configuration.
 */
@SuppressWarnings({"rawtypes", "unchecked"})
public class MerchantPlatform implements ITimeoutRequest {

     private int timeout;

     private boolean test;

     private String id;

     private boolean disabled;

     private String platformCode;

     private int priority;

     private String registrationId;

     private String merchantId;

     private String acquirerMid;

     private String notes;

     private String entryMethod;

     private String dateCreated;

     private String lastChange;

     private Map configMap;

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
     @JsonProperty("timeout")
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
     @JsonProperty("test")
     public boolean isTest() {
          return this.test;
     }

    /**
     * Sets primary identifier for a given platform configuration.
     * @param value primary identifier for a given platform configuration.
     */
     public void setId(String value) {
          this.id = value;
     }

    /**
     * Gets primary identifier for a given platform configuration.
     * @return primary identifier for a given platform configuration.
     */
     @JsonProperty("id")
     public String getId() {
          return this.id;
     }

    /**
     * Sets that a platform configuration is disabled.
     * @param value that a platform configuration is disabled.
     */
     public void setDisabled(boolean value) {
          this.disabled = value;
     }

    /**
     * Gets that a platform configuration is disabled.
     * @return that a platform configuration is disabled.
     */
     @JsonProperty("disabled")
     public boolean isDisabled() {
          return this.disabled;
     }

    /**
     * Sets BlockChyp's code for the boarding platform.
     * @param value BlockChyp's code for the boarding platform.
     */
     public void setPlatformCode(String value) {
          this.platformCode = value;
     }

    /**
     * Gets BlockChyp's code for the boarding platform.
     * @return BlockChyp's code for the boarding platform.
     */
     @JsonProperty("platformCode")
     public String getPlatformCode() {
          return this.platformCode;
     }

    /**
     * Sets the platform's priority in a multi platform setup.
     * @param value the platform's priority in a multi platform setup.
     */
     public void setPriority(int value) {
          this.priority = value;
     }

    /**
     * Gets the platform's priority in a multi platform setup.
     * @return the platform's priority in a multi platform setup.
     */
     @JsonProperty("priority")
     public int getPriority() {
          return this.priority;
     }

    /**
     * Sets an optional field specifying the merchant's card brand registration record.
     * @param value an optional field specifying the merchant's card brand registration
     * record.
     */
     public void setRegistrationId(String value) {
          this.registrationId = value;
     }

    /**
     * Gets an optional field specifying the merchant's card brand registration record.
     * @return an optional field specifying the merchant's card brand registration
     * record.
     */
     @JsonProperty("registrationId")
     public String getRegistrationId() {
          return this.registrationId;
     }

    /**
     * Sets the merchant's primary identifier.
     * @param value the merchant's primary identifier.
     */
     public void setMerchantId(String value) {
          this.merchantId = value;
     }

    /**
     * Gets the merchant's primary identifier.
     * @return the merchant's primary identifier.
     */
     @JsonProperty("merchantId")
     public String getMerchantId() {
          return this.merchantId;
     }

    /**
     * Sets the merchant id assigned by the acquiring bank.
     * @param value the merchant id assigned by the acquiring bank.
     */
     public void setAcquirerMid(String value) {
          this.acquirerMid = value;
     }

    /**
     * Gets the merchant id assigned by the acquiring bank.
     * @return the merchant id assigned by the acquiring bank.
     */
     @JsonProperty("acquirerMid")
     public String getAcquirerMid() {
          return this.acquirerMid;
     }

    /**
     * Sets free form notes description the purpose or intent behind the platform
     * configuration.
     * @param value free form notes description the purpose or intent behind the platform
     * configuration.
     */
     public void setNotes(String value) {
          this.notes = value;
     }

    /**
     * Gets free form notes description the purpose or intent behind the platform
     * configuration.
     * @return free form notes description the purpose or intent behind the platform
     * configuration.
     */
     @JsonProperty("notes")
     public String getNotes() {
          return this.notes;
     }

    /**
     * Sets the optional entry method code if a platform should only be used for specific
     * entry methods.
     * @param value the optional entry method code if a platform should only be used for
     * specific entry methods. Leave blank for 'all'.
     */
     public void setEntryMethod(String value) {
          this.entryMethod = value;
     }

    /**
     * Gets the optional entry method code if a platform should only be used for specific
     * entry methods.
     * @return the optional entry method code if a platform should only be used for
     * specific entry methods. Leave blank for 'all'.
     */
     @JsonProperty("entryMethod")
     public String getEntryMethod() {
          return this.entryMethod;
     }

    /**
     * Sets the date the platform configuration was first created.
     * @param value the date the platform configuration was first created.
     */
     public void setDateCreated(String value) {
          this.dateCreated = value;
     }

    /**
     * Gets the date the platform configuration was first created.
     * @return the date the platform configuration was first created.
     */
     @JsonProperty("dateCreated")
     public String getDateCreated() {
          return this.dateCreated;
     }

    /**
     * Sets the date the platform configuration was last modified.
     * @param value the date the platform configuration was last modified.
     */
     public void setLastChange(String value) {
          this.lastChange = value;
     }

    /**
     * Gets the date the platform configuration was last modified.
     * @return the date the platform configuration was last modified.
     */
     @JsonProperty("lastChange")
     public String getLastChange() {
          return this.lastChange;
     }

    /**
     * Sets a map of configuration values specific to the boarding platform.
     * @param value a map of configuration values specific to the boarding platform.
     * These are not published. Contact your BlockChyp rep for supported values.
     */
     public void setConfigMap(Map value) {
          this.configMap = value;
     }

    /**
     * Gets a map of configuration values specific to the boarding platform.
     * @return a map of configuration values specific to the boarding platform. These are
     * not published. Contact your BlockChyp rep for supported values.
     */
     @JsonProperty("configMap")
     public Map getConfigMap() {
          return this.configMap;
     }

}
