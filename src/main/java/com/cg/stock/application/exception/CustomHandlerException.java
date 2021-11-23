package com.cg.stock.application.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@ControllerAdvice
public class CustomHandlerException extends ResponseEntityExceptionHandler{
	
	private static final Logger LOG = LoggerFactory.getLogger(CustomHandlerException.class);
	
	@ExceptionHandler(CompanyNotFoundException.class)
	public ResponseEntity<Object> handleCompanyNotFoundException() {
		LOG.error("handleCompanyNotFoundException");
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", "This company is not available in the database.");
		return new ResponseEntity<Object>(null, headers, HttpStatus.NOT_FOUND);
	
	}




}
