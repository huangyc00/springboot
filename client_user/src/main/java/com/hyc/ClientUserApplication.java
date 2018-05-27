package com.hyc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@tk.mybatis.spring.annotation.MapperScan("com.hyc.dao")
public class ClientUserApplication {
	public static void main(String[] args) {
		SpringApplication.run(ClientUserApplication.class, args);
	}
}
