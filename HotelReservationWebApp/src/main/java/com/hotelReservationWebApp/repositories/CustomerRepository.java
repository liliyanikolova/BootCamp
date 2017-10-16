package com.hotelReservationWebApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotelReservationWebApp.entities.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
	
	Customer findByEgn(String egn);
}
