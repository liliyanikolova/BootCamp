package com.hotelReservationWebApp.viewModels;

import java.io.Serializable;
import java.time.LocalDate;

public class ReservationViewModel implements Serializable{
	
	private LocalDate startDate;

	private LocalDate endDate;

	private String roomCategory;
	
	private String roomOccupancyType;
	
	private String roomNumber;
	
	private Double chargedAmount;

	private CustomerViewModel customerViewModel;

	public ReservationViewModel() {
	}

	public LocalDate getStartDate() {
		return this.startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return this.endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public String getRoomCategory() {
		return this.roomCategory;
	}

	public void setRoomCategory(String roomCategory) {
		this.roomCategory = roomCategory;
	}

	public String getRoomOccupancyType() {
		return this.roomOccupancyType;
	}

	public void setRoomOccupancyType(String roomOccupancyType) {
		this.roomOccupancyType = roomOccupancyType;
	}

	public String getRoomNumber() {
		return this.roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Double getChargedAmount() {
		return this.chargedAmount;
	}

	public void setChargedAmount(Double chargedAmount) {
		this.chargedAmount = chargedAmount;
	}

	public CustomerViewModel getCustomerViewModel() {
		return customerViewModel;
	}

	public void setCustomerViewModel(CustomerViewModel customerViewModel) {
		this.customerViewModel = customerViewModel;
	}
}
