package BAI_TAP_LAM_THEM.BAI_4.Model;

import java.time.LocalDate;

public abstract class Person1 {
    private int id;
    private String name;
    private String gender;
    private LocalDate birthday;
    private String address;

    public Person1() {
    }

    public Person1(int id, String name, String gender, LocalDate birthday, String address) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.address = address;
    }

    public Person1(int id, String name, LocalDate birthday, String address) {
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        return "" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender " + gender + '\''+
                ", birthday=" + birthday +
                ", address='" + address + '\'' ;
    }
}
