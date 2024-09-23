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
}