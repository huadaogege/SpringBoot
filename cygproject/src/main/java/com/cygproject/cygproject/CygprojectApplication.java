package com.cygproject.cygproject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cygproject.cygproject.dao.mapper")
public class CygprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(CygprojectApplication.class, args);
	}
}
