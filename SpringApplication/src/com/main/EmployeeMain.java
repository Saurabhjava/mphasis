package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.conf.MyConfiguration;
import com.pojo.Employee;
import com.ser.TestService;
import com.service.EmployeeService;

public class EmployeeMain {
	public static void main(String[] args) throws Exception {
		ApplicationContext ctx=new AnnotationConfigApplicationContext(MyConfiguration.class);
		EmployeeService es=ctx.getBean(EmployeeService.class);
		//es.printEmployee();
		//es.calculate(10, 0);
		/*
		 * TestService ts=ctx.getBean(TestService.class);
		 * System.out.println(ts.sayHello("Atul"));
		 */
			
		//System.out.println("Add of Two No is "+es.add(20,4));
		es.calculate(0, 2);
	}
}
