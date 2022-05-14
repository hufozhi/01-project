package com.icbc.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
  @GetMapping("/helloB")
    public String hello(){
        return "hello,Springboot,创建了";
    }
}
