package com.example.userservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {
    private final UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/hello/{msg}")
    public String hello(@PathVariable("msg") String msg) {
        return userService.hello(msg);
    }

    @GetMapping("/all")
    public List<User> selectAllUsers() {
        return userService.selectAllUsers();
    }

}
