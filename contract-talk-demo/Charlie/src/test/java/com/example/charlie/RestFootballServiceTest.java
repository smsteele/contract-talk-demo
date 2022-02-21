package com.example.charlie;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.cloud.contract.stubrunner.spring.StubRunnerProperties;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.web.client.RestTemplate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = WebEnvironment.NONE)
@AutoConfigureStubRunner(ids = {"com.example.lucy:lucy:+:stubs:8888"},
        stubsMode = StubRunnerProperties.StubsMode.LOCAL)
public class RestFootballServiceTest {

    private final String url = "http://localhost:8888/footballs";

    private final RestTemplate restTemplate = new RestTemplate();

    private final FootballService service = new RestFootballService(url, restTemplate);

    @Test
    void shouldReceiveNonEmptyMessageAfterKickingFootball() {
        String message = this.service.kick("yolo");
        assertThat(message).isNotBlank();
    }
}
