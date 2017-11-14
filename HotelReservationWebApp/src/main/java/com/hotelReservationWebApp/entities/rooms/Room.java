package com.hotelReservationWebApp.entities.rooms;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.hotelReservationWebApp.entities.Reservation;
import com.hotelReservationWebApp.enums.OccupancyType;

@Entity
@Table(name = "rooms")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.STRING)
public abstract class Room {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String roomNumber;
	
	@Column(nullable = false)
	private String category;
	
	@Column(nullable = false)
	private double rate;
	
	@Enumerated(EnumType.STRING)
	private OccupancyType occupancyType;
	
	@OneToMany(mappedBy = "room")
	private List<Reservation> reservations;

	protected Room() { 
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRoomNumber() {
		return this.roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getRate() {
		return this.rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public OccupancyType getOccupancyType() {
		return this.occupancyType;
	}

	public void setOccupancyType(OccupancyType occupancyType) {
		this.occupancyType = occupancyType;
	}

}
