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




}



