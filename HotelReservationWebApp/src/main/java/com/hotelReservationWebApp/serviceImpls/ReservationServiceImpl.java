package com.hotelReservationWebApp.serviceImpls;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelReservationWebApp.entities.Customer;
import com.hotelReservationWebApp.entities.Reservation;
import com.hotelReservationWebApp.entities.rooms.Room;
import com.hotelReservationWebApp.enums.RoomOccupiedStatus;
import com.hotelReservationWebApp.exceptions.CustomerNotFoundException;
import com.hotelReservationWebApp.exceptions.NoFreeRoomsByCategoryException;
import com.hotelReservationWebApp.repositories.CustomerRepository;
import com.hotelReservationWebApp.repositories.ReservationRepository;
import com.hotelReservationWebApp.repositories.RoomRepository;
import com.hotelReservationWebApp.services.ReservationService;
import com.hotelReservationWebApp.utils.*;
import com.hotelReservationWebApp.viewModels.MakeReservationViewModel;
import com.hotelReservationWebApp.viewModels.ReservationViewModel;

@Service
public class ReservationServiceImpl implements ReservationService{
	
	private ReservationRepository reservationRepository;
	
	private CustomerRepository customerRepository;
	
	private RoomRepository roomRepository;

	@Autowired
	public ReservationServiceImpl(ReservationRepository reservationRepository, 
			CustomerRepository customerRepository,
			RoomRepository roomRepository) {
		this.reservationRepository = reservationRepository;
		this.customerRepository = customerRepository;
		this.roomRepository = roomRepository;
	}

	@Override
	public void makeReservation(MakeReservationViewModel makeReservationViewModel) {
		Reservation reservation = new Reservation();
		reservation.setStartDate(makeReservationViewModel.getStartDate());
		reservation.setEndDate(makeReservationViewModel.getEndDate());
		Customer customer = this.customerRepository.findByEgn(makeReservationViewModel.getCustomerEgn());
		if(customer == null) {
			throw new CustomerNotFoundException(Messages.NO_SUCH_CUSTOMER);
		}
		
		reservation.setCustomer(customer);
		String category = makeReservationViewModel.getRoomCategory();
		String occupancyType = makeReservationViewModel.getRoomOccupancyType();
		List<Room> freeRooms = this.roomRepository.getAllFreeRoomsByCategoryAndOccupancyType(category, occupancyType);
		if(freeRooms.size() == 0) {
			throw new NoFreeRoomsByCategoryException(Messages.NO_FREE_ROOMS_BY_SELECTED_CATEGORY);
		}
		
		Room room = freeRooms.get(0);
		room.setRoomOccupiedStatus(RoomOccupiedStatus.OCCUPIED);
		reservation.setRoom(room);
				
		this.reservationRepository.saveAndFlush(reservation);
	}

	@Override
	public List<ReservationViewModel> getAllReservations() {
		List<ReservationViewModel> reservationViewModels = new ArrayList<>();
		List<Reservation> reservations = this.reservationRepository.findAll();
		for (Reservation reservation : reservations) {
			ReservationViewModel reservationViewModel = new ReservationViewModel();
			reservationViewModel.setStartDate(reservation.getStartDate());
			reservationViewModel.setEndDate(reservation.getEndDate());
			reservationViewModel.setCustomerFirstName(reservation.getCustomer().getFirstName());
			reservationViewModel.setCustomerLastName(reservation.getCustomer().getLastName());
			reservationViewModel.setCustomerEgn(reservation.getCustomer().getEgn());
			reservationViewModel.setRoomCategory(reservation.getRoom().getCategory());
			reservationViewModel.setRoomOccupancyType(reservation.getRoom().getOccupancyType().toString());
			reservationViewModel.setChargedAmount(reservation.getChargedAmount());
			
			reservationViewModels.add(reservationViewModel);
		}
		
		return reservationViewModels;
	}
	
	
	
}
