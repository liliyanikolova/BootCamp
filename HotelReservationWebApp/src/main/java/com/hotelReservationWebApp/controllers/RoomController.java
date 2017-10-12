package com.hotelReservationWebApp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.hotelReservationWebApp.services.RoomService;
import com.hotelReservationWebApp.viewModels.RoomsByCategoryViewModel;

@Controller
public class RoomController {
	
	private RoomService roomService;

	@Autowired
	public RoomController(RoomService roomService) {
		this.roomService = roomService;
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/rooms")
	public ResponseEntity<List<RoomsByCategoryViewModel>> getAllRoomsByCategory() {		
		return new ResponseEntity<>(this.roomService.getRoomsByCategory(), HttpStatus.OK);
	}

}
