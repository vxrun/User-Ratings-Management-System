package com.ms.hotelapi.service;

import java.util.List;

import com.ms.hotelapi.entity.Hotel;

public interface HotelService {

	public List<Hotel> getAllHotels();
	
	public Hotel addHotel(Hotel hotel);
	
	public Hotel getHotelById(String hotelId);
}
