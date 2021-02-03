package com.example.practice_demo.other;

import lombok.Data;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Test {

    private static List<Person> syncList = new ArrayList<>();

    public static void main(String[] args) {
        String dayPattern = ".*([0-1][0-9]-[0-3][0-9])+.*";

        System.out.println("01-28".matches(dayPattern));
        System.out.println("f01-2902".matches(dayPattern));
        System.out.println("01-280247".matches(dayPattern));
        System.out.println("01-2502:1".matches(dayPattern));
        System.out.println("01-1909:28".matches(dayPattern));

        System.out.println("0-2702:13".matches(dayPattern));
        System.out.println("dfdfdf".matches(dayPattern));
    }

    public static void ji(Person strings){

    }



    @Data
    static class Person {
        private String name;
        private LocalDateTime create;
    }

    @Data
    static class Women extends Person{
        private String k;
    }


}
