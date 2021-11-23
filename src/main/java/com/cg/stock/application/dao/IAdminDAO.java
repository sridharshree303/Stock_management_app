package com.cg.stock.application.dao;

import java.util.List;

//import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.stock.application.dto.Admin;

public interface IAdminDAO  {   //extends JpaRepository<Admin, Integer>
	
	public Admin addAdmin(Admin admin);
	public Admin viewAdmin(Admin admin);
	public Admin removeAdmin(Admin admin);
	public List<Admin> viewAllAdmin();
}
