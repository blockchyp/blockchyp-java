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
 * Models basic information needed to create a gateway merchant.
 */
public class AddGatewayMerchantRequest implements ITimeoutRequest {

     private boolean test;

     private MerchantProfile profile;

     private int timeout;

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
     * Sets the merchant profile to be boarded.
     * @param value the merchant profile to be boarded.
     */
     public void setProfile(MerchantProfile value) {
          this.profile = value;
     }

    /**
     * Gets the merchant profile to be boarded.
     * @return the merchant profile to be boarded.
     */
     @SerializedName("profile")
     public MerchantProfile getProfile() {
          return this.profile;
     }

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

}
