package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		DemoApplication d = new DemoApplication();
		d.testMethod();
	}


	public void testMethod(){
		System.out.println("test_tt");
	}


}
