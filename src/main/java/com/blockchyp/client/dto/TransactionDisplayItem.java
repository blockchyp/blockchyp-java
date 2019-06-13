package com.blockchyp.client.dto;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Models an individual item to be displayed on the terminal line item display.
 * @author jeffreydpayne
 *
 */
public class TransactionDisplayItem {

    private String id;
    private String description;
    private String price;
    private float quantity;
    private String extended;

    @SuppressWarnings("rawtypes")
    private Collection discounts;

    /**
     * Returns the line item id.
     * @return - line item id.
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the line item id.
     * @param id - line item id.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Returns the line item description. 
     * @return - line item description.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the line item description.
     * @param description - line item description.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Returns the undiscounted price per unit quantity.
     * @return - price each.
     */
    public String getPrice() {
        return price;
    }

    /**
     * Sets the undiscounted price per unit quantity.
     * @param price - price each.
     */
    public void setPrice(String price) {
        this.price = price;
    }

    /**
     * Returns the line item quantity.
     * @return - line item quantity.
     */
    public float getQuantity() {
        return quantity;
    }

    /**
     * Sets the line item quantity.
     * @param quantity - line item quantity.
     */
    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    /**
     * Gets the extended price for a line item.
     * @return - extended amount.
     */
    public String getExtended() {
        return extended;
    }

    /**
     * Sets the extended price.
     * @param extended - extended amount.
     */
    public void setExtended(String extended) {
        this.extended = extended;
    }

    /**
     * Returns the discounts associated with the line item.
     * @return a java.util.Collection of {@link TransactionDisplayDiscount} objects.
     */
    @SuppressWarnings("rawtypes")
    public Collection getDiscounts() {
        return discounts;
    }
    
    /**
     * Sets the discounts on the line item.  
     * @param discounts a java.util.Collection of {@link TransactionDisplayDiscount} objects.
     */
    @SuppressWarnings("rawtypes")
    public void setDiscounts(Collection discounts) {
        this.discounts = discounts;
    }

    /**
     * Adds a discount to the line item.
     * @param discount {@link TransactionDisplayDiscount}
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public void addDiscount(TransactionDisplayDiscount discount) {
        if (discounts == null) {
            discounts = new ArrayList();
        }
        discounts.add(discount);
    }

    /**
     * Add a single discount to an existing line item.  For those developers who like the builder pattern.
     * @param discount {@link TransactionDisplayDiscount}
     * @return {@link TransactionDisplayItem}
     */
    public TransactionDisplayItem withDiscount(TransactionDisplayDiscount discount) {
        this.addDiscount(discount);
        return this;
    }

    /**
     * Adds discounts to an existing line item.  For those developers who like the builder pattern.
     * @param newDiscounts - a java.util.Collection of TransactionDisplayDiscount object.
     * @return {@link TransactionDisplayItem}
     */
    @SuppressWarnings("rawtypes")
    public TransactionDisplayItem withDiscounts(Collection newDiscounts) {
        this.setDiscounts(newDiscounts);
        return this;
    }

}
