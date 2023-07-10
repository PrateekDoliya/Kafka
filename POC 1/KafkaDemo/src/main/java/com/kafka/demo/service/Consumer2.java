package com.kafka.demo.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer2 {

	@KafkaListener(topics = "myFirst_topic", groupId = "myKafkaDemo")
	public void listenToTopic(String receivedMessage) {
		System.out.println("the message received is listener 2: "+ receivedMessage);
	}
	
}
