package BAI_TAP_LAM_THEM.BAI_3.Model;

import java.time.LocalDate;

public class ManagementStaff extends Person {
    private Double basicSalary;
    private Double coefficients;

    public ManagementStaff() {
    }

    public ManagementStaff(Double basicSalary, Double coefficients) {
        this.basicSalary = basicSalary;
        this.coefficients = coefficients;
    }

    public ManagementStaff(int id,
                           String employeeCode,
                           String name,
                           LocalDate birthday,
                           String address,
                           Double basicSalary,
                           Double coefficients) {
        super(id, employeeCode, name, birthday, address);
        this.basicSalary = basicSalary;
        this.coefficients = coefficients;
    }

    public Double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(Double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public Double getCoefficients() {
        return coefficients;
    }

    public void setCoefficients(Double coefficients) {
        this.coefficients = coefficients;
    }

    @Override
    public String toString() {
        return super.toString() +
                "basicSalary=" + basicSalary +
                ", coefficients=" + coefficients +
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
                , this.getBasicSalary()
                , this.getCoefficients()
        );
    }
}
