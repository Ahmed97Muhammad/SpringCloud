package com.avanza.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.avanza.models.Movie;

@RestController
public class RecommendationController {
	
	@Autowired
    RestTemplate restTemplate;

    @GetMapping("/recommendations")
    public Movie[] recommendations() {
        Movie[] result = restTemplate.getForObject("http://movie-service/movies", Movie[].class);
        return result;
    }

}
