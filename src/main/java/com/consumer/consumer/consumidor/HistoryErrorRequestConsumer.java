package com.consumer.consumer.consumidor;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class HistoryErrorRequestConsumer {

    @KafkaListener(topics = "${historyError.request.topic.v1}", groupId = "historyError-request-consumer-1")
    public void consume(String menssage){
        System.out.println("=== mensagem === " + menssage);
    }
}
