package com.exampledemo.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exampledemo.demo.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
