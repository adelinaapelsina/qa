package Lesson7;

public class Triangle {

    public double calculateArea(double base, double height){

        if(base <= 0 || height <= 0) {
            throw new IllegalArgumentException("Основание и высота должны быть больше нуля");
        }

        return (base * height) / 2;
    }
}
