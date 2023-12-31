package org.dnyanyog.repo;

import java.util.List;

import org.dnyanyog.dto.Product;
import org.dnyanyog.entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface ProductRepository extends JpaRepository<Products, Long>{
	List<Product> findById(long productId);
}
