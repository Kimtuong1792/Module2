package thi_thu.model;

public class CustomerInternational extends Person {
    private String country;

    public CustomerInternational() {
    }

    @Override
    public String getToString() {
        return String.format("%s,%s,%s"
        ,super.getIdCode()
        ,super.getName()
        ,this.country);
    }

    public CustomerInternational(String country) {
        this.country = country;
    }

    public CustomerInternational(String idCode, String name, String country) {
        super(idCode, name);
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return super.toString()+
                "country='" + country + '\'' +
                '}';
    }
}
