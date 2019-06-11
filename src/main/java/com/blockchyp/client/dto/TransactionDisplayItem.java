package com.blockchyp.client.dto;

import java.util.ArrayList;
import java.util.Collection;

public class TransactionDisplayItem {
	
	private String description;
	private String price;
	private float quantity;
	private String subtotal;
	
	@SuppressWarnings("rawtypes")
	private Collection discounts;
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public float getQuantity() {
		return quantity;
	}
	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}
	public String getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(String subtotal) {
		this.subtotal = subtotal;
	}
	@SuppressWarnings("rawtypes")
	public Collection getDiscounts() {
		return discounts;
	}
	@SuppressWarnings("rawtypes")
	public void setDiscounts(Collection discounts) {
		this.discounts = discounts;
	}
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void addDiscount(TransactionDisplayDiscount discount) {
		if (discounts == null) {
			discounts = new ArrayList();
		}
		discounts.add(discount);
	}
	
	public TransactionDisplayItem withDiscount(TransactionDisplayDiscount discount) {
		this.addDiscount(discount);
		return this;
	}
	
	@SuppressWarnings("rawtypes")
	public TransactionDisplayItem withDiscounts(Collection discounts) {
		this.setDiscounts(discounts);
		return this;
	}
	

}
