package com.example.practice_demo.queue;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class QueueDemo {

    public static void main(String[] args) {

        Queue<Integer> arrayQueue = new ArrayBlockingQueue<>(100);

        Queue<Integer> linkedQueue = new LinkedBlockingDeque<>();

        for (int i=0; i< 10000; i++){
            arrayQueue.add(i);
        }
    }
}
