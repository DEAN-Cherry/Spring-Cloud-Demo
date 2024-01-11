package com.example.eurekaclient.controllers;

import com.example.eurekaclient.servieces.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final HelloService helloService;
    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping("/hello/{msg}")
    public String hello(@PathVariable("msg") String msg) {
        return helloService.hello();
    }

    @GetMapping("/t")
    public String t() {
        System.out.println("Router for /t");
        return "t";
    }

}
