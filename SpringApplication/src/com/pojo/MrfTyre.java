package com.pojo;

import org.springframework.stereotype.Component;

@Component
public class MrfTyre implements ITyre{
	private String brandName="MRF";
	
	public String getTyreDetails() {
		return "Tyre Name : "+brandName;
	}
}
