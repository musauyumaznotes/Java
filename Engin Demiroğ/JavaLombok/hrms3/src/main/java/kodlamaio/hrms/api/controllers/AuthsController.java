package kodlamaio.hrms.api.controllers;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.AuthService;
import kodlamaio.hrms.core.utilities.results.ErrorDataResult;


import kodlamaio.hrms.entities.dtos.EmployerForRegisterDto;
import kodlamaio.hrms.entities.dtos.UserForLoginDto;

@RestController
@RequestMapping("/api/auths")
public class AuthsController {
	private AuthService authService;

	@Autowired
	public AuthsController(AuthService authService) {
		super();
		this.authService = authService;
	}
	@PostMapping(value = "/registeremployer")
	public ResponseEntity<?> registerEmployer(@Valid @RequestBody EmployerForRegisterDto employerForRegisterDto) {
		return ResponseEntity.ok(authService.registerEmployer(employerForRegisterDto));
	}
	@PostMapping(value = "/loginuser")
	public ResponseEntity<?> loginUser(@Valid @RequestBody UserForLoginDto userForLoginDto){
		return ResponseEntity.ok(authService.loginUser(userForLoginDto));
	}
	
	
	
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ErrorDataResult<Object> handleValidationException(MethodArgumentNotValidException exceptions){
		Map<String, String> validationErrors = new HashMap<String, String>();
		for(FieldError fieldError: exceptions.getBindingResult().getFieldErrors()) {
			validationErrors.put(fieldError.getField(), fieldError.getDefaultMessage());
		}
		ErrorDataResult<Object> errors = new ErrorDataResult<Object>(validationErrors,"Doğrulama hataları");
		return errors;
	}
}
