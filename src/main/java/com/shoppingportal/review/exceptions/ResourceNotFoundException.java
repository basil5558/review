package com.shoppingportal.review.exceptions;

public class ResourceNotFoundException extends RuntimeException {
	
	public ResourceNotFoundException(String errorMessage) {
        super(errorMessage);
    }

}
