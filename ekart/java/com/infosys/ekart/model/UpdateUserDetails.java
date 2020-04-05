package com.infosys.ekart.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import com.infosys.ekart.utils.ValidPassword;

public class UpdateUserDetails {
	
	@NotEmpty(message="Please enter password to update")
	@ValidPassword
	private String password;
	
	@NotEmpty(message = "Name must not be blank.")
	@Pattern(regexp="^[a-zA-Z\\s]+",message="Name should only contain alphabets")  
	private String name;
	
	@Email
	private String email;

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
