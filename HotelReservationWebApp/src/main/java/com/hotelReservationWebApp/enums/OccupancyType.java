package com.hotelReservationWebApp.enums;

public enum OccupancyType {

	SINGLE("Single"),
	DOUBLE("Double");

	private final String name;

	OccupancyType(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
