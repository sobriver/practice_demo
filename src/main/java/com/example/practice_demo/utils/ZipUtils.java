package com.example.practice_demo.utils;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipUtils {

    public static void main(String[] args) throws Exception {
       Path path = Paths.get("D:\\tmp\\112\\logs");
        Files.list(path).forEach(item -> {
            System.out.println(item.getFileName().toString());
        });

    }


    public static String replace(final String s) {
        String[] a = s.split("\\\\");
        return s.replace(a[0], "");
    }

}
