package CASESTUDY.Models;

public class House extends Facility  {
    private String standard;
    private int floor;

    public House() {
    }

    public House(String standard, int floor) {
        this.standard = standard;
        this.floor = floor;
    }

    public House(String id, String nameService,
                 double area,
                 double rentalCosts,
                 int maximumNumberOfPeople,
                 String rentalType,
                 String standard,
                 int floor) {
        super(id,nameService,
                area,
                rentalCosts,
                maximumNumberOfPeople,
                rentalType);
        this.standard = standard;
        this.floor = floor;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
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
                "standard='" + standard + '\'' +
                ", floor=" + floor +
                '}';
    }
}
