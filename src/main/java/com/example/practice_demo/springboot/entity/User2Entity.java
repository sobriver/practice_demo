package com.example.practice_demo.springboot.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("user2")
@Data
public class User2Entity {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String name;
}
