package com.kafka.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.demo.service.Producer;

@RestController
@RequestMapping("/api/v1")
public class HomeController {

	@Autowired
	private Producer producer;
	
	@GetMapping("/producer-msg")
	public void getMessageFromClient(@RequestParam("message") String message) {
		producer.sendMessageToTopic(message);
	}
	
}
