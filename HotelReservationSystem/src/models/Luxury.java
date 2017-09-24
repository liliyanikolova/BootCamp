package models;

import enums.RoomCategory;
import enums.RoomState;
import utils.Constants;

public class Luxury extends Room{

	private static final boolean HAS_WIFI = false;
	
	public Luxury() {
		super(RoomCategory.Luxury, HAS_WIFI, Constants.DEFAULT_RATE, RoomState.Free);
		
	}

}
