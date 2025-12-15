package com.example.demo.service.impl;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class UserServiceImpl {

    @Autowired
    private UserRepository userRepository;

    public User registerUser(User user) {
        // 1. Check if email already exists
        if (userRepository.findByEmail(user.getEmail()).isPresent()) {
            throw new RuntimeException("Email is already in use!");
        }
        // 2. Save user (In real app: encrypt password here)
        return userRepository.save(user);
    }

    public User loginUser(String email, String password) {
        // 1. Find user by email
        Optional<User> optionalUser = userRepository.findByEmail(email);

        // 2. Validate user existence and password
        if (optionalUser.isPresent()) {
            User user = optionalUser.get();
            if (user.getPassword().equals(password)) {
                return user; // Login success
            }
        }
        
        // 3. Login failed
        throw new RuntimeException("Invalid email or password");
    }
}