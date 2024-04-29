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
 * Models a physical address.
 */
public class Address {

     private String address1;

     private String address2;

     private String city;

     private String stateOrProvince;

     private String postalCode;

     private String countryCode;

     private float latitude;

     private float longitude;

    /**
     * Sets the first line of the street address.
     * @param value the first line of the street address.
     */
     public void setAddress1(String value) {
          this.address1 = value;
     }

    /**
     * Gets the first line of the street address.
     * @return the first line of the street address.
     */
     @JsonProperty("address1")
     public String getAddress1() {
          return this.address1;
     }

    /**
     * Sets the second line of the street address.
     * @param value the second line of the street address.
     */
     public void setAddress2(String value) {
          this.address2 = value;
     }

    /**
     * Gets the second line of the street address.
     * @return the second line of the street address.
     */
     @JsonProperty("address2")
     public String getAddress2() {
          return this.address2;
     }

    /**
     * Sets the city associated with the street address.
     * @param value the city associated with the street address.
     */
     public void setCity(String value) {
          this.city = value;
     }

    /**
     * Gets the city associated with the street address.
     * @return the city associated with the street address.
     */
     @JsonProperty("city")
     public String getCity() {
          return this.city;
     }

    /**
     * Sets the state or province associated with the street address.
     * @param value the state or province associated with the street address.
     */
     public void setStateOrProvince(String value) {
          this.stateOrProvince = value;
     }

    /**
     * Gets the state or province associated with the street address.
     * @return the state or province associated with the street address.
     */
     @JsonProperty("stateOrProvince")
     public String getStateOrProvince() {
          return this.stateOrProvince;
     }

    /**
     * Sets the postal code associated with the street address.
     * @param value the postal code associated with the street address.
     */
     public void setPostalCode(String value) {
          this.postalCode = value;
     }

    /**
     * Gets the postal code associated with the street address.
     * @return the postal code associated with the street address.
     */
     @JsonProperty("postalCode")
     public String getPostalCode() {
          return this.postalCode;
     }

    /**
     * Sets the ISO country code associated with the street address.
     * @param value the ISO country code associated with the street address.
     */
     public void setCountryCode(String value) {
          this.countryCode = value;
     }

    /**
     * Gets the ISO country code associated with the street address.
     * @return the ISO country code associated with the street address.
     */
     @JsonProperty("countryCode")
     public String getCountryCode() {
          return this.countryCode;
     }

    /**
     * Sets the latitude component of the address's GPS coordinates.
     * @param value the latitude component of the address's GPS coordinates.
     */
     public void setLatitude(float value) {
          this.latitude = value;
     }

    /**
     * Gets the latitude component of the address's GPS coordinates.
     * @return the latitude component of the address's GPS coordinates.
     */
     @JsonProperty("latitude")
     public float getLatitude() {
          return this.latitude;
     }

    /**
     * Sets the longitude component of the address's GPS coordinates.
     * @param value the longitude component of the address's GPS coordinates.
     */
     public void setLongitude(float value) {
          this.longitude = value;
     }

    /**
     * Gets the longitude component of the address's GPS coordinates.
     * @return the longitude component of the address's GPS coordinates.
     */
     @JsonProperty("longitude")
     public float getLongitude() {
          return this.longitude;
     }

}
