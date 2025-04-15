/**
 * Copyright 2019-2025 BlockChyp, Inc. All rights reserved. Use of this code is governed
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
 * Models a merchant application submission request to add a new merchant account.
 */
@SuppressWarnings({"rawtypes", "unchecked"})
public class SubmitApplicationRequest implements ITimeoutRequest {

     private int timeout;

     private boolean test;

     private String inviteCode;

     private String dbaName;

     private String corporateName;

     private String webSite;

     private String taxIdNumber;

     private String entityType;

     private String stateOfIncorporation;

     private String merchantType;

     private String businessDescription;

     private String yearsInBusiness;

     private String businessPhoneNumber;

     private Address physicalAddress;

     private Address mailingAddress;

     private String contactFirstName;

     private String contactLastName;

     private String contactPhoneNumber;

     private String contactEmail;

     private String contactTitle;

     private String contactTaxIdNumber;

     private String contactDOB;

     private String contactDlNumber;

     private String contactDlStateOrProvince;

     private String contactDlExpiration;

     private Address contactHomeAddress;

     private String contactRole;

     private Collection<Owner> owners;

     private ApplicationAccount manualAccount;

     private String averageTransaction;

     private String highTransaction;

     private String averageMonth;

     private String highMonth;

     private String refundPolicy;

     private String refundDays;

     private String timeZone;

     private String batchCloseTime;

     private String multipleLocations;

     private String locationName;

     private String storeNumber;

     private String ebtRequested;

     private String fnsNumber;

     private String ecommerce;

     private boolean dropShipping;

     private String cardPresentPercentage;

     private String phoneOrderPercentage;

     private String ecomPercentage;

     private String billBeforeShipmentDays;

     private String subscriptionsSupported;

     private String subscriptionFrequency;

     private String signerName;

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
     * Sets the invite code for the merchant.
     * @param value the invite code for the merchant.
     */
     public void setInviteCode(String value) {
          this.inviteCode = value;
     }

    /**
     * Gets the invite code for the merchant.
     * @return the invite code for the merchant.
     */
     @JsonProperty("inviteCode")
     public String getInviteCode() {
          return this.inviteCode;
     }

    /**
     * Sets the business name your customers know you by (DBA Name).
     * @param value the business name your customers know you by (DBA Name).
     */
     public void setDbaName(String value) {
          this.dbaName = value;
     }

    /**
     * Gets the business name your customers know you by (DBA Name).
     * @return the business name your customers know you by (DBA Name).
     */
     @JsonProperty("dbaName")
     public String getDbaName() {
          return this.dbaName;
     }

    /**
     * Sets the name of the legal entity you file your taxes under.
     * @param value the name of the legal entity you file your taxes under.
     */
     public void setCorporateName(String value) {
          this.corporateName = value;
     }

    /**
     * Gets the name of the legal entity you file your taxes under.
     * @return the name of the legal entity you file your taxes under.
     */
     @JsonProperty("corporateName")
     public String getCorporateName() {
          return this.corporateName;
     }

    /**
     * Sets the business website.
     * @param value the business website.
     */
     public void setWebSite(String value) {
          this.webSite = value;
     }

    /**
     * Gets the business website.
     * @return the business website.
     */
     @JsonProperty("webSite")
     public String getWebSite() {
          return this.webSite;
     }

    /**
     * Sets the business tax identification number (EIN).
     * @param value the business tax identification number (EIN).
     */
     public void setTaxIdNumber(String value) {
          this.taxIdNumber = value;
     }

    /**
     * Gets the business tax identification number (EIN).
     * @return the business tax identification number (EIN).
     */
     @JsonProperty("taxIdNumber")
     public String getTaxIdNumber() {
          return this.taxIdNumber;
     }

    /**
     * Sets the type of business entity.
     * @param value the type of business entity.
     */
     public void setEntityType(String value) {
          this.entityType = value;
     }

    /**
     * Gets the type of business entity.
     * @return the type of business entity.
     */
     @JsonProperty("entityType")
     public String getEntityType() {
          return this.entityType;
     }

    /**
     * Sets the state where the business is incorporated.
     * @param value the state where the business is incorporated.
     */
     public void setStateOfIncorporation(String value) {
          this.stateOfIncorporation = value;
     }

    /**
     * Gets the state where the business is incorporated.
     * @return the state where the business is incorporated.
     */
     @JsonProperty("stateOfIncorporation")
     public String getStateOfIncorporation() {
          return this.stateOfIncorporation;
     }

    /**
     * Sets the primary type of business (e.
     * @param value the primary type of business (e.g., Retail, Service, etc.).
     */
     public void setMerchantType(String value) {
          this.merchantType = value;
     }

    /**
     * Gets the primary type of business (e.
     * @return the primary type of business (e.g., Retail, Service, etc.).
     */
     @JsonProperty("merchantType")
     public String getMerchantType() {
          return this.merchantType;
     }

    /**
     * Sets A short description of the products and services sold.
     * @param value A short description of the products and services sold.
     */
     public void setBusinessDescription(String value) {
          this.businessDescription = value;
     }

    /**
     * Gets A short description of the products and services sold.
     * @return A short description of the products and services sold.
     */
     @JsonProperty("businessDescription")
     public String getBusinessDescription() {
          return this.businessDescription;
     }

    /**
     * Sets the number of years the business has been operating.
     * @param value the number of years the business has been operating.
     */
     public void setYearsInBusiness(String value) {
          this.yearsInBusiness = value;
     }

    /**
     * Gets the number of years the business has been operating.
     * @return the number of years the business has been operating.
     */
     @JsonProperty("yearsInBusiness")
     public String getYearsInBusiness() {
          return this.yearsInBusiness;
     }

    /**
     * Sets the business telephone number.
     * @param value the business telephone number.
     */
     public void setBusinessPhoneNumber(String value) {
          this.businessPhoneNumber = value;
     }

    /**
     * Gets the business telephone number.
     * @return the business telephone number.
     */
     @JsonProperty("businessPhoneNumber")
     public String getBusinessPhoneNumber() {
          return this.businessPhoneNumber;
     }

    /**
     * Sets the physical address of the business.
     * @param value the physical address of the business.
     */
     public void setPhysicalAddress(Address value) {
          this.physicalAddress = value;
     }

    /**
     * Gets the physical address of the business.
     * @return the physical address of the business.
     */
     @JsonProperty("physicalAddress")
     public Address getPhysicalAddress() {
          return this.physicalAddress;
     }

    /**
     * Sets the mailing address of the business.
     * @param value the mailing address of the business.
     */
     public void setMailingAddress(Address value) {
          this.mailingAddress = value;
     }

    /**
     * Gets the mailing address of the business.
     * @return the mailing address of the business.
     */
     @JsonProperty("mailingAddress")
     public Address getMailingAddress() {
          return this.mailingAddress;
     }

    /**
     * Sets the first name of the primary contact.
     * @param value the first name of the primary contact.
     */
     public void setContactFirstName(String value) {
          this.contactFirstName = value;
     }

    /**
     * Gets the first name of the primary contact.
     * @return the first name of the primary contact.
     */
     @JsonProperty("contactFirstName")
     public String getContactFirstName() {
          return this.contactFirstName;
     }

    /**
     * Sets the last name of the primary contact.
     * @param value the last name of the primary contact.
     */
     public void setContactLastName(String value) {
          this.contactLastName = value;
     }

    /**
     * Gets the last name of the primary contact.
     * @return the last name of the primary contact.
     */
     @JsonProperty("contactLastName")
     public String getContactLastName() {
          return this.contactLastName;
     }

    /**
     * Sets the phone number of the primary contact.
     * @param value the phone number of the primary contact.
     */
     public void setContactPhoneNumber(String value) {
          this.contactPhoneNumber = value;
     }

    /**
     * Gets the phone number of the primary contact.
     * @return the phone number of the primary contact.
     */
     @JsonProperty("contactPhoneNumber")
     public String getContactPhoneNumber() {
          return this.contactPhoneNumber;
     }

    /**
     * Sets the email address of the primary contact.
     * @param value the email address of the primary contact.
     */
     public void setContactEmail(String value) {
          this.contactEmail = value;
     }

    /**
     * Gets the email address of the primary contact.
     * @return the email address of the primary contact.
     */
     @JsonProperty("contactEmail")
     public String getContactEmail() {
          return this.contactEmail;
     }

    /**
     * Sets the job title of the primary contact.
     * @param value the job title of the primary contact.
     */
     public void setContactTitle(String value) {
          this.contactTitle = value;
     }

    /**
     * Gets the job title of the primary contact.
     * @return the job title of the primary contact.
     */
     @JsonProperty("contactTitle")
     public String getContactTitle() {
          return this.contactTitle;
     }

    /**
     * Sets the tax identification number (SSN) of the primary contact.
     * @param value the tax identification number (SSN) of the primary contact.
     */
     public void setContactTaxIdNumber(String value) {
          this.contactTaxIdNumber = value;
     }

    /**
     * Gets the tax identification number (SSN) of the primary contact.
     * @return the tax identification number (SSN) of the primary contact.
     */
     @JsonProperty("contactTaxIdNumber")
     public String getContactTaxIdNumber() {
          return this.contactTaxIdNumber;
     }

    /**
     * Sets the date of birth of the primary contact.
     * @param value the date of birth of the primary contact.
     */
     public void setContactDob(String value) {
          this.contactDOB = value;
     }

    /**
     * Gets the date of birth of the primary contact.
     * @return the date of birth of the primary contact.
     */
     @JsonProperty("contactDOB")
     public String getContactDob() {
          return this.contactDOB;
     }

    /**
     * Sets the driver's license number of the primary contact.
     * @param value the driver's license number of the primary contact.
     */
     public void setContactDlNumber(String value) {
          this.contactDlNumber = value;
     }

    /**
     * Gets the driver's license number of the primary contact.
     * @return the driver's license number of the primary contact.
     */
     @JsonProperty("contactDlNumber")
     public String getContactDlNumber() {
          return this.contactDlNumber;
     }

    /**
     * Sets the state that issued the primary contact's driver's license.
     * @param value the state that issued the primary contact's driver's license.
     */
     public void setContactDlStateOrProvince(String value) {
          this.contactDlStateOrProvince = value;
     }

    /**
     * Gets the state that issued the primary contact's driver's license.
     * @return the state that issued the primary contact's driver's license.
     */
     @JsonProperty("contactDlStateOrProvince")
     public String getContactDlStateOrProvince() {
          return this.contactDlStateOrProvince;
     }

    /**
     * Sets the expiration date of the primary contact's driver's license.
     * @param value the expiration date of the primary contact's driver's license.
     */
     public void setContactDlExpiration(String value) {
          this.contactDlExpiration = value;
     }

    /**
     * Gets the expiration date of the primary contact's driver's license.
     * @return the expiration date of the primary contact's driver's license.
     */
     @JsonProperty("contactDlExpiration")
     public String getContactDlExpiration() {
          return this.contactDlExpiration;
     }

    /**
     * Sets the home address of the primary contact.
     * @param value the home address of the primary contact.
     */
     public void setContactHomeAddress(Address value) {
          this.contactHomeAddress = value;
     }

    /**
     * Gets the home address of the primary contact.
     * @return the home address of the primary contact.
     */
     @JsonProperty("contactHomeAddress")
     public Address getContactHomeAddress() {
          return this.contactHomeAddress;
     }

    /**
     * Sets the role of the primary contact in the business.
     * @param value the role of the primary contact in the business.
     */
     public void setContactRole(String value) {
          this.contactRole = value;
     }

    /**
     * Gets the role of the primary contact in the business.
     * @return the role of the primary contact in the business.
     */
     @JsonProperty("contactRole")
     public String getContactRole() {
          return this.contactRole;
     }

    /**
     * Sets List of individuals with 25% or more ownership in the company.
     * @param value List of individuals with 25% or more ownership in the company.
     */
     public void setOwners(Collection<Owner> value) {
          this.owners = value;
     }

    /**
     * Gets List of individuals with 25% or more ownership in the company.
     * @return List of individuals with 25% or more ownership in the company.
     */
     @JsonProperty("owners")
     public Collection<Owner> getOwners() {
          return this.owners;
     }

    /**
     * Sets the bank account information for the business.
     * @param value the bank account information for the business.
     */
     public void setManualAccount(ApplicationAccount value) {
          this.manualAccount = value;
     }

    /**
     * Gets the bank account information for the business.
     * @return the bank account information for the business.
     */
     @JsonProperty("manualAccount")
     public ApplicationAccount getManualAccount() {
          return this.manualAccount;
     }

    /**
     * Sets the average transaction amount.
     * @param value the average transaction amount.
     */
     public void setAverageTransaction(String value) {
          this.averageTransaction = value;
     }

    /**
     * Gets the average transaction amount.
     * @return the average transaction amount.
     */
     @JsonProperty("averageTransaction")
     public String getAverageTransaction() {
          return this.averageTransaction;
     }

    /**
     * Sets the highest expected transaction amount.
     * @param value the highest expected transaction amount.
     */
     public void setHighTransaction(String value) {
          this.highTransaction = value;
     }

    /**
     * Gets the highest expected transaction amount.
     * @return the highest expected transaction amount.
     */
     @JsonProperty("highTransaction")
     public String getHighTransaction() {
          return this.highTransaction;
     }

    /**
     * Sets the average monthly transaction volume.
     * @param value the average monthly transaction volume.
     */
     public void setAverageMonth(String value) {
          this.averageMonth = value;
     }

    /**
     * Gets the average monthly transaction volume.
     * @return the average monthly transaction volume.
     */
     @JsonProperty("averageMonth")
     public String getAverageMonth() {
          return this.averageMonth;
     }

    /**
     * Sets the highest expected monthly transaction volume.
     * @param value the highest expected monthly transaction volume.
     */
     public void setHighMonth(String value) {
          this.highMonth = value;
     }

    /**
     * Gets the highest expected monthly transaction volume.
     * @return the highest expected monthly transaction volume.
     */
     @JsonProperty("highMonth")
     public String getHighMonth() {
          return this.highMonth;
     }

    /**
     * Sets the refund policy of the business.
     * @param value the refund policy of the business.
     */
     public void setRefundPolicy(String value) {
          this.refundPolicy = value;
     }

    /**
     * Gets the refund policy of the business.
     * @return the refund policy of the business.
     */
     @JsonProperty("refundPolicy")
     public String getRefundPolicy() {
          return this.refundPolicy;
     }

    /**
     * Sets the number of days after purchase that refunds can be issued.
     * @param value the number of days after purchase that refunds can be issued.
     */
     public void setRefundDays(String value) {
          this.refundDays = value;
     }

    /**
     * Gets the number of days after purchase that refunds can be issued.
     * @return the number of days after purchase that refunds can be issued.
     */
     @JsonProperty("refundDays")
     public String getRefundDays() {
          return this.refundDays;
     }

    /**
     * Sets the time zone of the business.
     * @param value the time zone of the business.
     */
     public void setTimeZone(String value) {
          this.timeZone = value;
     }

    /**
     * Gets the time zone of the business.
     * @return the time zone of the business.
     */
     @JsonProperty("timeZone")
     public String getTimeZone() {
          return this.timeZone;
     }

    /**
     * Sets the time when the daily batch should close.
     * @param value the time when the daily batch should close.
     */
     public void setBatchCloseTime(String value) {
          this.batchCloseTime = value;
     }

    /**
     * Gets the time when the daily batch should close.
     * @return the time when the daily batch should close.
     */
     @JsonProperty("batchCloseTime")
     public String getBatchCloseTime() {
          return this.batchCloseTime;
     }

    /**
     * Sets Indicates if the business has multiple locations.
     * @param value Indicates if the business has multiple locations.
     */
     public void setMultipleLocations(String value) {
          this.multipleLocations = value;
     }

    /**
     * Gets Indicates if the business has multiple locations.
     * @return Indicates if the business has multiple locations.
     */
     @JsonProperty("multipleLocations")
     public String getMultipleLocations() {
          return this.multipleLocations;
     }

    /**
     * Sets the name of this specific business location.
     * @param value the name of this specific business location.
     */
     public void setLocationName(String value) {
          this.locationName = value;
     }

    /**
     * Gets the name of this specific business location.
     * @return the name of this specific business location.
     */
     @JsonProperty("locationName")
     public String getLocationName() {
          return this.locationName;
     }

    /**
     * Sets the store number for this location.
     * @param value the store number for this location.
     */
     public void setStoreNumber(String value) {
          this.storeNumber = value;
     }

    /**
     * Gets the store number for this location.
     * @return the store number for this location.
     */
     @JsonProperty("storeNumber")
     public String getStoreNumber() {
          return this.storeNumber;
     }

    /**
     * Sets Indicates if the business wants to accept EBT cards.
     * @param value Indicates if the business wants to accept EBT cards.
     */
     public void setEbtRequested(String value) {
          this.ebtRequested = value;
     }

    /**
     * Gets Indicates if the business wants to accept EBT cards.
     * @return Indicates if the business wants to accept EBT cards.
     */
     @JsonProperty("ebtRequested")
     public String getEbtRequested() {
          return this.ebtRequested;
     }

    /**
     * Sets the FNS number issued by the USDA for EBT processing.
     * @param value the FNS number issued by the USDA for EBT processing.
     */
     public void setFnsNumber(String value) {
          this.fnsNumber = value;
     }

    /**
     * Gets the FNS number issued by the USDA for EBT processing.
     * @return the FNS number issued by the USDA for EBT processing.
     */
     @JsonProperty("fnsNumber")
     public String getFnsNumber() {
          return this.fnsNumber;
     }

    /**
     * Sets Indicates if the business plans to accept payments through a website.
     * @param value Indicates if the business plans to accept payments through a website.
     */
     public void setEcommerce(String value) {
          this.ecommerce = value;
     }

    /**
     * Gets Indicates if the business plans to accept payments through a website.
     * @return Indicates if the business plans to accept payments through a website.
     */
     @JsonProperty("ecommerce")
     public String getEcommerce() {
          return this.ecommerce;
     }

    /**
     * Sets Indicates if suppliers ship products directly to customers.
     * @param value Indicates if suppliers ship products directly to customers.
     */
     public void setDropShipping(boolean value) {
          this.dropShipping = value;
     }

    /**
     * Gets Indicates if suppliers ship products directly to customers.
     * @return Indicates if suppliers ship products directly to customers.
     */
     @JsonProperty("dropShipping")
     public boolean isDropShipping() {
          return this.dropShipping;
     }

    /**
     * Sets the percentage of transactions that will be chip or swipe.
     * @param value the percentage of transactions that will be chip or swipe.
     */
     public void setCardPresentPercentage(String value) {
          this.cardPresentPercentage = value;
     }

    /**
     * Gets the percentage of transactions that will be chip or swipe.
     * @return the percentage of transactions that will be chip or swipe.
     */
     @JsonProperty("cardPresentPercentage")
     public String getCardPresentPercentage() {
          return this.cardPresentPercentage;
     }

    /**
     * Sets the percentage of transactions that will be phone orders.
     * @param value the percentage of transactions that will be phone orders.
     */
     public void setPhoneOrderPercentage(String value) {
          this.phoneOrderPercentage = value;
     }

    /**
     * Gets the percentage of transactions that will be phone orders.
     * @return the percentage of transactions that will be phone orders.
     */
     @JsonProperty("phoneOrderPercentage")
     public String getPhoneOrderPercentage() {
          return this.phoneOrderPercentage;
     }

    /**
     * Sets the percentage of transactions that will be e-commerce.
     * @param value the percentage of transactions that will be e-commerce.
     */
     public void setEcomPercentage(String value) {
          this.ecomPercentage = value;
     }

    /**
     * Gets the percentage of transactions that will be e-commerce.
     * @return the percentage of transactions that will be e-commerce.
     */
     @JsonProperty("ecomPercentage")
     public String getEcomPercentage() {
          return this.ecomPercentage;
     }

    /**
     * Sets the number of days before shipment that customers are charged.
     * @param value the number of days before shipment that customers are charged.
     */
     public void setBillBeforeShipmentDays(String value) {
          this.billBeforeShipmentDays = value;
     }

    /**
     * Gets the number of days before shipment that customers are charged.
     * @return the number of days before shipment that customers are charged.
     */
     @JsonProperty("billBeforeShipmentDays")
     public String getBillBeforeShipmentDays() {
          return this.billBeforeShipmentDays;
     }

    /**
     * Sets Indicates if the business plans to process recurring payments.
     * @param value Indicates if the business plans to process recurring payments.
     */
     public void setSubscriptionsSupported(String value) {
          this.subscriptionsSupported = value;
     }

    /**
     * Gets Indicates if the business plans to process recurring payments.
     * @return Indicates if the business plans to process recurring payments.
     */
     @JsonProperty("subscriptionsSupported")
     public String getSubscriptionsSupported() {
          return this.subscriptionsSupported;
     }

    /**
     * Sets the frequency of recurring payments (if applicable).
     * @param value the frequency of recurring payments (if applicable).
     */
     public void setSubscriptionFrequency(String value) {
          this.subscriptionFrequency = value;
     }

    /**
     * Gets the frequency of recurring payments (if applicable).
     * @return the frequency of recurring payments (if applicable).
     */
     @JsonProperty("subscriptionFrequency")
     public String getSubscriptionFrequency() {
          return this.subscriptionFrequency;
     }

    /**
     * Sets the full legal name of the person signing the application.
     * @param value the full legal name of the person signing the application.
     */
     public void setSignerName(String value) {
          this.signerName = value;
     }

    /**
     * Gets the full legal name of the person signing the application.
     * @return the full legal name of the person signing the application.
     */
     @JsonProperty("signerName")
     public String getSignerName() {
          return this.signerName;
     }

    /**
     * Adds a List of individuals with 25% or more ownership in the company.
     * @param value List of individuals with 25% or more ownership in the company.
     */
     public void addOwner(Owner value) {
          if (this.owners == null) {
               this.owners = new ArrayList();
          }
          this.owners.add(value);
     }

}
