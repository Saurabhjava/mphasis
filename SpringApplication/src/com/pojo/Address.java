package com.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	@Value("${city}")
	private String city;
	@Value("${country}")
	private String country;
	@Value("${zip}")
	private int zip;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}
	public Address(String city, String country, int zip) {
		super();
		this.city = city;
		this.country = country;
		this.zip = zip;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	
	
}
