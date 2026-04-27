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
 * Models a request for short-lived API credentials.
 */
public class TransientKeyRequest implements ITimeoutRequest {

     private int timeout;

     private boolean test;

     private boolean oneTime;

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
     * Sets restricts the returned credentials to a single API call when true.
     * @param value restricts the returned credentials to a single API call when true.
     */
     public void setOneTime(boolean value) {
          this.oneTime = value;
     }

    /**
     * Gets restricts the returned credentials to a single API call when true.
     * @return restricts the returned credentials to a single API call when true.
     */
     @JsonProperty("oneTime")
     public boolean isOneTime() {
          return this.oneTime;
     }

}
