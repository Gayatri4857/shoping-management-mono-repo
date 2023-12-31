package org.dnyanyog.entity;

import org.springframework.stereotype.Component;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Component
@Table
public class Orders {

	@GeneratedValue
	@Id
	@Column
	private long orderId;
	
	@Column
	private String productIds;
	
	@Column
	private String totalPrice;
	
	@Column
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
