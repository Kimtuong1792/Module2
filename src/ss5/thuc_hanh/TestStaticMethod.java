package ss5.thuc_hanh;

public class TestStaticMethod {
    public static void main(String[] args) {
        StaticMethod.Student.change();
        StaticMethod.Student s1 = new  StaticMethod.Student(111, "Hoang");
        StaticMethod.Student s2 = new  StaticMethod.Student(222, "Nam");
        StaticMethod.Student s3 = new  StaticMethod.Student(333, "Khanh");
        s1.display();
        s2.display();
        s3.display();
    }
}
