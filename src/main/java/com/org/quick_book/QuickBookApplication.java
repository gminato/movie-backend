package com.org.quick_book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.org.quick_book")
public class QuickBookApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuickBookApplication.class, args);
	}

}
