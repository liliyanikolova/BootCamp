package com.hotelReservationWebApp.viewModels;

import java.io.Serializable;

public class RoomsByCategoryViewModel implements Serializable{
	
	private String roomNumber;
	
	private String category;

	private double rate;

	private String occupancyType;

	private String occupiedStatus;

	public RoomsByCategoryViewModel() {
	}

	public String getRoomNumber() {
		return this.roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getRate() {
		return this.rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public String getOccupancyType() {
		return this.occupancyType;
	}

	public void setOccupancyType(String occupancyType) {
		this.occupancyType = occupancyType;
	}

	public String getOccupiedStatus() {
		return this.occupiedStatus;
	}

	public void setOccupiedStatus(String occupiedStatus) {
		this.occupiedStatus = occupiedStatus;
	}
}
