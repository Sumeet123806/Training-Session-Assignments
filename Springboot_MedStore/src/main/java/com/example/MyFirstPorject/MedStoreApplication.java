package com.example.MyFirstPorject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude=SecurityAutoConfiguration.class)
public class MedStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedStoreApplication.class, args);
	}

}
