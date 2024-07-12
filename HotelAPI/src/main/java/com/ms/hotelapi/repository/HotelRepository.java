package com.ms.hotelapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ms.hotelapi.entity.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, String>{

}
