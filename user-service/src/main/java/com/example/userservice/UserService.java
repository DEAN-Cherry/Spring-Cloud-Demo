package com.example.userservice;

import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    String hello(String msg);

    List<User> selectAllUsers();

    List<User> getUsersByAge(Integer age);

    List<User> getUsersByName(String name);

    List<User> getUserById(Integer id);
}
