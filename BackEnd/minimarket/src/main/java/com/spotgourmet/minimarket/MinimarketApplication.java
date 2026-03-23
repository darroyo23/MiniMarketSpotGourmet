package com.spotgourmet.minimarket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
@EnableScheduling
public class MinimarketApplication {
	public static void main(String[] args) {
		SpringApplication.run(MinimarketApplication.class, args);
	}
}
