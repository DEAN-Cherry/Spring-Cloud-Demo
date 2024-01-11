package com.example.userservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "hello-service", path = "/api")
public interface HelloClient {

    @GetMapping("/hello/{msg}")
    String hello(@PathVariable("msg") String msg);
}
