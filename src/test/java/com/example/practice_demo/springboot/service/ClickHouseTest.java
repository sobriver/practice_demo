package com.example.practice_demo.springboot.service;

import com.example.practice_demo.clickhouse.dao.CityDao;
import com.example.practice_demo.clickhouse.entity.CityEntity;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ClickHouseTest {

    @Resource
    private CityDao cityDao;

    @Test
    public void t1() {
        int a = cityDao.list();
        System.out.println("a=================" + a);
    }

}
