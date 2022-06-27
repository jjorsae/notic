package com.example.notic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.mybatis.spring.annotation.MapperScan;
@SpringBootApplication
@MapperScan(basePackages = "com.example.notic")
public class NoticApplication {

	public static void main(String[] args) {
		SpringApplication.run(NoticApplication.class, args);
	}

}
