package com.consumer.consumer.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HistoryProducerConfig {
    @Bean
    public NewTopic createTopic(){
        return new NewTopic("historyError.request.topic.v1", 1, (short) 1);
    }
}
