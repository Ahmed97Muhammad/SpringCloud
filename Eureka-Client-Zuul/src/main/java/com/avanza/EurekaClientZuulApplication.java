package com.avanza;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.avanza.filters.ErrorFilter;
import com.avanza.filters.PostFilter;
import com.avanza.filters.PreFilter;
import com.avanza.filters.RouteFilter;
/*
https://howtodoinjava.com/spring-cloud/spring-cloud-api-gateway-zuul/
/https://springbootdev.com/2018/02/03/microservices-declare-zuul-routes-with-eureka-serviceid-spring-cloud-zuul-eureka/
*/

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class EurekaClientZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientZuulApplication.class, args);
	}
	
//	Create the bean definition of these filters to be auto-registered and enabled.

	@Bean
    public PreFilter preFilter() {
        return new PreFilter();
    }
    @Bean
    public PostFilter postFilter() {
        return new PostFilter();
    }
    @Bean
    public ErrorFilter errorFilter() {
        return new ErrorFilter();
    }
    @Bean
    public RouteFilter routeFilter() {
        return new RouteFilter();
    }
}
