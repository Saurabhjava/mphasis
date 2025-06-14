package com.ser;

import org.springframework.stereotype.Component;

@Component
public class TestService {
	public String sayHello(String name) {
		return "Hello "+name;
	}
}
