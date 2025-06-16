package com.dao;

import java.util.List;

import com.bean.User;

public interface IUserDao {
	public void saveUser(User u);
	public List<User> getAll();
	public User getUser(String uname);
}
