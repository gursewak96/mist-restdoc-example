package com.harry.mvcrestdoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = "com.harry.mvcrestdoc")
public class MvcRestDocApplication {

	public static void main(String[] args) {
		SpringApplication.run(MvcRestDocApplication.class, args);
	}

}
