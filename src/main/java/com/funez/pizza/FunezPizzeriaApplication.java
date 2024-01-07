package com.funez.pizza;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class FunezPizzeriaApplication {

	public static void main(String[] args) {
		SpringApplication.run(FunezPizzeriaApplication.class, args);
	}

}
