package com.hotelReservationWebApp.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hotelReservationWebApp.entities.rooms.Room;
import com.hotelReservationWebApp.enums.OccupancyType;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long>{
	
	@Query(value = "SELECT r "
			+ "FROM Room AS r "
			+ "ORDER BY r.category"
			)
	List<Room> findAllOrderByCategoryAsc();
	
	@Query(value = "SELECT r "
			+ "FROM Room AS r "
			+ "WHERE r.category = :category AND r.occupancyType = :occupancyType AND r.roomOccupiedStatus = 'Vacant' "
			)
	List<Room> getAllFreeRoomsByCategoryAndOccupancyType(@Param("category") String category, @Param("occupancyType") OccupancyType occupancyType);
}
