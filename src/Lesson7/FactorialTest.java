package Lesson7;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FactorialTest {

    private final Factorial calculator =
            new Factorial();

    @Test
    public void factorialOfFive() {

        long result = calculator.factorial(5);

        assertEquals(120, result);
    }

    @Test
    public void factorialOfZero() {

        long result = calculator.factorial(0);

        assertEquals(1, result);
    }

    @Test
    public void factorialNegativeNumber() {

        assertThrows (
                IllegalArgumentException.class,
                () -> calculator.factorial(-5));
    }
}
