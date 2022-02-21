package com.example.charlie;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class CharlieApplication {

    public static void main(String[] args) {
        SpringApplication.run(CharlieApplication.class, args);
    }

    @Bean
    RestTemplate footballRestTemplate() {
        return new RestTemplate();
    }

    @Bean
    FootballService footballService(@Value("${football.url:http://localhost:8080/footballs}") String url, RestTemplate restTemplate) {
        return new RestFootballService(url, restTemplate);
    }
}
