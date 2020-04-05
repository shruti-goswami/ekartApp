package com.infosys.ekart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.infosys.ekart.entity.WishlistEntity;

public interface WishlistRepository extends JpaRepository<WishlistEntity, String>{
	
	@Query("select w.productId from WishlistEntity w where w.userEmail = ?1")
	List<String> findByUserEmail(String userEmail);

	WishlistEntity findByUserEmailAndProductId(String userEmail, String productId);
}
