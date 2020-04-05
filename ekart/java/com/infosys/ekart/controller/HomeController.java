package com.infosys.ekart.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;
import com.infosys.ekart.model.Product;

@Controller
//@SessionAttributes("contextPath")
public class HomeController {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@GetMapping(value = "/")
	public ModelAndView getHomeDetails(/* HttpSession session, HttpServletRequest request */) {
		//session.setAttribute("contextPath", request.getContextPath());
		List<Product> productList = new RestTemplate().getForObject("http://localhost:5001/products" , List.class);
		logger.info("product details : " + productList);
        ModelAndView modelAndView = new ModelAndView("ekartHome");
        modelAndView.addObject("productList", productList);
		return new ModelAndView("ekartHome","","");
	}
	
	
}
