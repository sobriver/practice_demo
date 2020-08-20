package com.example.practice_demo.test;

import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipArchiveInputStream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;
import java.util.stream.IntStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class Test {
    public static void main(String[] args) throws Exception {

        Process process = Runtime.getRuntime().exec("python D:\\PycharmProjects\\quantify\\study\\tyyy.py");
        BufferedReader in = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String line = null;
        while ((line = in.readLine()) != null) {
            System.out.println(line);
        }
        in.close();
        process.waitFor();

    }

    private void t1() {
        System.out.println("sdsd");
        v2();
    }

    private void v2() {
        System.out.println("sdsd");
        v3();
    }

    private void v3() {
        System.out.println("ssd");
        throw new NullPointerException();
    }
}
