package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.User;
import com.dao.IUserDao;
import com.dao.UserDao;

public class UserMain {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("application.xml");
		IUserDao udao=ctx.getBean(UserDao.class);
		udao.saveUser(new User("Saurabh", "abc123", "saurabh@gmail.com", "A"));
	}

}
