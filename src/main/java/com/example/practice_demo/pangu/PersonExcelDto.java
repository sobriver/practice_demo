package com.example.practice_demo.pangu;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.util.Date;

@Data
public class PersonExcelDto {

    @ExcelProperty("姓名*")
    private String name;

    @ExcelProperty("照片名称")
    private String imageName;

    @ExcelProperty("备注")
    private String ext;

}
