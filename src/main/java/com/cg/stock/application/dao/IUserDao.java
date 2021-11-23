package com.cg.stock.application.dao;

//import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.stock.application.dto.User;

public interface IUserDao  {    //extends JpaRepository<User, Integer>

	public User login(String username,String password);
	public User logout(User user);
	public User createUser(User user);
	public User removeUser(User user);
}
