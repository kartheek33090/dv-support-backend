package com.backend.safesupport.repository;

import com.backend.safesupport.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}