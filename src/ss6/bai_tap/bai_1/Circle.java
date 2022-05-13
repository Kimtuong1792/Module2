package ss6.bai_tap.bai_1;

public class Circle {
    private double radius = 1.0;
    private String color = "red";


    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCircleArea() {
        return Math.pow(radius, 2) * 3.14;
    }

    public double getPerimeter() {
        return 2 * radius * 3.14;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' + ", area = " + getCircleArea() + " and perimeter = " + getPerimeter() +
                '}';
    }
}
