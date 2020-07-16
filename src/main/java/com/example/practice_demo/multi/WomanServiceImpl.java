package com.example.practice_demo.multi;

import org.springframework.stereotype.Service;

@Service("womanService")
public class WomanServiceImpl implements PersonService{
    @Override
    public void print() {
        System.out.println("I am women");
    }
}
