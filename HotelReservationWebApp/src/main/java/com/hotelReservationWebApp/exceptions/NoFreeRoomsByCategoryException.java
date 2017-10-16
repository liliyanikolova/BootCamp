package com.hotelReservationWebApp.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.hotelReservationWebApp.utils.Messages;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = Messages.NO_FREE_ROOMS_BY_SELECTED_CATEGORY)
public class NoFreeRoomsByCategoryException extends RuntimeException{

	public NoFreeRoomsByCategoryException() {
	}

	public NoFreeRoomsByCategoryException(String message) {
		super(message);
	}
	
}
