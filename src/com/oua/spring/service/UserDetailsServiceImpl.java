package com.oua.spring.service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.oua.spring.dao.UserDetailsDAO;
import com.oua.spring.domain.UserDetails;
import com.oua.spring.model.UserModel;

@Transactional
public class UserDetailsServiceImpl implements UserDetailsService {
	
	
	@Autowired
	UserDetailsDAO userDetailsDao;
	
	private SessionFactory sessionFactory;
	
	public UserDetailsServiceImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
	
	@Override
	public List<UserModel> list() {
		
		List<UserDetails> itemList =userDetailsDao.list();
		return convertToModelList(itemList);
	}

	@Override
	public void add(UserDetails item) {
		userDetailsDao.add(item);
	}

	@Override
	public void update(UserDetails item) {
		userDetailsDao.update(item);
	}

	@Override
	public UserModel getUserDetails(Long id) {
		UserDetails item =userDetailsDao.getUserDetails(id);
		return convertToModel(item);
	}

	@Override
	public void delete(Long id) {
		userDetailsDao.delete(id);;
	}

	public List<UserModel> convertToModelList(List<UserDetails> listOfUsers)
	{
		List<UserModel> userList = new ArrayList<UserModel>();
		UserModel user;
		
		for (UserDetails userDetails : listOfUsers) {
			user= new UserModel();
			
			user.setUserId(userDetails.getUser_id());
			user.setUserName(userDetails.getUser_name());
			user.setDesignation(userDetails.getDesignation());
			user.setCompany(userDetails.getCompany());
			user.setPincode(userDetails.getPin_code());
			user.setCreatedOn(userDetails.getCreatedOn());
			userList.add(user);
		}
		return userList;
	}
	
	public UserModel convertToModel(UserDetails userDetails)
	{
			UserModel user = new UserModel();
			user.setUserId(userDetails.getUser_id());
			user.setUserName(userDetails.getUser_name());
			user.setDesignation(userDetails.getDesignation());
			user.setCompany(userDetails.getCompany());
			user.setPincode(userDetails.getPin_code());
			user.setCreatedOn(userDetails.getCreatedOn());
			return user;
	}
}
