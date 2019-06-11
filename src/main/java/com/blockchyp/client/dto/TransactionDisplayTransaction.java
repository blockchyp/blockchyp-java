package com.blockchyp.client.dto;

import java.util.ArrayList;
import java.util.Collection;

public class TransactionDisplayTransaction {
	
	private String subtotal;
	private String tax;
	private String total;
	
	@SuppressWarnings("rawtypes")
	private Collection items;
	
	
	public String getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(String subtotal) {
		this.subtotal = subtotal;
	}
	public String getTax() {
		return tax;
	}
	public void setTax(String tax) {
		this.tax = tax;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	@SuppressWarnings("rawtypes")
	public Collection getItems() {
		return items;
	}
	@SuppressWarnings("rawtypes")
	public void setItems(Collection items) {
		this.items = items;
	}
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void addItem(TransactionDisplayItem item) {
		if (items == null) {
			items = new ArrayList();
		}
		items.add(item);
	}
	
	public TransactionDisplayTransaction withItem(TransactionDisplayItem item) {
		this.addItem(item);
		return this;
	}
	
	@SuppressWarnings("rawtypes")
	public TransactionDisplayTransaction withItems(Collection items) {
		this.setItems(items);
		return this;
	}
	
	

}
