package com.ccagigao.kafkademo.kafka.subscriber.impl;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

import com.ccagigao.kafkademo.domain.MessageData;
import com.ccagigao.kafkademo.kafka.subscriber.DemoSubscriber;
import com.ccagigao.kafkademo.kafka.subscriber.InputBinding;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@EnableBinding(InputBinding.class)
@Component
public class DemoSubscriberImpl implements DemoSubscriber {
	
	@StreamListener(target = "message", condition = "headers['operation']=='new'")
	@Override
	public void proccessMessage(MessageData messageData) {
		log.debug("Processing message: {}", messageData);
	}

}
