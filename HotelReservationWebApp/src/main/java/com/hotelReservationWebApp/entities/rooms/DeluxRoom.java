package com.hotelReservationWebApp.entities.rooms;

import javax.persistence.*;

import com.hotelReservationWebApp.utils.Constants;

@Entity
@DiscriminatorValue(value = "Delux")
public class DeluxRoom extends WifiRoom{
	
	public DeluxRoom() {
		this.setCategory(Constants.DELUX_CATEGORY);
		this.setRate(Constants.DELUX_ROOM_DEFAULT_RATE);
	}
}
