package com.ccagigao.kafkademo.kafka.publisher;

import com.ccagigao.kafkademo.domain.MessageData;

public interface DemoPublisher {

	public void send(MessageData messageData);
}
