package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
	
	public static void main(String[] args) {
		Employee emp=new Employee(1002, "Reshma", 56000, "reshma@gmail.com");
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session ses=sf.openSession();
		Transaction tx=ses.beginTransaction();
		
		ses.persist(emp);
		tx.commit();
		System.out.println("Employee Saved....");
	}

}
