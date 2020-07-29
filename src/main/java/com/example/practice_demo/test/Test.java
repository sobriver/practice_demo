package com.example.practice_demo.test;

import java.io.File;
import java.util.*;
import java.util.stream.IntStream;

public class Test {
    public static void main(String[] args) {
        Date date1 = new Date(122222220);
        Date date2 = new Date(122222221);
        Date date3 = new Date(122222224);

        List<Date> list = new ArrayList<>();
        list.add(date1);
        list.add(date2);
        list.add(date3);
        Optional<Date> date = list.stream().max(Comparator.comparing(Date::getTime));
        date.ifPresent(item -> System.out.println(item.getTime()));
    }

    private void t1() {
        System.out.println("sdsd");
        v2();
    }

    private void v2() {
        System.out.println("sdsd");
        v3();
    }

    private void v3() {
        System.out.println("ssd");
        throw new NullPointerException();
    }
}
