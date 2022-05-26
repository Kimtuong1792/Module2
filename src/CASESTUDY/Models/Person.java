package CASESTUDY.Models;

public abstract class Person {
    private String name;
    private String born;
    private boolean gender;
    private long identity;
    private long numberPhone;
    private String email;

    public Person() {
    }

    public Person(String name, String born, boolean gender,
                  long identity, long numberPhone, String email) {
        this.name = name;
        this.born = born;
        this.gender = gender;
        this.identity = identity;
        this.numberPhone = numberPhone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBorn() {
        return born;
    }

    public void setBorn(String born) {
        this.born = born;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public long getIdentity() {
        return identity;
    }

    public void setIdentity(long identity) {
        this.identity = identity;
    }

    public long getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(long numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", born='" + born + '\'' +
                ", gender=" + gender +
                ", identity=" + identity +
                ", numberPhone=" + numberPhone +
                ", email='" + email + '\'' +
                '}';
    }
}
