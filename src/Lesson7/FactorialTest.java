package Lesson7;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialTest {

    private final Factorial calculator =
            new Factorial();

    @Test
    public void factorialOfFive() {

        long result = calculator.factorial(5);

        Assert.assertEquals(result, 120);
    }

    @Test
    public void factorialOfZero() {

        long result = calculator.factorial(0);

        Assert.assertEquals(result, 120);
    }

    @Test (expectedExceptions = IllegalArgumentException.class)
    public void factorialNegativeNumber() {

        calculator.factorial(-5);
    }
}
