package com.example.practice_demo.mode.strategy;

public class Main {
    public static void main(String[] args) {
        Person hw = new Person();
        //今天骑自行车去上班
        hw.setTravelStrategy(new BikeTravelStrategy());
        hw.goWork();

        System.out.println("==================");
        //明天开车去上班
        hw.setTravelStrategy(new BusTravelStrategy());
        hw.goWork();
    }
}
