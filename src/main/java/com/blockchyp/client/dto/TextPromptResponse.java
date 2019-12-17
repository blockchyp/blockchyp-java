package com.blockchyp.client.dto;








/**
 * models the response to a text prompt request.
 */

public class TextPromptResponse {
  
     
     private boolean success;
  
     
     private String error;
  
     
     private String responseDescription;
  
     
     private String response;
  
  
     
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
  
     
     public void setResponse(String value) {
          this.response = value;
     }
     
     public String getResponse() {
          return this.response;
     }
  

  
}