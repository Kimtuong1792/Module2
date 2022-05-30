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

    public Customer(int id,
                    String name,
                    String born,
                    boolean gender,
                    long identity,
                    long numberPhone,
                    String email,
                    String typeOfGuest,
                    String address) {
        super(id,name, born, gender, identity, numberPhone, email);

        this.typeOfGuest = typeOfGuest;
        this.address = address;
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
        return super.toString() +
                "idCode=" + idCode +
                ", typeOfGuest='" + typeOfGuest + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
