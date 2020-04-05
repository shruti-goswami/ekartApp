package com.infosys.ekart.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class Order {

	@Id
	@Column(name="order_id")
	private String order_id;
	
	@Column(name="display_name")
	private String orderName;
	
	@Column(name="category",nullable = false)
	private String productCategory;
	
	@Column(name="seller_name",nullable = false)
	private String sellerName;
	
	@Column(name="price",nullable = false)
	private double price;
	
	@Column(name="quantity",nullable = false)
	private int quantity;
	
	@Column(name="total_price",nullable = false)
	private double totalPrice;
	
	@Column(name="ordered_date",nullable = false)
	private Date order_date;
	
	@Column(name="order_status",nullable = false)
	private String orderStatus;
}
