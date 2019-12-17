package com.blockchyp.client.dto;



import java.util.ArrayList;
import java.util.Collection;



/**
 * contains the items to display on a terminal.
 */
@SuppressWarnings({"rawtypes", "unchecked"})
public class TransactionDisplayTransaction {
  
     
     private String subtotal;
  
     
     private String tax;
  
     
     private String total;
  
     
     private float quantity;
  
     // Items can be overwritten or appended, based on the request type. 
     private Collection items;
  
  
     
     public void setSubtotal(String value) {
          this.subtotal = value;
     }
     
     public String getSubtotal() {
          return this.subtotal;
     }
  
     
     public void setTax(String value) {
          this.tax = value;
     }
     
     public String getTax() {
          return this.tax;
     }
  
     
     public void setTotal(String value) {
          this.total = value;
     }
     
     public String getTotal() {
          return this.total;
     }
  
     
     public void setQuantity(float value) {
          this.quantity = value;
     }
     
     public float getQuantity() {
          return this.quantity;
     }
  
     /**
      * can be overwritten or appended, based on the request type.
      */
     public void setItems(Collection value) {
          this.items = value;
     }
     /**
      * can be overwritten or appended, based on the request type.
      */
     public Collection getItems() {
          return this.items;
     }
  

  
     public void addItem(TransactionDisplayItem value) {
          if (this.items == null) {
               this.items = new ArrayList();
          }
          this.items.add(value);
     }
  
}