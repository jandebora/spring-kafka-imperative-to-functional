package com.ccagigao.kafkademo.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ccagigao.kafkademo.domain.MessageData;
import com.ccagigao.kafkademo.kafka.publisher.DemoPublisher;
import com.ccagigao.kafkademo.services.MessageService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class MessageServiceImpl implements MessageService {

	@Autowired
	private DemoPublisher demoPublisher;
	
	@Override
	public MessageData sendMessage(MessageData messageData) {
		log.debug("Creating new Message in Kafka: {}", messageData);
		
		demoPublisher.send(messageData);
		
		return messageData;
	}

}
