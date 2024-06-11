package com.consumer.consumer.consumidor;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.KafkaListeners;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class HistoryErrorRequestConsumer {

    Logger log = LoggerFactory.getLogger(HistoryErrorRequestConsumer.class);

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    private final String TOPIC = "historyError.request.topic.v1";
    @KafkaListener(
            topics = "historyError.request.topic.v1",
            groupId = "historyError-request-consumer-1"
    )
    public void sendMessage(String message) throws JsonProcessingException {
        System.out.printf("vsffffffffffff");
        log.info("MESSAGE SENT FROM PRODUCER END -> " + message);
        kafkaTemplate.send(TOPIC, new ObjectMapper().writeValueAsString(message));
    }




}
