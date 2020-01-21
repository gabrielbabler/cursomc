package com.gbabler.cursomc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.gbabler.cursomc.exception.ErrorResponse;
import com.gbabler.cursomc.exception.NotFoundException;

@RestControllerAdvice
public class ControllerAdvice {

	@ExceptionHandler
	public ResponseEntity<ErrorResponse> handleNotFoundException(NotFoundException e) {
		return ResponseEntity.status(HttpStatus.NOT_FOUND)
				.body(ErrorResponse.builder()
						.message(e.getMessage())
						.build());
	}
}
