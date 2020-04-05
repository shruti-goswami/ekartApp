package com.infosys.ekart.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.ekart.controller.RegistrationController;
import com.infosys.ekart.entity.UserEntity;
import com.infosys.ekart.exception.EmailIdAlreadyInUseException;
import com.infosys.ekart.model.User;
import com.infosys.ekart.repository.UserRepository;

@Service
public class RegistrationService {

	private static Logger logger = LoggerFactory.getLogger(RegistrationService.class);
	
	@Autowired
	UserRepository userRepository;
	
	public String registerUser(User user) throws EmailIdAlreadyInUseException {
		//validateUser(user);
		boolean b = userRepository.existsById(user.getEmail());
		logger.info("Id already exists " + b);
		if(b) 	
			throw new EmailIdAlreadyInUseException("RegistrationService.USERID_PRESENT");
		
		UserEntity userEntity = new UserEntity();
		userEntity.setEmail(user.getEmail());
		userEntity.setName(user.getName());
		userEntity.setPassword(user.getPassword());
		userRepository.saveAndFlush(userEntity);
		
		return "UserRespository.REGISTRATION_SUCCESS";
	}
}
