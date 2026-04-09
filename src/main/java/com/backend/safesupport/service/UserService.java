package com.backend.safesupport.service;

import com.backend.safesupport.model.User;
import com.backend.safesupport.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    // CREATE
    public User saveUser(User user) {
        return repo.save(user);
    }

    // READ
    public List<User> getAllUsers() {
        return repo.findAll();
    }

    // UPDATE STATUS
    public User updateStatus(int id) {
        User user = repo.findById(id).orElse(null);
        if (user != null) {
            user.setStatus("Solved");
            return repo.save(user);
        }
        return null;
    }

    // DELETE
    public void deleteUser(int id) {
        repo.deleteById(id);
    }
}