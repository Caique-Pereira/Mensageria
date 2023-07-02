package com.aws.mensagaria.utils;

import org.apache.kafka.clients.producer.Callback;

public class Utils {

	public static Callback dispacherCallback = (data, ex) -> {
			if (ex != null) {
				ex.printStackTrace();
				return;
			}
			System.out.println( 
					"offset : " + data.offset() + " /topico : " + data.topic() + "partition :" + data.partition());
		};

}
