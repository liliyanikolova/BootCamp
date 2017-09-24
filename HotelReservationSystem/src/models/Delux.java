package models;

import enums.RoomCategory;
import enums.RoomState;
import utils.Constants;

public class Delux extends Room{
	
	private static final boolean HAS_WIFI = true;

	public Delux() {
		super(RoomCategory.Delux, HAS_WIFI, Constants.DEFAULT_RATE, RoomState.Free);
		
	}

}
