package com.example.practice_demo.es.entity;

import lombok.Data;

@Data
public class PersonEntity {

    private Long id;
    private String name;
    private Integer age;
    private String address;
    private String phone;
    private String email;
    private String ext;
}
