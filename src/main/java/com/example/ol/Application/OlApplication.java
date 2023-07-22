package com.example.ol.Application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class OlApplication {

	public static void main(String[] args) {
		SpringApplication.run(OlApplication.class, args);
	}

}
