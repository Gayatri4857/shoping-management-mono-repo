package org.dnyanyog.services;

import java.util.Optional;

import org.dnyanyog.dto.ProductRequest;
import org.dnyanyog.dto.ProductResponse;
import org.dnyanyog.entity.Products;
import org.dnyanyog.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductManagementServices {
	@Autowired
	ProductRepository productRepo;
	
	public ProductResponse addUpdateProduct(ProductRequest request) {
		ProductResponse response = new ProductResponse();
		Products productsTable = new Products();
		
		productsTable.setproductName(request.getproductName());
		productsTable.setprice(request.getprice());
		productsTable.setquantity(request.getquantity());
		productsTable = productRepo.save(productsTable);
		
		response.setproductId(productsTable.getproductId());
		response.setproductName(productsTable.getproductName());
		response.setprice(productsTable.getprice());
		
		return response;
	
	}
        public ProductResponse UpdateProduct(Long productId, ProductRequest request) {
		
		ProductResponse response = new ProductResponse();
		Optional<Products> receivedData = productRepo.findById(productId);
		if(receivedData.isPresent()) {
			
		Products productsTable = new Products();
		
		productsTable.setproductName(request.getproductName());
		productsTable.setprice(request.getprice());
		productsTable.setquantity(request.getquantity());
		productsTable.setproductId(productId);
		productsTable = productRepo.save(productsTable);
	    
		response.setproductId(productsTable.getproductId());
		response.setproductName(productsTable.getproductName());
		response.setprice(productsTable.getprice());
	    
	
	}
		return response;
	}

}
