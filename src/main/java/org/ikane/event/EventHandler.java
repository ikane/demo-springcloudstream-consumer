package org.ikane.event;

import org.ikane.dto.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

@EnableBinding(EventChannel.class)
public class EventHandler {

	private static final Logger LOGGER = LoggerFactory.getLogger(EventHandler.class);
	
	@StreamListener(value=EventChannel.INPUT_CHANNEL)
	public void handlePersonCreatedEvent(Person p) {
		LOGGER.info("Person created event received for Person {}", p.toString());
	}
}
