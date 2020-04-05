package com.infosys.ekart.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.infosys.ekart.model.UpdateUserDetails;
import com.infosys.ekart.service.UpdateUserDetailsService;

public class UpdateUserDetailsController {

	@Autowired
	private UpdateUserDetailsService userDetailsService;
	
	@Autowired
	private Environment environment;
	
	
}
