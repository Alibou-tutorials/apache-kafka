package com.murali.eda.apache_kafka.service.producer;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import com.murali.eda.apache_kafka.model.Item;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class KafkaProducerService {

	private final KafkaTemplate<String, String> kafkaTemplate;
	private final KafkaTemplate<String, Item> KafkaItemTemplate;

	public void sendMessage(String msg) {
		kafkaTemplate.send("md-stream", msg);
		log.info("Data '{}' was published to md-stream successfully", msg);
	}

	public void sendJsonMessage(Item item) {
		Message<Item> msg = MessageBuilder.withPayload(item).setHeader(KafkaHeaders.TOPIC, "md-stream").build();
		log.info("Created message: {} ", msg);
		KafkaItemTemplate.send(msg);
		log.info("Data '{}' was published to md-stream successfully", msg);
	}
}
