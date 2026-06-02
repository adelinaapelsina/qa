package Lesson5;

public class ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        int[] numbers = {1,2,3};
        try {
            System.out.println(numbers[123]);}

        catch (java.lang.ArrayIndexOutOfBoundsException e) {
            System.out.println("Не тот индекс");
        }
    }
}
