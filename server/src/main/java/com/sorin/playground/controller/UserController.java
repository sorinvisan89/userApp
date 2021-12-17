package com.sorin.playground.controller;

import com.sorin.playground.api.UserApi;
import com.sorin.playground.models.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController implements UserApi {

    @Override
    public ResponseEntity<Void> createUser(User body) {
        return ResponseEntity.ok().build();
    }

    @Override
    public ResponseEntity<Void> deleteUser(Integer userId) {
        return ResponseEntity.ok().build();
    }

    @Override
    public ResponseEntity<User> getUserById(Integer userId) {
        return ResponseEntity.ok().build();
    }

    @Override
    public ResponseEntity<Void> updateUser(Integer userId, User body) {
        return ResponseEntity.ok().build();
    }
}
