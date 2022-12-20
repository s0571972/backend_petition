package com.htw.berlin.petition;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.htw.berlin.repository", "com.htw.berlin.service", "com.htw.berlin.model", "com.htw.berlin.controller" })
@EntityScan("com.htw.berlin.model")
@EnableJpaRepositories("com.htw.berlin.repository")
public class PetitionApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetitionApplication.class, args);
	}

}
