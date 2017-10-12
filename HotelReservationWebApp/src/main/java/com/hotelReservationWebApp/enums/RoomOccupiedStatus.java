package com.hotelReservationWebApp.enums;

public enum RoomOccupiedStatus {
	
	OCCUPIED("Occupied"),
	VACANT("Vacant");
	
	private final String name;
	
	RoomOccupiedStatus(String name){
		this.name= name;
	}

	public String getName() {
		return name;
	}
	
}
