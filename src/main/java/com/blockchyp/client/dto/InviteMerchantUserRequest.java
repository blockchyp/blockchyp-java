/**
 * Copyright 2019 BlockChyp, Inc. All rights reserved. Use of this code is governed by a
 * license that can be found in the LICENSE file.
 *
 * This file was generated automatically. Changes to this file will be lost every time the
 * code is regenerated.
 */

package com.blockchyp.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Models a request for adding a new user to a merchant account.
 */
@SuppressWarnings({"rawtypes", "unchecked"})
public class InviteMerchantUserRequest implements ICoreRequest {

     private String transactionRef;

     private boolean async;

     private boolean queue;

     private boolean waitForRemovedCard;

     private boolean force;

     private String orderRef;

     private String destinationAccount;

     private boolean test;

     private int timeout;

     private String merchantId;

     private String email;

     private String firstName;

     private String lastName;

     private Collection<String> roles;

    /**
     * Sets a user-assigned reference that can be used to recall or reverse transactions.
     * @param value a user-assigned reference that can be used to recall or reverse
     * transactions.
     */
     public void setTransactionRef(String value) {
          this.transactionRef = value;
     }

    /**
     * Gets a user-assigned reference that can be used to recall or reverse transactions.
     * @return a user-assigned reference that can be used to recall or reverse
     * transactions.
     */
     @JsonProperty("transactionRef")
     public String getTransactionRef() {
          return this.transactionRef;
     }

    /**
     * Sets defers the response to the transaction and returns immediately.
     * @param value defers the response to the transaction and returns immediately.
     * Callers should retrive the transaction result using the Transaction Status API.
     */
     public void setAsync(boolean value) {
          this.async = value;
     }

    /**
     * Gets defers the response to the transaction and returns immediately.
     * @return defers the response to the transaction and returns immediately. Callers
     * should retrive the transaction result using the Transaction Status API.
     */
     @JsonProperty("async")
     public boolean isAsync() {
          return this.async;
     }

    /**
     * Sets adds the transaction to the queue and returns immediately.
     * @param value adds the transaction to the queue and returns immediately. Callers
     * should retrive the transaction result using the Transaction Status API.
     */
     public void setQueue(boolean value) {
          this.queue = value;
     }

    /**
     * Gets adds the transaction to the queue and returns immediately.
     * @return adds the transaction to the queue and returns immediately. Callers should
     * retrive the transaction result using the Transaction Status API.
     */
     @JsonProperty("queue")
     public boolean isQueue() {
          return this.queue;
     }

    /**
     * Sets whether or not the request should block until all cards have been removed from
     * the card reader.
     * @param value whether or not the request should block until all cards have been
     * removed from the card reader.
     */
     public void setWaitForRemovedCard(boolean value) {
          this.waitForRemovedCard = value;
     }

    /**
     * Gets whether or not the request should block until all cards have been removed from
     * the card reader.
     * @return whether or not the request should block until all cards have been removed
     * from the card reader.
     */
     @JsonProperty("waitForRemovedCard")
     public boolean isWaitForRemovedCard() {
          return this.waitForRemovedCard;
     }

    /**
     * Sets override any in-progress transactions.
     * @param value override any in-progress transactions.
     */
     public void setForce(boolean value) {
          this.force = value;
     }

    /**
     * Gets override any in-progress transactions.
     * @return override any in-progress transactions.
     */
     @JsonProperty("force")
     public boolean isForce() {
          return this.force;
     }

    /**
     * Sets an identifier from an external point of sale system.
     * @param value an identifier from an external point of sale system.
     */
     public void setOrderRef(String value) {
          this.orderRef = value;
     }

    /**
     * Gets an identifier from an external point of sale system.
     * @return an identifier from an external point of sale system.
     */
     @JsonProperty("orderRef")
     public String getOrderRef() {
          return this.orderRef;
     }

    /**
     * Sets the settlement account for merchants with split settlements.
     * @param value the settlement account for merchants with split settlements.
     */
     public void setDestinationAccount(String value) {
          this.destinationAccount = value;
     }

    /**
     * Gets the settlement account for merchants with split settlements.
     * @return the settlement account for merchants with split settlements.
     */
     @JsonProperty("destinationAccount")
     public String getDestinationAccount() {
          return this.destinationAccount;
     }

    /**
     * Sets whether or not to route transaction to the test gateway.
     * @param value whether or not to route transaction to the test gateway.
     */
     public void setTest(boolean value) {
          this.test = value;
     }

    /**
     * Gets whether or not to route transaction to the test gateway.
     * @return whether or not to route transaction to the test gateway.
     */
     @JsonProperty("test")
     public boolean isTest() {
          return this.test;
     }

    /**
     * Sets the request timeout in seconds.
     * @param value the request timeout in seconds.
     */
     public void setTimeout(int value) {
          this.timeout = value;
     }

    /**
     * Gets the request timeout in seconds.
     * @return the request timeout in seconds.
     */
     @JsonProperty("timeout")
     public int getTimeout() {
          return this.timeout;
     }

    /**
     * Sets the merchant id.
     * @param value the merchant id. Optional for merchant scoped requests.
     */
     public void setMerchantId(String value) {
          this.merchantId = value;
     }

    /**
     * Gets the merchant id.
     * @return the merchant id. Optional for merchant scoped requests.
     */
     @JsonProperty("merchantId")
     public String getMerchantId() {
          return this.merchantId;
     }

    /**
     * Sets the email address of the user.
     * @param value the email address of the user.
     */
     public void setEmail(String value) {
          this.email = value;
     }

    /**
     * Gets the email address of the user.
     * @return the email address of the user.
     */
     @JsonProperty("email")
     public String getEmail() {
          return this.email;
     }

    /**
     * Sets the first name of the new user
     * @param value the first name of the new user
     */
     public void setFirstName(String value) {
          this.firstName = value;
     }

    /**
     * Gets the first name of the new user
     * @return the first name of the new user
     */
     @JsonProperty("firstName")
     public String getFirstName() {
          return this.firstName;
     }

    /**
     * Sets the last name of the new user
     * @param value the last name of the new user
     */
     public void setLastName(String value) {
          this.lastName = value;
     }

    /**
     * Gets the last name of the new user
     * @return the last name of the new user
     */
     @JsonProperty("lastName")
     public String getLastName() {
          return this.lastName;
     }

    /**
     * Sets an optional array of role codes that will be assigned to the user.
     * @param value an optional array of role codes that will be assigned to the user. If
     * omitted defaults to the default merchant role.
     */
     public void setRoles(Collection<String> value) {
          this.roles = value;
     }

    /**
     * Gets an optional array of role codes that will be assigned to the user.
     * @return an optional array of role codes that will be assigned to the user. If omitted
     * defaults to the default merchant role.
     */
     @JsonProperty("roles")
     public Collection<String> getRoles() {
          return this.roles;
     }

    /**
     * Adds a an optional array of role codes that will be assigned to the user.
     * @param value an optional array of role codes that will be assigned to the user. If
     * omitted defaults to the default merchant role.
     */
     public void addRole(String value) {
          if (this.roles == null) {
               this.roles = new ArrayList();
          }
          this.roles.add(value);
     }

}