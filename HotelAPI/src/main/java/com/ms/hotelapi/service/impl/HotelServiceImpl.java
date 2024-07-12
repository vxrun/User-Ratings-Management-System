package com.ms.hotelapi.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.hotelapi.entity.Hotel;
import com.ms.hotelapi.exception.ResourceNotFoundException;
import com.ms.hotelapi.repository.HotelRepository;
import com.ms.hotelapi.service.HotelService;

@Service
public class HotelServiceImpl implements HotelService {

	@Autowired
	private HotelRepository hotelRepository;

	@Override
	public List<Hotel> getAllHotels() {
		return hotelRepository.findAll();
	}

	@Override
	public Hotel addHotel(Hotel hotel) {
		String id = UUID.randomUUID().toString();
		hotel.setHotelId(id);
		return hotelRepository.save(hotel);
	}

	@Override
	public Hotel getHotelById(String hotelId) {
		return hotelRepository.findById(hotelId).orElseThrow(()-> new ResourceNotFoundException("hotel with given id not found!!"));
	}

}
