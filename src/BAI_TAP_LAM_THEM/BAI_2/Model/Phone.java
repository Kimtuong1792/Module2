package BAI_TAP_LAM_THEM.BAI_2.Model;

public abstract class Phone {
    private int ID;
    private String name;
    private Double price;
    private int number;
    private String product;

    public Phone() {
    }

    public Phone(int ID, String name, Double price, int number, String product) {
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.number = number;
        this.product = product;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }
    public abstract String getInfor();

    @Override
    public String toString() {
        return "Phone{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", number=" + number +
                ", product='" + product + '\'' +
                '}';
    }
}
