package com.example.springsecurity.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springsecurity.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	Optional<User> findByUserName(String UserName);
}
