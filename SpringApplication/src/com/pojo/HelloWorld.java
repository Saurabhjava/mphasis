package com.pojo;

import org.springframework.stereotype.Component;

@Component
public class HelloWorld {
	private String name;
	private String city;
	
	public void initMethod() {
		System.out.println("Object Of HelloWorld Created........");
	}
	public void destroyMethod() {
		System.out.println("Object Of HelloWorld destroyed.....");
	}
	public HelloWorld() {
		// TODO Auto-generated constructor stub
	}
	public HelloWorld(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}


	/*
	 * public String getName() { return name; }
	 * 
	 * public void setName(String name) { this.name = name; }
	 * 
	 * public String getCity() { return city; }
	 * 
	 * public void setCity(String city) { this.city = city; }
	 */

	public String sayHello() {
		return "Hello "+name+"! you are from "+city;
	}
}
