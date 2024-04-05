package com.product.controllers;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {

	
	@ExceptionHandler(value = Exception.class)
	public String error() {
		
		return "redirect:/error-page";
	}
}
