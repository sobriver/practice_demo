package com.example.practice_demo.t1;

public class Demo2 {
    public static void main(String[] args) {

        Inter inter = () -> System.out.println("---" + Inter.a);
        inter.t();

    }

    @FunctionalInterface
    interface Inter{
        int a = 3;
        void t();
    }
}
