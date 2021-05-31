package com.example.practice_demo.clickhouse.dao;

import com.example.practice_demo.clickhouse.entity.CityEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityDao {

    int list();
}
