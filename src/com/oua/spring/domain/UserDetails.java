package com.oua.spring.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import java.util.Date;

@Entity
@Table(name="UserDetails")
public class UserDetails implements Serializable{

	private static final long serialVersionUID = 453693552059515150L;
	private Long user_id;
	private String user_name;
	
	private String designation;
	private String company;
	private String city;
	private int pin_code;
	@Temporal(TemporalType.DATE)
	@Column (name="createdOn")
	private Date createdOn;

	
public Date getCreatedOn() {
		//return new Date();
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	
	/**
	 * @return the user_id
	 */
	@Id
	@GeneratedValue
	@Column(name="user_id")
	public Long getUser_id() {
		return user_id;
	}
	/**
	 * @param user_id the user_id to set
	 */
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}
	/**
	 * @return the user_name
	 */
	@Column(name="user_name")
	public String getUser_name() {
		return user_name;
	}
	/**
	 * @param user_name the user_name to set
	 */
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	/**
	 * @return the designation
	 */
	@Column(name="designation")
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
	@Column(name="company")
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
	@Column(name="city")
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
	@Column(name="pin_code")
	public int getPin_code() {
		return pin_code;
	}
	/**
	 * @param pin_code the pin_code to set
	 */
	public void setPin_code(int pin_code) {
		this.pin_code = pin_code;
	}
	
}
