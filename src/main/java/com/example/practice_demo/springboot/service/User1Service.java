package com.example.practice_demo.springboot.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.practice_demo.springboot.entity.User1Entity;
import com.example.practice_demo.springboot.mapper.User1Mapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class User1Service extends ServiceImpl<User1Mapper, User1Entity> {
    @Resource
    private User1Mapper user1Mapper;

    @Transactional(propagation = Propagation.REQUIRED)
    public void addUser1(User1Entity user1Entity) {
        user1Mapper.insert(user1Entity);
    }
}
