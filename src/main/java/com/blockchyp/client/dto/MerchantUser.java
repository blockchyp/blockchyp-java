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
 * Details about a merchant user.
 */
@SuppressWarnings({"rawtypes", "unchecked"})
public class MerchantUser {

     private boolean test;

     private String id;

     private String firstName;

     private String lastName;

     private String email;

     private String status;

     private String type;

     private Collection<String> roles;

     private boolean locked;

    /**
     * Sets whether or not these results are for test or live merchants.
     * @param value whether or not these results are for test or live merchants.
     */
     public void setTest(boolean value) {
          this.test = value;
     }

    /**
     * Gets whether or not these results are for test or live merchants.
     * @return whether or not these results are for test or live merchants.
     */
     @SerializedName("test")
     public boolean isTest() {
          return this.test;
     }

    /**
     * Sets the user's primary key.
     * @param value the user's primary key.
     */
     public void setId(String value) {
          this.id = value;
     }

    /**
     * Gets the user's primary key.
     * @return the user's primary key.
     */
     @SerializedName("id")
     public String getId() {
          return this.id;
     }

    /**
     * Sets the user's first name.
     * @param value the user's first name.
     */
     public void setFirstName(String value) {
          this.firstName = value;
     }

    /**
     * Gets the user's first name.
     * @return the user's first name.
     */
     @SerializedName("firstName")
     public String getFirstName() {
          return this.firstName;
     }

    /**
     * Sets the user's last name.
     * @param value the user's last name.
     */
     public void setLastName(String value) {
          this.lastName = value;
     }

    /**
     * Gets the user's last name.
     * @return the user's last name.
     */
     @SerializedName("lastName")
     public String getLastName() {
          return this.lastName;
     }

    /**
     * Sets the user's email address.
     * @param value the user's email address.
     */
     public void setEmail(String value) {
          this.email = value;
     }

    /**
     * Gets the user's email address.
     * @return the user's email address.
     */
     @SerializedName("email")
     public String getEmail() {
          return this.email;
     }

    /**
     * Sets the user account status.
     * @param value the user account status.
     */
     public void setStatus(String value) {
          this.status = value;
     }

    /**
     * Gets the user account status.
     * @return the user account status.
     */
     @SerializedName("status")
     public String getStatus() {
          return this.status;
     }

    /**
     * Sets the type of user account.
     * @param value the type of user account.
     */
     public void setType(String value) {
          this.type = value;
     }

    /**
     * Gets the type of user account.
     * @return the type of user account.
     */
     @SerializedName("type")
     public String getType() {
          return this.type;
     }

    /**
     * Sets the role codes assigned to this user.
     * @param value the role codes assigned to this user.
     */
     public void setRoles(Collection<String> value) {
          this.roles = value;
     }

    /**
     * Gets the role codes assigned to this user.
     * @return the role codes assigned to this user.
     */
     @SerializedName("roles")
     public Collection<String> getRoles() {
          return this.roles;
     }

    /**
     * Sets whether or not this user account is locked.
     * @param value whether or not this user account is locked.
     */
     public void setLocked(boolean value) {
          this.locked = value;
     }

    /**
     * Gets whether or not this user account is locked.
     * @return whether or not this user account is locked.
     */
     @SerializedName("locked")
     public boolean isLocked() {
          return this.locked;
     }

    /**
     * Adds a the role codes assigned to this user.
     * @param value the role codes assigned to this user.
     */
     public void addRole(String value) {
          if (this.roles == null) {
               this.roles = new ArrayList();
          }
          this.roles.add(value);
     }

}
