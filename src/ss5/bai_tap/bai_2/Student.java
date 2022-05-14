package ss5.bai_tap.bai_2;

public class Student {
    private String name = "join";
    private String lop = "C02";

    public Student() {
    }

    public Student(String name, String lop) {
        this.name = name;
        this.lop = lop;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }
}
