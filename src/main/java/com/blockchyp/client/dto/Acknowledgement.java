package com.blockchyp.client.dto;


/**
 * Models a basic api acknowledgement.
 */
public class Acknowledgement {

     private boolean success;

     private String error;

     private String responseDescription;

     /**
      * Sets
      *
      * @param value
      */
     public void setSuccess(boolean value) {
          this.success = value;
     }

     /**
      * Gets
      *
      * @return
      */
     public boolean isSuccess() {
          return this.success;
     }

     /**
      * Sets
      *
      * @param value
      */
     public void setError(String value) {
          this.error = value;
     }

     /**
      * Gets
      *
      * @return
      */
     public String getError() {
          return this.error;
     }

     /**
      * Sets
      *
      * @param value
      */
     public void setResponseDescription(String value) {
          this.responseDescription = value;
     }

     /**
      * Gets
      *
      * @return
      */
     public String getResponseDescription() {
          return this.responseDescription;
     }

}
