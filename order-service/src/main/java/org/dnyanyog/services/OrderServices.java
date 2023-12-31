package org.dnyanyog.services;

import org.dnyanyog.dto.OrderServiceRequest;
import org.dnyanyog.dto.OrderServiceResponse;
import org.dnyanyog.entity.Orders;
import org.dnyanyog.repo.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServices {
	@Autowired
	OrderRepository orderRepo;
	
	public OrderServiceResponse addUpdateOrder(OrderServiceRequest request) {
		OrderServiceResponse response = new OrderServiceResponse();
		Orders ordersTable = new Orders();
		ordersTable.setproductIds(request.getproductIds());
		ordersTable.setquantity(request.getquantity());
		ordersTable.settotalPrice(request.gettotalPrice());
		
		ordersTable = orderRepo.save(ordersTable);
		
		response.setorderId(ordersTable.getorderId());
		response.setproductIds(ordersTable.getproductIds());
		response.settotalPrice(ordersTable.gettotalPrice());
		
		
		return response;
		
	}
	public String deleteorder(Long orderId) {
		orderRepo.deleteById(orderId);
			return "Ordered cancelled Successfully" +orderId;
		}
	
	

}
