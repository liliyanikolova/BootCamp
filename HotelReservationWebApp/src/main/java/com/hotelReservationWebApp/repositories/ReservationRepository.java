package com.hotelReservationWebApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotelReservationWebApp.entities.Reservation;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long>{
	
}
