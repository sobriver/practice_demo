package com.example.practice_demo.springboot.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cc")
public class CallbackController {

    @PostMapping("/test")
    public void test(@RequestBody String msg) {
        System.out.println("msg==" + msg);
    }
}
