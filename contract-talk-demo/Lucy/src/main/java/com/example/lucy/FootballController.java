package com.example.lucy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static java.util.Objects.requireNonNull;

@Slf4j
@RestController
@RequestMapping("/footballs")
class FootballController {

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    FootballResponse kick(@RequestBody Kick kick) {
        log.info("Kicking football while yelling {}", requireNonNull(kick.getYell()));
        return FootballResponse.builder()
                .message("Be innocent of the knowledge, dearest chuck. Till thou applaud the deed.")
                .status("In Northern we Trust")
                .build();
    }
}

