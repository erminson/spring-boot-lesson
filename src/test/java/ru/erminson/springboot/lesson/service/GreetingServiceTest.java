package ru.erminson.springboot.lesson.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ActiveProfiles("test")
@SpringBootTest
class GreetingServiceTest {

    @Autowired
    GreetingService greetingService;

    @BeforeEach
    void setUp() {
    }

    @Test
    void testGreeting() {
        String expectedMessage = "Hello world";

        assertEquals(expectedMessage, greetingService.greeting());
    }

    @AfterEach
    void tearDown() {
    }
}