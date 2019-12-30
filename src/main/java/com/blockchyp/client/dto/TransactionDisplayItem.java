/**
 * Copyright 2019 BlockChyp, Inc. All rights reserved. Use of this code is governed by a
 * license that can be found in the LICENSE file.
 *
 * This file was generated automatically. Changes to this file will be lost every time the
 * code is regenerated.
 */
package com.blockchyp.client.dto;

import java.util.ArrayList;
import java.util.Collection;

/**
 * An item category in a transaction display. Groups combine if their descriptions match.
 * Calculated subtotal amounts are rounded to two decimal places of precision. Quantity
 * is a floating point number that is not rounded at all.
 */
@SuppressWarnings({"rawtypes", "unchecked"})
public class TransactionDisplayItem {

     private String id;

     private String description;

     private String price;

     private float quantity;

     private String extended;

     private Collection discounts;

     /**
      * Sets a unique value identifying the item.
      * @param value a unique value identifying the item. This is not required, but
      * recommended since it is required to update or delete line items.
      */
     public void setID(String value) {
          this.id = value;
     }

     /**
      * Gets a unique value identifying the item.
      * @return a unique value identifying the item. This is not required, but
      * recommended since it is required to update or delete line items.
      */
     public String getID() {
          return this.id;
     }

     /**
      * Sets a description of the line item.
      * @param value a description of the line item.
      */
     public void setDescription(String value) {
          this.description = value;
     }

     /**
      * Gets a description of the line item.
      * @return a description of the line item.
      */
     public String getDescription() {
          return this.description;
     }

     /**
      * Sets the price of the line item.
      * @param value the price of the line item.
      */
     public void setPrice(String value) {
          this.price = value;
     }

     /**
      * Gets the price of the line item.
      * @return the price of the line item.
      */
     public String getPrice() {
          return this.price;
     }

     /**
      * Sets the quantity of the line item.
      * @param value the quantity of the line item.
      */
     public void setQuantity(float value) {
          this.quantity = value;
     }

     /**
      * Gets the quantity of the line item.
      * @return the quantity of the line item.
      */
     public float getQuantity() {
          return this.quantity;
     }

     /**
      * Sets an item category in a transaction display.
      * @param value an item category in a transaction display. Groups combine if their
      * descriptions match. Calculated subtotal amounts are rounded to two decimal
      * places of precision. Quantity is a floating point number that is not rounded at
      * all.
      */
     public void setExtended(String value) {
          this.extended = value;
     }

     /**
      * Gets an item category in a transaction display.
      * @return an item category in a transaction display. Groups combine if their
      * descriptions match. Calculated subtotal amounts are rounded to two decimal
      * places of precision. Quantity is a floating point number that is not rounded at
      * all.
      */
     public String getExtended() {
          return this.extended;
     }

     /**
      * Sets are displayed under their corresponding item.
      * @param value are displayed under their corresponding item.
      */
     public void setDiscounts(Collection value) {
          this.discounts = value;
     }

     /**
      * Gets are displayed under their corresponding item.
      * @return are displayed under their corresponding item.
      */
     public Collection getDiscounts() {
          return this.discounts;
     }

     /**
      * Adds a are displayed under their corresponding item.
      * @param value are displayed under their corresponding item.
      */
     public void addDiscount(TransactionDisplayDiscount value) {
          if (this.discounts == null) {
               this.discounts = new ArrayList();
          }
          this.discounts.add(value);
     }

}
