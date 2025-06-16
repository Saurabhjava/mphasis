package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.bean.User;


public class UserDao implements IUserDao {
	@Autowired
	private SessionFactory sessionFactory;	
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	
	@Transactional
	public void saveUser(User u) {
		Session ses=sessionFactory.getCurrentSession();
		ses.persist(u);
		System.out.println("User Created....");		
		
	}

	
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}


	public User getUser(String uname) {
		// TODO Auto-generated method stub
		return null;
	}

}
