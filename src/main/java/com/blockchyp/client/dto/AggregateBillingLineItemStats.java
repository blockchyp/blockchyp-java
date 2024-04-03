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
 * Models statistics for low level aggregation line items.
 */
public class AggregateBillingLineItemStats {

     private String min;

     private String avg;

     private String max;

    /**
     * Sets the min value in the set.
     * @param value the min value in the set.
     */
     public void setMin(String value) {
          this.min = value;
     }

    /**
     * Gets the min value in the set.
     * @return the min value in the set.
     */
     @JsonProperty("min")
     public String getMin() {
          return this.min;
     }

    /**
     * Sets the avg value in the set.
     * @param value the avg value in the set.
     */
     public void setAvg(String value) {
          this.avg = value;
     }

    /**
     * Gets the avg value in the set.
     * @return the avg value in the set.
     */
     @JsonProperty("avg")
     public String getAvg() {
          return this.avg;
     }

    /**
     * Sets the max value in the set.
     * @param value the max value in the set.
     */
     public void setMax(String value) {
          this.max = value;
     }

    /**
     * Gets the max value in the set.
     * @return the max value in the set.
     */
     @JsonProperty("max")
     public String getMax() {
          return this.max;
     }

}
