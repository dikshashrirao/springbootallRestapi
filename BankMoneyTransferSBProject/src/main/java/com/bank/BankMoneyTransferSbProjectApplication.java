package com.bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EnableJpaRepositories
@EntityScan
@SpringBootApplication
public class BankMoneyTransferSbProjectApplication {

	public static void main(String[] args) {
		System.out.println("Welcome in my Bank");
		SpringApplication.run(BankMoneyTransferSbProjectApplication.class, args);
	}

}
