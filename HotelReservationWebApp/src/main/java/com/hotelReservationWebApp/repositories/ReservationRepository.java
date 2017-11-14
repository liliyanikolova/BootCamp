package com.hotelReservationWebApp.repositories;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hotelReservationWebApp.entities.Reservation;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long>{
	
//	@Query(value = "SELECT COUNT(res) "
//			+ "FROM Reservations AS res "
//			+ "JOIN res.room AS rms "
//			+ "WHERE rms.category = :category AND rms.occupancyType = :occupancyType AND res.startDate > :endDate AND res.endDate < : startDate"
//			)
//	Integer countAllFreeRoomsByCategoryAndOccupancyTypeInPeriod(@Param("category") String category, 
//			@Param("occupancyType") OccupancyType occupancyType,
//			@Param("startDate") LocalDate startDate,
//			@Param("endDate") LocalDate endDate);
	
	@Query(value = "SELECT res "
			+ "FROM Reservation AS res "
			+ "WHERE (res.startDate < :startDate AND res.endDate < :startDate) OR "
			+ "(res.startDate > :endDate AND res.endDate > :endDate)")
	List<Reservation> findAllAfterStartDate(@Param("startDate") LocalDate startDate, @Param("endDate") LocalDate endDate);
	
}
