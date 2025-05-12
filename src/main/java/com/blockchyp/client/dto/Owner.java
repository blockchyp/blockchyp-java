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
 * Models an individual with 25% or more ownership interest in a company.
 */
public class Owner {

     private String firstName;

     private String lastName;

     private String jobTitle;

     private String taxIdNumber;

     private String phoneNumber;

     private String dob;

     private String ownership;

     private Address address;

     private String email;

     private String singleLineAddress;

     private String entityType;

     private String dlNumber;

     private String dlStateOrProvince;

     private String dlExpiration;

    /**
     * Sets the first name of the owner.
     * @param value the first name of the owner.
     */
     public void setFirstName(String value) {
          this.firstName = value;
     }

    /**
     * Gets the first name of the owner.
     * @return the first name of the owner.
     */
     @SerializedName("firstName")
     public String getFirstName() {
          return this.firstName;
     }

    /**
     * Sets the last name of the owner.
     * @param value the last name of the owner.
     */
     public void setLastName(String value) {
          this.lastName = value;
     }

    /**
     * Gets the last name of the owner.
     * @return the last name of the owner.
     */
     @SerializedName("lastName")
     public String getLastName() {
          return this.lastName;
     }

    /**
     * Sets the job title of the owner.
     * @param value the job title of the owner.
     */
     public void setJobTitle(String value) {
          this.jobTitle = value;
     }

    /**
     * Gets the job title of the owner.
     * @return the job title of the owner.
     */
     @SerializedName("jobTitle")
     public String getJobTitle() {
          return this.jobTitle;
     }

    /**
     * Sets the tax identification number (SSN) of the owner.
     * @param value the tax identification number (SSN) of the owner.
     */
     public void setTaxIdNumber(String value) {
          this.taxIdNumber = value;
     }

    /**
     * Gets the tax identification number (SSN) of the owner.
     * @return the tax identification number (SSN) of the owner.
     */
     @SerializedName("taxIdNumber")
     public String getTaxIdNumber() {
          return this.taxIdNumber;
     }

    /**
     * Sets the phone number of the owner.
     * @param value the phone number of the owner.
     */
     public void setPhoneNumber(String value) {
          this.phoneNumber = value;
     }

    /**
     * Gets the phone number of the owner.
     * @return the phone number of the owner.
     */
     @SerializedName("phoneNumber")
     public String getPhoneNumber() {
          return this.phoneNumber;
     }

    /**
     * Sets the date of birth of the owner in mm/dd/yyyy format.
     * @param value the date of birth of the owner in mm/dd/yyyy format.
     */
     public void setDob(String value) {
          this.dob = value;
     }

    /**
     * Gets the date of birth of the owner in mm/dd/yyyy format.
     * @return the date of birth of the owner in mm/dd/yyyy format.
     */
     @SerializedName("dob")
     public String getDob() {
          return this.dob;
     }

    /**
     * Sets the percentage of ownership.
     * @param value the percentage of ownership.
     */
     public void setOwnership(String value) {
          this.ownership = value;
     }

    /**
     * Gets the percentage of ownership.
     * @return the percentage of ownership.
     */
     @SerializedName("ownership")
     public String getOwnership() {
          return this.ownership;
     }

    /**
     * Sets the address of the owner.
     * @param value the address of the owner.
     */
     public void setAddress(Address value) {
          this.address = value;
     }

    /**
     * Gets the address of the owner.
     * @return the address of the owner.
     */
     @SerializedName("address")
     public Address getAddress() {
          return this.address;
     }

    /**
     * Sets the email address of the owner.
     * @param value the email address of the owner.
     */
     public void setEmail(String value) {
          this.email = value;
     }

    /**
     * Gets the email address of the owner.
     * @return the email address of the owner.
     */
     @SerializedName("email")
     public String getEmail() {
          return this.email;
     }

    /**
     * Sets A single line representation of the owner's address.
     * @param value A single line representation of the owner's address.
     */
     public void setSingleLineAddress(String value) {
          this.singleLineAddress = value;
     }

    /**
     * Gets A single line representation of the owner's address.
     * @return A single line representation of the owner's address.
     */
     @SerializedName("singleLineAddress")
     public String getSingleLineAddress() {
          return this.singleLineAddress;
     }

    /**
     * Sets the type of entity this owner represents.
     * @param value the type of entity this owner represents.
     */
     public void setEntityType(String value) {
          this.entityType = value;
     }

    /**
     * Gets the type of entity this owner represents.
     * @return the type of entity this owner represents.
     */
     @SerializedName("entityType")
     public String getEntityType() {
          return this.entityType;
     }

    /**
     * Sets the driver's license number of the owner.
     * @param value the driver's license number of the owner.
     */
     public void setDlNumber(String value) {
          this.dlNumber = value;
     }

    /**
     * Gets the driver's license number of the owner.
     * @return the driver's license number of the owner.
     */
     @SerializedName("dlNumber")
     public String getDlNumber() {
          return this.dlNumber;
     }

    /**
     * Sets the state that issued the owner's driver's license.
     * @param value the state that issued the owner's driver's license.
     */
     public void setDlStateOrProvince(String value) {
          this.dlStateOrProvince = value;
     }

    /**
     * Gets the state that issued the owner's driver's license.
     * @return the state that issued the owner's driver's license.
     */
     @SerializedName("dlStateOrProvince")
     public String getDlStateOrProvince() {
          return this.dlStateOrProvince;
     }

    /**
     * Sets the expiration date of the owner's driver's license.
     * @param value the expiration date of the owner's driver's license.
     */
     public void setDlExpiration(String value) {
          this.dlExpiration = value;
     }

    /**
     * Gets the expiration date of the owner's driver's license.
     * @return the expiration date of the owner's driver's license.
     */
     @SerializedName("dlExpiration")
     public String getDlExpiration() {
          return this.dlExpiration;
     }

}
