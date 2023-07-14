package com.employee.ErrorHandiling;

import java.util.HashMap;
import java.util.Map;



import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;


import org.springframework.web.bind.annotation.RestControllerAdvice;



@RestControllerAdvice
public class ExcepetionHandeler {
	
	
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String, String> handleError(MethodArgumentNotValidException ex){
		
		Map<String, String> errorMap = new HashMap<>();
		
		ex.getBindingResult().getFieldErrors().forEach(error ->{
			errorMap.put(error.getField(), error.getDefaultMessage());
		});
		return errorMap;
		
		
	}
	
//
//	@ExceptionHandler(NoSuchElementException.class)
//	public Map<String, String> handleError(NoSuchElementException ex){
//		
//		Map<String, String> errorMap = new HashMap<>();
//		
//	      errorMap.put("errorMessage", ex.getMessage());
//		return errorMap;
//		
//		
//	}
	    
	
	


}
