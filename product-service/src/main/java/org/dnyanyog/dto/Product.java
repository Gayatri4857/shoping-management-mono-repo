package org.dnyanyog.dto;

import org.springframework.stereotype.Component;

@Component
public class Product {
	
	private String productName;
	private int price;
	private int quantity;
	private long productId;
	public String getproductName() {
		return productName;
	}
	public void setproductName(String productName) {
		this.productName = productName;
	}
	public int getprice() {
		return price;
	}
	public void setprice(int price) {
		this.price = price;
	}
	public int getquantity() {
		return quantity;
	}
	public void setquantity(int quantity) {
		this.quantity = quantity;
	}
	public long getproductId() {
		return productId;
	}
	public void setproductId(long productId) {
		this.productId = productId;
	}
	
	

}
