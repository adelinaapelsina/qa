package Lesson7;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TriangleTest {

    private final Triangle calculator =
            new Triangle();

    @Test
    public void calculateArea() {

        double result =
                calculator.calculateArea(10, 4);

        Assert.assertEquals(result, 20);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void negativeValues() {

        calculator.calculateArea(-10,5);
    }
}
