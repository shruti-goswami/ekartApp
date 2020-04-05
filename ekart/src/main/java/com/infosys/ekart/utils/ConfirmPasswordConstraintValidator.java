package com.infosys.ekart.utils;

import java.util.Arrays;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.beanutils.BeanUtils;
import org.passay.CharacterRule;
import org.passay.EnglishCharacterData;
import org.passay.LengthRule;
import org.passay.PasswordData;
import org.passay.PasswordValidator;
import org.passay.RuleResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConfirmPasswordConstraintValidator implements ConstraintValidator<ConfirmPassword, Object> {

	private String firstFieldName;
    private String secondFieldName;
    private static Logger logger = LoggerFactory.getLogger(PasswordConstraintValidator.class);
    
    @Override
    public void initialize(ConfirmPassword constraintAnnotation) {
    	firstFieldName = constraintAnnotation.first();
        secondFieldName = constraintAnnotation.second();
        //fieldToBeChecked = constraintAnnotation.fieldToBeChecked();
    }

   
	@Override
    public boolean isValid(Object password, ConstraintValidatorContext context) {
    	String pwd = "";
    	String confirmPwd = "";
    	boolean toReturn = false;
    	try {
    		pwd = BeanUtils.getProperty(password,firstFieldName);
    		confirmPwd = BeanUtils.getProperty(password, secondFieldName);
    		logger.info("p " + pwd);
    		logger.info("confirm " + confirmPwd);
    		toReturn = pwd == null && confirmPwd == null || pwd != null && pwd.equals(confirmPwd);
    	}catch(Exception ex) {
    		logger.info("exception : " + ex.getMessage());
    	}
    	logger.info("p " + pwd);
		logger.info("confirm " + confirmPwd);
    	if( !toReturn) {
    		context.disableDefaultConstraintViolation();
			context.buildConstraintViolationWithTemplate("Passwords do not match").addPropertyNode(secondFieldName).addConstraintViolation();
		} 
    	return toReturn;
    
    	    	      
    	
    }
}
