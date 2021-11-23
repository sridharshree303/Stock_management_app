package com.cg.stock.application.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BankAccount implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column
	private String bankName;
	
	@Column
	private String branchName;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long accountNo;
	
	@Column
	private double balance;
	
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public BankAccount(String bankName, String branchName, long accountNo, double balance) {
		super();
		this.bankName = bankName;
		this.branchName = branchName;
		this.accountNo = accountNo;
		this.balance = balance;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Override
	public String toString() {
		return "BankAccount [bankName=" + bankName + ", branchName=" + branchName + ", accountNo=" + accountNo
				+ ", balance=" + balance + "]";
	}
	
	
}
