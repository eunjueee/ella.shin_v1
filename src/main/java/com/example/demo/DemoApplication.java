package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("test_tt");
		// 주석 달기
		/* 주석달기 */
	}

	/** 메소드만들기 */
	public void testMethod(){
	}


}
