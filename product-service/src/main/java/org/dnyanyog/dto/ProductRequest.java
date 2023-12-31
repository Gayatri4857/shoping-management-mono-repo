package org.dnyanyog.dto;

import org.springframework.stereotype.Component;

@Component
public class ProductRequest {

	private String productName;
	private int price;
	private int quantity;
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
	
	
}

