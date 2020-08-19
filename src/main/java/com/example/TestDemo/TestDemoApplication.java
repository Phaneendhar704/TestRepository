package com.example.TestDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestDemoApplication {

	public static void main(String[] args) {
		System.out.println("print");
		SpringApplication.run(TestDemoApplication.class, args);
	}

}
