package ss5.thuc_hanh;

public class StaticMethod {
    public static class Student{
        private int rollno;
        private String name;
        private static String college = "BBDIT";


    public Student(int r, String n) {
        rollno = r;
        name = n;
    }
        static void change() {
            college = "CODEGYM";
        }
        void display() {
            System.out.println(rollno + " " + name + " " + college);
    }
}}
