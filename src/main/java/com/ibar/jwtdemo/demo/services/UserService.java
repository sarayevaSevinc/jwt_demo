package com.ibar.jwtdemo.demo.services;

import com.ibar.jwtdemo.demo.model.User;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface UserService {
    Optional<User> getUserById(int id);
    Optional<User> getUserByUsername(String username);
    User save(User user);
}
