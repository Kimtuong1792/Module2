package CASESTUDY.Models;

public class Villa extends Facility implements Standard {
    private double poolArea;

    public Villa() {
    }

    public Villa(double poolArea) {
        this.poolArea = poolArea;
    }

    public Villa(String nameService, double area, double rentalCosts, int maximumNumberOfPeople, String rentalType, double poolArea) {
        super(nameService, area, rentalCosts, maximumNumberOfPeople, rentalType);
        this.poolArea = poolArea;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    @Override
    public String toString() {
        return "Villa{" +
                super.toString()+
                "poolArea=" + poolArea +
                '}';
    }

    @Override
    public void roomStandard() {

    }

    @Override
    public void numberOfFloors() {

    }
}
