package ss4.bai_tap;

import java.util.Scanner;

public class QuadraticEquation {

    public static class Quadratic {
        private double a;
        private double b;
        private double c;

        public Quadratic() {}

        public Quadratic(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public double getA() {
            return a;
        }

        public void setA(double a) {
            this.a = a;
        }

        public double getB() {
            return b;
        }

        public void setB(double b) {
            this.b = b;
        }

        public double getC() {
            return c;
        }

        public void setC(double c) {
            this.c = c;
        }

        public double getDiscriminant() {
            return ((this.b * this.b) - (4 * this.a * this.c));

        }

        public double getRoot1() {
            return ((-this.b) + Math.sqrt(getDiscriminant())) / 2 * this.a;
        }

        public double getRoot2() {
            return ((-this.b) - Math.sqrt(getDiscriminant())) / 2 * this.a;
        }

        public String Display() {
            return "QuadraticEquation{" + "number a=" + getA() + ", number b=" + getB() + ", number c= " + getC() + "}";
        }
    }



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input number a ");
        double a = input.nextDouble();
        System.out.println("input number b ");
        double b = input.nextDouble();
        System.out.println("input number c");
        double c = input.nextDouble();

        Quadratic quadratic = new Quadratic(a, b, c);
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



