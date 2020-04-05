package com.infosys.product.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infosys.product.entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity,String>{
	
	List<ProductEntity> findByProductNameStartsWith(String productName);

}
