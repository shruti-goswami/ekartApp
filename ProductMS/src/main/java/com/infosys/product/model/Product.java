package com.infosys.product.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.infosys.product.entity.ProductEntity;

public class Product {

	private static Logger logger = LoggerFactory.getLogger(Product.class);
	
	private String productId;

	private String productName;
	
	private String description;
	
	private double price;
	
	private double discount;
	
	private double deliveryCharge;
	
	private double average_rating;
	
	private int quantity;
	
	private String sellerName;
	
	private String category;
	
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getDeliveryCharge() {
		return deliveryCharge;
	}

	public void setDeliveryCharge(double deliveryCharge) {
		this.deliveryCharge = deliveryCharge;
	}

	public double getAverage_rating() {
		return average_rating;
	}

	public void setAverage_rating(double average_rating) {
		this.average_rating = average_rating;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	
	public static Product valueOf(ProductEntity productEntity) {
		Product product = new Product();
		product.setProductId(productEntity.getProductId());
		product.setProductName(productEntity.getProductName());
		product.setAverage_rating(productEntity.getAverage_rating());
		product.setDeliveryCharge(productEntity.getDeliveryCharge());
		product.setDescription(productEntity.getDescription());
		product.setDiscount(productEntity.getDiscount());
		product.setPrice(productEntity.getPrice());
		product.setQuantity(productEntity.getQuantity());
		product.setSellerName(productEntity.getSellerName());
		product.setCategory(productEntity.getCategory());
		logger.info("Category : " + productEntity.getCategory());
		return product;
	}

}
