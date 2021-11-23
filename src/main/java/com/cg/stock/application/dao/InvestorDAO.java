package com.cg.stock.application.dao;

import java.util.List;

//import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.stock.application.dto.Company;
import com.cg.stock.application.dto.Investor;
import com.cg.stock.application.dto.Stock;

public interface InvestorDAO  {    //extends JpaRepository<Investor, Integer>
	public Investor addInvestor(Investor info);
	public  List<Investor> getAllInvestor();
	public Investor getInvestorDetails(String investorId);
	public Investor  updateInvestor(Investor info);
	public Investor deleteInvestor(Investor inv);
	public List<Investor> viewAllInvestor(Stock stock);
	public List<Investor> viewAllInvestor(Company company);
	
}