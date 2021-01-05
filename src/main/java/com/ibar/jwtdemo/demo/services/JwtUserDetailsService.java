package com.ibar.jwtdemo.demo.services;

import com.ibar.jwtdemo.demo.model.User;
import com.ibar.jwtdemo.demo.services.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service

public class JwtUserDetailsService implements UserDetailsService {


    private final UserServiceImpl userService;

    @Autowired
    public JwtUserDetailsService(UserServiceImpl userService) {

        this.userService = userService;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> userByUsername = userService.getUserByUsername(username);
        if (userByUsername.isPresent()) {
            return userByUsername.get();
        }
        throw new UsernameNotFoundException("User not found with username: " + username);
    }
}
