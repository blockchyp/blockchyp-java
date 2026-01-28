/**
 * Copyright 2019-2026 BlockChyp, Inc. All rights reserved. Use of this code is governed
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
 * Models low level aggregated and nested data line items.
 */
@SuppressWarnings({"rawtypes", "unchecked"})
public class AggregateBillingLineItem {

     private String id;

     private String description;

     private boolean expandable;

     private boolean negative;

     private float total;

     private String totalFormatted;

     private AggregateBillingLineItemStats perTranFeeRange;

     private AggregateBillingLineItemStats transactionPercentageRange;

     private Collection<AggregateBillingLineItem> detailLines;

    /**
     * Sets the line item identifier.
     * @param value the line item identifier.
     */
     public void setId(String value) {
          this.id = value;
     }

    /**
     * Gets the line item identifier.
     * @return the line item identifier.
     */
     @JsonProperty("id")
     public String getId() {
          return this.id;
     }

    /**
     * Sets provides a basic description of the line item.
     * @param value provides a basic description of the line item.
     */
     public void setDescription(String value) {
          this.description = value;
     }

    /**
     * Gets provides a basic description of the line item.
     * @return provides a basic description of the line item.
     */
     @JsonProperty("description")
     public String getDescription() {
          return this.description;
     }

    /**
     * Sets that a line item has nested information.
     * @param value that a line item has nested information.
     */
     public void setExpandable(boolean value) {
          this.expandable = value;
     }

    /**
     * Gets that a line item has nested information.
     * @return that a line item has nested information.
     */
     @JsonProperty("expandable")
     public boolean isExpandable() {
          return this.expandable;
     }

    /**
     * Sets the total is a negative number.
     * @param value the total is a negative number.
     */
     public void setNegative(boolean value) {
          this.negative = value;
     }

    /**
     * Gets the total is a negative number.
     * @return the total is a negative number.
     */
     @JsonProperty("negative")
     public boolean isNegative() {
          return this.negative;
     }

    /**
     * Sets the total for the line item.
     * @param value the total for the line item.
     */
     public void setTotal(float value) {
          this.total = value;
     }

    /**
     * Gets the total for the line item.
     * @return the total for the line item.
     */
     @JsonProperty("total")
     public float getTotal() {
          return this.total;
     }

    /**
     * Sets the currency formatted total for the line item.
     * @param value the currency formatted total for the line item.
     */
     public void setTotalFormatted(String value) {
          this.totalFormatted = value;
     }

    /**
     * Gets the currency formatted total for the line item.
     * @return the currency formatted total for the line item.
     */
     @JsonProperty("totalFormatted")
     public String getTotalFormatted() {
          return this.totalFormatted;
     }

    /**
     * Sets the range of count based fees charged for the given line item.
     * @param value the range of count based fees charged for the given line item.
     */
     public void setPerTranFeeRange(AggregateBillingLineItemStats value) {
          this.perTranFeeRange = value;
     }

    /**
     * Gets the range of count based fees charged for the given line item.
     * @return the range of count based fees charged for the given line item.
     */
     @JsonProperty("perTranFeeRange")
     public AggregateBillingLineItemStats getPerTranFeeRange() {
          return this.perTranFeeRange;
     }

    /**
     * Sets the range of percentage based fees charged for the given line item.
     * @param value the range of percentage based fees charged for the given line item.
     */
     public void setTransactionPercentageRange(AggregateBillingLineItemStats value) {
          this.transactionPercentageRange = value;
     }

    /**
     * Gets the range of percentage based fees charged for the given line item.
     * @return the range of percentage based fees charged for the given line item.
     */
     @JsonProperty("transactionPercentageRange")
     public AggregateBillingLineItemStats getTransactionPercentageRange() {
          return this.transactionPercentageRange;
     }

    /**
     * Sets encapsulated drill down or detail lines.
     * @param value encapsulated drill down or detail lines.
     */
     public void setDetailLines(Collection<AggregateBillingLineItem> value) {
          this.detailLines = value;
     }

    /**
     * Gets encapsulated drill down or detail lines.
     * @return encapsulated drill down or detail lines.
     */
     @JsonProperty("detailLines")
     public Collection<AggregateBillingLineItem> getDetailLines() {
          return this.detailLines;
     }

    /**
     * Adds a encapsulated drill down or detail lines.
     * @param value encapsulated drill down or detail lines.
     */
     public void addDetailLine(AggregateBillingLineItem value) {
          if (this.detailLines == null) {
               this.detailLines = new ArrayList();
          }
          this.detailLines.add(value);
     }

}
