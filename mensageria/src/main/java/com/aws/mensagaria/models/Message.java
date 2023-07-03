package com.aws.mensagaria.models;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

import com.aws.mensagaria.utils.MessageStatus;



@Component
public class Message {
	
	String message;
	MessageStatus status;
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	public MessageStatus getStatus() {
		return status;
	}
	public void setStatus(MessageStatus status) {
		this.status = status;
	}
	
	
	

}
