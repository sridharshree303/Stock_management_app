package com.cg.stock.application.service;

import com.cg.stock.application.dto.User;

public interface IUserService {

	public User login(String username,String password);
	public User logout(User user);
	public User createUser(User user);
	public User removeUser(User user);
	
}
