package com.hotelReservationWebApp.services;

import java.util.List;

import com.hotelReservationWebApp.viewModels.RoomsByCategoryViewModel;

public interface RoomService {
	
	List<RoomsByCategoryViewModel> getRoomsByCategory();
}
