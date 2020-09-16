package com.example.practice_demo;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


public class PracticeDemoApplicationTests {

	@Test
    public void t1() {
        System.out.println("test");
    }

    @BeforeClass
    public static void b() {
        System.out.println("before");
    }

    @AfterClass
    public static void c() {
        System.out.println("after");
    }

}
