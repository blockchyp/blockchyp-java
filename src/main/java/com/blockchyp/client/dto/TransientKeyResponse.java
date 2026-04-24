/**
 * Copyright 2019-2026 BlockChyp, Inc. All rights reserved. Use of this code is governed
 * by a license that can be found in the LICENSE file.
 *
 * This file was generated automatically by the BlockChyp SDK Generator. Changes to this
 * file will be lost every time the code is regenerated.
 */

package com.blockchyp.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Models a response containing short-lived API credentials.
 */
public class TransientKeyResponse implements IAbstractAcknowledgement {

     private boolean success;

     private String error;

     private String responseDescription;

     private String apiKey;

     private String bearerToken;

     private String signingKey;

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
     * Sets the transient API key.
     * @param value the transient API key.
     */
     public void setApiKey(String value) {
          this.apiKey = value;
     }

    /**
     * Gets the transient API key.
     * @return the transient API key.
     */
     @JsonProperty("apiKey")
     public String getApiKey() {
          return this.apiKey;
     }

    /**
     * Sets the transient bearer token.
     * @param value the transient bearer token.
     */
     public void setBearerToken(String value) {
          this.bearerToken = value;
     }

    /**
     * Gets the transient bearer token.
     * @return the transient bearer token.
     */
     @JsonProperty("bearerToken")
     public String getBearerToken() {
          return this.bearerToken;
     }

    /**
     * Sets the transient signing key.
     * @param value the transient signing key.
     */
     public void setSigningKey(String value) {
          this.signingKey = value;
     }

    /**
     * Gets the transient signing key.
     * @return the transient signing key.
     */
     @JsonProperty("signingKey")
     public String getSigningKey() {
          return this.signingKey;
     }

}
