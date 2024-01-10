package com.felipe.helpdesk.resources.execeptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.felipe.helpdesk.services.exception.DataIntegrityViolationException;
import com.felipe.helpdesk.services.exception.ObjectnotFoundException;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceExceptionHandler {

	@ExceptionHandler(ObjectnotFoundException.class)
	public ResponseEntity<StandardError> objectnotFoundException(ObjectnotFoundException ex,HttpServletRequest request){
		StandardError error = new StandardError(System.currentTimeMillis(),HttpStatus.NOT_FOUND.value(),"object Not Found",ex.getMessage(),request.getRequestURI());
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
	}
	
	@ExceptionHandler(DataIntegrityViolationException.class)
	public ResponseEntity<StandardError> dataIntegrityViolationException(DataIntegrityViolationException ex,HttpServletRequest request){
		StandardError error = new StandardError(System.currentTimeMillis(),HttpStatus.BAD_REQUEST.value(),"VIOLAÇÃO DE DADOS",ex.getMessage(),request.getRequestURI());
		
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error);
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<StandardError> validationsErrors(MethodArgumentNotValidException ex,HttpServletRequest request){
		
		ValidationError errors = new ValidationError(System.currentTimeMillis(),HttpStatus.BAD_REQUEST.value(),
				"VALIDATION ERROR","ERRO NA VALIDAÇÃO DOS CAMPOS", request.getRequestURI());
		
		for(FieldError x : ex.getBindingResult().getFieldErrors()) {
			errors.addErrors(x.getField(), x.getDefaultMessage());
		}
		
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errors);
	}
}
