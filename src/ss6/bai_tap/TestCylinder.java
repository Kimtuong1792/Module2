package ss6.bai_tap;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        cylinder = new Cylinder(5);
        System.out.println(cylinder);
        cylinder = new Cylinder(3,4,"blue");
        System.out.println(cylinder);
    }
}
