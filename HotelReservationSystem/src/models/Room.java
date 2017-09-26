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
	
	private boolean isReserved;

	public Room(RoomCategory roomCategory, 
			boolean hasWiFi, 
			double defaultRate,
			RoomState roomState) {
		this.roomCategory = roomCategory;
		this.hasWiFi = hasWiFi;
		this.defaultRate = defaultRate;
		this.roomState = roomState;
	}

	public RoomCategory getRoomCategory() {
		return roomCategory;
	}

	protected void setRoomCategory(RoomCategory roomCategory) {
		this.roomCategory = roomCategory;
	}

	public boolean isHasWiFi() {
		return hasWiFi;
	}

	protected void setHasWiFi(boolean hasWiFi) {
		this.hasWiFi = hasWiFi;
	}

	public RoomOccupancy getRoomOccupancy() {
		return roomOccupancy;
	}

	protected void setRoomOccupancy(RoomOccupancy roomOccupancy) {
		this.roomOccupancy = roomOccupancy;
	}

	public double getDefaultRate() {
		return defaultRate;
	}

	protected void setDefaultRate(double defaultRate) {
		this.defaultRate = defaultRate;
	}

	public RoomState getRoomState() {
		return roomState;
	}

	protected void setRoomState(RoomState roomState) {
		this.roomState = roomState;
	}
	
	public boolean isReserved() {
		return isReserved;
	}

	protected void setReserved(boolean isReserved) {
		this.isReserved = isReserved;
	}

	public abstract void changeOccupancyState(RoomOccupancy roomOccupancy);
		
}
