package com.study.roadmap.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.study.roadmap.entity.MyUser;
import com.study.roadmap.repository.UserRepository;

public class UserService {
    
    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<MyUser> getAllUsers() {
        return userRepository.findAll();
    }
}
