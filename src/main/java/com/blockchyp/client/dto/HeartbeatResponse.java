package com.blockchyp.client.dto;





import java.util.Date;


/**
 * models the response to a basic API health check. If the security context permits it, the response may also include the public key of the current merchant.
 */

public class HeartbeatResponse {
  
     
     private boolean success;
  
     
     private String error;
  
     
     private String responseDescription;
  
     
     private Date timestamp;
  
     
     private String clockchain;
  
     
     private String latestTick;
  
     
     private String merchantPublicKey;
  
  
     
     public void setSuccess(boolean value) {
          this.success = value;
     }
     
     public boolean isSuccess() {
          return this.success;
     }
  
     
     public void setError(String value) {
          this.error = value;
     }
     
     public String getError() {
          return this.error;
     }
  
     
     public void setResponseDescription(String value) {
          this.responseDescription = value;
     }
     
     public String getResponseDescription() {
          return this.responseDescription;
     }
  
     
     public void setTimestamp(Date value) {
          this.timestamp = value;
     }
     
     public Date getTimestamp() {
          return this.timestamp;
     }
  
     
     public void setClockchain(String value) {
          this.clockchain = value;
     }
     
     public String getClockchain() {
          return this.clockchain;
     }
  
     
     public void setLatestTick(String value) {
          this.latestTick = value;
     }
     
     public String getLatestTick() {
          return this.latestTick;
     }
  
     
     public void setMerchantPublicKey(String value) {
          this.merchantPublicKey = value;
     }
     
     public String getMerchantPublicKey() {
          return this.merchantPublicKey;
     }
  

  
}