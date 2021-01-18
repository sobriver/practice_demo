package com.example.practice_demo.sb.controller;

import com.example.practice_demo.sb.entity.T1Entity;
import com.example.practice_demo.sb.mapper.T1Mapper;
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

    @GetMapping("{id}")
    public Integer queryById(@PathVariable Integer id) {
        T1Entity entity = t1Mapper.selectById(id);
        return entity.getVal();
    }
}
