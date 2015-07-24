package com.oua.spring.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.persistence.Entity;

@Entity
@Table(name="Userdetail")
public class User {

	@Id  
    @GeneratedValue  
    @Column(name = "User_ID")  
    private int id;  
  
  
  
    @Column(name = "User_Name")  
    private String userName;  
  
  
    @Column(name = "Occupation")  
    private String occupation;  
  
  
    @Column(name = "City")  
    private String city;


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
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
	 * @return the occupation
	 */
	public String getOccupation() {
		return occupation;
	}


	/**
	 * @param occupation the occupation to set
	 */
	public void setOccupation(String occupation) {
		this.occupation = occupation;
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
  
    
}
