package br.com.sistemalogin.exception;

import javax.servlet.ServletException;

public class InvalidUserException extends ServletException {
	private static final long serialVersionUID = 1L;

	public InvalidUserException(String message) {
		super(message);
	}
	 public InvalidUserException(String message, Throwable cause) {
	        super(message, cause);
	    }
	
}
