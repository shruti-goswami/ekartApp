package com.infosys.product.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class ProductEntity {
	
	@Id
	@Column(name="product_id")
	private String productId;
	
	@Column(name="product_name",nullable=false)
	private String productName;
	
	@Column(name="description", nullable = false)
	private String description;
	
	@Column(name="price",nullable = false)
	private double price;
	
	@Column(name="discount",nullable = false)
	private double discount;
	
	@Column(name="delivery_charge",nullable = false)
	private double deliveryCharge;
	
	@Column(name="avg_rating", nullable=false)
	private double average_rating;
	
	@Column(name="quantity",nullable = false)
	private int quantity;
	
	@Column(name="seller_name",nullable = false)
	private String sellerName;
	
	@Column(name="category",nullable = false)
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


}
