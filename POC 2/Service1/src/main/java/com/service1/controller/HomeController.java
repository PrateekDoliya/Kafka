package com.service1.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.service1.service.Producer;

@RestController
public class HomeController {

	@Autowired
	private Producer producer;
	
	@PostMapping("/upload")
	public ResponseEntity<String> getMessage(@RequestBody Map<String, String> data) throws JsonProcessingException {
		producer.sendMessageToTopic(data);
		return ResponseEntity.ok("Done");
	}
	
}
