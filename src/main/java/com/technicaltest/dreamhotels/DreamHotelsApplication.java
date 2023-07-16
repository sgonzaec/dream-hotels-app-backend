package com.technicaltest.dreamhotels;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

@ComponentScan(basePackages = "com.technicaltest.dreamhotels")
public class DreamHotelsApplication {
	public static void main(String[] args) {
		SpringApplication.run(DreamHotelsApplication.class, args);
	}
}

