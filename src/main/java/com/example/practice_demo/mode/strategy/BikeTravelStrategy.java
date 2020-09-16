package com.example.practice_demo.mode.strategy;


public class BikeTravelStrategy implements TravelStrategy{
    @Override
    public void action() {
        System.out.println("骑自行车走了");
    }
}
