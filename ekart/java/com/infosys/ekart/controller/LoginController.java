package com.infosys.ekart.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.infosys.ekart.exception.EmailIdAlreadyInUseException;
import com.infosys.ekart.exception.InvalidCredentialException;
import com.infosys.ekart.model.Login;
import com.infosys.ekart.model.UpdateUserDetails;
import com.infosys.ekart.model.User;
import com.infosys.ekart.service.LoginService;
import com.infosys.ekart.service.RegistrationService;
import com.infosys.ekart.service.UpdateUserDetailsService;

import java.security.Principal;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@Controller
@SessionAttributes({"userName","userId"})
public class LoginController {
	
	private static Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired
	private LoginService loginService;
	
	@Autowired
	private UpdateUserDetailsService userDetailsService;
	
	@Autowired
	private Environment environment;

	@GetMapping(value = "/login")
	public ModelAndView getLoginDetails() {
		return new ModelAndView("login", "command", new Login());
	}

	@PostMapping(value = "/authenticateLogin")
	public ModelAndView authenticateLogin(@Valid @ModelAttribute("command") Login userLogin, BindingResult result,
			ModelMap model) {		

		ModelAndView modelAndView = new ModelAndView("error");
		try {
			if (result.hasErrors()) {
				modelAndView= new ModelAndView("login", "command", userLogin);
			}
			else{
				User user= loginService.authenticateLogin(userLogin);
				
				model.addAttribute("userName", user.getName());
				model.addAttribute("userId", user.getEmail());

			modelAndView = new ModelAndView("loggedInHome", "command",new User());	
			}
		}
		catch (InvalidCredentialException e) {
			
			if (e.getMessage().contains("LoginService")) {
				modelAndView = new ModelAndView("login"); 
				modelAndView.addObject("loginName", userLogin.getEmail());
			}

			modelAndView.addObject("message", environment.getProperty(e.getMessage()));
		}
		return modelAndView;

	}

	@GetMapping(value="/modifyDetails")
	public ModelAndView getModifyDetails() {
		return new ModelAndView("updateDetails","command",new UpdateUserDetails());
	}
	
	@PostMapping(value="/{userId}/updateDetails")
	public ModelAndView modifyDetails(@PathVariable("userId") String userId, @Valid @ModelAttribute("command") UpdateUserDetails userDetails, BindingResult result,
			ModelMap model) {
		ModelAndView modelAndView = new ModelAndView("error");
		logger.info("user Id from URL" + userId);
		if(result.hasErrors()) {
			logger.info("in error" + result.getAllErrors());
			modelAndView= new ModelAndView("updateDetails", "command", userDetails);
		} else {
			try {
				userDetails.setEmail(userId);
				logger.info("session : " + model.getAttribute("userId"));
				userDetailsService.updateDetails(userDetails);
				logger.info("Details updated " );
				modelAndView = new ModelAndView("updateDetails","command",userDetails);
				modelAndView.addObject("successMessage","Details Updated successfully");
			} catch (Exception e) {
				if (e.getMessage().contains("UpdateUserDetailsService")) {
					modelAndView = new ModelAndView("updateDetails"); 
					logger.info("exception msg " + e.getMessage());
					modelAndView.addObject("loginName", userDetails.getEmail());
				}

				modelAndView.addObject("message", environment.getProperty(e.getMessage()));
			}
		}
		return modelAndView;
		
	}
}

