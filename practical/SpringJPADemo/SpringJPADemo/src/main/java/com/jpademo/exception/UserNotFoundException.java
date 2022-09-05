package com.jpademo.exception;

public class UserNotFoundException extends RuntimeException{


	private static final long serialVersionUID = 5751721638004233094L;

	public UserNotFoundException(String message) {
		super(message);
		
	}
	
	
	

}
