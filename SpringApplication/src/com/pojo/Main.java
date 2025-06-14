package com.pojo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
		//BeanFactory ctx=new ClassPathXmlApplicationContext("bean.xml");
		HelloWorld h=ctx.getBean(HelloWorld.class);
		
		//h.setName("Dhanush");
		System.out.println(h.sayHello());
		
	}

}
