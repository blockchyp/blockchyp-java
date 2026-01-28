/**
 * Copyright 2019-2026 BlockChyp, Inc. All rights reserved. Use of this code is governed
 * by a license that can be found in the LICENSE file.
 *
 * This file was generated automatically by the BlockChyp SDK Generator. Changes to this
 * file will be lost every time the code is regenerated.
 */

package com.blockchyp.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Details about a merchant board platform configuration.
 */
public class TerminalProfile {

     private String id;

     private String ipAddress;

     private String terminalName;

     private String terminalType;

     private String terminalTypeDisplayString;

     private String blockChypFirmwareVersion;

     private boolean cloudBased;

     private String publicKey;

     private String serialNumber;

     private boolean online;

     private String since;

     private int totalMemory;

     private int totalStorage;

     private int availableMemory;

     private int availableStorage;

     private int usedMemory;

     private int usedStorage;

     private String brandingPreview;

     private String groupId;

     private String groupName;

    /**
     * Sets primary identifier for a given terminal.
     * @param value primary identifier for a given terminal.
     */
     public void setId(String value) {
          this.id = value;
     }

    /**
     * Gets primary identifier for a given terminal.
     * @return primary identifier for a given terminal.
     */
     @JsonProperty("id")
     public String getId() {
          return this.id;
     }

    /**
     * Sets the terminal's local IP address.
     * @param value the terminal's local IP address.
     */
     public void setIpAddress(String value) {
          this.ipAddress = value;
     }

    /**
     * Gets the terminal's local IP address.
     * @return the terminal's local IP address.
     */
     @JsonProperty("ipAddress")
     public String getIpAddress() {
          return this.ipAddress;
     }

    /**
     * Sets the name assigned to the terminal during activation.
     * @param value the name assigned to the terminal during activation.
     */
     public void setTerminalName(String value) {
          this.terminalName = value;
     }

    /**
     * Gets the name assigned to the terminal during activation.
     * @return the name assigned to the terminal during activation.
     */
     @JsonProperty("terminalName")
     public String getTerminalName() {
          return this.terminalName;
     }

    /**
     * Sets the terminal type.
     * @param value the terminal type.
     */
     public void setTerminalType(String value) {
          this.terminalType = value;
     }

    /**
     * Gets the terminal type.
     * @return the terminal type.
     */
     @JsonProperty("terminalType")
     public String getTerminalType() {
          return this.terminalType;
     }

    /**
     * Sets the terminal type display string.
     * @param value the terminal type display string.
     */
     public void setTerminalTypeDisplayString(String value) {
          this.terminalTypeDisplayString = value;
     }

    /**
     * Gets the terminal type display string.
     * @return the terminal type display string.
     */
     @JsonProperty("terminalTypeDisplayString")
     public String getTerminalTypeDisplayString() {
          return this.terminalTypeDisplayString;
     }

    /**
     * Sets the current firmware version deployed on the terminal.
     * @param value the current firmware version deployed on the terminal.
     */
     public void setBlockChypFirmwareVersion(String value) {
          this.blockChypFirmwareVersion = value;
     }

    /**
     * Gets the current firmware version deployed on the terminal.
     * @return the current firmware version deployed on the terminal.
     */
     @JsonProperty("blockChypFirmwareVersion")
     public String getBlockChypFirmwareVersion() {
          return this.blockChypFirmwareVersion;
     }

    /**
     * Sets whether or not the terminal is configured for cloud relay.
     * @param value whether or not the terminal is configured for cloud relay.
     */
     public void setCloudBased(boolean value) {
          this.cloudBased = value;
     }

    /**
     * Gets whether or not the terminal is configured for cloud relay.
     * @return whether or not the terminal is configured for cloud relay.
     */
     @JsonProperty("cloudBased")
     public boolean isCloudBased() {
          return this.cloudBased;
     }

    /**
     * Sets the terminal's elliptic curve public key.
     * @param value the terminal's elliptic curve public key.
     */
     public void setPublicKey(String value) {
          this.publicKey = value;
     }

    /**
     * Gets the terminal's elliptic curve public key.
     * @return the terminal's elliptic curve public key.
     */
     @JsonProperty("publicKey")
     public String getPublicKey() {
          return this.publicKey;
     }

    /**
     * Sets the manufacturer's serial number.
     * @param value the manufacturer's serial number.
     */
     public void setSerialNumber(String value) {
          this.serialNumber = value;
     }

    /**
     * Gets the manufacturer's serial number.
     * @return the manufacturer's serial number.
     */
     @JsonProperty("serialNumber")
     public String getSerialNumber() {
          return this.serialNumber;
     }

    /**
     * Sets whether or not the terminal is currently online.
     * @param value whether or not the terminal is currently online.
     */
     public void setOnline(boolean value) {
          this.online = value;
     }

    /**
     * Gets whether or not the terminal is currently online.
     * @return whether or not the terminal is currently online.
     */
     @JsonProperty("online")
     public boolean isOnline() {
          return this.online;
     }

    /**
     * Sets the date and time the terminal was first brought online.
     * @param value the date and time the terminal was first brought online.
     */
     public void setSince(String value) {
          this.since = value;
     }

    /**
     * Gets the date and time the terminal was first brought online.
     * @return the date and time the terminal was first brought online.
     */
     @JsonProperty("since")
     public String getSince() {
          return this.since;
     }

    /**
     * Sets the total memory on the terminal.
     * @param value the total memory on the terminal.
     */
     public void setTotalMemory(int value) {
          this.totalMemory = value;
     }

    /**
     * Gets the total memory on the terminal.
     * @return the total memory on the terminal.
     */
     @JsonProperty("totalMemory")
     public int getTotalMemory() {
          return this.totalMemory;
     }

    /**
     * Sets the storage on the terminal.
     * @param value the storage on the terminal.
     */
     public void setTotalStorage(int value) {
          this.totalStorage = value;
     }

    /**
     * Gets the storage on the terminal.
     * @return the storage on the terminal.
     */
     @JsonProperty("totalStorage")
     public int getTotalStorage() {
          return this.totalStorage;
     }

    /**
     * Sets the available (unused) memory on the terminal.
     * @param value the available (unused) memory on the terminal.
     */
     public void setAvailableMemory(int value) {
          this.availableMemory = value;
     }

    /**
     * Gets the available (unused) memory on the terminal.
     * @return the available (unused) memory on the terminal.
     */
     @JsonProperty("availableMemory")
     public int getAvailableMemory() {
          return this.availableMemory;
     }

    /**
     * Sets the available (unused) storage on the terminal.
     * @param value the available (unused) storage on the terminal.
     */
     public void setAvailableStorage(int value) {
          this.availableStorage = value;
     }

    /**
     * Gets the available (unused) storage on the terminal.
     * @return the available (unused) storage on the terminal.
     */
     @JsonProperty("availableStorage")
     public int getAvailableStorage() {
          return this.availableStorage;
     }

    /**
     * Sets the memory currently in use on the terminal.
     * @param value the memory currently in use on the terminal.
     */
     public void setUsedMemory(int value) {
          this.usedMemory = value;
     }

    /**
     * Gets the memory currently in use on the terminal.
     * @return the memory currently in use on the terminal.
     */
     @JsonProperty("usedMemory")
     public int getUsedMemory() {
          return this.usedMemory;
     }

    /**
     * Sets the storage currently in use on the terminal.
     * @param value the storage currently in use on the terminal.
     */
     public void setUsedStorage(int value) {
          this.usedStorage = value;
     }

    /**
     * Gets the storage currently in use on the terminal.
     * @return the storage currently in use on the terminal.
     */
     @JsonProperty("usedStorage")
     public int getUsedStorage() {
          return this.usedStorage;
     }

    /**
     * Sets the branding asset currently displayed on the terminal.
     * @param value the branding asset currently displayed on the terminal.
     */
     public void setBrandingPreview(String value) {
          this.brandingPreview = value;
     }

    /**
     * Gets the branding asset currently displayed on the terminal.
     * @return the branding asset currently displayed on the terminal.
     */
     @JsonProperty("brandingPreview")
     public String getBrandingPreview() {
          return this.brandingPreview;
     }

    /**
     * Sets the id of the terminal group to which the terminal belongs, if any.
     * @param value the id of the terminal group to which the terminal belongs, if any.
     */
     public void setGroupId(String value) {
          this.groupId = value;
     }

    /**
     * Gets the id of the terminal group to which the terminal belongs, if any.
     * @return the id of the terminal group to which the terminal belongs, if any.
     */
     @JsonProperty("groupId")
     public String getGroupId() {
          return this.groupId;
     }

    /**
     * Sets the name of the terminal group to which the terminal belongs, if any.
     * @param value the name of the terminal group to which the terminal belongs, if any.
     */
     public void setGroupName(String value) {
          this.groupName = value;
     }

    /**
     * Gets the name of the terminal group to which the terminal belongs, if any.
     * @return the name of the terminal group to which the terminal belongs, if any.
     */
     @JsonProperty("groupName")
     public String getGroupName() {
          return this.groupName;
     }

}
