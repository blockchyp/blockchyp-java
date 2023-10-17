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
 * Models a single set of pricing values for a pricing policy.
 */
public class PricePoint {

     private String buyRate;

     private String current;

     private String limit;

    /**
     * Sets the string representation of a per transaction minimum.
     * @param value the string representation of a per transaction minimum.
     */
     public void setBuyRate(String value) {
          this.buyRate = value;
     }

    /**
     * Gets the string representation of a per transaction minimum.
     * @return the string representation of a per transaction minimum.
     */
     @JsonProperty("buyRate")
     public String getBuyRate() {
          return this.buyRate;
     }

    /**
     * Sets the string representation of the current fee per transaction.
     * @param value the string representation of the current fee per transaction.
     */
     public void setCurrent(String value) {
          this.current = value;
     }

    /**
     * Gets the string representation of the current fee per transaction.
     * @return the string representation of the current fee per transaction.
     */
     @JsonProperty("current")
     public String getCurrent() {
          return this.current;
     }

    /**
     * Sets the string representation of a per transaction gouge limit.
     * @param value the string representation of a per transaction gouge limit.
     */
     public void setLimit(String value) {
          this.limit = value;
     }

    /**
     * Gets the string representation of a per transaction gouge limit.
     * @return the string representation of a per transaction gouge limit.
     */
     @JsonProperty("limit")
     public String getLimit() {
          return this.limit;
     }

}
