package com.infosys.ekart.exception;

public class ProductAlreadyAddedInWishlistException extends Exception {

	private static final long serialVersionUID = 1L;

	public ProductAlreadyAddedInWishlistException(String message) {
		super(message);
	}
}
