package com.example.eurekaclient.servieces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class HelloService {


    private final Environment environment;

    public HelloService(Environment environment) {
        this.environment = environment;
    }

    public String hello() {
        return environment.getProperty("server.port");
    }

    public String hello(String msg) {
        return String.format("收到消息：%s, 我是：%s", msg, environment.getProperty("server.port"));
    }
}
