package BAI_TAP_LAM_THEM.BAI_3.Model;

import java.time.LocalDate;

public abstract class Person {
    private int id;
    private String employeeCode;
    private String name;
    private LocalDate birthday;
    private String address;

    public Person() {
    }

    public Person(int id, String employeeCode, String name, LocalDate birthday, String address) {
        this.id = id;
        this.employeeCode = employeeCode;
        this.name = name;
        this.birthday = birthday;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
   public abstract String getInFor();

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", employeeCode='" + employeeCode + '\'' +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", address='" + address + '\'' +
                '}';
    }
}
