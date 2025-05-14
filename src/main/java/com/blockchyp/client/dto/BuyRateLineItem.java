/**
 * Copyright 2019-2025 BlockChyp, Inc. All rights reserved. Use of this code is governed
 * by a license that can be found in the LICENSE file.
 *
 * This file was generated automatically by the BlockChyp SDK Generator. Changes to this
 * file will be lost every time the code is regenerated.
 */

package com.blockchyp.client.dto;

import com.google.gson.annotations.SerializedName;


/**
 * Models a single buy rate calculation line item.
 */
public class BuyRateLineItem {

     private String description;

     private float volume;

     private String volumeFormatted;

     private float volumeRate;

     private String volumeRateFormatted;

     private int count;

     private float countRate;

     private String countRateFormatted;

     private String rateSummary;

     private float total;

     private String totalFormatted;

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
     @SerializedName("description")
     public String getDescription() {
          return this.description;
     }

    /**
     * Sets the volume related to this line item.
     * @param value the volume related to this line item.
     */
     public void setVolume(float value) {
          this.volume = value;
     }

    /**
     * Gets the volume related to this line item.
     * @return the volume related to this line item.
     */
     @SerializedName("volume")
     public float getVolume() {
          return this.volume;
     }

    /**
     * Sets the currency formatted volume related to this line item.
     * @param value the currency formatted volume related to this line item.
     */
     public void setVolumeFormatted(String value) {
          this.volumeFormatted = value;
     }

    /**
     * Gets the currency formatted volume related to this line item.
     * @return the currency formatted volume related to this line item.
     */
     @SerializedName("volumeFormatted")
     public String getVolumeFormatted() {
          return this.volumeFormatted;
     }

    /**
     * Sets the rate on volume charged for this line item.
     * @param value the rate on volume charged for this line item.
     */
     public void setVolumeRate(float value) {
          this.volumeRate = value;
     }

    /**
     * Gets the rate on volume charged for this line item.
     * @return the rate on volume charged for this line item.
     */
     @SerializedName("volumeRate")
     public float getVolumeRate() {
          return this.volumeRate;
     }

    /**
     * Sets the string formatted rate on volume charged for this line item.
     * @param value the string formatted rate on volume charged for this line item.
     */
     public void setVolumeRateFormatted(String value) {
          this.volumeRateFormatted = value;
     }

    /**
     * Gets the string formatted rate on volume charged for this line item.
     * @return the string formatted rate on volume charged for this line item.
     */
     @SerializedName("volumeRateFormatted")
     public String getVolumeRateFormatted() {
          return this.volumeRateFormatted;
     }

    /**
     * Sets the count associated with this line item.
     * @param value the count associated with this line item.
     */
     public void setCount(int value) {
          this.count = value;
     }

    /**
     * Gets the count associated with this line item.
     * @return the count associated with this line item.
     */
     @SerializedName("count")
     public int getCount() {
          return this.count;
     }

    /**
     * Sets the rate per item charged for this line item.
     * @param value the rate per item charged for this line item.
     */
     public void setCountRate(float value) {
          this.countRate = value;
     }

    /**
     * Gets the rate per item charged for this line item.
     * @return the rate per item charged for this line item.
     */
     @SerializedName("countRate")
     public float getCountRate() {
          return this.countRate;
     }

    /**
     * Sets the string formatted rate per item charged for this line item.
     * @param value the string formatted rate per item charged for this line item.
     */
     public void setCountRateFormatted(String value) {
          this.countRateFormatted = value;
     }

    /**
     * Gets the string formatted rate per item charged for this line item.
     * @return the string formatted rate per item charged for this line item.
     */
     @SerializedName("countRateFormatted")
     public String getCountRateFormatted() {
          return this.countRateFormatted;
     }

    /**
     * Sets provides a narrative description of the rate.
     * @param value provides a narrative description of the rate.
     */
     public void setRateSummary(String value) {
          this.rateSummary = value;
     }

    /**
     * Gets provides a narrative description of the rate.
     * @return provides a narrative description of the rate.
     */
     @SerializedName("rateSummary")
     public String getRateSummary() {
          return this.rateSummary;
     }

    /**
     * Sets the total amount for the line item.
     * @param value the total amount for the line item.
     */
     public void setTotal(float value) {
          this.total = value;
     }

    /**
     * Gets the total amount for the line item.
     * @return the total amount for the line item.
     */
     @SerializedName("total")
     public float getTotal() {
          return this.total;
     }

    /**
     * Sets the string formatted total for the line item.
     * @param value the string formatted total for the line item.
     */
     public void setTotalFormatted(String value) {
          this.totalFormatted = value;
     }

    /**
     * Gets the string formatted total for the line item.
     * @return the string formatted total for the line item.
     */
     @SerializedName("totalFormatted")
     public String getTotalFormatted() {
          return this.totalFormatted;
     }

}
