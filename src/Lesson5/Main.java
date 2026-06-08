package Lesson5;

public class Main {
    public static void main(String[] args) {
        String[][] array = {
                {"1","2","3","4"},
                {"5","6", "7", "8"},
                {"9", "8", "11", "12"},
                {"13", "14", "15", "16"}
        };
        try {
            int result = ArrayUtil.sumArray(array);
            System.out.println("Сумма = " + result);
        }
        catch (MyArraySizeException e) {
            System.out.println("Неправильный размер массива");
            System.out.println(e.getMessage());
        }
        catch(MyArrayDataException e) {
            System.out.println("Неправильные данные");
            System.out.println(e.getMessage());
        }
    }
}
