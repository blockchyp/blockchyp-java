package com.blockchyp.client.dto;








/**
 * models the response to a boolean prompt request.
 */

public class BooleanPromptResponse {
  
     
     private boolean success;
  
     
     private String error;
  
     
     private String responseDescription;
  
     
     private boolean response;
  
  
     
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
  
     
     public void setResponse(boolean value) {
          this.response = value;
     }
     
     public boolean isResponse() {
          return this.response;
     }
  

  
}