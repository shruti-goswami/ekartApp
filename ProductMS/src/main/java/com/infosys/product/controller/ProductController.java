package com.infosys.product.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.product.model.Product;
import com.infosys.product.service.ProductService;

@RestController
@CrossOrigin
public class ProductController {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	ProductService productService;

	// Fetches all plan details
	@GetMapping(value = "/products", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Product> getAllPlans() {
		logger.info("Fetching all plans");
		return productService.getAllProducts();
	}

	//Fetch product details based on name 
	@GetMapping(value="/searchproduct/{productName}")
	public List<Product> getProductsByName(@PathVariable String productName){
		logger.info("product name : " + productName);
		return productService.getProductsByName(productName);
	}
	
	// Fetch plan details of a specific plan
	@GetMapping(value = "/products/{productId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Product getSpecificPlans(@PathVariable String productId) {
		logger.info("Fetching details of plan {}", productService.getSpecificProduct(productId).getCategory());
		Product product = productService.getSpecificProduct(productId);
		return product;
	}
}
