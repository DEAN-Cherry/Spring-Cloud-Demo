package com.example.helloservice.service;

import org.springframework.web.bind.annotation.PathVariable;


public interface HelloService {


    String hello(@PathVariable("msg") String msg);

    String peerHello(String msg);

}
