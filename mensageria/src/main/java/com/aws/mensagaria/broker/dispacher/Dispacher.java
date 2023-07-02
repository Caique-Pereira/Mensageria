package com.aws.mensagaria.broker.dispacher;

import java.util.UUID;
import java.util.concurrent.ExecutionException;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.aws.mensagaria.models.Message;
import com.aws.mensagaria.utils.MessageStatus;
import com.aws.mensagaria.utils.Utils;

@Component
public class Dispacher<T> {
		
   @Autowired
   KafkaProducer<String, Message> kafkaDispacher;
	
	public MessageStatus newMessage(Message m) {
		ProducerRecord<String, Message> record = new ProducerRecord<String, Message>("New_Message", UUID.randomUUID().toString(), m);
		try {
			kafkaDispacher.send(record,Utils.dispacherCallback).get();
			return MessageStatus.Sucess;
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
			return MessageStatus.Error;
		}
	}
	
}
