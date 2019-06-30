package net.ddns.kafka.inbound.handlers;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.listener.AcknowledgingMessageListener;
import org.springframework.kafka.support.Acknowledgment;

public class MioHandler implements AcknowledgingMessageListener<String, String> {
	private static final Logger LOGGER = LoggerFactory.getLogger(MioHandler.class);
	private String nulla;
	
	@Override
	public void onMessage(ConsumerRecord<String, String> data, Acknowledgment acknowledgment) {
		LOGGER.debug("Ricevuto messaggio: " + data.value());
	}
}
