package ss4.bai_tap;

import java.util.Scanner;

public class TestQuadraticEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input number a ");
        double a = input.nextDouble();
        System.out.println("input number b ");
        double b = input.nextDouble();
        System.out.println("input number c");
        double c = input.nextDouble();

        QuadraticEquation.Quadratic quadratic = new QuadraticEquation.Quadratic(a, b, c);
        System.out.println(quadratic.Display());

        if (quadratic.getDiscriminant() > 0) {
            System.out.println("the equation has 2 solutions" +quadratic.getRoot1() + " and " + quadratic.getRoot2());
        } else if (quadratic.getDiscriminant() == 0) {
            System.out.println("the equation has 2 solutions" + (-(quadratic.getB() / 2 * quadratic.getA())));
        } else {
            System.out.println("The equation has no roots");
        }
    }
}
