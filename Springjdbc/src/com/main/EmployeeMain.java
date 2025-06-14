package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.EmployeeDao;
import com.pojo.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
		EmployeeDao edao=ctx.getBean(EmployeeDao.class);
		/*
		 * int row=edao.saveEmployee(new Employee(111, "Prachi", "pra@gmail.com",
		 * 98000)); if(row>0) System.out.println("Employee Created"); else
		 * System.out.println("Employee Not Created");
		 * 
		 */
		//Employee e=edao.getEmployee(105);
		//System.out.println(e);
		edao.getAll().forEach(e->System.out.println(e));
	}

}
