package com.example.userservice;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final HelloClient helloClient;
    private final UserMapper userMapper;

    public UserServiceImpl(HelloClient helloClient, UserMapper userMapper) {
        this.helloClient = helloClient;
        this.userMapper = userMapper;
    }

    @Override
    public String hello(String msg) {
        return helloClient.hello("I am UserService, message from UserService:" + msg + "!");
    }

    @Override
    public List<User> selectAllUsers() {
        return userMapper.selectList(null);
    }

    @Override
    public List<User> getUsersByAge(Integer age) {
        return null;
    }

    @Override
    public List<User> getUsersByName(String name) {
        return null;
    }

    @Override
    public List<User> getUserById(Integer id) {
        return null;
    }


}
