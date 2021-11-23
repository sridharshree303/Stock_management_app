package com.cg.stock.application.exception;

public class StockNotFoundException extends RuntimeException {


	/**
	 * 
	 */
	private static final long serialVersionUID = -1010258932709338694L;

	public StockNotFoundException() {
		super();
	}

	public StockNotFoundException(String message) {
		super(message);
	}
	
}
