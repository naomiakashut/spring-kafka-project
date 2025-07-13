package com.akashut;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestBody;

public record MessageRequest(String message) {

}
