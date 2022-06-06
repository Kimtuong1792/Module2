package BAI_TAP_LAM_THEM.BAI_3.Model;

import java.time.LocalDate;

public class ProductionStaff extends Person {
    private int numberProduct;
    private Double price;

    public ProductionStaff() {
    }

    public ProductionStaff(int numberProduct, Double price) {
        this.numberProduct = numberProduct;
        this.price = price;
    }

    public ProductionStaff(int id, String employeeCode, String name, LocalDate birthday, String address, int numberProduct, Double price) {
        super(id, employeeCode, name, birthday, address);
        this.numberProduct = numberProduct;
        this.price = price;
    }

    @Override
    public String getInFor() {
        return null;
    }
}
