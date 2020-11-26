package com.example.practice_demo.dto;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

@Data
public class PersonDto {
    @ExcelProperty("姓名*")
    private String name;
}
