package BAI_TAP_LAM_THEM.BAI_4.Model;

import java.time.LocalDate;

public class Student extends Person1 {
    private int studentCode;
    private double mediumScore;

    public Student() {
    }

    public Student(int studentCode, double mediumScore) {
        this.studentCode = studentCode;
        this.mediumScore = mediumScore;
    }

    public Student(int id, String name,String gender, LocalDate birthday, String address, int studentCode, double mediumScore) {
        super(id, name,gender, birthday, address);
        this.studentCode = studentCode;
        this.mediumScore = mediumScore;
    }

    public int getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(int studentCode) {
        this.studentCode = studentCode;
    }

    public double getMediumScore() {
        return mediumScore;
    }

    public void setMediumScore(double mediumScore) {
        this.mediumScore = mediumScore;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString()+
                "studentCode='" + studentCode + '\'' +
                ", mediumScore=" + mediumScore +
                '}';
    }

    @Override
    public String getInFor() {
        return String.format("%s,%s,%s,%s,%s,%s,%s"
                , super.getId()
                , super.getName()
                , super.getGender()
                , super.getBirthday()
                , super.getAddress()
                , this.getStudentCode()
                , this.getMediumScore());
    }
}
