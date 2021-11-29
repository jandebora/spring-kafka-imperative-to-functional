package com.ccagigao.kafkademo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ccagigao.kafkademo.domain.MessageData;
import com.ccagigao.kafkademo.services.MessageService;

@Validated
@RestController
public class KafkaDemoController {

	@Autowired
	private MessageService messageService;
	
	@PostMapping(value = "/createMessage")
	public MessageData createMessage(@Valid @RequestBody MessageData messageData) {
		return messageService.sendMessage(messageData);
	}
}
