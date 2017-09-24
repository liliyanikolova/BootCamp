package models;

import java.util.List;

public class HotelDatabase {
	
	private List<Room> rooms;

	public HotelDatabase(List<Room> rooms) {
		this.rooms = rooms;
	}

	protected List<Room> getRooms() {
		return rooms;
	}

	protected void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}
	
}
