package com.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication
public class TrainingDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrainingDemoApplication.class, args);
	}

}
