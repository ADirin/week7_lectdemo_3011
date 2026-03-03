package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    void testSpeedAverageNormal() {
        // Normal case: distance = 100, time = 2 => speed = 50
        double result = Main.speedAverage(100, 2);
        assertEquals(50, result, 0.0001);
    }

    @Test
    void testSpeedAverageZeroDistance() {
        // distance = 0, time = 5 => speed = 0
        double result = Main.speedAverage(0, 5);
        assertEquals(0, result, 0.0001);
    }

    @Test
    void testSpeedAverageDecimal() {
        // distance = 7.5, time = 2.5 => speed = 3
        double result = Main.speedAverage(7.5, 2.5);
        assertEquals(3, result, 0.0001);
    }

    @Test
    void testSpeedAverageNegative() {
        // negative distance => speed = -5
        double result = Main.speedAverage(-10, 2);
        assertEquals(-5, result, 0.0001);
    }
}