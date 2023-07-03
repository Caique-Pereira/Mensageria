package com.aws.mensagaria.service;


import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aws.mensagaria.broker.dispacher.Dispacher;
import com.aws.mensagaria.models.Message;
import com.aws.mensagaria.utils.MessageStatus;

@Service
public class KafkaDispacherService {
	
   @Autowired
   Dispacher<Message> publiser;
   
   @Autowired 
   Message m;
	
   
	public String newMessage(String message)  {
		m.setMessage(message);
		m.setStatus(MessageStatus.Enviando);
		return publiser.newMessage(m).getDescricao();
		 
	}

	
	
}
