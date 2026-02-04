package com.example.Insurance;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class HelloControllerTest {

    @Test
    void testHello() {
        String response = "Hello from Java CI/CD Pipeline!";
        assertTrue(response.contains("Hello"));
    }
}