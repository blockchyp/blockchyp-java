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
 * Models settings related to state checks for a merchant.
 */
@SuppressWarnings({"rawtypes", "unchecked"})
public class StateCheckSettings {

     private boolean enabled;

     private Collection<String> surchargeExemptStates;

    /**
     * Sets if state checks are enabled for the merchant.
     * @param value if state checks are enabled for the merchant.
     */
     public void setEnabled(boolean value) {
          this.enabled = value;
     }

    /**
     * Gets if state checks are enabled for the merchant.
     * @return if state checks are enabled for the merchant.
     */
     @JsonProperty("enabled")
     public boolean isEnabled() {
          return this.enabled;
     }

    /**
     * Sets the list of states that are exempt from surcharges.
     * @param value the list of states that are exempt from surcharges.
     */
     public void setSurchargeExemptStates(Collection<String> value) {
          this.surchargeExemptStates = value;
     }

    /**
     * Gets the list of states that are exempt from surcharges.
     * @return the list of states that are exempt from surcharges.
     */
     @JsonProperty("surchargeExemptStates")
     public Collection<String> getSurchargeExemptStates() {
          return this.surchargeExemptStates;
     }

    /**
     * Adds a the list of states that are exempt from surcharges.
     * @param value the list of states that are exempt from surcharges.
     */
     public void addSurchargeExemptState(String value) {
          if (this.surchargeExemptStates == null) {
               this.surchargeExemptStates = new ArrayList();
          }
          this.surchargeExemptStates.add(value);
     }

}
