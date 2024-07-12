package com.ms.userapi.service;

import java.util.List;

import com.ms.userapi.entity.User;

public interface UserService {
	
	public List<User> getAllUsers();
	
	public User saveUser(User user);
	
	public User getUser(String userId);

}
