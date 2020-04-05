package com.infosys.ekart.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.infosys.ekart.model.Product;
import com.infosys.ekart.service.WishlistService;

@RestController
public class WishlistController {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	Environment environment;
	
	@Autowired
	WishlistService wishlistService ;
	
	@GetMapping(value="{userId}/wishlist")
	public ModelAndView getWishlist(@PathVariable("userId") String userId) {
		logger.info("userId : " + userId);
		List<String> productIdList = wishlistService.viewWishlist(userId);
		List<Product> productList = new ArrayList<Product>();
		for( String productId : productIdList) {
			Product product = new RestTemplate().getForObject("http://localhost:5001/products/"+ productId,Product.class);
			productList.add(product);
		}
		logger.info("product Details " + productList);
		ModelAndView modelAndView = new ModelAndView("wishlist");
        modelAndView.addObject("wishlistItems", productList);
     
		return modelAndView;
	}

	@GetMapping(value="{userId}/wishlist/{productId}/remove")
	public ModelAndView removeProductFromWishlist(@PathVariable("userId") String userId, @PathVariable("productId") String productId) {
		try {
			logger.info("productId : " + productId);
			wishlistService.deleteProduct(userId, productId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ModelAndView("redirect:/"+userId+"/wishlist");
	}
	
	@GetMapping(value="{userId}/wishlist/{productId}/add")
	public ModelAndView addProductToWishlist(@PathVariable("userId") String userId, @PathVariable("productId") String productId,
			RedirectAttributes redirectAttrs) {
		logger.info("userId :" + userId);
		
			String addStatus = "";
			try {
				addStatus = wishlistService.addProductToWishlist(userId, productId);
			} catch (Exception e) {
				e.printStackTrace();
				logger.info("in catch : " + e.getMessage());
			}
			//List<Product> productList = new RestTemplate().getForObject("http://localhost:5001/products" , List.class);
			ModelAndView modelAndView = new ModelAndView("redirect:/home/");
	       // modelAndView.addObject("productList", productList);
			redirectAttrs.addFlashAttribute("wishlistAddMessage", environment.getProperty(addStatus));
	        //modelAndView.addObject("wishlistAddMessage",environment.getProperty(addStatus));
	        return modelAndView;
		}
	
}
