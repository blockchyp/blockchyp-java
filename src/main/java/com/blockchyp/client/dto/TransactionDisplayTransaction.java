package com.blockchyp.client.dto;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Models a transaction to be displayed on the terminal line item display.
 * 
 */

public class TransactionDisplayTransaction {

    private String subtotal;
    private String tax;
    private String total;

    @SuppressWarnings("rawtypes")
    private Collection items;


    /**
     * Gets the pre tax subtotal for the line item display.
     * @return pre tax subtotal for the line item display.
     */
    public String getSubtotal() {
        return subtotal;
    }

    /**
     * Sets the pre tax subtotal for the line item display.
     * @param subtotal pre tax subtotal for the line item display.
     */
    public void setSubtotal(String subtotal) {
        this.subtotal = subtotal;
    }

    /**
     * Returns tax for the line item display. 
     * @return tax for the line item display.
     */
    public String getTax() {
        return tax;
    }

    /**
     * Sets tax for the line item display. 
     * @param tax tax for the line item display.
     */
    public void setTax(String tax) {
        this.tax = tax;
    }

    /**
     * Returns grand total for the line item display.
     * @return grand total.
     */
    public String getTotal() {
        return total;
    }

    /**
     * Sets the grand total on the line item display.
     * @param total grand total.
     */
    public void setTotal(String total) {
        this.total = total;
    }

    /**
     * Returns the line items associated with the transaction.
     * @return a java.util.Collection of {@link TransactionDisplayItem} objects.
     */
    @SuppressWarnings("rawtypes")
    public Collection getItems() {
        return items;
    }

    /**
     * Sets the line items on the transaction.  
     * @param items a java.util.Collection of {@link TransactionDisplayItem} objects.
     */
    @SuppressWarnings("rawtypes")
    public void setItems(Collection items) {
        this.items = items;
    }

    /**
     * Adds a line item to the transaction.
     * @param item {@link TransactionDisplayItem}
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public void addItem(TransactionDisplayItem item) {
        if (items == null) {
            items = new ArrayList();
        }
        items.add(item);
    }

    /**
     * Add a single line item to an existing transaction for those developers who like the builder pattern.
     * @param item {@link TransactionDisplayItem}
     * @return {@link TransactionDisplayTransaction}
     */
    public TransactionDisplayTransaction withItem(TransactionDisplayItem item) {
        this.addItem(item);
        return this;
    }

    /**
     * Sets the line items for the transaction using the builder pattern.
     * 
     * @param newItems a java.util.Collection of TransactionDisplayItem object.
     * @return {@link TransactionDisplayTransaction}
     */
    @SuppressWarnings("rawtypes")
    public TransactionDisplayTransaction withItems(Collection newItems) {
        this.setItems(newItems);
        return this;
    }

}
