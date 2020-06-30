package com.example.practice_demo.test;

public class ThrowableTest {

    @lombok.SneakyThrows
    public static void main(String[] args) {
        try {
            throw new Throwable();
        } catch (Throwable e) {
            System.out.println("sdsds");
        }
    }
}
