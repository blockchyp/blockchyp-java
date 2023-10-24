/**
 * Copyright 2019-2023 BlockChyp, Inc. All rights reserved. Use of this code is governed
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
 * 
 */
@SuppressWarnings({"rawtypes", "unchecked"})
public class InvoiceLineItem {

     private String id;

     private String lineType;

     private String productId;

     private int quantity;

     private String description;

     private String explanation;

     private int transactionCount;

     private float volume;

     private String volumeFormatted;

     private float perTransactionFee;

     private String perTransactionFeeFormatted;

     private float transactionPercentage;

     private String transactionPercentageFormatted;

     private float price;

     private String priceFormatted;

     private float priceExtended;

     private String priceExtendedFormatted;

     private Collection<InvoiceLineItem> lineItems;

    /**
     * Sets the line item id.
     * @param value the line item id.
     */
     public void setId(String value) {
          this.id = value;
     }

    /**
     * Gets the line item id.
     * @return the line item id.
     */
     @JsonProperty("id")
     public String getId() {
          return this.id;
     }

    /**
     * Sets the type of line item.
     * @param value the type of line item.
     */
     public void setLineType(String value) {
          this.lineType = value;
     }

    /**
     * Gets the type of line item.
     * @return the type of line item.
     */
     @JsonProperty("lineType")
     public String getLineType() {
          return this.lineType;
     }

    /**
     * Sets the product id for standard invoices.
     * @param value the product id for standard invoices.
     */
     public void setProductId(String value) {
          this.productId = value;
     }

    /**
     * Gets the product id for standard invoices.
     * @return the product id for standard invoices.
     */
     @JsonProperty("productId")
     public String getProductId() {
          return this.productId;
     }

    /**
     * Sets the quantity associated with the line item.
     * @param value the quantity associated with the line item.
     */
     public void setQuantity(int value) {
          this.quantity = value;
     }

    /**
     * Gets the quantity associated with the line item.
     * @return the quantity associated with the line item.
     */
     @JsonProperty("quantity")
     public int getQuantity() {
          return this.quantity;
     }

    /**
     * Sets the description associated with the line item.
     * @param value the description associated with the line item.
     */
     public void setDescription(String value) {
          this.description = value;
     }

    /**
     * Gets the description associated with the line item.
     * @return the description associated with the line item.
     */
     @JsonProperty("description")
     public String getDescription() {
          return this.description;
     }

    /**
     * Sets an alternate explanation.
     * @param value an alternate explanation.
     */
     public void setExplanation(String value) {
          this.explanation = value;
     }

    /**
     * Gets an alternate explanation.
     * @return an alternate explanation.
     */
     @JsonProperty("explanation")
     public String getExplanation() {
          return this.explanation;
     }

    /**
     * Sets the transaction count associated with any transaction based fees.
     * @param value the transaction count associated with any transaction based fees.
     */
     public void setTransactionCount(int value) {
          this.transactionCount = value;
     }

    /**
     * Gets the transaction count associated with any transaction based fees.
     * @return the transaction count associated with any transaction based fees.
     */
     @JsonProperty("transactionCount")
     public int getTransactionCount() {
          return this.transactionCount;
     }

    /**
     * Sets the transaction volume associated with any fees.
     * @param value the transaction volume associated with any fees.
     */
     public void setVolume(float value) {
          this.volume = value;
     }

    /**
     * Gets the transaction volume associated with any fees.
     * @return the transaction volume associated with any fees.
     */
     @JsonProperty("volume")
     public float getVolume() {
          return this.volume;
     }

    /**
     * Sets the string formatted volume.
     * @param value the string formatted volume.
     */
     public void setVolumeFormatted(String value) {
          this.volumeFormatted = value;
     }

    /**
     * Gets the string formatted volume.
     * @return the string formatted volume.
     */
     @JsonProperty("volumeFormatted")
     public String getVolumeFormatted() {
          return this.volumeFormatted;
     }

    /**
     * Sets the per transaction fee.
     * @param value the per transaction fee.
     */
     public void setPerTransactionFee(float value) {
          this.perTransactionFee = value;
     }

    /**
     * Gets the per transaction fee.
     * @return the per transaction fee.
     */
     @JsonProperty("perTransactionFee")
     public float getPerTransactionFee() {
          return this.perTransactionFee;
     }

    /**
     * Sets the string formatted per transaction fee.
     * @param value the string formatted per transaction fee.
     */
     public void setPerTransactionFeeFormatted(String value) {
          this.perTransactionFeeFormatted = value;
     }

    /**
     * Gets the string formatted per transaction fee.
     * @return the string formatted per transaction fee.
     */
     @JsonProperty("perTransactionFeeFormatted")
     public String getPerTransactionFeeFormatted() {
          return this.perTransactionFeeFormatted;
     }

    /**
     * Sets the percentage (as floating point ratio) fee assessed on volume.
     * @param value the percentage (as floating point ratio) fee assessed on volume.
     */
     public void setTransactionPercentage(float value) {
          this.transactionPercentage = value;
     }

    /**
     * Gets the percentage (as floating point ratio) fee assessed on volume.
     * @return the percentage (as floating point ratio) fee assessed on volume.
     */
     @JsonProperty("transactionPercentage")
     public float getTransactionPercentage() {
          return this.transactionPercentage;
     }

    /**
     * Sets the string formatted transaction fee percentage.
     * @param value the string formatted transaction fee percentage.
     */
     public void setTransactionPercentageFormatted(String value) {
          this.transactionPercentageFormatted = value;
     }

    /**
     * Gets the string formatted transaction fee percentage.
     * @return the string formatted transaction fee percentage.
     */
     @JsonProperty("transactionPercentageFormatted")
     public String getTransactionPercentageFormatted() {
          return this.transactionPercentageFormatted;
     }

    /**
     * Sets the quantity price associated.
     * @param value the quantity price associated.
     */
     public void setPrice(float value) {
          this.price = value;
     }

    /**
     * Gets the quantity price associated.
     * @return the quantity price associated.
     */
     @JsonProperty("price")
     public float getPrice() {
          return this.price;
     }

    /**
     * Sets the string formatted price associated with a conventional line item.
     * @param value the string formatted price associated with a conventional line item.
     */
     public void setPriceFormatted(String value) {
          this.priceFormatted = value;
     }

    /**
     * Gets the string formatted price associated with a conventional line item.
     * @return the string formatted price associated with a conventional line item.
     */
     @JsonProperty("priceFormatted")
     public String getPriceFormatted() {
          return this.priceFormatted;
     }

    /**
     * Sets the extended price .
     * @param value the extended price .
     */
     public void setPriceExtended(float value) {
          this.priceExtended = value;
     }

    /**
     * Gets the extended price .
     * @return the extended price .
     */
     @JsonProperty("priceExtended")
     public float getPriceExtended() {
          return this.priceExtended;
     }

    /**
     * Sets the string formatted extended price.
     * @param value the string formatted extended price.
     */
     public void setPriceExtendedFormatted(String value) {
          this.priceExtendedFormatted = value;
     }

    /**
     * Gets the string formatted extended price.
     * @return the string formatted extended price.
     */
     @JsonProperty("priceExtendedFormatted")
     public String getPriceExtendedFormatted() {
          return this.priceExtendedFormatted;
     }

    /**
     * Sets
     * @param value
     */
     public void setLineItems(Collection<InvoiceLineItem> value) {
          this.lineItems = value;
     }

    /**
     * Gets
     * @return
     */
     @JsonProperty("lineItems")
     public Collection<InvoiceLineItem> getLineItems() {
          return this.lineItems;
     }

    /**
     * Adds a
     * @param value
     */
     public void addLineItem(InvoiceLineItem value) {
          if (this.lineItems == null) {
               this.lineItems = new ArrayList();
          }
          this.lineItems.add(value);
     }

}
