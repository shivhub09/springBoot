package com.exampledemo.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import com.exampledemo.demo.model.User;

@Service
public class KafkaProducerService {

    private static final String TOPIC = "user-registration-topic";

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    public void sendUserData(User user) {
        System.out.println("Following is the data received : ");
        System.out.println("Sending user data: " + user.toString());
        
        // Sending data to Kafka topic
        kafkaTemplate.send(TOPIC, user);

        System.out.println("User data sent to Kafka topic: " + TOPIC);
    }
}
