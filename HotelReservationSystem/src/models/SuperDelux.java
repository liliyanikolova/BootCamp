package models;

import enums.RoomCategory;
import enums.RoomState;
import utils.Constants;

public class SuperDelux extends Room{
	
	private static final boolean HAS_WIFI = true;

	public SuperDelux() {
		super(RoomCategory.Delux, HAS_WIFI, Constants.DEFAULT_RATE, RoomState.Free);
		
	}

}
