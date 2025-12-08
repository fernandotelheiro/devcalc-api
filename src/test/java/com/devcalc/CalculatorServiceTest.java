package com.devcalc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {

    @Test
    void testAdd() {
        CalculatorService service = new CalculatorService();
        assertEquals(15.0, service.add(10, 5));
    }

    @Test
    void testSubtract() {
        CalculatorService service = new CalculatorService();
        assertEquals(5.0, service.subtract(10, 5));
    }

    @Test
    void testMultiply() {
        CalculatorService service = new CalculatorService();
        assertEquals(50.0, service.multiply(10, 5));
    }

    @Test
    void testDivide() {
        CalculatorService service = new CalculatorService();
        assertEquals(2.0, service.divide(10, 5));
    }

    @Test
    void testDivideByZero() {
        CalculatorService service = new CalculatorService();
        assertThrows(IllegalArgumentException.class, () -> service.divide(10, 0));
    }
}
