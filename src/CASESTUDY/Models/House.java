package CASESTUDY.Models;

public abstract class House extends Facility  {
    private String standard;
    private int floor;

    public House() {
    }

    @Override
    public String getToString() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s"
                ,super.getId()
                , super.getNameService()
                ,super.getArea()
                ,super.getRentalCosts()
                ,super.getMaximumNumberOfPeople()
                ,super.getRentalType()
                ,this.getStandard()
                ,this.getFloor());
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
