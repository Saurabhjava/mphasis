package com.pojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.conf.MyConfiguration;

public class CarMain {

	public static void main(String[] args) {
		//ApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
		ApplicationContext ctx=new AnnotationConfigApplicationContext(MyConfiguration.class);
		Car c=ctx.getBean(Car.class);
		c.printCarDetails();
	}

}
