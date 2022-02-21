package com.example.charlie;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.HashSet;

import static java.util.Optional.ofNullable;

@RequiredArgsConstructor
public class RestFootballService implements FootballService {

    private final String footballUrl;

    private final RestTemplate restTemplate;

    @Override
    public String kick(String yell) {
        Kick kick = new Kick(yell);
        return ofNullable(this.restTemplate.postForObject(URI.create(footballUrl), kick, KickResponse.class))
                .map(KickResponse::getMessage)
                .orElseThrow();
    }

    @Data
    static class KickResponse {
        private String message;
    }
}
