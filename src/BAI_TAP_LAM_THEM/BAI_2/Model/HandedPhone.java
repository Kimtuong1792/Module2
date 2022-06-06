package BAI_TAP_LAM_THEM.BAI_2.Model;

public class HandedPhone extends Phone{
    private String country;
    private String status;

    public HandedPhone() {
    }

    public HandedPhone(String country, String status) {
        this.country = country;
        this.status = status;
    }

    public HandedPhone(int ID,
                       String name,
                       Double price,
                       int number,
                       String product,
                       String country,
                       String status) {
        super(ID, name, price, number, product);
        this.country = country;
        this.status = status;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    @Override
    public String getInfor() {
        return String.format("%s,%s,%s,%s,%s,%s,%s"
                , super.getID()
                , super.getName()
                , super.getPrice()
                , super.getNumber()
                , super.getProduct()
                , this.getCountry()
                , this.getStatus());
    }
}
