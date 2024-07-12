package com.ms.ratingapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ms.ratingapi.entity.Rating;

@Repository
public interface RatingRepository extends JpaRepository<Rating, String> {

	@Query("from rating where userId = :userId")
	List<Rating> findByUserId(@Param("userId") String userId);

	@Query("from rating where hotelId = :hotelId")
	List<Rating> findByHotelId(@Param("hotelId") String hotelId);

}
