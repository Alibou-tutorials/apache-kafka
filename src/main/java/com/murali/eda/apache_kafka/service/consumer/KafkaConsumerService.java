package com.murali.eda.apache_kafka.service.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.murali.eda.apache_kafka.model.Item;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class KafkaConsumerService {

//	@KafkaListener(topics = "md-stream", groupId = "myGroup")
	public void consumeMsg(String msg) {
		log.info("Consumed data '{}' from md-stream!", msg);
	}

	@KafkaListener(topics = "md-stream", groupId = "myGroup")
	public void consumeJsonMsg(Item item) {
		log.info("Consumed data '{}' from md-stream!", item);
	}
}
