package com.hotelReservationWebApp.viewModels;

import java.io.Serializable;
import java.time.LocalDate;

import org.hibernate.validator.constraints.NotEmpty;

public class MakeReservationViewModel implements Serializable{

	@NotEmpty(message = "Enter start date")
	private String startDate;
	
	@NotEmpty(message = "Enter end date")
	private String endDate;

	@NotEmpty(message = "Enter room category")
	private String roomCategory;
	
	@NotEmpty(message = "Enter room occupancy type")
	private String roomOccupancyType;

	@NotEmpty(message = "Enter customer EGN")
	private String customerEgn;

	public MakeReservationViewModel() {
	}

	public String getStartDate() {
		return this.startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return this.endDate;
	}

	public void setEndDate(String endDate) {
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

	public String getCustomerEgn() {
		return this.customerEgn;
	}

	public void setCustomerEgn(String customerEgn) {
		this.customerEgn = customerEgn;
	}
}
