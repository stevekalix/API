package com.example.Secondabi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SecondabiApplication {

	public static void main(String[] args) {

		ApplicationContext context=  SpringApplication.run(SecondabiApplication.class, args);
		std std=context.getBean(std.class);

	}

}
