package com.hotelReservationWebApp.serviceImpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelReservationWebApp.entities.Customer;
import com.hotelReservationWebApp.exceptions.ExistingCustomerEgnException;
import com.hotelReservationWebApp.repositories.CustomerRepository;
import com.hotelReservationWebApp.services.CustomerService;
import com.hotelReservationWebApp.utils.Messages;
import com.hotelReservationWebApp.viewModels.CustomerViewModel;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	private CustomerRepository customerRepository;

	@Autowired
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	@Override
	public void createCustomer(CustomerViewModel customerViewModel) {
		Customer customer = this.customerRepository.findByEgn(customerViewModel.getEgn());
		if(customer != null) {
			throw new ExistingCustomerEgnException(Messages.EXISTING_CUSTOMER_EGN);
		}
		
		customer = new Customer();
		customer.setEgn(customerViewModel.getEgn());
		customer.setFirstName(customerViewModel.getFirstName());
		customer.setLastName(customerViewModel.getLastName());
		this.customerRepository.saveAndFlush(customer);
	}

}
