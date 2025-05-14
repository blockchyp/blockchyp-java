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
 * A group of fields for a specific type of healthcare.
 */
public class HealthcareGroup {

     private HealthcareType type;

     private String amount;

     private String providerId;

     private String serviceTypeCode;

     private String payerOrCarrierId;

     private String approvalRejectReasonCode;

    /**
     * Sets the type of healthcare cost.
     * @param value the type of healthcare cost.
     */
     public void setType(HealthcareType value) {
          this.type = value;
     }

    /**
     * Gets the type of healthcare cost.
     * @return the type of healthcare cost.
     */
     @SerializedName("type")
     public HealthcareType getType() {
          return this.type;
     }

    /**
     * Sets the amount of this type.
     * @param value the amount of this type.
     */
     public void setAmount(String value) {
          this.amount = value;
     }

    /**
     * Gets the amount of this type.
     * @return the amount of this type.
     */
     @SerializedName("amount")
     public String getAmount() {
          return this.amount;
     }

    /**
     * Sets the provider ID used for Mastercard and Discover IIAS requests.
     * @param value the provider ID used for Mastercard and Discover IIAS requests.
     */
     public void setProviderId(String value) {
          this.providerId = value;
     }

    /**
     * Gets the provider ID used for Mastercard and Discover IIAS requests.
     * @return the provider ID used for Mastercard and Discover IIAS requests.
     */
     @SerializedName("providerId")
     public String getProviderId() {
          return this.providerId;
     }

    /**
     * Sets the service type code used for Mastercard and Discover IIAS requests.
     * @param value the service type code used for Mastercard and Discover IIAS requests.
     */
     public void setServiceTypeCode(String value) {
          this.serviceTypeCode = value;
     }

    /**
     * Gets the service type code used for Mastercard and Discover IIAS requests.
     * @return the service type code used for Mastercard and Discover IIAS requests.
     */
     @SerializedName("serviceTypeCode")
     public String getServiceTypeCode() {
          return this.serviceTypeCode;
     }

    /**
     * Sets thr payer ID/carrier ID used for Mastercard and Discover IIAS requests.
     * @param value thr payer ID/carrier ID used for Mastercard and Discover IIAS
     * requests.
     */
     public void setPayerOrCarrierId(String value) {
          this.payerOrCarrierId = value;
     }

    /**
     * Gets thr payer ID/carrier ID used for Mastercard and Discover IIAS requests.
     * @return thr payer ID/carrier ID used for Mastercard and Discover IIAS requests.
     */
     @SerializedName("payerOrCarrierId")
     public String getPayerOrCarrierId() {
          return this.payerOrCarrierId;
     }

    /**
     * Sets the approval or reject reason code used for Mastercard and Discover IIAS
     * requests.
     * @param value the approval or reject reason code used for Mastercard and Discover
     * IIAS requests.
     */
     public void setApprovalRejectReasonCode(String value) {
          this.approvalRejectReasonCode = value;
     }

    /**
     * Gets the approval or reject reason code used for Mastercard and Discover IIAS
     * requests.
     * @return the approval or reject reason code used for Mastercard and Discover IIAS
     * requests.
     */
     @SerializedName("approvalRejectReasonCode")
     public String getApprovalRejectReasonCode() {
          return this.approvalRejectReasonCode;
     }

}
