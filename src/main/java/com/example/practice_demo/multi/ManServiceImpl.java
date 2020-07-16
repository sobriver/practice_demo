package com.example.practice_demo.multi;

import org.springframework.stereotype.Service;

@Service("manService")
public class ManServiceImpl implements PersonService{
    @Override
    public void print() {
        System.out.println("I am man");
    }
}
