package com.daaradji.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
public class QuranMapperApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuranMapperApplication.class, args);
	}

}
