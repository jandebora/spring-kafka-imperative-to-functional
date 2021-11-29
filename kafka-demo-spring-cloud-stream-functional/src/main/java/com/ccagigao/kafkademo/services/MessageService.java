package com.ccagigao.kafkademo.services;

import com.ccagigao.kafkademo.domain.MessageData;

public interface MessageService {

	public MessageData sendMessage(MessageData messageData);
}
