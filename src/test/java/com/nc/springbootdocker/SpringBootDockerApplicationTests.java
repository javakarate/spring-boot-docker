package com.nc.springbootdocker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SpringBootDockerApplicationTests {

    private SpringBootDockerApplication subject = new SpringBootDockerApplication();

    @Test
    void contextLoads() {
        assertEquals(2, 1 + 1);
    }

    @Test
    void testGetRandomNumber() {
        int randomValue = subject.getRandomValue();
        assertEquals(true, randomValue > 0 && randomValue < 99999);
    }
}