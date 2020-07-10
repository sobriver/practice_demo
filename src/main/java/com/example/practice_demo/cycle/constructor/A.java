package com.example.practice_demo.cycle.constructor;

import org.springframework.stereotype.Service;

/**
 * 构造器循环依赖示例
 */
@Service
public class A {
    public A(B b) {
    }
}
