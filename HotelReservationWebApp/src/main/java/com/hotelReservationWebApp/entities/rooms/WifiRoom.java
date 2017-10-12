package com.hotelReservationWebApp.entities.rooms;

import javax.persistence.*;

@Entity
public abstract class WifiRoom extends Room{
	
	@Column(nullable = true)
	private Boolean hasWifi;
	
	protected WifiRoom() {
		this.hasWifi = true;
	}

	public Boolean hasWiFi() {
		return this.hasWifi;
	}
}
