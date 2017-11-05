package com.example.tbspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class TbspringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(TbspringbootApplication.class, args);
	}

	@RestController
	public static class HelloWorldController{
		@RequestMapping("/hello")
		public String helloWorld(){
			System.out.println("Hello World!");
			return "Hello World!";
		}
	}


}
