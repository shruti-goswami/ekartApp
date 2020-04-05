package com.infosys.ekart.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Login {
	@NotNull(message = "Please enter your email")
    private String email;
	
	@NotNull(message = "Please enter your password.")    
	private String password;   

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the userName
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param userName the userName to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
}
