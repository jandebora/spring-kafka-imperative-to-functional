package com.ccagigao.kafkademo.kafka.publisher;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface DemoChannel {

	static final String OUTPUT_STRING = "message";
	
	@Output(OUTPUT_STRING)
	MessageChannel output();
}
