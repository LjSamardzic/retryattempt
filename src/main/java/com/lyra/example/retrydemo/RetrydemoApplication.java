package com.lyra.example.retrydemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;

@SpringBootApplication
public class RetrydemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RetrydemoApplication.class, args);
	}

}
