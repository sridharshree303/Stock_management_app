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
public class Company implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String companyId;
	
	@Column
	private String companyName;
	
	@OneToOne
	@JoinColumn(name="managerId")
	private Manager manager;
	
	@Column
	private int noOfStocks;
	
	@Column
	private double stockPrice;
	
	@Column
	private double percentageChange;

	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Company(String companyId, String companyName, Manager manager, int noOfStocks, double stockPrice,
			double percentageChange) {
		super();
		this.companyId = companyId;
		this.companyName = companyName;
		this.manager = manager;
		this.noOfStocks = noOfStocks;
		this.stockPrice = stockPrice;
		this.percentageChange = percentageChange;
	}

	public String getCompanyId() {
		return companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	public int getNoOfStocks() {
		return noOfStocks;
	}

	public void setNoOfStocks(int noOfStocks) {
		this.noOfStocks = noOfStocks;
	}

	public double getStockPrice() {
		return stockPrice;
	}

	public void setStockPrice(double stockPrice) {
		this.stockPrice = stockPrice;
	}

	public double getPercentageChange() {
		return percentageChange;
	}

	public void setPercentageChange(double percentageChange) {
		this.percentageChange = percentageChange;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Company [companyId=" + companyId + ", companyName=" + companyName + ", manager=" + manager
				+ ", noOfStocks=" + noOfStocks + ", stockPrice=" + stockPrice + ", percentageChange=" + percentageChange
				+ "]";
	}	
	
	
}
