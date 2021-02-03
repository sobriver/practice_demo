package com.example.practice_demo.springboot.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.practice_demo.springboot.entity.T1Entity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface T1Mapper extends BaseMapper<T1Entity> {
}
