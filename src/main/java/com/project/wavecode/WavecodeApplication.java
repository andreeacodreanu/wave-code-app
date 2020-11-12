package com.project.wavecode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"controller"})
public class WavecodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(WavecodeApplication.class, args);
	}

}
