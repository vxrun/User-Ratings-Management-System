package com.ms.userapi.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.userapi.bean.Rating;
import com.ms.userapi.entity.User;
import com.ms.userapi.exceptions.ResourceNotFoundException;
import com.ms.userapi.external.api.service.HotelService;
import com.ms.userapi.external.api.service.RatingService;
import com.ms.userapi.repository.UserRepository;
import com.ms.userapi.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RatingService ratingService;
	
	@Autowired
	private HotelService hotelService;
	
	@Override
	public List<User> getAllUsers() {
		List<User> allUsers =  userRepository.findAll();
		for (User user : allUsers) {
			user.getRatings().addAll(ratingService.getRatingForUserId(user.getUserId()));
			for (Rating rating : user.getRatings()) {
				rating.setHotel(hotelService.getHotel(rating.getHotelId()));
			}
		}
		return allUsers;
	}

	@Override
	public User saveUser(User user) {
		if(userRepository.getByEmail(user.getEmail()) != null){
			return null;
		}
		String userId = UUID.randomUUID().toString() + "_tpe";
		user.setUserId(userId);
		return userRepository.save(user);
	}

	@Override
	public User getUser(String userId) {
		User user =  userRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundException());
		user.getRatings().addAll(ratingService.getRatingForUserId(user.getUserId()));
		for (Rating rating : user.getRatings()) {
			rating.setHotel(hotelService.getHotel(rating.getHotelId()));
		}
		return user;
	}
	
	
}
