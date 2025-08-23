package com.example.userservice.consumer;

import com.example.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class AuthServiceConsumer {

    private UserRepository userRepository;

    @Autowired
    public AuthServiceConsumer(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @KafkaListener(topics = "${spring.kafka.topic-name}" , groupId = "${spring.kafka.consumer.group-id}")
    public void consume(Object eventData) {
        try {
            System.out.println(eventData);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
