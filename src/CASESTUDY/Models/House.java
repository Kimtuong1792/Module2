package CASESTUDY.Models;

public class House extends Facility  {
    public House() {
    }

    public House(String nameService, double area, double rentalCosts, int maximumNumberOfPeople, String rentalType) {
        super(nameService, area, rentalCosts, maximumNumberOfPeople, rentalType);
    }
    @Override
    public String toString() {
        return "House " +
                super.toString();}

}
