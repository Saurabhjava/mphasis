package com;

public class Employee {
	
	private int empid;
	private String name;
	private int salary;
	private String email;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int empid, String name, int salary, String email) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		this.email = email;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
