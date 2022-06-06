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
    public String getInFor() {
        return null;
    }
}
