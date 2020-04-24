package com.leinuoa.userserver.controller;

import com.leinuoa.userserver.model.UserEntity;
import com.leinuoa.userserver.service.UserService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/add")
    public String createUser(@RequestBody UserEntity userEntity){
        userService.addUser(userEntity);
        return userEntity.toString();
    }
}
