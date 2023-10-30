/**
 * Copyright 2019-2023 BlockChyp, Inc. All rights reserved. Use of this code is governed
 * by a license that can be found in the LICENSE file.
 *
 * This file was generated automatically by the BlockChyp SDK Generator. Changes to this
 * file will be lost every time the code is regenerated.
 */

package com.blockchyp.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Models a request to retrieve pricing policy information. The default policy for the
 * merchant is returned if no idea is provided.
 */
public class PricingPolicyRequest implements ITimeoutRequest {

     private int timeout;

     private boolean test;

     private String id;

     private String merchantId;

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
     * Sets an optional id used to retrieve a specific pricing policy.
     * @param value an optional id used to retrieve a specific pricing policy.
     */
     public void setId(String value) {
          this.id = value;
     }

    /**
     * Gets an optional id used to retrieve a specific pricing policy.
     * @return an optional id used to retrieve a specific pricing policy.
     */
     @JsonProperty("id")
     public String getId() {
          return this.id;
     }

    /**
     * Sets an optional merchant id if this request is submitted via partner credentials.
     * @param value an optional merchant id if this request is submitted via partner
     * credentials.
     */
     public void setMerchantId(String value) {
          this.merchantId = value;
     }

    /**
     * Gets an optional merchant id if this request is submitted via partner credentials.
     * @return an optional merchant id if this request is submitted via partner
     * credentials.
     */
     @JsonProperty("merchantId")
     public String getMerchantId() {
          return this.merchantId;
     }

}
