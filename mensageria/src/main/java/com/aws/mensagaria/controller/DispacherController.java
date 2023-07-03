package com.aws.mensagaria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aws.mensagaria.service.KafkaDispacherService;

@RestController
public class DispacherController {

	@Autowired
	KafkaDispacherService service;
	
	@PostMapping("/{message}")
	public String newMessage(@PathVariable String message) {
		return service.newMessage(message);
		
	}
	
}
