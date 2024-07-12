package com.ms.hotelapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ms.hotelapi.entity.Hotel;
import com.ms.hotelapi.service.HotelService;

@RestController
public class HotelController {

	@Autowired
	private HotelService hotelService;

	@GetMapping("/getAllHotels")
	public ResponseEntity<List<Hotel>> getAllHotel() {
		List<Hotel> allHotels = hotelService.getAllHotels();
		return new ResponseEntity<>(allHotels, HttpStatus.OK);
	}

	@PostMapping("/addHotel")
	public ResponseEntity<Hotel> addHotel(@RequestBody Hotel hotel) {
		Hotel allHotels = hotelService.addHotel(hotel);
		return new ResponseEntity<>(allHotels, HttpStatus.OK);
	}

	@GetMapping("/{hotelId}")
	public ResponseEntity<Hotel> getByHotelId(@PathVariable(name = "hotelId") String hotelId) {
		Hotel hotel = hotelService.getHotelById(hotelId);
		return new ResponseEntity<>(hotel, HttpStatus.OK);
	}

}
