package com.ms.hotelapi.exception.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ms.hotelapi.bean.ApiResponse;
import com.ms.hotelapi.exception.ResourceNotFoundException;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ApiResponse> resourceNotFoundException(ResourceNotFoundException ex) {
		String message = ex.getMessage();
		ApiResponse apiResponse = ApiResponse.builder().message(message).success(false)
				.httpStatusCode(HttpStatus.NOT_FOUND).build();
		return new ResponseEntity<>(apiResponse, HttpStatus.NOT_FOUND);
	}
}
