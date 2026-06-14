package Lesson7;

public class Comparing {

    public String compare(int firstNumber, int secondNumber) {

        if(firstNumber > secondNumber) {
            return "Первое число больше второго";
        }

        if(firstNumber < secondNumber) {
            return "Второе число больше первого";
        }

            return "Оба числа равны";
        }
    }
