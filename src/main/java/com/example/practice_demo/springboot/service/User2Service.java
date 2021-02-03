package com.example.practice_demo.springboot.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.practice_demo.springboot.entity.User2Entity;
import com.example.practice_demo.springboot.mapper.User2Mapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class User2Service extends ServiceImpl<User2Mapper, User2Entity> {

    @Resource
    private User2Mapper user2Mapper;

    @Transactional(propagation = Propagation.REQUIRED)
    public void addUser2(User2Entity user2Entity) {
        user2Mapper.insert(user2Entity);
    }
}
