package Bai_tap_them.bai_3.Model;

import Bai_tap_them.bai_3.service.Timekeeping;

public class ProductionStaff extends Staff implements Timekeeping {
    private int productNumber;

    public ProductionStaff() {
    }

    public ProductionStaff(int productNumber) {

        this.productNumber = productNumber;
    }

    public ProductionStaff(String name, int born, String address, int productNumber) {
        super(name, born, address);
        this.productNumber = productNumber;
    }

    public int getProductNumber() {

        return productNumber;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }

    @Override
    public String toString() {
        return "ProductionStaff{" +
                super.toString() +
                "productNumber=" + productNumber +
                '}';
    }

    @Override
    public double employmentSalary() {
       return productNumber * 50;
    }

    @Override
    public void timekeeping() {

    }
}
