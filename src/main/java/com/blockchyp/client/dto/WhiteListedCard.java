package com.blockchyp.client.dto;








/**
 * shows details about a white listed card.
 */

public class WhiteListedCard {
  
     
     private String bin;
  
     
     private String track1;
  
     
     private String track2;
  
     
     private String pan;
  
  
     
     public void setBin(String value) {
          this.bin = value;
     }
     
     public String getBin() {
          return this.bin;
     }
  
     
     public void setTrack1(String value) {
          this.track1 = value;
     }
     
     public String getTrack1() {
          return this.track1;
     }
  
     
     public void setTrack2(String value) {
          this.track2 = value;
     }
     
     public String getTrack2() {
          return this.track2;
     }
  
     
     public void setPan(String value) {
          this.pan = value;
     }
     
     public String getPan() {
          return this.pan;
     }
  

  
}