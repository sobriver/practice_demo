package com.example.practice_demo.sb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("t1")
@Data
public class T1Entity {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private Integer val;
    private Integer source;
}
