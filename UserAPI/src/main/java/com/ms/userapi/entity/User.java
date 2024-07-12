package com.ms.userapi.entity;

import java.util.ArrayList;
import java.util.List;

import com.ms.userapi.bean.Rating;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.Data;

@Entity(name = "user")
@Data
public class User {
	
	@Id
	private String userId;
	private String name;
	private String email;
	private String about;
	
	@Transient
	private List<Rating> ratings = new ArrayList<Rating>();
	

}
