/**
 * Copyright 2019-2025 BlockChyp, Inc. All rights reserved. Use of this code is governed
 * by a license that can be found in the LICENSE file.
 *
 * This file was generated automatically by the BlockChyp SDK Generator. Changes to this
 * file will be lost every time the code is regenerated.
 */

package com.blockchyp.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

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

     private String unitCode;

     private String commodityCode;

     private String productCode;

     private Collection<TransactionDisplayDiscount> discounts;

    /**
     * Sets a unique value identifying the item.
     * @param value a unique value identifying the item. This is not required, but
     * recommended since it is required to update or delete line items.
     */
     public void setId(String value) {
          this.id = value;
     }

    /**
     * Gets a unique value identifying the item.
     * @return a unique value identifying the item. This is not required, but recommended
     * since it is required to update or delete line items.
     */
     @JsonProperty("id")
     public String getId() {
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
     @JsonProperty("description")
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
     @JsonProperty("price")
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
     @JsonProperty("quantity")
     public float getQuantity() {
          return this.quantity;
     }

    /**
     * Sets an item category in a transaction display.
     * @param value an item category in a transaction display. Groups combine if their
     * descriptions match. Calculated subtotal amounts are rounded to two decimal
     * places of precision. Quantity is a floating point number that is not rounded at all.
     */
     public void setExtended(String value) {
          this.extended = value;
     }

    /**
     * Gets an item category in a transaction display.
     * @return an item category in a transaction display. Groups combine if their
     * descriptions match. Calculated subtotal amounts are rounded to two decimal
     * places of precision. Quantity is a floating point number that is not rounded at all.
     */
     @JsonProperty("extended")
     public String getExtended() {
          return this.extended;
     }

    /**
     * Sets an alphanumeric code for units of measurement as used in international trade.
     * @param value an alphanumeric code for units of measurement as used in
     * international trade.
     */
     public void setUnitCode(String value) {
          this.unitCode = value;
     }

    /**
     * Gets an alphanumeric code for units of measurement as used in international trade.
     * @return an alphanumeric code for units of measurement as used in international
     * trade.
     */
     @JsonProperty("unitCode")
     public String getUnitCode() {
          return this.unitCode;
     }

    /**
     * Sets an international description code of the item.
     * @param value an international description code of the item.
     */
     public void setCommodityCode(String value) {
          this.commodityCode = value;
     }

    /**
     * Gets an international description code of the item.
     * @return an international description code of the item.
     */
     @JsonProperty("commodityCode")
     public String getCommodityCode() {
          return this.commodityCode;
     }

    /**
     * Sets a merchant-defined description code of the item.
     * @param value a merchant-defined description code of the item.
     */
     public void setProductCode(String value) {
          this.productCode = value;
     }

    /**
     * Gets a merchant-defined description code of the item.
     * @return a merchant-defined description code of the item.
     */
     @JsonProperty("productCode")
     public String getProductCode() {
          return this.productCode;
     }

    /**
     * Sets are displayed under their corresponding item.
     * @param value are displayed under their corresponding item.
     */
     public void setDiscounts(Collection<TransactionDisplayDiscount> value) {
          this.discounts = value;
     }

    /**
     * Gets are displayed under their corresponding item.
     * @return are displayed under their corresponding item.
     */
     @JsonProperty("discounts")
     public Collection<TransactionDisplayDiscount> getDiscounts() {
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
