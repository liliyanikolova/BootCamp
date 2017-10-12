package com.hotelReservationWebApp.entities.rooms;

import javax.persistence.*;

import com.hotelReservationWebApp.enums.OccupancyType;
import com.hotelReservationWebApp.enums.RoomOccupiedStatus;

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
	
	@Enumerated(EnumType.STRING)
	private RoomOccupiedStatus roomOccupiedStatus;

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

	public RoomOccupiedStatus getRoomOccupiedStatus() {
		return roomOccupiedStatus;
	}

	public void setRoomOccupiedStatus(RoomOccupiedStatus roomOccupiedStatus) {
		this.roomOccupiedStatus = roomOccupiedStatus;
	}

}
