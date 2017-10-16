package com.hotelReservationWebApp.services;

import java.util.List;

import com.hotelReservationWebApp.viewModels.MakeReservationViewModel;
import com.hotelReservationWebApp.viewModels.ReservationViewModel;

public interface ReservationService {
	
	void makeReservation(MakeReservationViewModel makeReservationViewModel);
	
	List<ReservationViewModel> getAllReservations();
}
