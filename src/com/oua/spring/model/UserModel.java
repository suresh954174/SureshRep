package com.oua.spring.model;

import java.util.Date;

public class UserModel {
	
	private Long userId;
	private String userName;
	private String designation;
	private String company;
	private String city;
	private int pincode;
	
	private Date createdOn;
	/**
	 * @return the user
	 */
	public Long getUserId() {
		return userId;
	}
	/**
	 * @param user the user to set
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}
	/**
	 * @param designation the designation to set
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	/**
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}
	/**
	 * @param company the company to set
	 */
	public void setCompany(String company) {
		this.company = company;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the pin_code
	 */
	public int getPincode() {
		return pincode;
	}
	/**
	 * @param pin_code the pin_code to set
	 */
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	/**
	 * @return the createdOn
	 */
	public Date getCreatedOn() {
		return createdOn;
	}
	/**
	 * @param createdOn the createdOn to set
	 */
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

}
