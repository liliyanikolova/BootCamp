package com.hotelReservationWebApp.entities.rooms;

import javax.persistence.*;

import com.hotelReservationWebApp.enums.*;
import com.hotelReservationWebApp.utils.Constants;

@Entity
@DiscriminatorValue(value = "Luxury")
public class LuxuryRoom extends Room{
	
	public LuxuryRoom() {
		this.setCategory(Constants.LUXURY_CATEGORY);
		this.setOccupancyType(OccupancyType.DOUBLE);
		this.setRate(Constants.LUXURY_ROOM_DEFAULT_RATE);
	}

	@Override
	public void setOccupancyType(OccupancyType occupancyType) {
		super.setOccupancyType(OccupancyType.DOUBLE);
	}
	
}
