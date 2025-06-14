package com.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {
	private String name="Honda";
	private String color="RED";
	@Autowired
	@Qualifier("appolo")
	private ITyre tyre;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void printCarDetails() {
		System.out.println("Name="+name);
		System.out.println("Color="+color);
		System.out.println(tyre.getTyreDetails());
	}
}
