package Lesson7;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calculator =
            new Calculator();

    @Test
    void addTest() {
        assertEquals(8, calculator.add(5,3));
    }

    @Test
    void substractTest() {
        assertEquals(2, calculator.subtract(5,3));
    }

    @Test
    void multiplyTest() {
        assertEquals(15, calculator.multiply(5,3));
    }

    @Test
    void divideTest() {
        assertEquals(3, calculator.divide(6,2));
    }

    @Test
    void divideByZero() {

        assertThrows(ArithmeticException.class, () -> calculator.divide(2, 0));
    }
}
