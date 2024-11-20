/**
 * Copyright 2019-2024 BlockChyp, Inc. All rights reserved. Use of this code is governed
 * by a license that can be found in the LICENSE file.
 *
 * This file was generated automatically by the BlockChyp SDK Generator. Changes to this
 * file will be lost every time the code is regenerated.
 */

package com.blockchyp.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Models a payment token metadata response.
 */
public class TokenMetadataResponse implements IAbstractAcknowledgement {

     private boolean success;

     private String error;

     private String responseDescription;

     private CustomerToken token;

     private CardMetadata cardMetadata;

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
     * Sets the token metadata for a given query.
     * @param value the token metadata for a given query.
     */
     public void setToken(CustomerToken value) {
          this.token = value;
     }

    /**
     * Gets the token metadata for a given query.
     * @return the token metadata for a given query.
     */
     @JsonProperty("token")
     public CustomerToken getToken() {
          return this.token;
     }

    /**
     * Sets details about a payment card derived from its BIN/IIN.
     * @param value details about a payment card derived from its BIN/IIN.
     */
     public void setCardMetadata(CardMetadata value) {
          this.cardMetadata = value;
     }

    /**
     * Gets details about a payment card derived from its BIN/IIN.
     * @return details about a payment card derived from its BIN/IIN.
     */
     @JsonProperty("cardMetadata")
     public CardMetadata getCardMetadata() {
          return this.cardMetadata;
     }

}
