package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bean.Employee;


@Repository
public class EmployeeDao {
	@Autowired
	private SessionFactory sf;
	
	@Transactional
	public String saveEmployee(Employee emp) {
		Session ses=sf.getCurrentSession();
		ses.persist(emp);
		return "Employee Created with Employee Id "+emp.getEmpid();
	}
	
	@Transactional
	public List<Employee> allEmployee() {
		Session ses=sf.getCurrentSession();
		List<Employee> emps=ses.createQuery("select e from Employee e", Employee.class).list();
		return emps;
	}
}
