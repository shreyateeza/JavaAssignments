package com.telstra.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class ExceptionAdvice {

@ExceptionHandler(CustomerNotFoundException.class)
public ResponseEntity<CustomErrorResponse> handleCustomerNotFoundException(CustomerNotFoundException customerNotFoundException){
		
		CustomErrorResponse customErrorResponse = new CustomErrorResponse();
		customErrorResponse.setStatus(HttpStatus.NOT_FOUND.value());
		customErrorResponse.setTimestamp(LocalDateTime.now());
		customErrorResponse.setErrorCode("NOT_FOUND");
		customErrorResponse.setErrorMessage(customerNotFoundException.getMessage());
		return new ResponseEntity<CustomErrorResponse>(customErrorResponse, HttpStatus.NOT_FOUND);
		
	}
	
}