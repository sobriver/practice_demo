package com.example.practice_demo.test;

import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class ThrowableTest {

    public static void main(String[] args) {
        BigDecimal num = BigDecimal.valueOf(456732);
        String cellValue = num.toPlainString();
        System.out.println(cellValue);
    }


}
