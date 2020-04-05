package com.infosys.ekart.exception;

public class EmailIdAlreadyInUseException extends Exception {
	private static final long serialVersionUID = 1L;
	public EmailIdAlreadyInUseException(String message) {
		super(message);
	}
}

