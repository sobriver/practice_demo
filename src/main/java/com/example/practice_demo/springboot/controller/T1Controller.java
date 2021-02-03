package com.example.practice_demo.springboot.controller;

import com.example.practice_demo.springboot.entity.T1Entity;
import com.example.practice_demo.springboot.mapper.T1Mapper;
import com.example.practice_demo.springboot.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/t1")
public class T1Controller {

    @Resource
    private T1Mapper t1Mapper;
    @Resource
    private TestService testService;

    @GetMapping("{id}")
    public Integer queryById(@PathVariable Integer id) {
        T1Entity entity = t1Mapper.selectById(id);
        return entity.getVal();
    }

    @GetMapping("/test")
    public void test() {
        testService.t1();
    }
}
