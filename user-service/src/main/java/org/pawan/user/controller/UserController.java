package org.pawan.user.controller;

import org.pawan.user.entity.User;
import org.pawan.user.service.UserService;
import org.pawan.user.vo.ResponseTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public ResponseTemplate getUser(@PathVariable("id") Long userId){
        return userService.getUser(userId);
    }
}
