package com.harri_task.harri_api_task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
//@SpringBootApplication
public class HarriApiTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(HarriApiTaskApplication.class, args);
	}

}
