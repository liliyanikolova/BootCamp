package com.hotelReservationWebApp.controllers;

import java.util.List;

import com.jcabi.aspects.Loggable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hotelReservationWebApp.exceptions.ExistingCustomerEgnException;
import com.hotelReservationWebApp.services.CustomerService;
import com.hotelReservationWebApp.viewModels.CustomerViewModel;

@Controller
@RequestMapping("/customers")
public class CustomerController {
	
	private CustomerService customerService;

	@Autowired
	public CustomerController(CustomerService customerService) {
		this.customerService = customerService;
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "")
	public ResponseEntity<CustomerViewModel> createCustomer(@RequestBody CustomerViewModel customerViewModel) {
		this.customerService.createCustomer(customerViewModel);
		return new ResponseEntity<>(customerViewModel, HttpStatus.OK);
	}

	@ExceptionHandler(ExistingCustomerEgnException.class)
    public ResponseEntity catchNoFreeRoomsByCategoryException(ExistingCustomerEgnException ecee) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ecee.getMessage());
    }
	
	@RequestMapping(method = RequestMethod.GET, value = "")
	@Loggable
	public ResponseEntity<List<CustomerViewModel>> getAllCustomers() {		
		return new ResponseEntity<>(this.customerService.getAllCustomers(), HttpStatus.OK);
	}
	
}
