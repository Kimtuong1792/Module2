package ss12.thuc_hanh;

public class Student implements Comparable<Student> {
    private String name;
    private final int age;
    private final String address;

    public Student(String name, int age, String address) {
        super();
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getAge() {

        return age;
    }

    @Override
    public String toString() {

        return "Student@name=" + name + ",age=" + age + ",address=" + address;
    }

    @Override
    public int compareTo(Student student) {
        return this.getName().compareTo(student.getName());
    }


//    @Override
//    public int compareTo(Student student) {
//        return this.getName().compareTo(student.getName());
//    }
}
