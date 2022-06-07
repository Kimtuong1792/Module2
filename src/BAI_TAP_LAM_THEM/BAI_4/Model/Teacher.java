package BAI_TAP_LAM_THEM.BAI_4.Model;

import java.time.LocalDate;

public class Teacher extends Person1 {
    private String teachingClass;
    private Double salaryOneHour;
    private Double time;

    public Teacher() {
    }

    public Teacher(String teachingClass, Double salaryOneHour, Double time) {
        this.teachingClass = teachingClass;
        this.salaryOneHour = salaryOneHour;
        this.time = time;
    }


    public Teacher(int id,
                   String name,
                   String gender,
                   LocalDate birthday,
                   String address,
                   String teachingClass,
                   Double salaryOneHour,
                   Double time) {
        super(id, name,gender, birthday, address);
        this.teachingClass = teachingClass;
        this.salaryOneHour = salaryOneHour;
        this.time = time;
    }

    public String getTeachingClass() {
        return teachingClass;
    }

    public void setTeachingClass(String teachingClass) {
        this.teachingClass = teachingClass;
    }

    public Double getSalaryOneHour() {
        return salaryOneHour;
    }

    public void setSalaryOneHour(Double salaryOneHour) {
        this.salaryOneHour = salaryOneHour;
    }

    public Double getTime() {
        return time;
    }

    public void setTime(Double time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Teacher{" + super.toString()+
                "class " + teachingClass +
                "salaryOneHour=" + salaryOneHour +
                ", time=" + time +
                '}';
    }

    @Override
    public String getInFor() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s"
                , super.getId()
                , super.getName()
                , super.getGender()
                , super.getBirthday()
                , super.getAddress()
                , this.getTeachingClass()
                , this.getSalaryOneHour()
                , this.getTime());
    }
}
