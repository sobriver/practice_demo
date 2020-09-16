package com.example.practice_demo.mode.strategy;

public class Person {

    private TravelStrategy travelStrategy;

    public void setTravelStrategy(TravelStrategy travelStrategy) {
        this.travelStrategy = travelStrategy;
    }

    /**
     * 上班
     */
    public void goWork() {
        //1. 吃饭
        System.out.println("先吃饭");
        //2.出行
        travelStrategy.action();
        //3.到达公司
        System.out.println("到达公司");
    }
}
