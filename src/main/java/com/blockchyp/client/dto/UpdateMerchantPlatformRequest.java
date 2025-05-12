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
 * Used to up platform configuration for gateway merchants.
 */
public class UpdateMerchantPlatformRequest implements ITimeoutRequest {

     private int timeout;

     private boolean test;

     private MerchantPlatform platform;

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
     @SerializedName("timeout")
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
     @SerializedName("test")
     public boolean isTest() {
          return this.test;
     }

    /**
     * Sets the merchant platform configuration.
     * @param value the merchant platform configuration.
     */
     public void setPlatform(MerchantPlatform value) {
          this.platform = value;
     }

    /**
     * Gets the merchant platform configuration.
     * @return the merchant platform configuration.
     */
     @SerializedName("platform")
     public MerchantPlatform getPlatform() {
          return this.platform;
     }

}
