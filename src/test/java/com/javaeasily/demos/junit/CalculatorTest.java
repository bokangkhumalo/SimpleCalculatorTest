package com.javaeasily.demos.junit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testAddTwoIntegers() {
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.add(1, 2));
        assertEquals(-2, calculator.add(-1, -1));
    }

    @Test
    public void testAddMultipleIntegers() {
        Calculator calculator = new Calculator();
        assertEquals(15, calculator.add(1, 2, 3, 4, 5));
        assertEquals(3, calculator.add(1, 2));
        assertEquals(-2, calculator.add(-1, -1));
    }

    @Test
    public void testMultiplyTwoIntegers() {
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.multiply(1, 3));
        assertEquals(-3, calculator.multiply(-1, 3));
    }

    @Test
    public void testMultiplyMultipleIntegers() {
        Calculator calculator = new Calculator();
        assertEquals(120, calculator.multiply(1, 2, 3, 4, 5));
        assertEquals(3, calculator.multiply(1, 3));
        assertEquals(-3, calculator.multiply(-1, 3));
    }
}
