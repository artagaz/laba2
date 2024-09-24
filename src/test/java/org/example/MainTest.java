package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void triangle() {
        assertTrue(Main.triangle(2, 3, 4));
        assertFalse(Main.triangle(-2, 0 ,123));
    }

    @Test
    void distance() {
        assertEquals(11, Math.floor(Main.distance(0,0, 8,8)));
    }

    @Test
    void powerLoop() {
        assertEquals(32, Main.powerLoop(2,5));
        assertEquals(1, Main.powerLoop(123, 0));
        assertEquals(-1, Main.powerLoop(0, -123));
    }

    @Test
    void power() {
        assertEquals(32, Main.power(2,5));
        assertEquals(1, Main.power(123, 0));
        assertEquals(-1, Main.power(0, -123));
    }

    @Test
    void tribonacci() {
        int[] lastThree = {0,0,1};
        assertEquals(0, Main.tribonacci(0, lastThree));
        assertEquals(0, Main.tribonacci(1, lastThree));
        assertEquals(1, Main.tribonacci(2, lastThree));
        assertEquals(81, Main.tribonacci(10, lastThree));
        assertEquals(-1, Main.tribonacci(-123123, lastThree));
        lastThree = new int[]{1, 2, 4};
        assertEquals(81, Main.tribonacci(7, lastThree));
    }
}