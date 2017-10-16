package com.hotelReservationWebApp.viewModels;

import org.hibernate.validator.constraints.NotEmpty;

public class CustomerViewModel {
	
	@NotEmpty(message = "Enter first name")
	private String firstName;

	@NotEmpty(message = "Enter last name")
	private String lastName;

	@NotEmpty(message = "Enter EGN")
	private String egn;

	public CustomerViewModel() {
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEgn() {
		return this.egn;
	}

	public void setEgn(String egn) {
		this.egn = egn;
	}
}
