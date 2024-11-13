package org.example.recipesharingp.controller;

import org.example.recipesharingp.model.User;
import org.example.recipesharingp.model.Role;
import org.example.recipesharingp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.Set;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public User registerUser(@RequestBody UserRegistrationRequest request) {
        return userService.createUser(request.getEmail(), request.getPassword(), request.getName(), Set.of(Role.USER));
    }

    @GetMapping("/{email}")
    public Optional<User> getUserByEmail(@PathVariable String email) {
        return userService.findByEmail(email);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }

    // Other user-related endpoints...

    static class UserRegistrationRequest {
        private String email;
        private String password;
        private String name;

        // Getters and Setters
    }
}