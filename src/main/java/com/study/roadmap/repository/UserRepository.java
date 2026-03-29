package com.study.roadmap.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.study.roadmap.entity.MyUser;

@Repository
public interface UserRepository extends MongoRepository<MyUser, String> {
    // You can define custom query methods here if needed
}