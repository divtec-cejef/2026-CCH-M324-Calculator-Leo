package ch.divtec;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class CalculatorTest {

    @Test
    public void addTest() {

        Calculator calculator = new Calculator();

        assertEquals(3, calculator.add(1, 2));
        assertEquals(-54, calculator.add(-12, -42));
        assertEquals(1313213235, calculator.add(1313213233, 2));
    }

    @Test
    public void multiplyTest() {
        Calculator calculator = new Calculator();

        assertEquals(0, (int)calculator.multiply(0, -5649678));

        assertEquals(2, calculator.multiply(1, 2));
        assertEquals(504, calculator.multiply(-12, -42));
        assertEquals(262642646, calculator.multiply(131321323, 2));
    }

    @Test
    public void substractTest() {
        Calculator calculator = new Calculator();

        assertEquals(-1, calculator.subtract(1, 2));
        assertEquals(30, calculator.subtract(-12, -42));
        assertEquals(1313213231, calculator.subtract(1313213233, 2));
    }

    @Test
    public void divideTest() {
        Calculator calculator = new Calculator();

        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(1, 0);
        });

        assertEquals(-1, calculator.subtract(1, 2));
        assertEquals(30, calculator.subtract(-12, -42));
        assertEquals(1313213231, calculator.subtract(1313213233, 2));
    }

    void factorialNegative() {
        Calculator calculator = new Calculator();

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.factorial(-5);
        });

        String expectedMessage = "Number must be positive";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    void factorialDecimal() {
        Calculator calculator = new Calculator();

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.factorial(3.2);
        });

        String expectedMessage = "Number must be an integer";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }


}
