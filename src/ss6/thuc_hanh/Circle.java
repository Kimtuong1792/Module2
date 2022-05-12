package ss6.thuc_hanh;

public class Circle extends Shape{
    private double radius = 1.0;
    public Circle(){

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color,filled);
        this.radius = radius;
    }

    public double getRadius() {

        return radius;
    }

    public void setRadius(double radius) {

        this.radius = radius;
    }
    public double getArea(){
        return Math.pow(radius,2)*3.14;
    }
    public double getPerimeter(){
        return radius*2*3.14;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }
}
