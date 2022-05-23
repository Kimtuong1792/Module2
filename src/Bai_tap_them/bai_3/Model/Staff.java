package Bai_tap_them.bai_3.Model;

public abstract class Staff implements Comparable<Staff> {
    private String name;

    @Override
    public int compareTo(Staff o) {
        return  this.getName().compareTo(o.getName());
    }

    private int born;
    private String address;

    public Staff() {
    }

    public Staff(String name, int born, String address) {
        this.name = name;
        this.born = born;
        this.address = address;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBorn() {
        return born;
    }

    public void setBorn(int born) {
        this.born = born;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public abstract double employmentSalary();

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                        ", born=" + born +
                        ", address='" + address + '\'' + ", Salary: " + employmentSalary() + ", ";
    }
}
