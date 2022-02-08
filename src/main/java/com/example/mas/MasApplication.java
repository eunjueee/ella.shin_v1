package com.example.mas;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MasApplication {
	final Log logger = LogFactory.getLog(MasApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(MasApplication.class, args);
	}

}
