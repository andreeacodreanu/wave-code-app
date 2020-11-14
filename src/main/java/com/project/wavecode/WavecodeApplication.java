package com.project.wavecode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import com.project.repository.CityRepository;

@SpringBootApplication
@ComponentScan(basePackages={"com.project"})
@EnableMongoRepositories(basePackageClasses = CityRepository.class)
public class WavecodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(WavecodeApplication.class, args);
	}

}
