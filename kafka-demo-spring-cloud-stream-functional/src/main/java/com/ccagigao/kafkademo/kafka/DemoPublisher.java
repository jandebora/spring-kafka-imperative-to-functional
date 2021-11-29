package com.ccagigao.kafkademo.kafka;

import java.util.function.Supplier;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.ccagigao.kafkademo.domain.MessageData;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Sinks;
import reactor.core.publisher.Sinks.Many;

@Slf4j
@Component
public class DemoPublisher {
	
	private static final Many<MessageData> flux = Sinks.many().multicast().onBackpressureBuffer();

	public void sendMessage(MessageData messageData) {
		log.debug("Sending message: {}", messageData);
		flux.tryEmitNext(messageData);
		log.debug("Message sent successfully");
	}
	
	@Bean
	public Supplier<Flux<MessageData>> messageDataPublisher() {
		return flux::asFlux;
	}
}
