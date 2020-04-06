package com.avanza;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
//https://spring.io/guides/gs/centralized-configuration/
public class MyConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyConfigServerApplication.class, args);
	}

}
