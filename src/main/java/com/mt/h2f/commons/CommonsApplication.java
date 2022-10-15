package com.mt.h2f.commons;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@SpringBootApplication
public class CommonsApplication {
	public static void main(String[] args) {
		SpringApplication.run(CommonsApplication.class, args);
	}
}
