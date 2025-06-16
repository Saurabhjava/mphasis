package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.bean.User;


public class UserDao implements IUserDao {
	@Autowired
	private SessionFactory sf;
	@Override
	@Transactional
	public void saveUser(User u) {
		Session ses=sf.getCurrentSession();
		ses.persist(u);
		System.out.println("User Created....");		
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUser(String uname) {
		// TODO Auto-generated method stub
		return null;
	}

}
