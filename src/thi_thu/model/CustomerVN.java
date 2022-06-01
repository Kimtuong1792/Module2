package thi_thu.model;

public class CustomerVN extends Person {
private String typeCustomer;
private Double consumption;

    public CustomerVN() {
    }

    @Override
    public String getToString() {
        return String.format("%s,%s,%s,%s"
        ,super.getIdCode()
        , super.getName()
        ,this.typeCustomer
        ,this.consumption);
    }

    public CustomerVN(String typeCustomer, Double consumption) {
        this.typeCustomer = typeCustomer;
        this.consumption = consumption;
    }



    public CustomerVN(String idCode,
                      String name,
                      String typeCustomer,
                      Double consumption) {
        super(idCode, name);
        this.typeCustomer = typeCustomer;
        this.consumption = consumption;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public Double getConsumption() {
        return consumption;
    }

    public void setConsumption(Double consumption) {
        this.consumption = consumption;
    }

    @Override
    public String toString() {
        return super.toString() +
                "typeCustomer='" + typeCustomer + '\'' +
                ", consumption=" + consumption +
                '}';
    }
}
