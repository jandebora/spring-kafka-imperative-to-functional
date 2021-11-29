package com.ccagigao.kafkademo.kafka.publisher.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

import com.ccagigao.kafkademo.domain.MessageData;
import com.ccagigao.kafkademo.kafka.publisher.DemoChannel;
import com.ccagigao.kafkademo.kafka.publisher.DemoPublisher;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@SuppressWarnings("deprecation")
@Slf4j
@Component
@EnableBinding(DemoChannel.class)
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class DemoPublisherImpl implements DemoPublisher {

	private final DemoChannel demoChannel;

	@Override
	public void send(MessageData messageData) {
		log.debug("Sending message: {}", messageData);
		demoChannel.output().send(MessageBuilder
				.withPayload(messageData)
				.setHeader("operation", "new")
				.build()
		);
		log.debug("Message sent successfully");
		
	}
}
