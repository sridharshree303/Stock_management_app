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
public class Investor implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = -7970529286316608172L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String investorId;
	
	@Column
	private String investorName;
	
	@Column
	private String email;
	
	@Column
	private String password;
	
	@Column
	private String mobileNo;
	
	@Column
	private String gender;
	
	@OneToOne
	@JoinColumn(name="accountNo")
	private BankAccount account;

	public Investor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Investor(String investorId, String investorName, String email, String password, String mobileNo,
			String gender, BankAccount account) {
		super();
		this.investorId = investorId;
		this.investorName = investorName;
		this.email = email;
		this.password = password;
		this.mobileNo = mobileNo;
		this.gender = gender;
		this.account = account;
	}

	public String getInvestorId() {
		return investorId;
	}

	public void setInvestorId(String investorId) {
		this.investorId = investorId;
	}

	public String getInvestorName() {
		return investorName;
	}

	public void setInvestorName(String investorName) {
		this.investorName = investorName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public BankAccount getAccount() {
		return account;
	}

	public void setAccount(BankAccount account) {
		this.account = account;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Investor [investorId=" + investorId + ", investorName=" + investorName + ", email=" + email
				+ ", password=" + password + ", mobileNo=" + mobileNo + ", gender=" + gender + ", account=" + account
				+ "]";
	}

	
}
