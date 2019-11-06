package com.nc.springbootdocker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SpringBootDockerApplicationTests {

    private SpringBootDockerApplication subjectToTest = new SpringBootDockerApplication();

    @Test
    void contextLoads() {
        assertEquals(2, 1 + 1);
    }

    @Test
    void testGetRandomNumber() {
        // When
        int randomValue = subjectToTest.getRandomValue();

        // Then
        assertEquals(true, randomValue > 0 && randomValue < 99999);
    }
}