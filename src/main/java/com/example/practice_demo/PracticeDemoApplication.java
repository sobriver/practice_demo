package com.example.practice_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PracticeDemoApplication {

	public static void main(String[] args) {
		try {
			SpringApplication.run(PracticeDemoApplication.class, args);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
