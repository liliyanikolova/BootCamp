package com.hotelReservationWebApp.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hotelReservationWebApp.entities.rooms.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long>{
	
	@Query(value = "SELECT r "
			+ "FROM Room AS r "
			+ "ORDER BY r.category")
	List<Room> findAllOrderByCategoryAsc();
}
