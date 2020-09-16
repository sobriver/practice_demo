package com.example.practice_demo.mode.strategy;

/**
 * 开车出行
 */
public class BusTravelStrategy implements TravelStrategy{

    @Override
    public void action() {
        System.out.println("开车走了");
    }
}
