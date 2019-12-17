package com.blockchyp.client.dto;








/**
 * models a basic api acknowledgement.
 */

public class Acknowledgement {
  
     
     private boolean success;
  
     
     private String error;
  
     
     private String responseDescription;
  
  
     
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
  

  
}