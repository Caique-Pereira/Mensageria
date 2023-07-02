package com.aws.mensagaria.models;

import java.security.Timestamp;
import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

import com.aws.mensagaria.utils.MessageStatus;

import lombok.Data;


@Component
public class Message {
	
	String message;
	LocalDateTime date;
	MessageStatus status;
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public LocalDateTime getDate() {
		return date;
	}
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	public MessageStatus getStatus() {
		return status;
	}
	public void setStatus(MessageStatus status) {
		this.status = status;
	}
	
	
	

}
