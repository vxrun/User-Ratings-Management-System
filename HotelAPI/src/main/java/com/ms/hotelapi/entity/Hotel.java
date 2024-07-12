package com.ms.hotelapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity(name = "hotel")
@Data
public class Hotel {

	@Id
	private String hotelId;
	private String name;
	private String location;
	private String about;

}
