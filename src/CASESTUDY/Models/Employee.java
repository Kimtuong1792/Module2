package CASESTUDY.Models;

public class Employee extends Person {
    private String level;
    private String location;
    private double salary;

    public Employee() {
    }

    public Employee(String level, String location, double salary) {
        this.level = level;
        this.location = location;
        this.salary = salary;
    }

    public Employee(int id, String name, String born, boolean gender, long identity, long numberPhone, String email, String level, String location, double salary) {
        super(id, name, born, gender, identity, numberPhone, email);
        this.level = level;
        this.location = location;
        this.salary = salary;
    }



    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                super.toString()+
                "level='" + level + '\'' +
                ", location='" + location + '\'' +
                ", salary=" + salary +
                '}';
    }
}
