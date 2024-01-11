package com.example.helloservice.controller;

import com.example.helloservice.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {
    private final HelloService helloService;
    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }
    @GetMapping("/hello/{msg}")
    public String hello(@PathVariable("msg") String msg) {
        return helloService.hello(msg);
    }

//    @GetMapping("/peerHello")
//    public String peerHello(String msg) {
//        return helloService.peerHello(msg);
//    }

}
