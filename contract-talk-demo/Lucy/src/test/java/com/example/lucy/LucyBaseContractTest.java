package com.example.lucy;


import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.BeforeEach;

public class LucyBaseContractTest {
    @BeforeEach
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(new FootballController());
    }
}
