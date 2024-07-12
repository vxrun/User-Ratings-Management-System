package com.ms.ratingapi.service;

import java.util.List;

import com.ms.ratingapi.entity.Rating;

public interface RatingService {

	public List<Rating> getAllRatings();

	public Rating addRating(Rating rating);

	public Rating getRatingById(String ratingId);
	
	public List<Rating> getRatingByUserId(String userId);
	
	public List<Rating> getRatingByHotelId(String hotelId);


	
}
