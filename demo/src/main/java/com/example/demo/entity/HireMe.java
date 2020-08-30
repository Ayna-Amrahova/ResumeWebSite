package com.example.demo.entity;

public class HireMe {
	
	private String name;
	private String subject;
	private String email;
	private String message;
	
	
	public HireMe() {
		super();
	}

	
	public HireMe(String name, String subject, String email, String message) {
		super();
		this.name = name;
		this.subject = subject;
		this.email = email;
		this.message = message;
	}




	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	@Override
	public String toString() {
		return "HireMe [name=" + name + ", subject=" + subject + ", email=" + email + ", message=" + message + "]";
	}



}
