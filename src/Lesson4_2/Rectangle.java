package Lesson4_2;

public class Rectangle implements Shape {
    private double width;
    private double height;
    private String fillColour;
    private String borderColour;

    public Rectangle(double width,
                     double height,
                     String fillColour,
                     String borderColour) {

        this.width = width;
        this.height = height;
        this.fillColour = fillColour;
        this.borderColour = borderColour;
    }
    @Override
    public double getArea() {
        return width * height;
    }
    @Override
    public double getPerimeter(){
        return 2 * (width + height);
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
