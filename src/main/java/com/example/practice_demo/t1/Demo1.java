package com.example.practice_demo.t1;

import lombok.extern.slf4j.Slf4j;
import net.lingala.zip4j.ZipFile;
import net.lingala.zip4j.exception.ZipException;

import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.*;

@Slf4j
public class Demo1 {

    public static void main(String[] args) {

        list();
//        map();


    }


    public static void list() {
        List<String> list = new CopyOnWriteArrayList<>();

        ExecutorService executor = Executors.newFixedThreadPool(10);
        long start = System.currentTimeMillis();
        for (int i=0; i < 10; i++){
            executor.submit(new Runnable() {
                @Override
                public void run() {
                    for (int j=0; j< 10000; j++){
                        list.add(UUID.randomUUID().toString());
                    }
                }
            });
        }

        executor.shutdown();
        try {
            if (executor.awaitTermination(1, TimeUnit.DAYS)){
                System.out.println(System.currentTimeMillis() - start);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void map() {
        Map<String, String> list = new ConcurrentHashMap<>();

        ExecutorService executor = Executors.newFixedThreadPool(10);
        long start = System.currentTimeMillis();
        for (int i=0; i < 10; i++){
            int finalI = i;
            executor.submit(new Runnable() {
                @Override
                public void run() {
                    for (int j=0; j< 10000; j++){
                        list.put(UUID.randomUUID().toString(),"huah" + j);
                    }
                }
            });
        }

        executor.shutdown();
        try {
            if (executor.awaitTermination(1, TimeUnit.DAYS)){
                Collection<String> s = list.values();
                System.out.println(s.size());
                System.out.println(System.currentTimeMillis() - start);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
