package com.finwise.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FinWiseApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinWiseApplication.class, args);
		System.out.println("Application running.");
	}

}
