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
 * Merchant api credential data.
 */
public class MerchantCredentialGenerationResponse implements IAbstractAcknowledgement {

     private boolean success;

     private String error;

     private String responseDescription;

     private String apiKey;

     private String bearerToken;

     private String signingKey;

     private String tokenizingKey;

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
     * Sets the merchant api key.
     * @param value the merchant api key.
     */
     public void setApiKey(String value) {
          this.apiKey = value;
     }

    /**
     * Gets the merchant api key.
     * @return the merchant api key.
     */
     @SerializedName("apiKey")
     public String getApiKey() {
          return this.apiKey;
     }

    /**
     * Sets the merchant bearer token.
     * @param value the merchant bearer token.
     */
     public void setBearerToken(String value) {
          this.bearerToken = value;
     }

    /**
     * Gets the merchant bearer token.
     * @return the merchant bearer token.
     */
     @SerializedName("bearerToken")
     public String getBearerToken() {
          return this.bearerToken;
     }

    /**
     * Sets the merchant signing key.
     * @param value the merchant signing key.
     */
     public void setSigningKey(String value) {
          this.signingKey = value;
     }

    /**
     * Gets the merchant signing key.
     * @return the merchant signing key.
     */
     @SerializedName("signingKey")
     public String getSigningKey() {
          return this.signingKey;
     }

    /**
     * Sets the tokenizing key.
     * @param value the tokenizing key.
     */
     public void setTokenizingKey(String value) {
          this.tokenizingKey = value;
     }

    /**
     * Gets the tokenizing key.
     * @return the tokenizing key.
     */
     @SerializedName("tokenizingKey")
     public String getTokenizingKey() {
          return this.tokenizingKey;
     }

}
