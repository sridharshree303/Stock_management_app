package com.cg.stock.application.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.cg.stock.application.dao.ICompanyDAO;
import com.cg.stock.application.dao.IStockDAO;
//import com.cg.stock.application.dao.InvestorDAO;
//import com.cg.stock.application.dto.Investor;
import com.cg.stock.application.dto.Stock;

@Service
public class StockService implements IStockService {
	
	private static final Logger LOG = LoggerFactory.getLogger(StockService.class);

	@Autowired
	private IStockDAO iStockDao;
	
//	@Autowired
//	private ICompanyDAO iCompanyDao;
//	
//	@Autowired
//	private InvestorDAO investorDao;

	@Override
	public Stock addStockDetails(Stock stock) {
		LOG.info("Service addStockDetails");
		return null;//iStockDao.addStockDetails(stock);
	}

//	@Override
//	public Stock updateStockDetails(Stock stock) {
//		LOG.info("Service updateStockDetails");
//		return null;//iStockDao.updateStockDetails(stock);
//	}
//
//	@Override
//	public Stock removeStockDetails(Stock stock) {
//		LOG.info("Service removeStockDetails");
//		return null;//iStockDao.removeStockDetails(stock);
//	}
//
//	@Override
//	public Stock viewStockDetails(Stock stock) {
//		LOG.info("Service viewStockDetails");
//		return null;// iStockDao.viewStockDetails(stock);
//	}
//
//	@Override
//	public List<Stock> viewAllStockDetails() {
//		LOG.info("Service viewAllStockDetails");
//		return null;// iStockDao.viewAllStockDetails();
//	}
//
//	@Override
//	public Stock viewStockByCompanyName(String name) {
//		LOG.info("Service viewStockByCompanyName");
//		return null;//iStockDao.viewStockByCompanyName(name);
//	}
//
//	@Override
//	public List<Stock> viewStockByInvestor(Investor inv) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List<Stock> viewAllGrowingStocks() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List<Stock> viewAllReducingStocks() {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
