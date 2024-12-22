package com.codetech.multipledatabase.controller;

import com.codetech.multipledatabase.entity.UserEntity;
import com.codetech.multipledatabase.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/saveUser")
    public ResponseEntity<UserEntity> savePrimaryEntity(@RequestBody UserEntity user) {
        return new ResponseEntity<>(userService.saveUser(user), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<String> saveData() {
        userService.saveData();
        return ResponseEntity.ok("Data saved to both databases.");
    }

}
