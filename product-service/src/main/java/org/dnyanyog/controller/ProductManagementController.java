package org.dnyanyog.controller;

import org.dnyanyog.dto.ProductRequest;
import org.dnyanyog.dto.ProductResponse;
import org.dnyanyog.services.ProductManagementServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductManagementController {
	
	@Autowired
	ProductManagementServices productService;
	
	@PostMapping(path="/auth/product",
	consumes = {"application/json","application/xml"},
    produces = {"application/json","application/xml"})
    
    public ProductResponse addUpdateProduct(@RequestBody ProductRequest productRequest)
    {
		return productService.addUpdateProduct(productRequest);
    }
	
	@PostMapping(path="/auth/product/update/{productId}",
			 consumes = {"application/json","application/xml"},
		      produces = {"application/json","application/xml"})
	public ProductResponse UpdateProduct(@RequestBody ProductRequest productRequest,@PathVariable Long productId)
	{
		return productService.UpdateProduct(productId, productRequest);
	}
	

	

}
