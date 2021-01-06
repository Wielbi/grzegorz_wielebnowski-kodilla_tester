package com.kodilla.abstracts.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeCheckerTestSuite {

    @Test
    public void shouldReturnFalseWhenPassingNotPrimeNumber() {
        PrimeChecker checker = new PrimeChecker();
        boolean result = checker.isPrime(14);
        assertFalse(result);
    }
}