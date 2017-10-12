package com.hotelReservationWebApp.serviceImpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelReservationWebApp.repositories.ReservationRepository;
import com.hotelReservationWebApp.services.ReservationService;
import com.hotelReservationWebApp.viewModels.MakeReservationViewModel;

@Service
public class ReservationServiceImpl implements ReservationService{
	
	private ReservationRepository reservationRepository;

	@Autowired
	public ReservationServiceImpl(ReservationRepository reservationRepository) {
		this.reservationRepository = reservationRepository;
	}

	@Override
	public void makeReservation(MakeReservationViewModel makeReservationViewModel) {
		// TODO Auto-generated method stub
		
	}
	
}
