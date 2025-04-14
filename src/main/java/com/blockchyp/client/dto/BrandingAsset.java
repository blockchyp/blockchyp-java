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
 * Models the priority and display settings for terminal media.
 */
@SuppressWarnings({"rawtypes", "unchecked"})
public class BrandingAsset implements ITimeoutRequest, IAbstractAcknowledgement {

     private int timeout;

     private boolean test;

     private boolean success;

     private String error;

     private String responseDescription;

     private String id;

     private String ownerId;

     private String terminalId;

     private String terminalGroupId;

     private String merchantId;

     private String organizationId;

     private String partnerId;

     private String slideShowId;

     private String mediaId;

     private boolean padded;

     private String startDate;

     private String endDate;

     private Collection<Weekday> daysOfWeek;

     private String startTime;

     private String endTime;

     private int ordinal;

     private boolean enabled;

     private boolean preview;

     private String userId;

     private String userName;

     private String thumbnail;

     private String lastModified;

     private String notes;

     private boolean editable;

     private String assetType;

     private String ownerType;

     private String ownerTypeCaption;

     private String ownerName;

     private String previewImage;

     private String narrativeEffectiveDates;

     private String narrativeDisplayPeriod;

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
     * Sets whether or not the request succeeded.
     * @param value whether or not the request succeeded.
     */
     public void setSuccess(boolean value) {
          this.success = value;
     }

    /**
     * Gets whether or not the request succeeded.
     * @return whether or not the request succeeded.
     */
     @JsonProperty("success")
     public boolean isSuccess() {
          return this.success;
     }

    /**
     * Sets the error, if an error occurred.
     * @param value the error, if an error occurred.
     */
     public void setError(String value) {
          this.error = value;
     }

    /**
     * Gets the error, if an error occurred.
     * @return the error, if an error occurred.
     */
     @JsonProperty("error")
     public String getError() {
          return this.error;
     }

    /**
     * Sets a narrative description of the transaction result.
     * @param value a narrative description of the transaction result.
     */
     public void setResponseDescription(String value) {
          this.responseDescription = value;
     }

    /**
     * Gets a narrative description of the transaction result.
     * @return a narrative description of the transaction result.
     */
     @JsonProperty("responseDescription")
     public String getResponseDescription() {
          return this.responseDescription;
     }

    /**
     * Sets id used to track a branding asset.
     * @param value id used to track a branding asset.
     */
     public void setId(String value) {
          this.id = value;
     }

    /**
     * Gets id used to track a branding asset.
     * @return id used to track a branding asset.
     */
     @JsonProperty("id")
     public String getId() {
          return this.id;
     }

    /**
     * Sets the id owner of the tenant who owns the branding asset.
     * @param value the id owner of the tenant who owns the branding asset.
     */
     public void setOwnerId(String value) {
          this.ownerId = value;
     }

    /**
     * Gets the id owner of the tenant who owns the branding asset.
     * @return the id owner of the tenant who owns the branding asset.
     */
     @JsonProperty("ownerId")
     public String getOwnerId() {
          return this.ownerId;
     }

    /**
     * Sets the terminal id if this branding asset is specific to a single terminal.
     * @param value the terminal id if this branding asset is specific to a single
     * terminal.
     */
     public void setTerminalId(String value) {
          this.terminalId = value;
     }

    /**
     * Gets the terminal id if this branding asset is specific to a single terminal.
     * @return the terminal id if this branding asset is specific to a single terminal.
     */
     @JsonProperty("terminalId")
     public String getTerminalId() {
          return this.terminalId;
     }

    /**
     * Sets the terminal group id if this branding asset is specific to a terminal group.
     * @param value the terminal group id if this branding asset is specific to a terminal
     * group.
     */
     public void setTerminalGroupId(String value) {
          this.terminalGroupId = value;
     }

    /**
     * Gets the terminal group id if this branding asset is specific to a terminal group.
     * @return the terminal group id if this branding asset is specific to a terminal
     * group.
     */
     @JsonProperty("terminalGroupId")
     public String getTerminalGroupId() {
          return this.terminalGroupId;
     }

    /**
     * Sets the merchant id associated with this branding asset.
     * @param value the merchant id associated with this branding asset.
     */
     public void setMerchantId(String value) {
          this.merchantId = value;
     }

    /**
     * Gets the merchant id associated with this branding asset.
     * @return the merchant id associated with this branding asset.
     */
     @JsonProperty("merchantId")
     public String getMerchantId() {
          return this.merchantId;
     }

    /**
     * Sets the organization id associated with this branding asset.
     * @param value the organization id associated with this branding asset.
     */
     public void setOrganizationId(String value) {
          this.organizationId = value;
     }

    /**
     * Gets the organization id associated with this branding asset.
     * @return the organization id associated with this branding asset.
     */
     @JsonProperty("organizationId")
     public String getOrganizationId() {
          return this.organizationId;
     }

    /**
     * Sets the partner id associated with this branding asset.
     * @param value the partner id associated with this branding asset.
     */
     public void setPartnerId(String value) {
          this.partnerId = value;
     }

    /**
     * Gets the partner id associated with this branding asset.
     * @return the partner id associated with this branding asset.
     */
     @JsonProperty("partnerId")
     public String getPartnerId() {
          return this.partnerId;
     }

    /**
     * Sets the slide show associated with this branding asset, if any.
     * @param value the slide show associated with this branding asset, if any. A branding
     * asset can reference a slide show or media asset, but not both.
     */
     public void setSlideShowId(String value) {
          this.slideShowId = value;
     }

    /**
     * Gets the slide show associated with this branding asset, if any.
     * @return the slide show associated with this branding asset, if any. A branding
     * asset can reference a slide show or media asset, but not both.
     */
     @JsonProperty("slideShowId")
     public String getSlideShowId() {
          return this.slideShowId;
     }

    /**
     * Sets the media id associated with this branding asset, if any.
     * @param value the media id associated with this branding asset, if any. A branding
     * asset can reference a slide show or media asset, but not both.
     */
     public void setMediaId(String value) {
          this.mediaId = value;
     }

    /**
     * Gets the media id associated with this branding asset, if any.
     * @return the media id associated with this branding asset, if any. A branding asset
     * can reference a slide show or media asset, but not both.
     */
     @JsonProperty("mediaId")
     public String getMediaId() {
          return this.mediaId;
     }

    /**
     * Sets applies standard margins to images displayed on terminals.
     * @param value applies standard margins to images displayed on terminals. Usually
     * the best option for logos.
     */
     public void setPadded(boolean value) {
          this.padded = value;
     }

    /**
     * Gets applies standard margins to images displayed on terminals.
     * @return applies standard margins to images displayed on terminals. Usually the
     * best option for logos.
     */
     @JsonProperty("padded")
     public boolean isPadded() {
          return this.padded;
     }

    /**
     * Sets the start date if this asset should be displayed based on a schedule.
     * @param value the start date if this asset should be displayed based on a schedule.
     * Format: MM/DD/YYYY.
     */
     public void setStartDate(String value) {
          this.startDate = value;
     }

    /**
     * Gets the start date if this asset should be displayed based on a schedule.
     * @return the start date if this asset should be displayed based on a schedule.
     * Format: MM/DD/YYYY.
     */
     @JsonProperty("startDate")
     public String getStartDate() {
          return this.startDate;
     }

    /**
     * Sets the end date if this asset should be displayed based on a schedule.
     * @param value the end date if this asset should be displayed based on a schedule.
     * Format: MM/DD/YYYY.
     */
     public void setEndDate(String value) {
          this.endDate = value;
     }

    /**
     * Gets the end date if this asset should be displayed based on a schedule.
     * @return the end date if this asset should be displayed based on a schedule. Format:
     * MM/DD/YYYY.
     */
     @JsonProperty("endDate")
     public String getEndDate() {
          return this.endDate;
     }

    /**
     * Sets an array of days of the week during which a branding asset should be enabled.
     * @param value an array of days of the week during which a branding asset should be
     * enabled. Days of the week are coded as integers starting with Sunday (0) and ending
     * with Saturday (6).
     */
     public void setDaysOfWeek(Collection<Weekday> value) {
          this.daysOfWeek = value;
     }

    /**
     * Gets an array of days of the week during which a branding asset should be enabled.
     * @return an array of days of the week during which a branding asset should be enabled.
     * Days of the week are coded as integers starting with Sunday (0) and ending with
     * Saturday (6).
     */
     @JsonProperty("daysOfWeek")
     public Collection<Weekday> getDaysOfWeek() {
          return this.daysOfWeek;
     }

    /**
     * Sets the start date if this asset should be displayed based on a schedule.
     * @param value the start date if this asset should be displayed based on a schedule.
     * Format: MM/DD/YYYY.
     */
     public void setStartTime(String value) {
          this.startTime = value;
     }

    /**
     * Gets the start date if this asset should be displayed based on a schedule.
     * @return the start date if this asset should be displayed based on a schedule.
     * Format: MM/DD/YYYY.
     */
     @JsonProperty("startTime")
     public String getStartTime() {
          return this.startTime;
     }

    /**
     * Sets the end date if this asset should be displayed based on a schedule.
     * @param value the end date if this asset should be displayed based on a schedule.
     * Format: MM/DD/YYYY.
     */
     public void setEndTime(String value) {
          this.endTime = value;
     }

    /**
     * Gets the end date if this asset should be displayed based on a schedule.
     * @return the end date if this asset should be displayed based on a schedule. Format:
     * MM/DD/YYYY.
     */
     @JsonProperty("endTime")
     public String getEndTime() {
          return this.endTime;
     }

    /**
     * Sets the ordinal number marking the position of this asset within the branding
     * stack.
     * @param value the ordinal number marking the position of this asset within the
     * branding stack.
     */
     public void setOrdinal(int value) {
          this.ordinal = value;
     }

    /**
     * Gets the ordinal number marking the position of this asset within the branding
     * stack.
     * @return the ordinal number marking the position of this asset within the branding
     * stack.
     */
     @JsonProperty("ordinal")
     public int getOrdinal() {
          return this.ordinal;
     }

    /**
     * Sets enables the asset for display.
     * @param value enables the asset for display.
     */
     public void setEnabled(boolean value) {
          this.enabled = value;
     }

    /**
     * Gets enables the asset for display.
     * @return enables the asset for display.
     */
     @JsonProperty("enabled")
     public boolean isEnabled() {
          return this.enabled;
     }

    /**
     * Sets if true, the asset will be displayed in the merchant portal, but not on merchant
     * terminal hardware.
     * @param value if true, the asset will be displayed in the merchant portal, but not on
     * merchant terminal hardware. Developers will usually want this to always be false.
     */
     public void setPreview(boolean value) {
          this.preview = value;
     }

    /**
     * Gets if true, the asset will be displayed in the merchant portal, but not on merchant
     * terminal hardware.
     * @return if true, the asset will be displayed in the merchant portal, but not on
     * merchant terminal hardware. Developers will usually want this to always be false.
     */
     @JsonProperty("preview")
     public boolean isPreview() {
          return this.preview;
     }

    /**
     * Sets id of the user who created this branding asset, if applicable.
     * @param value id of the user who created this branding asset, if applicable.
     */
     public void setUserId(String value) {
          this.userId = value;
     }

    /**
     * Gets id of the user who created this branding asset, if applicable.
     * @return id of the user who created this branding asset, if applicable.
     */
     @JsonProperty("userId")
     public String getUserId() {
          return this.userId;
     }

    /**
     * Sets name of the user who created this branding asset, if applicable.
     * @param value name of the user who created this branding asset, if applicable.
     */
     public void setUserName(String value) {
          this.userName = value;
     }

    /**
     * Gets name of the user who created this branding asset, if applicable.
     * @return name of the user who created this branding asset, if applicable.
     */
     @JsonProperty("userName")
     public String getUserName() {
          return this.userName;
     }

    /**
     * Sets the fully qualified URL of the thumbnail image for this branding asset.
     * @param value the fully qualified URL of the thumbnail image for this branding
     * asset.
     */
     public void setThumbnail(String value) {
          this.thumbnail = value;
     }

    /**
     * Gets the fully qualified URL of the thumbnail image for this branding asset.
     * @return the fully qualified URL of the thumbnail image for this branding asset.
     */
     @JsonProperty("thumbnail")
     public String getThumbnail() {
          return this.thumbnail;
     }

    /**
     * Sets the time and date this asset was last modified.
     * @param value the time and date this asset was last modified.
     */
     public void setLastModified(String value) {
          this.lastModified = value;
     }

    /**
     * Gets the time and date this asset was last modified.
     * @return the time and date this asset was last modified.
     */
     @JsonProperty("lastModified")
     public String getLastModified() {
          return this.lastModified;
     }

    /**
     * Sets a field for notes related to a branding asset.
     * @param value a field for notes related to a branding asset.
     */
     public void setNotes(String value) {
          this.notes = value;
     }

    /**
     * Gets a field for notes related to a branding asset.
     * @return a field for notes related to a branding asset.
     */
     @JsonProperty("notes")
     public String getNotes() {
          return this.notes;
     }

    /**
     * Sets if true, the API credentials used to retrieve the branding asset record can be
     * used to update it.
     * @param value if true, the API credentials used to retrieve the branding asset
     * record can be used to update it.
     */
     public void setEditable(boolean value) {
          this.editable = value;
     }

    /**
     * Gets if true, the API credentials used to retrieve the branding asset record can be
     * used to update it.
     * @return if true, the API credentials used to retrieve the branding asset record can
     * be used to update it.
     */
     @JsonProperty("editable")
     public boolean isEditable() {
          return this.editable;
     }

    /**
     * Sets the type of branding asset.
     * @param value the type of branding asset.
     */
     public void setAssetType(String value) {
          this.assetType = value;
     }

    /**
     * Gets the type of branding asset.
     * @return the type of branding asset.
     */
     @JsonProperty("assetType")
     public String getAssetType() {
          return this.assetType;
     }

    /**
     * Sets the type of user or tenant that owns this asset.
     * @param value the type of user or tenant that owns this asset.
     */
     public void setOwnerType(String value) {
          this.ownerType = value;
     }

    /**
     * Gets the type of user or tenant that owns this asset.
     * @return the type of user or tenant that owns this asset.
     */
     @JsonProperty("ownerType")
     public String getOwnerType() {
          return this.ownerType;
     }

    /**
     * Sets a recommended caption for displaying the owner.
     * @param value a recommended caption for displaying the owner. Takes into account
     * multiple organization types.
     */
     public void setOwnerTypeCaption(String value) {
          this.ownerTypeCaption = value;
     }

    /**
     * Gets a recommended caption for displaying the owner.
     * @return a recommended caption for displaying the owner. Takes into account
     * multiple organization types.
     */
     @JsonProperty("ownerTypeCaption")
     public String getOwnerTypeCaption() {
          return this.ownerTypeCaption;
     }

    /**
     * Sets the name of the tenant or entity that owns the branding asset.
     * @param value the name of the tenant or entity that owns the branding asset.
     */
     public void setOwnerName(String value) {
          this.ownerName = value;
     }

    /**
     * Gets the name of the tenant or entity that owns the branding asset.
     * @return the name of the tenant or entity that owns the branding asset.
     */
     @JsonProperty("ownerName")
     public String getOwnerName() {
          return this.ownerName;
     }

    /**
     * Sets the recommended image to be displayed when rendering a preview of this
     * branding asset.
     * @param value the recommended image to be displayed when rendering a preview of this
     * branding asset.
     */
     public void setPreviewImage(String value) {
          this.previewImage = value;
     }

    /**
     * Gets the recommended image to be displayed when rendering a preview of this
     * branding asset.
     * @return the recommended image to be displayed when rendering a preview of this
     * branding asset.
     */
     @JsonProperty("previewImage")
     public String getPreviewImage() {
          return this.previewImage;
     }

    /**
     * Sets a compact narrative string explaining the effective date and time rules for a
     * branding asset.
     * @param value a compact narrative string explaining the effective date and time
     * rules for a branding asset.
     */
     public void setNarrativeEffectiveDates(String value) {
          this.narrativeEffectiveDates = value;
     }

    /**
     * Gets a compact narrative string explaining the effective date and time rules for a
     * branding asset.
     * @return a compact narrative string explaining the effective date and time rules
     * for a branding asset.
     */
     @JsonProperty("narrativeEffectiveDates")
     public String getNarrativeEffectiveDates() {
          return this.narrativeEffectiveDates;
     }

    /**
     * Sets a compact narrative string explaining the display period for a branding
     * asset.
     * @param value a compact narrative string explaining the display period for a
     * branding asset.
     */
     public void setNarrativeDisplayPeriod(String value) {
          this.narrativeDisplayPeriod = value;
     }

    /**
     * Gets a compact narrative string explaining the display period for a branding
     * asset.
     * @return a compact narrative string explaining the display period for a branding
     * asset.
     */
     @JsonProperty("narrativeDisplayPeriod")
     public String getNarrativeDisplayPeriod() {
          return this.narrativeDisplayPeriod;
     }

    /**
     * Adds a an array of days of the week during which a branding asset should be enabled.
     * @param value an array of days of the week during which a branding asset should be
     * enabled. Days of the week are coded as integers starting with Sunday (0) and ending
     * with Saturday (6).
     */
     public void addDaysOfWeek(Weekday value) {
          if (this.daysOfWeek == null) {
               this.daysOfWeek = new ArrayList();
          }
          this.daysOfWeek.add(value);
     }

}
