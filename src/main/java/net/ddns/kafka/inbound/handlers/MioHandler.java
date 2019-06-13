package net.ddns.kafka.inbound.handlers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHandler;
import org.springframework.messaging.MessagingException;

public class MioHandler implements MessageHandler {
	private static final Logger LOGGER = LoggerFactory.getLogger(MioHandler.class);

	@Override
	public void handleMessage(Message<?> message) throws MessagingException {
		LOGGER.info("Loggato messaggio: " + message);
	}
}
