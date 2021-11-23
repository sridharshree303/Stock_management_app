//package com.cg.stock.application.dto;
//
//import java.io.Serializable;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToOne;
//
//@Entity
//public class Manager implements Serializable {
///**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L;
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private String managerId;
//	
//	@Column
//	private String managerName;
//	
//	@OneToOne
//	@JoinColumn(name="companyId")
//	private Company company;
//	
//	@Column
//	private String email;
//	
//	@Column
//	private String mobileNo;
//
//	public Manager() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	public Manager(String managerId, String managerName, Company company, String email, String mobileNo) {
//		super();
//		this.managerId = managerId;
//		this.managerName = managerName;
//		this.company = company;
//		this.email = email;
//		this.mobileNo = mobileNo;
//	}
//
//	public String getManagerId() {
//		return managerId;
//	}
//
//	public void setManagerId(String managerId) {
//		this.managerId = managerId;
//	}
//
//	public String getManagerName() {
//		return managerName;
//	}
//
//	public void setManagerName(String managerName) {
//		this.managerName = managerName;
//	}
//
//	public Company getCompany() {
//		return company;
//	}
//
//	public void setCompany(Company company) {
//		this.company = company;
//	}
//
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//	public String getMobileNo() {
//		return mobileNo;
//	}
//
//	public void setMobileNo(String mobileNo) {
//		this.mobileNo = mobileNo;
//	}
//
//	public static long getSerialversionuid() {
//		return serialVersionUID;
//	}
//
//	@Override
//	public String toString() {
//		return "Manager [managerId=" + managerId + ", managerName=" + managerName + ", company=" + company + ", email="
//				+ email + ", mobileNo=" + mobileNo + "]";
//	}	
//	
//	
//}
