package com.infosys.ekart.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.ekart.entity.UserEntity;
import com.infosys.ekart.model.UpdateUserDetails;
import com.infosys.ekart.repository.UserRepository;

@Service
public class UpdateUserDetailsService {
	@Autowired
	private UserRepository userRepository;	
	
	private static Logger logger = LoggerFactory.getLogger(LoginService.class);
	public void updateDetails(UpdateUserDetails userLogin) throws Exception{
		
		UserEntity userentity = null;
		try {
		userentity = userRepository.getOne(userLogin.getEmail());
		userentity.setName(userLogin.getName());
		userentity.setPassword(userLogin.getPassword());
		userRepository.save(userentity);
		logger.info("userEntity "+ userentity);
		} catch(Exception e) {
			logger.info("exception in service " + e.getMessage());
			throw new Exception("UpdateUserDetailsService.UNABLE_TO_UPDATE");
		}
		
		}
}
