package com.example.demo.service;

public interface MailService {
	
	public void send(String fromAddress, String toAddress, String subject, String message) throws Exception;

}
