package Lesson4_2;

public class Main {
    public static void main(String[] args) {
        Circle circle =
                new Circle(5, "Чёрный ", "Зелёный ");
        Rectangle rectangle =
                new Rectangle(4, 6, "Серый ", "Оранжевый ");
        Triangle triangle =
                new Triangle(3,4,5, "Белый ", "Персиковый ");

        System.out.println("Круг");
        circle.printInfo();

        System.out.println("Прямоугольник");
        rectangle.printInfo();

        System.out.println("Треугольник");
        triangle.printInfo();
    }
}
