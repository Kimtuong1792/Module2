package BAI_TAP_LAM_THEM.BAI_2.Model;

import java.time.LocalDate;

public class GenuinePhone extends Phone {
    private int insuranceTime;
    private String rangeInsurance;

    public GenuinePhone() {
    }

    public GenuinePhone(int insuranceTime, String rangeInsurance) {
        this.insuranceTime = insuranceTime;
        this.rangeInsurance = rangeInsurance;
    }

    public GenuinePhone(int ID,
                        String name,
                        Double price,
                        int number,
                        String product,
                        int insuranceTime,
                        String rangeInsurance) {
        super(ID, name, price, number, product);
        this.insuranceTime = insuranceTime;
        this.rangeInsurance = rangeInsurance;
    }

    public int getInsuranceTime() {
        return insuranceTime;
    }

    public void setInsuranceTime(int insuranceTime) {
        this.insuranceTime = insuranceTime;
    }

    public String getRangeInsurance() {
        return rangeInsurance;
    }

    public void setRangeInsurance(String rangeInsurance) {
        this.rangeInsurance = rangeInsurance;
    }

    @Override
    public String getInfor() {
        return String.format("%s,%s,%s,%s,%s,%s,%s"
        , super.getID()
        , super.getName()
        , super.getPrice()
        , super.getNumber()
        , super.getProduct()
        , this.getInsuranceTime()
        , this.getRangeInsurance());
    }
}
