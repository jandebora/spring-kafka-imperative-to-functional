package com.ccagigao.kafkademo.kafka.subscriber;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface InputBinding {

	@Input(value = "message")
	SubscribableChannel channel();
}
