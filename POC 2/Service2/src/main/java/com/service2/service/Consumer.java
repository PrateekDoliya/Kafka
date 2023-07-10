package com.service2.service;

import java.util.Map;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

	@KafkaListener(topics = "service1_topic", groupId = "service2_group")
	public void listenMessageFromTopic( Map<String, String> data ) {
		System.out.println("This is data from kafka:" + data);
	}
	
}
