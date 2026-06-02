package Lesson4_2;

public class Triangle implements Shape {
    private double a;
    private double b;
    private double c;

    private String fillColour;
    private String borderColour;

    public Triangle (double a,
                     double b,
                     double c,
                     String fillColour,
                     String borderColour) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.fillColour = fillColour;
        this. borderColour = borderColour;
    }
    @Override
    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(
                p * (p - a) * (p-b) * (p - c)
        );
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }
    @Override
    public String getFillColour() {
        return fillColour;
    }
    @Override
    public String getBorderColour() {
        return borderColour;
    }
}
