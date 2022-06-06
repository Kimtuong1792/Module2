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

    public int getNumberProduct() {
        return numberProduct;
    }

    public void setNumberProduct(int numberProduct) {
        this.numberProduct = numberProduct;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return super.toString() +
                "numberProduct=" + numberProduct +
                ", price=" + price +
                '}';
    }

    @Override
    public String getInFor() {
        return String.format("%s,%s,%s,%s,%s,%s,%s"
                , super.getId()
                , super.getEmployeeCode()
                , super.getName()
                , super.getBirthday()
                , super.getAddress()
                , this.getNumberProduct()
                , this.getPrice()
                );
    }
}
