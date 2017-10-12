package com.hotelReservationWebApp.serviceImpls;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelReservationWebApp.entities.rooms.Room;
import com.hotelReservationWebApp.repositories.RoomRepository;
import com.hotelReservationWebApp.services.RoomService;
import com.hotelReservationWebApp.viewModels.RoomsByCategoryViewModel;

@Service
public class RoomServiceImpl implements RoomService{
	
	private RoomRepository roomRepository;

	@Autowired
	public RoomServiceImpl(RoomRepository roomRepository) {
		this.roomRepository = roomRepository;
	}

	@Override
	public List<RoomsByCategoryViewModel> getRoomsByCategory() {
		List<RoomsByCategoryViewModel> roomsByCategoryViewModels = new ArrayList<>();
		List<Room> roomsByCategory = this.roomRepository.findAllOrderByCategoryAsc();
		for (Room room : roomsByCategory) {
			RoomsByCategoryViewModel roomsByCategoryViewModel = new RoomsByCategoryViewModel();
			roomsByCategoryViewModel.setRoomNumber(room.getRoomNumber());
			roomsByCategoryViewModel.setRate(room.getRate());
			roomsByCategoryViewModel.setOccupancyType(room.getOccupancyType().getName());
			roomsByCategoryViewModel.setOccupiedStatus(room.getRoomOccupiedStatus().getName());
			roomsByCategoryViewModel.setCategory(room.getCategory());
			roomsByCategoryViewModels.add(roomsByCategoryViewModel);
		}
		
		return roomsByCategoryViewModels;
	}	
	
}
