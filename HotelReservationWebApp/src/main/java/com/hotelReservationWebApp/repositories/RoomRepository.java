package com.hotelReservationWebApp.repositories;

import java.time.LocalDate;
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
	
//	@Query(value = "SELECT r "
//			+ "FROM Room AS r "
//			+ "WHERE r.category = :category AND r.occupancyType = :occupancyType "
//			)
//	List<Room> getAllFreeRoomsByCategoryAndOccupancyType(@Param("category") String category, @Param("occupancyType") OccupancyType occupancyType);
	
//	@Query(value = "SELECT rms "
//			+ "FROM Reservation AS res "
//			+ "JOIN res.room AS rms "
//			+ "WHERE rms.category = :category AND rms.occupancyType = :occupancyType AND"
//			+ "((res.startDate < :startDate AND res.endDate < :startDate) OR "
//			+ "(res.startDate > :endDate AND res.endDate > :endDate))"
//			)
	@Query(value = "SELECT rms "
			+ "FROM Room AS rms "
			+ "LEFT JOIN rms.reservations AS res "
			+ "WHERE rms.category = :category AND rms.occupancyType = :occupancyType AND"
			+ "((res.startDate < :startDate AND res.endDate < :startDate) OR "
			+ "(res.startDate > :endDate AND res.endDate > :endDate))"
			)
	List<Room> getAllFreeRoomsByCategoryAndOccupancyTypeInPeriod(@Param("category") String category, 
			@Param("occupancyType") OccupancyType occupancyType,
			@Param("startDate") LocalDate startDate,
			@Param("endDate") LocalDate endDate);
}
