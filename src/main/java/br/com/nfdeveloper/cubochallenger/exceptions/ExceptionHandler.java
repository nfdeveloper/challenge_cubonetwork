package br.com.nfdeveloper.cubochallenger.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ExceptionHandler extends ResponseEntityExceptionHandler{

	@org.springframework.web.bind.annotation.ExceptionHandler(NullPointerException.class)
	public ResponseEntity newException(Exception exception) {
		return new ResponseEntity<>("this field is invalid, because it's null", HttpStatus.BAD_REQUEST);
	}
}
