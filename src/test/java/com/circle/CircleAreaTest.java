
package com.circle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CircleAreaTest {

    CircleArea circle = new CircleArea();

    // Test Case 1: Normal radius
    @Test
    void testAreaWithPositiveRadius() {

        double result = circle.calculateArea(5);

        assertEquals(78.53981633974483, result, 0.0001);
    }

    // Test Case 2: Radius is zero
    @Test
    void testAreaWithZeroRadius() {

        double result = circle.calculateArea(0);

        assertEquals(0.0, result);
    }

    // Test Case 3: Negative radius
    @Test
    void testAreaWithNegativeRadius() {

        assertThrows(IllegalArgumentException.class, () -> {
            circle.calculateArea(-5);
        });
    }

    // Test Case 4: Another positive radius
    @Test
    void testAreaWithRadiusTwo() {

        double result = circle.calculateArea(2);

        assertEquals(12.566370614359172, result, 0.0001);
    }
}
