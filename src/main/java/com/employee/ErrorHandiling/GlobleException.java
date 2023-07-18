package com.employee.ErrorHandiling;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


import com.employee.NoSuchElementError.UserNotFoundException;

@RestControllerAdvice
public class GlobleException {
	
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String, String> handleInvalidArgument(MethodArgumentNotValidException ex){
		Map<String, String> erroeMap = new HashMap<>();
		
		ex.getBindingResult().getFieldErrors().forEach(error->{
			
			erroeMap.put(error.getField(),error.getDefaultMessage());
			
		});
		return erroeMap;
	}
	
	@ExceptionHandler(UserNotFoundException.class)
	 public Map<String, String> handleBusinessException(UserNotFoundException ex){
		
		Map<String, String> errorMap = new HashMap<>();
		
		errorMap.put("errorMessage", ex.getMessage());
		
		return errorMap;
	}
	

}
