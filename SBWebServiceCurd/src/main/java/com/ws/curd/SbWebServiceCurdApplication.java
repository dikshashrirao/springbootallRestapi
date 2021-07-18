package com.ws.curd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EnableJpaRepositories
@EntityScan
@SpringBootApplication
public class SbWebServiceCurdApplication {

	public static void main(String[] args) {
		System.out.println("welcome");
		SpringApplication.run(SbWebServiceCurdApplication.class, args);
	}
}
