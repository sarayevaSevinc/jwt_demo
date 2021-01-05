package com.ibar.jwtdemo.demo.repo;


import com.ibar.jwtdemo.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> getUserById(long id);
    Optional<User> getUserByUsername(String username);

}
