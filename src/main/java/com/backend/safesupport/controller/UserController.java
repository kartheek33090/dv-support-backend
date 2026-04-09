package com.backend.safesupport.controller;

import com.backend.safesupport.model.User;
import com.backend.safesupport.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    private UserService service;

    // CREATE
    @PostMapping
    public User addUser(@RequestBody User user) {
        return service.saveUser(user);
    }

    // READ
    @GetMapping
    public List<User> getUsers() {
        return service.getAllUsers();
    }

    // UPDATE STATUS
    @PutMapping("/{id}")
    public User updateStatus(@PathVariable int id) {
        return service.updateStatus(id);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable int id) {
        service.deleteUser(id);
    }
}