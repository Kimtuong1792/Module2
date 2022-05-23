package Bai_tap_them.bai_3.Model;

public class Worker extends Staff  {
    private int workdays;

    public Worker() {
    }

    public Worker(int workdays) {
        this.workdays = workdays;
    }

    public Worker(String name, int born, String address, int workdays) {
        super(name, born, address);
        this.workdays = workdays;
    }

    public int getWorkdays() {
        return workdays;
    }

    public void setWorkdays(int workdays) {
        this.workdays = workdays;
    }


    @Override
    public String toString() {
        return "Worker{" +
                super.toString() +
                "workdays=" + workdays +
                '}';
    }


    @Override
    public double employmentSalary() {
        return  workdays * 120;

    }
}
