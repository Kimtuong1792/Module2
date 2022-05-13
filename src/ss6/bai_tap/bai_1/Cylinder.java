package ss6.bai_tap.bai_1;

public class Cylinder extends Circle {
    private double height;


    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public Cylinder() {

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    //thể tích hình trụ
    public double getVolume() {
        return getCircleArea() * height;
    }

    // diện tích xung quanh
    public double getSurroundingArea() {
        return getPerimeter() * height;
    }

    // diện tích toàn phần = diện tích xung quanh + diện tích đáy
    public double getTotalArea() {
        return getSurroundingArea() + getCircleArea();
    }

    @Override
    public String toString() {
        return "+ Lớp con Cylinder : " + '\n' +
                "+ height= " + height + '\n' +
                "+ thể tích = " + getVolume() + '\n' +
                "+ diện tích xung quanh = " + getSurroundingArea() + '\n' +
                "+ diện tích toàn phần = " + getTotalArea() + '\n' +
                "and which is a subclass of "
                + super.toString();

    }
}

