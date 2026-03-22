package com.study.roadmap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.study.roadmap.entity.MyUser;

@Repository
public interface UserRepository extends JpaRepository<MyUser, Long> {
    
}
