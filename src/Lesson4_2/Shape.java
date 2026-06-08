package Lesson4_2;

public interface Shape {
    double getArea();
    double getPerimeter();
    String getFillColour();
    String getBorderColour();

    default void printInfo() {
        System.out.println("Площадь: " + getArea());
        System.out.println("Периметр: " + getPerimeter());
        System.out.println("Цвет заливки: " + getFillColour());
        System.out.println("Цвет границы: " + getBorderColour());
    }
}
