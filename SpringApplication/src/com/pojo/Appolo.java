package com.pojo;

import org.springframework.stereotype.Component;

@Component
public class Appolo implements ITyre{
	
	private String brandName="Appolo";
	
	public String getTyreDetails() {
		return "Tyre Name : "+brandName;
	}
}

