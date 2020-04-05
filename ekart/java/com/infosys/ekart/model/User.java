package com.infosys.ekart.model;

import javax.validation.constraints.Size;

import com.infosys.ekart.utils.ConfirmPassword;
import com.infosys.ekart.utils.ValidPassword;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;


public class User {

	@NotEmpty(message = "Email must not be blank.")
	@Email
	private String email;

	@ValidPassword()
	private String password;
	
	@ConfirmPassword(first="password",second = "confirmPassword")
	private String confirmPassword;
	
	
	@NotEmpty(message = "Name must not be blank.")
	@Size(min = 4, max = 15, message = "Name must be between 4 to 15 Characters.")
	private String name;
	
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
