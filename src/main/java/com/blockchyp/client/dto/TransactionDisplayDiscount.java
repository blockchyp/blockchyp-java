package com.blockchyp.client.dto;








/**
 * is an item level discount for transaction display. Discounts never combine.
 */

public class TransactionDisplayDiscount {
  
     
     private String description;
  
     
     private String amount;
  
  
     
     public void setDescription(String value) {
          this.description = value;
     }
     
     public String getDescription() {
          return this.description;
     }
  
     
     public void setAmount(String value) {
          this.amount = value;
     }
     
     public String getAmount() {
          return this.amount;
     }
  

  
}