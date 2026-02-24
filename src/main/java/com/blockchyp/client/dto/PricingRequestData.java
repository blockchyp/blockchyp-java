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
 * Models the data wrapper for a pricing request.
 */
public class PricingRequestData {

     private String type;

     private PricingRequestAttributes attributes;

    /**
     * Sets the type of the request.
     * @param value the type of the request.
     */
     public void setType(String value) {
          this.type = value;
     }

    /**
     * Gets the type of the request.
     * @return the type of the request.
     */
     @JsonProperty("type")
     public String getType() {
          return this.type;
     }

    /**
     * Sets the pricing request attributes.
     * @param value the pricing request attributes.
     */
     public void setAttributes(PricingRequestAttributes value) {
          this.attributes = value;
     }

    /**
     * Gets the pricing request attributes.
     * @return the pricing request attributes.
     */
     @JsonProperty("attributes")
     public PricingRequestAttributes getAttributes() {
          return this.attributes;
     }

}
