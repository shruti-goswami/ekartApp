package com.infosys.ekart.exception;

public class InvalidCredentialException extends Exception {
	private static final long serialVersionUID = 1L;

	public InvalidCredentialException(String message) {
		super(message);
	}
}
