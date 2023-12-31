package org.dnyanyog.dto;

import org.springframework.stereotype.Component;

@Component
public class OrderServiceRequest {
private String productIds;
private String quantity;
private String totalPrice;



public String gettotalPrice() {
	return totalPrice;
}
public void settotalPrice(String totalPrice) {
	this.totalPrice = totalPrice;
}
public String getproductIds() {
	return productIds;
}
public void setproductIds(String productIds) {
	this.productIds = productIds;
}
public String getquantity() {
	return quantity;
}
public void setquantity(String quantity) {
	this.quantity = quantity;
}
}
