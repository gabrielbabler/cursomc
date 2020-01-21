package com.gbabler.cursomc.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class NotFoundException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	private ErrorResponse error;
	
	public NotFoundException(String message) {
		this.error = new ErrorResponse(message);
	}
}
