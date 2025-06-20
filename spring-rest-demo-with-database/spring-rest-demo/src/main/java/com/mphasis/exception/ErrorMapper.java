package com.mphasis.exception;

import java.time.LocalDate;

public class ErrorMapper {
	private String message;
	private String uri;
	private LocalDate date;
	public ErrorMapper() {
		// TODO Auto-generated constructor stub
	}
	
	
	public ErrorMapper(String message, String uri, LocalDate date) {
		super();
		this.message = message;
		this.uri = uri;
		this.date = date;
	}


	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getUri() {
		return uri;
	}
	public void setUri(String uri) {
		this.uri = uri;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	
}
