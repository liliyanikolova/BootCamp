package com.hotelReservationWebApp.services;

import java.util.List;

import com.hotelReservationWebApp.viewModels.MakeReservationViewModel;
import com.hotelReservationWebApp.viewModels.ReservationViewModel;

public interface ReservationService {
	
	ReservationViewModel makeReservation(MakeReservationViewModel makeReservationViewModel);
	
	List<ReservationViewModel> getAllReservations();
}
