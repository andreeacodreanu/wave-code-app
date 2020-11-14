package com.project.wavecode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import repository.CityRepository;

@SpringBootApplication
@ComponentScan(basePackages={"controller", "service", "repository"})
@EnableMongoRepositories(basePackageClasses = CityRepository.class)
public class WavecodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(WavecodeApplication.class, args);
	}

}
