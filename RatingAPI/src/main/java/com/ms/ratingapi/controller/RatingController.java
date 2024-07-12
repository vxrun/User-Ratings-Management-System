package com.ms.ratingapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ms.ratingapi.entity.Rating;
import com.ms.ratingapi.service.RatingService;

@RestController
public class RatingController {
	
	@Autowired
	private RatingService ratingService;

	@GetMapping("/getAllRatings")
	public ResponseEntity<List<Rating>> getAllRating() {
		List<Rating> allRatings = ratingService.getAllRatings();
		return new ResponseEntity<>(allRatings, HttpStatus.OK);
	}

	@PostMapping("/addRating")
	public ResponseEntity<Rating> addRating(@RequestBody Rating rating) {
		Rating allRatings = ratingService.addRating(rating);
		return new ResponseEntity<>(allRatings, HttpStatus.OK);
	}

	@GetMapping("/{ratingId}")
	public ResponseEntity<Rating> getByRatingId(@PathVariable(name = "ratingId") String ratingId) {
		Rating rating = ratingService.getRatingById(ratingId);
		return new ResponseEntity<>(rating, HttpStatus.OK);
	}
	
	@GetMapping("/user/{userId}")
	public ResponseEntity<List<Rating>> getByUserId(@PathVariable(name = "userId") String ratingId) {
		List<Rating> rating = ratingService.getRatingByUserId(ratingId);
		return new ResponseEntity<>(rating, HttpStatus.OK);
	}
	
	@GetMapping("/hotel/{hotelId}")
	public ResponseEntity<List<Rating>> getByHotelId(@PathVariable(name = "hotelId") String hotelId) {
		List<Rating> rating = ratingService.getRatingByHotelId(hotelId);
		return new ResponseEntity<>(rating, HttpStatus.OK);
	}
}
