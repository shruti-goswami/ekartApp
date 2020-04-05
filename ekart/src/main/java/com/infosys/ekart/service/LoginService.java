package com.infosys.ekart.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.ekart.controller.RegistrationController;
import com.infosys.ekart.entity.UserEntity;
import com.infosys.ekart.exception.InvalidCredentialException;
import com.infosys.ekart.model.Login;
import com.infosys.ekart.model.User;
import com.infosys.ekart.repository.UserRepository;
@Service
public class LoginService {
	@Autowired
	private UserRepository userRepository;	
	
	private static Logger logger = LoggerFactory.getLogger(LoginService.class);
	public User authenticateLogin(Login userLogin) throws InvalidCredentialException{
		
		UserEntity userentity = null;
		try {
		userentity = userRepository.getOne(userLogin.getEmail());
		logger.info("userEntity "+ userentity);
		} catch(Exception e) {
			logger.info("exception  "+ e.getMessage());
			throw new InvalidCredentialException(
					"LoginService.USER_DOES_NOT_EXISTS");
		}
		User user = new User();;
		if(userentity!=null) {
			user.setEmail(userentity.getEmail());
			user.setName(userentity.getName());
			user.setPassword(userentity.getPassword());
			if(!(user.getPassword().equals(userLogin.getPassword()))){
				throw new InvalidCredentialException(
						"LoginService.INVALID_CREDENTIALS");
			}
		}
		
		
			return user;				
		}
	}