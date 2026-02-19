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
 * Models the data wrapper for a pricing response.
 */
public class PricingResponseData {

     private String type;

     private PricingResponseAttributes attributes;

    /**
     * Sets the type of the response.
     * @param value the type of the response.
     */
     public void setType(String value) {
          this.type = value;
     }

    /**
     * Gets the type of the response.
     * @return the type of the response.
     */
     @JsonProperty("type")
     public String getType() {
          return this.type;
     }

    /**
     * Sets the pricing response attributes.
     * @param value the pricing response attributes.
     */
     public void setAttributes(PricingResponseAttributes value) {
          this.attributes = value;
     }

    /**
     * Gets the pricing response attributes.
     * @return the pricing response attributes.
     */
     @JsonProperty("attributes")
     public PricingResponseAttributes getAttributes() {
          return this.attributes;
     }

}
