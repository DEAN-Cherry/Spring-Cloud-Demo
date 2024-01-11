package com.example.helloservice.service;

import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService{

    private final Environment environment;

    public HelloServiceImpl(Environment environment) {
        this.environment = environment;
    }

    @Override
    public String hello(String msg) {
        System.out.println("收到消息：" + msg);
        return String.format("收到消息：%s, 我是：%s", msg, environment.getProperty("server.port"));
    }

    @Override
    public String peerHello(String msg) {
        System.out.println("收到消息：" + msg);
        return String.format("收到消息：%s, 我是：%s", msg, environment.getProperty("server.port"));
    }
}
