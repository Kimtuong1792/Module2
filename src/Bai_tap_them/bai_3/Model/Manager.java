package Bai_tap_them.bai_3.Model;

import Bai_tap_them.bai_3.service.Timekeeping;

public class Manager extends Staff implements Timekeeping {
    private double salary;
    private double coefficients;

    public Manager() {
    }

    public Manager(double salary, double coefficients) {
        this.salary = salary;
        this.coefficients = coefficients;
    }

    public Manager(String name, int born, String address, double salary, double coefficients) {
        super(name, born, address);
        this.salary = salary;
        this.coefficients = coefficients;
    }

    public double getSalary() {

        return salary;
    }

    public void setSalary(double salary) {

        this.salary = salary;
    }

    public double getCoefficients() {
        return coefficients;
    }

    public void setCoefficients(double coefficients) {

        this.coefficients = coefficients;
    }


    @Override
    public String toString() {
        return "Manager{" +
                super.toString() +
                "salary=" + salary +
                ", coefficients=" + coefficients +

                '}';
    }

    @Override
    public double employmentSalary() {
        return salary * coefficients;
    }

    @Override
    public void timekeeping() {

    }
}
