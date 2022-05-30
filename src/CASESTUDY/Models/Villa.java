package CASESTUDY.Models;

public class Villa extends Facility {
    private double poolArea;
    private String standardVilla;
    private int floor;

    public Villa() {
    }

    public Villa(double poolArea, String standardVilla, int floor) {
        this.poolArea = poolArea;
        this.standardVilla = standardVilla;
        this.floor = floor;
    }

    public Villa(String nameService,
                 double area,
                 double rentalCosts,
                 int maximumNumberOfPeople,
                 String rentalType,
                 double poolArea,
                 String standardVilla,
                 int floor) {
        super(nameService, area, rentalCosts, maximumNumberOfPeople, rentalType);
        this.poolArea = poolArea;
        this.standardVilla = standardVilla;
        this.floor = floor;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public String getStandardVilla() {
        return standardVilla;
    }

    public void setStandardVilla(String standardVilla) {
        this.standardVilla = standardVilla;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return super.toString() +
                "poolArea=" + poolArea +
                ", standardVilla='" + standardVilla + '\'' +
                ", floor=" + floor +
                '}';
    }
}
