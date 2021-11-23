package com.cg.stock.application.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Stock implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int stockId;
	
	@Column
	private String stockName;
	
//	@OneToOne
//	@JoinColumn(name="investorId")
//	private Investor investor;
//	
//	@OneToOne
//	@JoinColumn(name="companyId")
//	private Company company;
	
	@Column
	private int quantity;
	
	@Column
	private String type;
	
	@Column
	private double avgPrice;
	
	@Column
	private int totalNoOfStocks;
	
	@Column
	private double profitLoss;
	
	@Column
	private String status;

	public Stock() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Stock(int stockId, String stockName, int quantity, String type,
			double avgPrice, int totalNoOfStocks, double profitLoss, String status) { //Investor investor, Company company
		super();
		this.stockId = stockId;
		this.stockName = stockName;
//		this.investor = investor;
//		this.company = company;
		this.quantity = quantity;
		this.type = type;
		this.avgPrice = avgPrice;
		this.totalNoOfStocks = totalNoOfStocks;
		this.profitLoss = profitLoss;
		this.status = status;
	}

	public int getStockId() {
		return stockId;
	}

	public void setStockId(int stockId) {
		this.stockId = stockId;
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
//
//	public Investor getInvestor() {
//		return investor;
//	}
//
//	public void setInvestor(Investor investor) {
//		this.investor = investor;
//	}
//
//	public Company getCompany() {
//		return company;
//	}
//
//	public void setCompany(Company company) {
//		this.company = company;
//	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getAvgPrice() {
		return avgPrice;
	}

	public void setAvgPrice(double avgPrice) {
		this.avgPrice = avgPrice;
	}

	public int getTotalNoOfStocks() {
		return totalNoOfStocks;
	}

	public void setTotalNoOfStocks(int totalNoOfStocks) {
		this.totalNoOfStocks = totalNoOfStocks;
	}

	public double getProfitLoss() {
		return profitLoss;
	}

	public void setProfitLoss(double profitLoss) {
		this.profitLoss = profitLoss;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Stock [stockId=" + stockId + ", stockName=" + stockName + ", quantity=" + quantity + ", type=" + type + ", avgPrice=" + avgPrice
				+ ", totalNoOfStocks=" + totalNoOfStocks + ", profitLoss=" + profitLoss + ", status=" + status + "]";//company="
				//+ company + ",investor=" + investor + ",
	}
	
	
	
}
