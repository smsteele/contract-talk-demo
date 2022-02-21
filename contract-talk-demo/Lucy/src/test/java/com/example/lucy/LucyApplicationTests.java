package com.example.lucy;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
class LucyApplicationTests {

    @Test
    void contextLoads() {
        MockMvcResultMatchers.status().isIAmATeapot();
    }

}
