package com.example.practice_demo.springboot.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.practice_demo.springboot.entity.User1Entity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface User1Mapper extends BaseMapper<User1Entity> {
}
