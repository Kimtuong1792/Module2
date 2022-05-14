package ss7.bai_tap.bai_1.main;

import ss7.bai_tap.bai_1.*;

public class ResizeableTest {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4,7);
Square square = new Square(2.5);

        Shape[] mangHinhHoc = {circle, rectangle , square};

        for (Shape arrHinh : mangHinhHoc) {
            //random
            System.out.println("before resize");
            System.out.println(arrHinh.getArea());
            int random = (int) (Math.random() * 100) + 1;
            ((Resizeable) arrHinh).resize(random);
            System.out.println("After resize");

            System.out.println(arrHinh);
            System.out.println(arrHinh.getArea());

    }
}}
