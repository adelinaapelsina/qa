package Lesson7;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ComparingTest {

    private final Comparing comparator = new Comparing();

    @Test
    public void firstNumberIsGreater() {

        String result = comparator.compare(10, 5);

        Assert.assertEquals(result, "Первое число больше");
    }

    @Test
    public void secondNumberIsGreater() {

        String result = comparator.compare(5,10);

        Assert.assertEquals(result, "Второе число больше");
    }

    @Test
    public void numberAreEqual() {

        String result = comparator.compare(10,10);

        Assert.assertEquals(result,"Числа равны");
    }
}
