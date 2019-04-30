package com.spring.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.spring.app.**.dao")
public class SpringTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTestApplication.class, args);
	}

}
