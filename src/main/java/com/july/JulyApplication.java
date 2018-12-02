package com.july;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.july.db.dao")
public class JulyApplication {

	public static void main(String[] args) {
		SpringApplication.run(JulyApplication.class, args);
	}
}
