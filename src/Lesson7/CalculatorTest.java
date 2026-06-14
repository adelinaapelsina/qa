package Lesson7;
import org.testng.Assert;
import org.testng.annotations.Test;

class CalculatorTest {

    private final Calculator calculator =
            new Calculator();

    @Test
    public void addTest() {

        Assert.assertEquals(calculator.add(5,3), 8);
    }

    @Test
    public void substractTest() {

        Assert.assertEquals(calculator.subtract(5,3), 2);
    }

    @Test
    public void multiplyTest() {

        Assert.assertEquals(calculator.multiply(5,3), 15);
    }

    @Test
    public void divideTest() {

        Assert.assertEquals(calculator.divide(6,2), 3);
    }

    @Test (
            expectedExceptions = ArithmeticException.class)

    public void divideByZero() {

        calculator.divide(5, 0);
    }
}
