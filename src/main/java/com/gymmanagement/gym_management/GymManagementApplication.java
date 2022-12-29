package com.gymmanagement.gym_management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class GymManagementApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(GymManagementApplication.class, args);
	}

}
