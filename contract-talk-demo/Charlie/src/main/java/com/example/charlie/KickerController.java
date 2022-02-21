package com.example.charlie;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/kicks")
@RequiredArgsConstructor
public class KickerController {
    private final FootballService footballService;

    @GetMapping
    Map<String, String> kick(@RequestParam("yell") String yell) {
        return Map.of("response", this.footballService.kick(yell));
    }
}
