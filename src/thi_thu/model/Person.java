package thi_thu.model;

public abstract class Person {
    private String idCode;
    private String name;

    public Person() {
    }

    public Person(String IDCode, String name) {
        this.idCode = IDCode;
        this.name = name;
    }

    public String getIdCode() {
        return idCode;
    }

    public void setIdCode(String idCode) {
        this.idCode = idCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    abstract String getToString();

    @Override
    public String toString() {
        return "Person{" +
                "IDCode='" + idCode + '\'' +
                ", Name='" + name + '\'' +
                '}';
    }
}
