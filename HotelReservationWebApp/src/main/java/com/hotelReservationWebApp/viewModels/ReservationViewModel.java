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

	private String customerFirstName;
	
	private String customerLastName;
	
	private String customerEgn;

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

	public String getCustomerFirstName() {
		return this.customerFirstName;
	}

	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}

	public String getCustomerLastName() {
		return this.customerLastName;
	}

	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}

	public String getCustomerEgn() {
		return this.customerEgn;
	}

	public void setCustomerEgn(String customerEgn) {
		this.customerEgn = customerEgn;
	}

}
