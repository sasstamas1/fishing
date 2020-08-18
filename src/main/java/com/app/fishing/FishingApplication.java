package com.app.fishing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableAutoConfiguration
@EnableJpaRepositories("com.app.fishing.repositories")
@SpringBootApplication
public class FishingApplication {


	public static void main(String[] args) {
		SpringApplication.run(FishingApplication.class, args);

	}

}
