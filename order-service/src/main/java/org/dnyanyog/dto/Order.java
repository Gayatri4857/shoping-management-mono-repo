package org.dnyanyog.dto;

import org.springframework.stereotype.Component;

@Component
public class Order {
	
    private long orderId;
	
	private String productIds;
	
	private String totalPrice;
	
	private String quantity;
	
	public long getorderId() {
		return orderId;
	}

	public void setorderId(long orderId) {
		this.orderId = orderId;
	}

	public String getproductIds() {
		return productIds;
	}

	public void setproductIds(String productIds) {
		this.productIds = productIds;
	}

	public String gettotalPrice() {
		return totalPrice;
	}

	public void settotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getquantity() {
		return quantity;
	}

	public void setquantity(String quantity) {
		this.quantity = quantity;
	}

	

	

}
