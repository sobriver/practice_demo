package com.example.practice_demo.clickhouse.entity;

import lombok.Data;

import java.util.Date;

@Data
public class CityEntity {
    private String id;
    private String country;
    private String province;
    private String city;
    private Date create_time;
}
