package com.hotelReservationWebApp.services;

import java.util.List;

import com.hotelReservationWebApp.viewModels.CustomerViewModel;

public interface CustomerService {
	
	void createCustomer(CustomerViewModel customerViewModel);

	List<CustomerViewModel> getAllCustomers();
}
