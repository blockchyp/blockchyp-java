/**
 * Copyright 2019-2024 BlockChyp, Inc. All rights reserved. Use of this code is governed
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
 * Fields for HSA/FSA transactions.
 */
@SuppressWarnings({"rawtypes", "unchecked"})
public class Healthcare {

     private Collection<HealthcareGroup> types;

     private boolean iiasVerified;

     private boolean iiasExempt;

    /**
     * Sets a list of healthcare categories in the transaction.
     * @param value a list of healthcare categories in the transaction.
     */
     public void setTypes(Collection<HealthcareGroup> value) {
          this.types = value;
     }

    /**
     * Gets a list of healthcare categories in the transaction.
     * @return a list of healthcare categories in the transaction.
     */
     @SerializedName("types")
     public Collection<HealthcareGroup> getTypes() {
          return this.types;
     }

    /**
     * Sets that the purchased items were verified against an Inventory Information
     * Approval System (IIAS).
     * @param value that the purchased items were verified against an Inventory
     * Information Approval System (IIAS).
     */
     public void setIiasVerified(boolean value) {
          this.iiasVerified = value;
     }

    /**
     * Gets that the purchased items were verified against an Inventory Information
     * Approval System (IIAS).
     * @return that the purchased items were verified against an Inventory Information
     * Approval System (IIAS).
     */
     @SerializedName("iiasVerified")
     public boolean isIiasVerified() {
          return this.iiasVerified;
     }

    /**
     * Sets that the transaction is exempt from IIAS verification.
     * @param value that the transaction is exempt from IIAS verification.
     */
     public void setIiasExempt(boolean value) {
          this.iiasExempt = value;
     }

    /**
     * Gets that the transaction is exempt from IIAS verification.
     * @return that the transaction is exempt from IIAS verification.
     */
     @SerializedName("iiasExempt")
     public boolean isIiasExempt() {
          return this.iiasExempt;
     }

    /**
     * Adds a a list of healthcare categories in the transaction.
     * @param value a list of healthcare categories in the transaction.
     */
     public void addType(HealthcareGroup value) {
          if (this.types == null) {
               this.types = new ArrayList();
          }
          this.types.add(value);
     }

}
