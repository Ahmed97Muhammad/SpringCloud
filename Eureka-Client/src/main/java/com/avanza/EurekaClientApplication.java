package com.avanza;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientApplication.class, args);
	}
	
	@LoadBalanced//(RestTemplate bean with annotation @LoadBalanced. This tells Spring that we want to take advantage of client-side load balancing, which is in this case done by Ribbon.)Client-side load balancing decides which instance (in case of multiple end service running in the cluster that client can call)
    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
	}

}
