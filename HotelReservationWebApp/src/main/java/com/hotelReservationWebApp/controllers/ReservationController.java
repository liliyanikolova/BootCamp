package com.hotelReservationWebApp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.hotelReservationWebApp.exceptions.CustomerNotFoundException;
import com.hotelReservationWebApp.exceptions.NoFreeRoomsByCategoryException;
import com.hotelReservationWebApp.services.ReservationService;
import com.hotelReservationWebApp.viewModels.MakeReservationViewModel;
import com.hotelReservationWebApp.viewModels.RoomsByCategoryViewModel;

@Controller
@RequestMapping("/reservations")
public class ReservationController {
	
	private ReservationService reservationService;

	@Autowired
	public ReservationController(ReservationService reservationService) {
		this.reservationService = reservationService;
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/add")
	public ResponseEntity<MakeReservationViewModel> makeReservation(@RequestBody MakeReservationViewModel makeReservationViewModel) {
		this.reservationService.makeReservation(makeReservationViewModel);
		return new ResponseEntity<>(makeReservationViewModel, HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "")
	public ResponseEntity<List<MakeReservationViewModel>> getAllReservations() {		
		return new ResponseEntity<>(this.reservationService.getAllReservations(), HttpStatus.OK);
	}
	
	@ExceptionHandler(CustomerNotFoundException.class)
    public ResponseEntity catchCustomertNotFoundException(CustomerNotFoundException cnfe) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(cnfe.getMessage());
    }
	
	@ExceptionHandler(NoFreeRoomsByCategoryException.class)
    public ResponseEntity catchNoFreeRoomsByCategoryException(NoFreeRoomsByCategoryException nfrce) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(nfrce.getMessage());
    }
}
