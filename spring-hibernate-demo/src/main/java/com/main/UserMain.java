package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.User;
import com.dao.HelloWorld;
import com.dao.IUserDao;
import com.dao.UserDao;

public class UserMain {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("application.xml");
		IUserDao udao=ctx.getBean(IUserDao.class);
		udao.saveUser(new User("Saurabh2", "abc123", "saurabh@gmail.com", "A"));
	}

}
