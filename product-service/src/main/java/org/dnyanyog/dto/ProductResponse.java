package org.dnyanyog.dto;

import org.springframework.stereotype.Component;

@Component
public class ProductResponse {
	
	private long productId;
	private String productName;
	private int price;
	public long getproductId() {
		return productId;
	}
	public void setproductId(long productId) {
		this.productId = productId;
	}
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
	
	

}
