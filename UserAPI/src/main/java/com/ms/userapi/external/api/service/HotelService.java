package com.ms.userapi.external.api.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ms.userapi.bean.Hotel;

@FeignClient(name = "HOTELAPI/hotel")
public interface HotelService {

	@GetMapping("/{hotelId}")
	Hotel getHotel(@PathVariable(name = "hotelId") String hotelId);
}
