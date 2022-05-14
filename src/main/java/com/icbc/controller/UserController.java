package com.icbc.controller;

import com.icbc.pojo.User;
import com.icbc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/user/{id}")
    public User findById(@PathVariable("id") Long id){
        User user = userService.findById(id);
        return user;

    }
}
