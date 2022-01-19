package com.codedecode.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories("com.codedecode.demo.repository")
public class ExpenseSharing2Application {

	public static void main(String[] args) {
		SpringApplication.run(ExpenseSharing2Application.class, args);
	}

}
