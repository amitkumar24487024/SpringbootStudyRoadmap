package com.study.roadmap.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api")
@Slf4j
public class UserController {
    

    @GetMapping
    public ResponseEntity<String> getAllUsers() {
        log.info("Fetching all users");
        return ResponseEntity.ok("All users");
    }
}
