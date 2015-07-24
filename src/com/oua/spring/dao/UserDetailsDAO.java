package com.oua.spring.dao;

import java.util.List;

import com.oua.spring.domain.UserDetails;

public interface UserDetailsDAO {

	public List<UserDetails> list();
	public void add(UserDetails item);
	public void  update(UserDetails item);
	public UserDetails  getUserDetails(Long id);
	public void  delete(Long id);
	
}
