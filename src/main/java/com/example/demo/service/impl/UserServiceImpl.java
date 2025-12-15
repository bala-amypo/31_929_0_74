package com.example.demo.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    User user;
    public User register(User user){
        return user;
    }
    public User findByEmail(String email){
        return user;
    }
}
