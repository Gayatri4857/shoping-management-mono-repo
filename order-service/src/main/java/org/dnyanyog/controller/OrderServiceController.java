package org.dnyanyog.controller;


import org.dnyanyog.dto.OrderServiceRequest;
import org.dnyanyog.dto.OrderServiceResponse;
import org.dnyanyog.services.OrderServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderServiceController {
	
	@Autowired
	OrderServices orderService;
	
	@PostMapping(path="/auth/order",
			consumes = {"application/json","application/xml"},
			produces = {"application/json","application/xml"})
	public OrderServiceResponse addUpdateOrder(@RequestBody OrderServiceRequest orderRequest)
	{
		return orderService.addUpdateOrder(orderRequest);
	}
	

	@DeleteMapping(path="/auth/order/delete/{orderId}")
	public String deleteorder(@PathVariable Long orderId)
	{
		return orderService.deleteorder(orderId);
		
	}

}
