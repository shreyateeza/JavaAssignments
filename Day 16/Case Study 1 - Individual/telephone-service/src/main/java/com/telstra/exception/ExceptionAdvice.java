package com.telstra.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionAdvice {
	
	@ExceptionHandler(TelephoneNotFoundException.class)
	public ResponseEntity<CustomErrorResponse> handleTelephoneNotFoundException(TelephoneNotFoundException telephoneNotFoundException){
		
		CustomErrorResponse customErrorResponse = new CustomErrorResponse();
		customErrorResponse.setStatus(HttpStatus.NOT_FOUND.value());
		customErrorResponse.setTimestamp(LocalDateTime.now());
		customErrorResponse.setErrorCode("NOT_FOUND");
		customErrorResponse.setErrorMessage(telephoneNotFoundException.getMessage());
		return new ResponseEntity<CustomErrorResponse>(customErrorResponse, HttpStatus.NOT_FOUND);
		
	}

}
