package com.blockchyp.client.dto;



import java.util.ArrayList;
import java.util.Collection;



/**
 * is an item category in a transaction display. Groups combine if their descriptions match. Calculated subtotal amounts are rounded to two decimal places of precision. Quantity is a floating point number that is not rounded at all.
 */
@SuppressWarnings({"rawtypes", "unchecked"})
public class TransactionDisplayItem {
  
     // ID is not required, but recommended since it is required to update or delete line items. 
     private String id;
  
     
     private String description;
  
     
     private String price;
  
     
     private float quantity;
  
     // Extended is an item category in a transaction display. Groups combine if their descriptions match. Calculated subtotal amounts are rounded to two decimal places of precision. Quantity is a floating point number that is not rounded at all. 
     private String extended;
  
     // Discounts are displayed under their corresponding item. 
     private Collection discounts;
  
  
     /**
      * is not required, but recommended since it is required to update or delete line items.
      */
     public void setID(String value) {
          this.id = value;
     }
     /**
      * is not required, but recommended since it is required to update or delete line items.
      */
     public String getID() {
          return this.id;
     }
  
     
     public void setDescription(String value) {
          this.description = value;
     }
     
     public String getDescription() {
          return this.description;
     }
  
     
     public void setPrice(String value) {
          this.price = value;
     }
     
     public String getPrice() {
          return this.price;
     }
  
     
     public void setQuantity(float value) {
          this.quantity = value;
     }
     
     public float getQuantity() {
          return this.quantity;
     }
  
     /**
      * is an item category in a transaction display. Groups combine if their descriptions match. Calculated subtotal amounts are rounded to two decimal places of precision. Quantity is a floating point number that is not rounded at all.
      */
     public void setExtended(String value) {
          this.extended = value;
     }
     /**
      * is an item category in a transaction display. Groups combine if their descriptions match. Calculated subtotal amounts are rounded to two decimal places of precision. Quantity is a floating point number that is not rounded at all.
      */
     public String getExtended() {
          return this.extended;
     }
  
     /**
      * are displayed under their corresponding item.
      */
     public void setDiscounts(Collection value) {
          this.discounts = value;
     }
     /**
      * are displayed under their corresponding item.
      */
     public Collection getDiscounts() {
          return this.discounts;
     }
  

  
     public void addDiscount(TransactionDisplayDiscount value) {
          if (this.discounts == null) {
               this.discounts = new ArrayList();
          }
          this.discounts.add(value);
     }
  
}