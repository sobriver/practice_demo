package com.example.practice_demo.redis;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.redisson.Redisson;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.stream.IntStream;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class LockTest {

    @Test
    public void lock() {
        Config config = new Config();
        config.useSingleServer().setAddress("redis://192.168.99.100:6379");
        RedissonClient client = Redisson.create(config);

        IntStream.rangeClosed(1, 5)
                .parallel()
                .forEach(i -> {
                    executeLock(i, client);
                });

    }

    public void executeLock(int i, RedissonClient client){
        RLock lock = client.getLock("myLock");
        boolean locked = false;

        try {
            log.info("{} try lock", i);
            locked = lock.tryLock();
            log.info("{} get lock result:{}", i, locked);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
    }
}