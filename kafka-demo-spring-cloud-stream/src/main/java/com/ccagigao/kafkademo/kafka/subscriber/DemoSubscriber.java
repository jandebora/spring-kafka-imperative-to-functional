package com.ccagigao.kafkademo.kafka.subscriber;

import com.ccagigao.kafkademo.domain.MessageData;

public interface DemoSubscriber {

	public void proccessMessage(MessageData messageData);
}
