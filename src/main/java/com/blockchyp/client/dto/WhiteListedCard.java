/**
 * Copyright 2019 BlockChyp, Inc. All rights reserved. Use of this code is governed by a
 * license that can be found in the LICENSE file.
 *
 * This file was generated automatically. Changes to this file will be lost every time the
 * code is regenerated.
 */
package com.blockchyp.client.dto;


/**
 * Shows details about a white listed card.
 */
public class WhiteListedCard {

     private String bin;

     private String track1;

     private String track2;

     private String pan;

     /**
      * Sets the card BIN.
      * @param value the card BIN.
      */
     public void setBin(String value) {
          this.bin = value;
     }

     /**
      * Gets the card BIN.
      * @return the card BIN.
      */
     public String getBin() {
          return this.bin;
     }

     /**
      * Sets the track 1 data from the card.
      * @param value the track 1 data from the card.
      */
     public void setTrack1(String value) {
          this.track1 = value;
     }

     /**
      * Gets the track 1 data from the card.
      * @return the track 1 data from the card.
      */
     public String getTrack1() {
          return this.track1;
     }

     /**
      * Sets the track 2 data from the card.
      * @param value the track 2 data from the card.
      */
     public void setTrack2(String value) {
          this.track2 = value;
     }

     /**
      * Gets the track 2 data from the card.
      * @return the track 2 data from the card.
      */
     public String getTrack2() {
          return this.track2;
     }

     /**
      * Sets the card primary account number.
      * @param value the card primary account number.
      */
     public void setPan(String value) {
          this.pan = value;
     }

     /**
      * Gets the card primary account number.
      * @return the card primary account number.
      */
     public String getPan() {
          return this.pan;
     }

}
