/**
 * Copyright 2019-2024 BlockChyp, Inc. All rights reserved. Use of this code is governed
 * by a license that can be found in the LICENSE file.
 *
 * This file was generated automatically by the BlockChyp SDK Generator. Changes to this
 * file will be lost every time the code is regenerated.
 */

package com.blockchyp.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Models a request to generate merchant api credentials.
 */
@SuppressWarnings({"rawtypes", "unchecked"})
public class MerchantCredentialGenerationRequest implements ITimeoutRequest {

     private int timeout;

     private boolean test;

     private String merchantId;

     private boolean deleteProtected;

     private Collection<String> roles;

     private String notes;

     private String credentialType;

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
     * Sets the merchant id.
     * @param value the merchant id.
     */
     public void setMerchantId(String value) {
          this.merchantId = value;
     }

    /**
     * Gets the merchant id.
     * @return the merchant id.
     */
     @JsonProperty("merchantId")
     public String getMerchantId() {
          return this.merchantId;
     }

    /**
     * Sets protects the credentials from deletion.
     * @param value protects the credentials from deletion.
     */
     public void setDeleteProtected(boolean value) {
          this.deleteProtected = value;
     }

    /**
     * Gets protects the credentials from deletion.
     * @return protects the credentials from deletion.
     */
     @JsonProperty("deleteProtected")
     public boolean isDeleteProtected() {
          return this.deleteProtected;
     }

    /**
     * Sets an optional array of role codes that will be assigned to the credentials.
     * @param value an optional array of role codes that will be assigned to the
     * credentials.
     */
     public void setRoles(Collection<String> value) {
          this.roles = value;
     }

    /**
     * Gets an optional array of role codes that will be assigned to the credentials.
     * @return an optional array of role codes that will be assigned to the credentials.
     */
     @JsonProperty("roles")
     public Collection<String> getRoles() {
          return this.roles;
     }

    /**
     * Sets free form description of the purpose or intent behind the credentials.
     * @param value free form description of the purpose or intent behind the
     * credentials.
     */
     public void setNotes(String value) {
          this.notes = value;
     }

    /**
     * Gets free form description of the purpose or intent behind the credentials.
     * @return free form description of the purpose or intent behind the credentials.
     */
     @JsonProperty("notes")
     public String getNotes() {
          return this.notes;
     }

    /**
     * Sets type of credentials to generate, either API or TOKENIZING.
     * @param value type of credentials to generate, either API or TOKENIZING. Defaults
     * to API.
     */
     public void setCredentialType(String value) {
          this.credentialType = value;
     }

    /**
     * Gets type of credentials to generate, either API or TOKENIZING.
     * @return type of credentials to generate, either API or TOKENIZING. Defaults to
     * API.
     */
     @JsonProperty("credentialType")
     public String getCredentialType() {
          return this.credentialType;
     }

    /**
     * Adds a an optional array of role codes that will be assigned to the credentials.
     * @param value an optional array of role codes that will be assigned to the
     * credentials.
     */
     public void addRole(String value) {
          if (this.roles == null) {
               this.roles = new ArrayList();
          }
          this.roles.add(value);
     }

}
