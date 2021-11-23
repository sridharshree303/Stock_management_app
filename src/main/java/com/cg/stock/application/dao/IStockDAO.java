package com.cg.stock.application.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

//import com.cg.stock.application.dto.Investor;
import com.cg.stock.application.dto.Stock;

public interface IStockDAO  extends JpaRepository<Stock, Integer>{    //
	
//	public Stock addStockDetails(Stock stock);
//	public Stock updateStockDetails(Stock stock);
//	public Stock removeStockDetails(Stock stock);
//	public Stock viewStockDetails(Stock stock);
//	public List<Stock> viewAllStockDetails();
//	public Stock viewStockByCompanyName(String name);
//	public List<Stock> viewStockByInvestor(Investor inv);
//	public List<Stock> viewAllGrowingStocks(); // stocks where the price is increased 
//	public List<Stock> viewAllReducingStocks();// stocks where the price is reduced.
}
