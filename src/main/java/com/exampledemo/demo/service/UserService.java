package com.exampledemo.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.exampledemo.demo.dao.UserRepository;
import com.exampledemo.demo.model.User;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private KafkaProducerService kafkaProducerService;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User saveUser(User user) {
        User savedUser = userRepository.save(user);
        kafkaProducerService.sendUserData(savedUser);  
        return savedUser;
    }
}
