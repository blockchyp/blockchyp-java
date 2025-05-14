/**
 * Copyright 2019-2025 BlockChyp, Inc. All rights reserved. Use of this code is governed
 * by a license that can be found in the LICENSE file.
 *
 * This file was generated automatically by the BlockChyp SDK Generator. Changes to this
 * file will be lost every time the code is regenerated.
 */

package com.blockchyp.client.dto;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.Collection;

/**
 * The items to display on a terminal.
 */
@SuppressWarnings({"rawtypes", "unchecked"})
public class TransactionDisplayTransaction {

     private String subtotal;

     private String tax;

     private String total;

     private Collection<TransactionDisplayItem> items;

    /**
     * Sets the subtotal to display.
     * @param value the subtotal to display.
     */
     public void setSubtotal(String value) {
          this.subtotal = value;
     }

    /**
     * Gets the subtotal to display.
     * @return the subtotal to display.
     */
     @SerializedName("subtotal")
     public String getSubtotal() {
          return this.subtotal;
     }

    /**
     * Sets the tax to display.
     * @param value the tax to display.
     */
     public void setTax(String value) {
          this.tax = value;
     }

    /**
     * Gets the tax to display.
     * @return the tax to display.
     */
     @SerializedName("tax")
     public String getTax() {
          return this.tax;
     }

    /**
     * Sets the total to display.
     * @param value the total to display.
     */
     public void setTotal(String value) {
          this.total = value;
     }

    /**
     * Gets the total to display.
     * @return the total to display.
     */
     @SerializedName("total")
     public String getTotal() {
          return this.total;
     }

    /**
     * Sets an item to display.
     * @param value an item to display. Can be overwritten or appended, based on the
     * request type.
     */
     public void setItems(Collection<TransactionDisplayItem> value) {
          this.items = value;
     }

    /**
     * Gets an item to display.
     * @return an item to display. Can be overwritten or appended, based on the request
     * type.
     */
     @SerializedName("items")
     public Collection<TransactionDisplayItem> getItems() {
          return this.items;
     }

    /**
     * Adds a an item to display.
     * @param value an item to display. Can be overwritten or appended, based on the
     * request type.
     */
     public void addItem(TransactionDisplayItem value) {
          if (this.items == null) {
               this.items = new ArrayList();
          }
          this.items.add(value);
     }

}
