package com.example.practice_demo.other;

import lombok.Data;
import org.apache.commons.compress.utils.Lists;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class Test {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        for (int i=0; i < 1000; i++){
            map.put(UUID.randomUUID().toString(), "12");
        }

    }


}
