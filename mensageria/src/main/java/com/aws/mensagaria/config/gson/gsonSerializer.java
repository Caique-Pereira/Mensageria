package com.aws.mensagaria.config.gson;

import org.apache.kafka.common.serialization.Serializer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class gsonSerializer<T> implements Serializer<T> {
	
	public Gson gson = new  GsonBuilder().create();
	
	@Override
	public byte[] serialize(String topic, T data) {
		return gson.toJson(data).getBytes();
	}

}
