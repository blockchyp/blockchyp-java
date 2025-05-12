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
 * Models a bank account associated with an application.
 */
public class ApplicationAccount {

     private String name;

     private String bank;

     private String accountHolderName;

     private String routingNumber;

     private String accountNumber;

    /**
     * Sets the name of the bank account.
     * @param value the name of the bank account.
     */
     public void setName(String value) {
          this.name = value;
     }

    /**
     * Gets the name of the bank account.
     * @return the name of the bank account.
     */
     @SerializedName("name")
     public String getName() {
          return this.name;
     }

    /**
     * Sets the name of the bank.
     * @param value the name of the bank.
     */
     public void setBank(String value) {
          this.bank = value;
     }

    /**
     * Gets the name of the bank.
     * @return the name of the bank.
     */
     @SerializedName("bank")
     public String getBank() {
          return this.bank;
     }

    /**
     * Sets the name of the account holder.
     * @param value the name of the account holder.
     */
     public void setAccountHolderName(String value) {
          this.accountHolderName = value;
     }

    /**
     * Gets the name of the account holder.
     * @return the name of the account holder.
     */
     @SerializedName("accountHolderName")
     public String getAccountHolderName() {
          return this.accountHolderName;
     }

    /**
     * Sets the routing number of the bank.
     * @param value the routing number of the bank.
     */
     public void setRoutingNumber(String value) {
          this.routingNumber = value;
     }

    /**
     * Gets the routing number of the bank.
     * @return the routing number of the bank.
     */
     @SerializedName("routingNumber")
     public String getRoutingNumber() {
          return this.routingNumber;
     }

    /**
     * Sets the account number.
     * @param value the account number.
     */
     public void setAccountNumber(String value) {
          this.accountNumber = value;
     }

    /**
     * Gets the account number.
     * @return the account number.
     */
     @SerializedName("accountNumber")
     public String getAccountNumber() {
          return this.accountNumber;
     }

}
