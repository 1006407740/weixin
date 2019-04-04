package org.fkjava.weixin.service.impl;

import org.fkjava.weixin.controller.MessageReceiverController;
import org.fkjava.weixin.domain.InMessage;
import org.fkjava.weixin.domain.OUtMessage;
import org.fkjava.weixin.service.MessageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl implements MessageService{
 
	private static final Logger LOG=LoggerFactory.getLogger(MessageServiceImpl.class);
	@Override
	public OUtMessage onMessage(InMessage msg) {
		LOG.trace("转换后的消息对象：\n{}\n",msg);
		return null;
	}
}
