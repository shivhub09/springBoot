package com.exampledemo.demo.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import com.exampledemo.demo.model.User;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "user-registration-topic", groupId = "group_id")
    public void consumeUserData(User user) {
        System.out.println("Received user data from Kafka topic: ");
        System.out.println("User Data: " + user.toString());

        // Simulate logging the user registration activity
        logUserRegistration(user);

        // Simulate sending a welcome email
        sendWelcomeEmail(user);
    }

    // Simulate logging the registration
    private void logUserRegistration(User user) {
        System.out.println("Logging user registration for user: " + user.getName());
        // Add actual logging or auditing logic here
    }

    // Simulate sending a welcome email
    private void sendWelcomeEmail(User user) {
        System.out.println("Sending welcome email to: " + user.getEmail());
        // Add actual email sending logic here
    }
}
