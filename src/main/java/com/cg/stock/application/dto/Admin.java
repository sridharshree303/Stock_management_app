//package com.cg.stock.application.dto;
//
//import java.io.Serializable;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//
//@Entity
//public class Admin implements Serializable{
//	
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L;
//	
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private String adminId;
//	
//	@Column
//	private String adminName;
//	
//	@Column
//	private String email;
//	
//	@Column
//	private String password;
//
//	public Admin() {
//		
//		super();
//		
//	}
//
//	public Admin(String adminId, String adminName, String email, String password) {
//		super();
//		this.adminId = adminId;
//		this.adminName = adminName;
//		this.email = email;
//		this.password = password;
//	}
//
//	public String getAdminId() {
//		return adminId;
//	}
//
//	public void setAdminId(String adminId) {
//		this.adminId = adminId;
//	}
//
//	public String getAdminName() {
//		return adminName;
//	}
//
//	public void setAdminName(String adminName) {
//		this.adminName = adminName;
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
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//
//	public static long getSerialversionuid() {
//		return serialVersionUID;
//	}
//
//	@Override
//	public String toString() {
//		return "Admin [adminId=" + adminId + ", adminName=" + adminName + ", email=" + email + ", password=" + password
//				+ "]";
//	}
//	
//	
//}
