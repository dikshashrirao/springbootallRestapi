package com.ws.cunsume;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SbWebServiceCosumeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbWebServiceCosumeApplication.class, args);
		
	}

	@Bean
	public RestTemplate rt() 
	{
	RestTemplate restTemplate=new RestTemplate();
	return restTemplate;
    }
}
