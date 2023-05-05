package com.aeon.validation.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.aeon.validation.dto.ApiErroDTO;

@RestControllerAdvice
public class ApplicationControllerAdvice {

	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ApiErroDTO tratamentoMethodArgumentNotValidException(MethodArgumentNotValidException ex) {
		List<String> erroStrList = ex.getBindingResult()
				.getAllErrors()
				.stream()
				.map(erroStr -> erroStr.getDefaultMessage())
				.collect(Collectors.toList());
		
		return new ApiErroDTO(erroStrList);
	}
		
}
