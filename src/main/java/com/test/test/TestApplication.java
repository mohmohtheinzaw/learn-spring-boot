package com.test.test;

import com.test.test.controller.BookController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication

public class TestApplication {

	public static void main(String[] args) {
		System.out.println("ok");
		SpringApplication.run(TestApplication.class, args);
	}

}
