package com.hotelReservationWebApp.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.hotelReservationWebApp.utils.*;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = Messages.NO_SUCH_CUSTOMER)
public class CustomerNotFoundException extends RuntimeException{
	
	public CustomerNotFoundException() {
	}
	
	public CustomerNotFoundException(String message) {
		super(message);
	}	
	
}
