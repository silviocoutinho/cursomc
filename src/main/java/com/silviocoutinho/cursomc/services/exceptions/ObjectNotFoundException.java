package com.silviocoutinho.cursomc.services.exceptions;

public class ObjectNotFoundException extends RuntimeException {


	private static final long serialVersionUID = -6260611030867498367L;
	
	public ObjectNotFoundException(String msg) {
		super(msg);
	}
	
	
	public ObjectNotFoundException(String msg, Throwable cause) {
		super(msg, cause);
	}

}
