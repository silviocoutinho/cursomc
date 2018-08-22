package com.silviocoutinho.cursomc.services.exceptions;

public class DataIntegrityViolationException extends RuntimeException {


	private static final long serialVersionUID = -6260611030867498367L;
	
	public DataIntegrityViolationException(String msg) {
		super(msg);
	}
	
	
	public DataIntegrityViolationException(String msg, Throwable cause) {
		super(msg, cause);
	}

}
