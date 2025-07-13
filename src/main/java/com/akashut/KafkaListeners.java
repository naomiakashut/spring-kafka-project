package com.akashut;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "kafkaTopic", groupId = "any")
    void Listener (String data) {
        System.out.println("I spy with my little listener: " + data + ", that's pretty cool.");
    }
}
