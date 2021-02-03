package com.example.practice_demo.springboot.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.practice_demo.springboot.entity.User2Entity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface User2Mapper extends BaseMapper<User2Entity> {
}
