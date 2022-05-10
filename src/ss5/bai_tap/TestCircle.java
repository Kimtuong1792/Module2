package ss5.bai_tap;

import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input radius ");
        double R = input.nextDouble();
        Circle circle = new Circle(R);
        System.out.println("circle with radius : " + R + '\n'+"area is : "+ circle.getArea() );
    }
}
