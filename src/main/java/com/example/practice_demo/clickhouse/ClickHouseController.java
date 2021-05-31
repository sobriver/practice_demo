package com.example.practice_demo.clickhouse;

import com.example.practice_demo.clickhouse.dao.CityDao;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ClickHouseController {
    @Resource
    private CityDao cityDao;



    @GetMapping("/click")
    public void test() {
        int a = cityDao.list();
        System.out.println("a==============" + a);
    }
}
