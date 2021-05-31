package com.example.practice_demo.pangu;

import com.alibaba.excel.EasyExcel;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.*;

public class MakeExcel {

    public static void batchCopyAndRename() throws Exception{
        String oriPath = "D:\\test\\批量导入\\新建文件夹";
        String savePath = "D:\\test\\批量导入\\11";


        List<Path> images = new ArrayList<>();
        Files.walkFileTree(Paths.get(oriPath), new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                images.add(file);
                return FileVisitResult.CONTINUE;
            }
        });

        for (int i=0; i < images.size(); i++){
            String[] re = images.get(i).getFileName().toString().split("\\.");
            int a = Integer.parseInt(re[0]) + 50000;
            Files.copy(images.get(i), Paths.get(savePath,  a + ".jpg"));
        }

    }


    public static void make(int num) throws Exception {
        //excel文件路径
        String excelPath = "D:\\test\\批量导入\\12\\employee_template.xlsx";
        //图片文件目录
        String imagePath = "D:\\test\\批量导入\\图片";
        //结果保存目录
        String savePath = "D:\\test\\批量导入\\12";


        List<Path> images = new ArrayList<>();
        Files.walkFileTree(Paths.get(imagePath), new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                images.add(file);
                return FileVisitResult.CONTINUE;
            }
        });

        int totalImageNum = images.size();

        List<PersonExcelDto> list = new ArrayList<>();
        for (int i=0; i < num; i++){
            PersonExcelDto dto = new PersonExcelDto();

            Path path = images.get(RandomUtils.nextInt(0, totalImageNum));
            String imageName = UUID.randomUUID().toString().replace("-", "") + ".jpg";
            Files.copy(path, Paths.get(savePath, imageName));
            dto.setImageName(imageName);
            dto.setName(RandomStringUtils.randomAlphabetic(5, 15));
            dto.setExt(RandomStringUtils.randomAlphabetic(5, 20));
            list.add(dto);
        }

        EasyExcel.write(Paths.get(excelPath).toFile(), PersonExcelDto.class).sheet("Sheet1").doWrite(list);
    }

    public static void main(String[] args) throws Exception {
        System.out.println(Long.MAX_VALUE);
    }
}
