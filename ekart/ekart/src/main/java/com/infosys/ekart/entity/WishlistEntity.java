package com.infosys.ekart.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="wishlist")
@IdClass(WishlistId.class)
public class WishlistEntity {

	@Id
	@Column(name="product_id")
	private String productId;
	
	@Id
	@Column(name="user_email")
	private String userEmail;

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	
	
}
