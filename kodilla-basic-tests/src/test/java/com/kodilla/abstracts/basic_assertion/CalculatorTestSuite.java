package com.kodilla.abstracts.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTestSuite {

    @Test

    public void testSum() {
        Calculator calculator = new Calculator();
        assertEquals(13, calculator.sum(8, 5));
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.subtract(8, 5));
    }


    @Test
    public void testsqrtDouble() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.sqrt(25));
        assertEquals(0, calculator.sqrt(0));
        assertEquals(0, calculator.sqrt(-25));
    }
}