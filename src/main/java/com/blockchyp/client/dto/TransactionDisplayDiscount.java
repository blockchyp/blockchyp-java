/**
 * Copyright 2019 BlockChyp, Inc. All rights reserved. Use of this code is governed by a
 * license that can be found in the LICENSE file.
 *
 * This file was generated automatically. Changes to this file will be lost every time the
 * code is regenerated.
 */
package com.blockchyp.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * An item level discount for transaction display. Discounts never combine.
 */
public class TransactionDisplayDiscount {

     private String description;

     private String amount;

     /**
      * Sets the discount description.
      * @param value the discount description.
      */
     public void setDescription(String value) {
          this.description = value;
     }

     /**
      * Gets the discount description.
      * @return the discount description.
      */
     @JsonProperty("description")
     public String getDescription() {
          return this.description;
     }

     /**
      * Sets the amount of the discount.
      * @param value the amount of the discount.
      */
     public void setAmount(String value) {
          this.amount = value;
     }

     /**
      * Gets the amount of the discount.
      * @return the amount of the discount.
      */
     @JsonProperty("amount")
     public String getAmount() {
          return this.amount;
     }

}
