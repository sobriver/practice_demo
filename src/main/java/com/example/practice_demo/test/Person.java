package com.example.practice_demo.test;

import lombok.Data;

import java.util.List;

@Data
public class Person {
    private Long companyId;
    //人员类型
    private Integer type;
    //用户名, 模糊查询
    private String name;
    //员工编码, 模糊查询
    private String code;
    //员工ID集合
    private List<Long> personIdList;
}
