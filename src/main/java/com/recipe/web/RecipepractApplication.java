package com.recipe.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.thymeleaf.dialect.springdata.SpringDataDialect;

@SpringBootApplication
public class RecipepractApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecipepractApplication.class, args);
	}
	@Bean
	 SpringDataDialect springDataDialect() {
		return new SpringDataDialect();
	}

}
