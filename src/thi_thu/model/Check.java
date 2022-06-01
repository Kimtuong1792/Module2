package thi_thu.model;

public class Check {
    private String idCheck;
    private String idCode;
    private String date;
    private Double number;
    private Double price;
    private Double money;

    public Check() {
    }

    public Check(String idCheck, String idCode, String date, Double number, Double price, Double money) {
        this.idCheck = idCheck;
        this.idCode = idCode;
        this.date = date;
        this.number = number;
        this.price = price;
        this.money = money;
    }

    public String getIdCheck() {
        return idCheck;
    }

    public void setIdCheck(String idCheck) {
        this.idCheck = idCheck;
    }

    public String getIdCode() {
        return idCode;
    }

    public void setIdCode(String idCode) {
        this.idCode = idCode;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Double getNumber() {
        return number;
    }

    public void setNumber(Double number) {
        this.number = number;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Check{" +
                "idCheck='" + idCheck + '\'' +
                ", idCode='" + idCode + '\'' +
                ", date='" + date + '\'' +
                ", number=" + number +
                ", price=" + price +
                ", money=" + money +
                '}';
    }
}
