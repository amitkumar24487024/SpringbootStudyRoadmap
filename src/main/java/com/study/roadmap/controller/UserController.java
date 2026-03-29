package com.study.roadmap.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.roadmap.entity.MyUser;
import com.study.roadmap.service.UserService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api")
@Slf4j
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    
    

    @GetMapping("/users")
    public ResponseEntity<List<MyUser>> getAllUsers() {

        log.info("Fetching all users");
        List<MyUser> users = userService.getAllUsers();
        log.info("Number of users fetched: {}", users);
        return ResponseEntity.ok(users);
    }
}
