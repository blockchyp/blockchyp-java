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
 * Models a request for merchant information.
 */
public class GetMerchantsRequest implements ITimeoutRequest {

     private int timeout;

     private boolean test;

     private int maxResults;

     private int startIndex;

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
     * Sets whether or not to return test or live merchants.
     * @param value whether or not to return test or live merchants.
     */
     public void setTest(boolean value) {
          this.test = value;
     }

    /**
     * Gets whether or not to return test or live merchants.
     * @return whether or not to return test or live merchants.
     */
     @JsonProperty("test")
     public boolean isTest() {
          return this.test;
     }

    /**
     * Sets max to be returned in a single page.
     * @param value max to be returned in a single page. Defaults to the system max of 250.
     */
     public void setMaxResults(int value) {
          this.maxResults = value;
     }

    /**
     * Gets max to be returned in a single page.
     * @return max to be returned in a single page. Defaults to the system max of 250.
     */
     @JsonProperty("maxResults")
     public int getMaxResults() {
          return this.maxResults;
     }

    /**
     * Sets starting index for paged results.
     * @param value starting index for paged results. Defaults to zero.
     */
     public void setStartIndex(int value) {
          this.startIndex = value;
     }

    /**
     * Gets starting index for paged results.
     * @return starting index for paged results. Defaults to zero.
     */
     @JsonProperty("startIndex")
     public int getStartIndex() {
          return this.startIndex;
     }

}
