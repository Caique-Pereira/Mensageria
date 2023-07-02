package com.aws.mensagaria.config.kafka;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.aws.mensagaria.config.gson.gsonSerializer;

@Configuration
public class KafkaDispacherConfig<T> {
	
	@Value("${Kafka.config.bootstrapServer}")
	private String bootstrapServer;
   
   @Bean
   public KafkaProducer<String, T> kafkaDispacher(){
	 return new KafkaProducer<String, T>(props());
   }
   
   public Properties props() {
	   Properties props = new Properties();
	   props.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServer);
	   props.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
	   props.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, gsonSerializer.class.getName());
	  
	   return props;
	   
   }

}
