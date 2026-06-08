package Lesson7;

public class Factorial {

    public long factorial(int number) {

        if (number <0) {
            throw new IllegalArgumentException("Число не может быть отрицательным");
        }

        long result = 1;

        for (int i = 1; i <= number; i++) {
            result = result * i;
        }

        return result;
    }
}
