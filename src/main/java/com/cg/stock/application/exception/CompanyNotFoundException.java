package com.cg.stock.application.exception;

public class CompanyNotFoundException extends RuntimeException {

	/**
		 * 
		 */
	private static final long serialVersionUID = 147784517467862451L;

	public CompanyNotFoundException() {

		super();
	}

	public CompanyNotFoundException(String message) {
		super(message);
	}
}
