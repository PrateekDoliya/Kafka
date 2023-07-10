package com.service1.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class Producer {

	@Autowired
	private KafkaTemplate<String, Map<String, String>> kafkaTemplate;
	
	@Autowired
	private ObjectMapper mapper;
	
	public void sendMessageToTopic(Map<String, String> data) throws JsonProcessingException {
		kafkaTemplate.send("service1_topic", data);
	}
	
}
