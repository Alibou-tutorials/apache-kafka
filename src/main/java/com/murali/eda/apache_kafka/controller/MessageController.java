package com.murali.eda.apache_kafka.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.murali.eda.apache_kafka.model.Item;
import com.murali.eda.apache_kafka.service.producer.KafkaProducerService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class MessageController {

	private final KafkaProducerService kafkaProducerService;

	@PostMapping("/string")
	public ResponseEntity<String> sendMessageApi(@RequestBody String msg) {
		kafkaProducerService.sendMessage(msg);
		return new ResponseEntity<>("Data queued successfully!", HttpStatus.OK);
	}

	@PostMapping("/json")
	public ResponseEntity<String> sendJsonMessageApi(@RequestBody Item item) {
		kafkaProducerService.sendJsonMessage(item);
		return new ResponseEntity<>("Item queued successfully!", HttpStatus.OK);
	}

}
