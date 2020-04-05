package com.infosys.ekart.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.ekart.entity.UserEntity;
import com.infosys.ekart.entity.WishlistEntity;
import com.infosys.ekart.exception.EmailIdAlreadyInUseException;
import com.infosys.ekart.exception.ProductAlreadyAddedInWishlistException;
import com.infosys.ekart.repository.WishlistRepository;

@Service
public class WishlistService {
	
	@Autowired
	private WishlistRepository wishlistRepository;
	
	private static Logger logger = LoggerFactory.getLogger(LoginService.class);

	public void deleteProduct(String userId, String productId) throws Exception {
		try {
		WishlistEntity wishListItem = wishlistRepository.findByUserEmailAndProductId(userId, productId);
		wishlistRepository.delete(wishListItem);
		} catch(Exception e ) {
			logger.info("Exception : " + e.getMessage());
			throw new Exception("WishlistService.UNABLE_TO_DELETE");
		}
		
	}
	
	public String addProductToWishlist(String userId, String productId) throws Exception {
		WishlistEntity wishlistItem = null ;
		try {
			wishlistItem = wishlistRepository.findByUserEmailAndProductId(userId, productId);
		} catch(Exception e) {
			logger.info("exception while fethching : "+ e.getMessage());
			return "WishlistService.UNABLE_TO_ADD_PRODUCT";
		}
		if(wishlistItem != null ) {	
			logger.info("WishlistService : throwing nProduct ALready added");
			return "WishlistService.PRODUCT_ALREADY_ADDED";
			//throw new ProductAlreadyAddedInWishlistException("WishlistService.PRODUCT_ALREADY_ADDED");
		}
		
		wishlistItem = new WishlistEntity();
		wishlistItem.setProductId(productId);
		wishlistItem.setUserEmail(userId);
		wishlistRepository.saveAndFlush(wishlistItem);
		
		return "WishlistService.PRODUCT_ADDED_SUCCESFFULY_IN_WISHLIST";
	}
	
	//This method will return the productIds for the products for a particular user.
	public List<String> viewWishlist(String userId) {
		return wishlistRepository.findByUserEmail(userId);
	}
}
