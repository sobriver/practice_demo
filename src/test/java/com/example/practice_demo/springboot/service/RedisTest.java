package com.example.practice_demo.springboot.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class RedisTest {

    @Resource
    private RedissonClient client;

    @Test
    public void t1() {
        IntStream.range(1, 10).parallel().forEach(i -> executeLock());
        executeLock();
    }

    public void executeLock(){
        RLock lock = client.getLock("lock878");
        boolean locked = false;

        try {
            locked  = lock.tryLock();
            log.info("try lock result:{}", locked);
            if (locked){
                TimeUnit.SECONDS.sleep(3);
                log.info("lock finish");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (locked){
                lock.unlock();
            }
        }
    }




    @Test
    public void readLock1() {
        RLock lock = client.getReadWriteLock("lock112").readLock();
        lock.tryLock();
        lock.unlock();
    }

    @Test
    public void readLock2() {
        RLock lock = client.getReadWriteLock("lock112").readLock();
        lock.unlock();
    }

}
