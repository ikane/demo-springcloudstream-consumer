package org.ikane.event;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface EventChannel {

	String INPUT_CHANNEL = "inputChannel";
	
	@Input(INPUT_CHANNEL)
	MessageChannel inputChannel();
}
