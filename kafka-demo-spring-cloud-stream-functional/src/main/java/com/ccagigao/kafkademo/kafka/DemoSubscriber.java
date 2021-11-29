package com.ccagigao.kafkademo.kafka;

import java.util.function.Consumer;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.ccagigao.kafkademo.domain.MessageData;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class DemoSubscriber {

	@Bean
	public Consumer<MessageData> proccessMessage(){
		return this::processMessage;
	}
	
	@SneakyThrows
	private void processMessage(MessageData messageData) {
		log.debug("Processing message: {}", messageData);
	}
}
