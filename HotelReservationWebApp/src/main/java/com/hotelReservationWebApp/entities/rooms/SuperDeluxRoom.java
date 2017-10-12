package com.hotelReservationWebApp.entities.rooms;

import javax.persistence.*;

import com.hotelReservationWebApp.utils.Constants;

@Entity
@DiscriminatorValue(value = "SuperDelux")
public class SuperDeluxRoom extends WifiRoom{
	
	public SuperDeluxRoom() {
		this.setCategory(Constants.SUPER_DELUX_CATEGORY);
		this.setRate(Constants.SUPER_DELUX_ROOM_DEFAULT_RATE);
	}
}
