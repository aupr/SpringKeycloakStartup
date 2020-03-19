package com.sincos.springrestapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringRestApiApplication {

	public static void main(String[] args) {

		//registry.addMapping("/**").allowedOrigins("http://localhost:4200");

		SpringApplication.run(SpringRestApiApplication.class, args);
	}

}
