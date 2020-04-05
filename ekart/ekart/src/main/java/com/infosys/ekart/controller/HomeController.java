package com.infosys.ekart.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.infosys.ekart.model.Product;

@Controller
//@SessionAttributes("contextPath")
public class HomeController {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@GetMapping(value = {"/","/home","home/{wishlistAddMessage}"})
	public ModelAndView getHomeDetails( @ModelAttribute("wishlistAddMessage") Optional<String> wishlistAddMessage,HttpSession session,
			HttpServletRequest request) {
		//session.setAttribute("contextPath", request.getContextPath());
		logger.info("contextPath : " + request.getContextPath());
		logger.info("wihslist " + wishlistAddMessage);
		List<Product> productList = new RestTemplate().getForObject("http://localhost:5001/products" , List.class);
		ModelAndView modelAndView = new ModelAndView("ekartHome");
        modelAndView.addObject("productList", productList);
        //session.removeAttribute("userId");
        if(wishlistAddMessage.isPresent()) {
        	modelAndView.addObject("wishlistAddMessage",wishlistAddMessage.get());
        }
        //modelAndView.addObject("productName",new HomePage());
		return modelAndView;
	}
}
