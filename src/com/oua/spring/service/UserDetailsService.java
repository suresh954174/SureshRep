package com.oua.spring.service;

import java.util.List;

import com.oua.spring.domain.UserDetails;
import com.oua.spring.model.UserModel;

public interface UserDetailsService {

	public List<UserModel> list();
	public void add(UserDetails item);
	public void  update(UserDetails item);
	public UserModel  getUserDetails(Long id);
	public void  delete(Long id);
}
