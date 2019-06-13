package com.blockchyp.client.dto;

/**
 * Models transaction discount information for the line item display.
 * 
 * @author jeffreydpayne
 *
 */
public class TransactionDisplayDiscount {

    private String description;
    private String amount;

    /**
     * Returns the discount description.
     * @return - discount description.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the discount description.
     * @param description - discount description.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    
    /**
     * Returns the discount amount.
     * @return - discount amount.
     */
    public String getAmount() {
        return amount;
    }

    /**
     * Sets the discount amount.
     * @param amount - discount amount.
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }

}
