package com.hotelReservationWebApp.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.hotelReservationWebApp.utils.Messages;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = Messages.EXISTING_CUSTOMER_EGN)
public class ExistingCustomerEgnException extends RuntimeException{

	public ExistingCustomerEgnException() {
	}

	public ExistingCustomerEgnException(String message) {
		super(message);
	}
	
}
