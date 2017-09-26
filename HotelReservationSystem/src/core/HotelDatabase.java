package core;

import java.util.*;

import models.Room;

public class HotelDatabase {
	
	private List<Room> rooms;

	public HotelDatabase(List<Room> rooms) {
		this.rooms = rooms;
	}

	public List<Room> getRooms() {
		return Collections.unmodifiableList(rooms);
	}

	protected void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}
	
	public void addRoom(Room room) {
		if(room != null) {
			this.rooms.add(room);
		}
	}
	
}
