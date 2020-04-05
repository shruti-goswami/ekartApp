package com.infosys.product.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.infosys.product.entity.ProductEntity;
import com.infosys.product.model.Product;
import com.infosys.product.repository.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public List<Product> getAllProducts() {

		List<ProductEntity> productEntityList = productRepository.findAll();
		List<Product> productList = new ArrayList<>();

		for (ProductEntity productEntity : productEntityList) {
			Product product = Product.valueOf(productEntity);
			productList.add(product);
		}

		logger.info("Product details : {}", productList);
		return productList;
	}

	// Fetch specific plan details
	public Product getSpecificProduct(String productId) {
		
		Product product = null;
		Optional<ProductEntity> optProductEntity = productRepository.findById(productId);
		if (optProductEntity.isPresent()) {
			ProductEntity productEntity = optProductEntity.get();
			product = Product.valueOf(productEntity);
			logger.info("product in pc"+ product.getProductName());
		}
		return product;
	}
	
	public List<Product> getProductsByName(String productName) {

		logger.info("Product Name " + productName);
		List<ProductEntity> productEntityList = productRepository.findByProductNameStartsWith(productName);
		List<Product> productList = new ArrayList<>();

		for (ProductEntity productEntity : productEntityList) {
			Product product = Product.valueOf(productEntity);
			productList.add(product);
		}

		logger.info("Product details for productName : {}", productList);
		return productList;
	}
	
}
