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
public class Products {
	
	@Column
	private String productName;
	
	@Column
	private int price;
	
	@Column
	private int quantity;
	
	@GeneratedValue
	@Id
	@Column
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
