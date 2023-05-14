package com.fabricio.apirest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.cruz.repository")
@EntityScan(basePackages = "com.cruz.entity")
public class ApirestApplication {

	public static void main(String[] args) {

		SpringApplication.run(ApirestApplication.class, args);
	}

}
