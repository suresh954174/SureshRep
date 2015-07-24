package com.oua.spring.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.oua.spring.domain.UserDetails;


public class UserDetailsDAOImpl implements UserDetailsDAO {
	
	 private SessionFactory sessionFactory;
	 
	    public UserDetailsDAOImpl(SessionFactory sessionFactory) {
	        this.sessionFactory = sessionFactory;
	    }
	
    @Override 	    
	public void add(UserDetails item) {
		Session session = sessionFactory.getCurrentSession();
		try {
			session.beginTransaction();
			session.save(item);
		  } catch (HibernateException e) {
			  e.printStackTrace();
			  session.getTransaction().rollback();
		}
			session.getTransaction().commit();
	}
	
    @Override 	
	public void update(UserDetails item) {
		
		Session session = sessionFactory.getCurrentSession();
		try {
			System.out.println("IN Update");
			session.beginTransaction();
			session.saveOrUpdate(item);
			} catch (HibernateException e) {
				e.printStackTrace();
				session.getTransaction().rollback();
			}
		session.getTransaction().commit();
	}
	
	@Override 
	public UserDetails getUserDetails(Long id) {
		Session session = sessionFactory.getCurrentSession();
		UserDetails item=null;
		try {
			System.out.println("IN GetIteam");
			session.beginTransaction();
		    item = (UserDetails) session.get(UserDetails.class, id);
		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		session.getTransaction().commit();
		return item;
	}
	 
	@Override 
	public void delete(Long id) {
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		UserDetails item = (UserDetails) session.get(UserDetails.class, id);
		if(null != item) {
			session.delete(item);
		}
		session.getTransaction().commit();
		//return item;
	}

	@Override 
	public List<UserDetails> list() {
		
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		List<UserDetails> items = null;
		try {
			System.out.println("IN LIST");
			items = (List<UserDetails>)session.createQuery("from UserDetails").list();
			
		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		session.getTransaction().commit();
		return items;
	}

}
