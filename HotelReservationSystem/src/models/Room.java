package models;

import enums.RoomCategory;
import enums.RoomOccupancy;
import enums.RoomState;

public abstract class Room {
	
	private RoomCategory roomCategory;
	
	private boolean hasWiFi;
	
	private RoomOccupancy roomOccupancy;
	
	private double defaultRate;
	
	private RoomState roomState;

	public Room(RoomCategory roomCategory, 
			boolean hasWiFi, 
			double defaultRate,
			RoomState roomState) {
		this.roomCategory = roomCategory;
		this.hasWiFi = hasWiFi;
		this.defaultRate = defaultRate;
		this.roomState = roomState;
	}

	protected RoomCategory getRoomCategory() {
		return roomCategory;
	}

	protected void setRoomCategory(RoomCategory roomCategory) {
		this.roomCategory = roomCategory;
	}

	protected boolean isHasWiFi() {
		return hasWiFi;
	}

	protected void setHasWiFi(boolean hasWiFi) {
		this.hasWiFi = hasWiFi;
	}

	protected RoomOccupancy getRoomOccupancy() {
		return roomOccupancy;
	}

	protected void setRoomOccupancy(RoomOccupancy roomOccupancy) {
		this.roomOccupancy = roomOccupancy;
	}

	protected double getDefaultRate() {
		return defaultRate;
	}

	protected void setDefaultRate(double defaultRate) {
		this.defaultRate = defaultRate;
	}

	protected RoomState getRoomState() {
		return roomState;
	}

	protected void setRoomState(RoomState roomState) {
		this.roomState = roomState;
	}
		
}
