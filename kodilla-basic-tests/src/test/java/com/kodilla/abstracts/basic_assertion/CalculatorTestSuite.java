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
    public void testSubstract() {
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.subtract(8, 5));
    }


    @Test
    public void testExpPositiveNumber() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.exp(8, 5));
    }

    @Test
    public void testExpNegativNumber() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.exp(8, 5));

    }

    @Test

    public void testExpZeroNumber(){
        Calculator calculator = new Calculator();
        assertEquals(0,calculator.exp(8,3));

    }

@Test
    public void testsqrtDouble(){
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.sqrt(25));
}
}