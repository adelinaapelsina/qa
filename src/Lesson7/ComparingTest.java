package Lesson7;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ComparingTest {

    private final Comparing comparator = new Comparing();

    @Test
    void firstNumberIsGreater() {

        String result = comparator.compare(10, 5);

        assertEquals("Первое число больше", result);
    }

    @Test
    void secondNumberIsGreater() {

        String result = comparator.compare(5,10);

        assertEquals("Второе число больше", result);
    }

    @Test
    void numberAreEqual() {

        String result = comparator.compare(10,10);

        assertEquals("Числа равны", result);
    }
}
