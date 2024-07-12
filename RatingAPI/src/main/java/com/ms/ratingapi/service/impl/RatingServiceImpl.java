package com.ms.ratingapi.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.ratingapi.entity.Rating;
import com.ms.ratingapi.exception.ResourceNotFoundException;
import com.ms.ratingapi.repository.RatingRepository;
import com.ms.ratingapi.service.RatingService;

@Service
public class RatingServiceImpl implements RatingService {

	@Autowired
	private RatingRepository ratingRepository;

	@Override
	public List<Rating> getAllRatings() {
		return ratingRepository.findAll();
	}

	@Override
	public Rating addRating(Rating rating) {
		String id = UUID.randomUUID().toString();
		rating.setRatingId(id);
		return ratingRepository.save(rating);
	}

	@Override
	public Rating getRatingById(String ratingId) {
		return ratingRepository.findById(ratingId).orElseThrow(() -> new ResourceNotFoundException());
	}

	@Override
	public List<Rating> getRatingByUserId(String userId) {
		return ratingRepository.findByUserId(userId);
	}

	@Override
	public List<Rating> getRatingByHotelId(String hotelId) {
		return ratingRepository.findByHotelId(hotelId);
	}

}
