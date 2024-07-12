package com.ms.userapi.external.api.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ms.userapi.bean.Rating;

@FeignClient("RATINGAPI/rating")
public interface RatingService {

	@GetMapping("/user/{userId}")
	public List<Rating> getRatingForUserId(@PathVariable(name = "userId") String userId);
}
