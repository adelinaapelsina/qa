package Lesson7;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    private final Triangle calculator =
            new Triangle();

    @Test
    void calculateArea() {

        double result =
                calculator.calculateArea(10, 4);

        assertEquals(20, result);
    }

    @Test
    void negativeValues() {

        assertThrows(
                IllegalArgumentException.class,
                () -> calculator.calculateArea(-10,5));
    }
}
