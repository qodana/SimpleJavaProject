package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for the Calculator class.
 * <p>
 * This class contains unit tests for the add(int a, int b) method in the
 * Calculator class. Each test is designed to validate specific behaviors of
 * the add method, ensuring it functions as expected for different input cases.
 */
public class CalculatorTest {

    @Test
    public void testAddWithPositiveNumbers() {
        Calculator calculator = new Calculator();
        int result = calculator.add(5, 3);
        assertEquals(8, result, "Adding 5 and 3 should return 8");
    }

    @Test
    public void testAddWithNegativeNumbers() {
        Calculator calculator = new Calculator();
        int result = calculator.add(-4, -6);
        assertEquals(-10, result, "Adding -4 and -6 should return -10");
    }

    @Test
    public void testAddWithPositiveAndNegativeNumbers() {
        Calculator calculator = new Calculator();
        int result = calculator.add(7, -2);
        assertEquals(5, result, "Adding 7 and -2 should return 5");
    }

    @Test
    public void testAddWithZero() {
        Calculator calculator = new Calculator();
        int result = calculator.add(0, 9);
        assertEquals(9, result, "Adding 0 and 9 should return 9");
    }

    @Test
    public void testAddWithBothZeroes() {
        Calculator calculator = new Calculator();
        int result = calculator.add(0, 0);
        assertEquals(0, result, "Adding 0 and 0 should return 0");
    }

    @Test
    public void testMultiplyWithPositiveNumbers() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(6, 4);
        assertEquals(24, result, "Multiplying 6 and 4 should return 24");
    }

    @Test
    public void testMultiplyWithNegativeNumbers() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(-3, -7);
        assertEquals(21, result, "Multiplying -3 and -7 should return 21");
    }

    @Test
    public void testMultiplyWithPositiveAndNegativeNumbers() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(8, -5);
        assertEquals(-40, result, "Multiplying 8 and -5 should return -40");
    }

    @Test
    public void testMultiplyWithZero() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(0, 10);
        assertEquals(0, result, "Multiplying 0 and 10 should return 0");
    }

    @Test
    public void testMultiplyWithBothZeroes() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(0, 0);
        assertEquals(0, result, "Multiplying 0 and 0 should return 0");
    }
}