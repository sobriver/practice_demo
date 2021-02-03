package com.example.practice_demo.springboot.service;

import com.example.practice_demo.springboot.entity.User1Entity;
import com.example.practice_demo.springboot.entity.User2Entity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@SpringBootTest
@RunWith(SpringRunner.class)
public class User1ServiceTest {

    @Resource
    private User1Service user1Service;
    @Resource
    private User2Service user2Service;

    @Test
    public void nested() {
        t1();
    }

    @Transactional
    public void t1() {
        User1Entity user1Entity = new User1Entity();
        user1Entity.setId(100);
        user1Entity.setName("sju");
        user1Service.addUser1(user1Entity);

        User2Entity user2Entity = new User2Entity();
        user2Entity.setId(200);
        user2Entity.setName("fdf");
        user2Service.addUser2(user2Entity);

        throw new RuntimeException();
    }

}