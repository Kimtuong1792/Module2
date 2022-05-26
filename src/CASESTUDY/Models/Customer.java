package CASESTUDY.Models;

public class Customer extends Person{
    private double idCode;
    private String typeOfGuest;
    private String address;

    public Customer() {
    }

    public Customer(double idCode, String typeOfGuest, String address) {
        this.idCode = idCode;
        this.typeOfGuest = typeOfGuest;
        this.address = address;
    }

    public Customer(String name, String born, boolean gender, long identity, long numberPhone, String email, double idCode, String typeOfGuest, String address) {
        super(name, born, gender, identity, numberPhone, email);
        this.idCode = idCode;
        this.typeOfGuest = typeOfGuest;
        this.address = address;
    }

    public double getIdCode() {
        return idCode;
    }

    public void setIdCode(double idCode) {
        this.idCode = idCode;
    }

    public String getTypeOfGuest() {
        return typeOfGuest;
    }

    public void setTypeOfGuest(String typeOfGuest) {
        this.typeOfGuest = typeOfGuest;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "idCode=" + idCode +
                ", typeOfGuest='" + typeOfGuest + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
