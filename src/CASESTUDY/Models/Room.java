package CASESTUDY.Models;

public class Room extends Facility {
    private String freeService;

    public Room() {
    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String id, String nameService,
                double area,
                double rentalCosts,
                int maximumNumberOfPeople,
                String rentalType,
                String freeService) {
        super(id,nameService, area, rentalCosts, maximumNumberOfPeople, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return super.toString() +
                "freeService='" + freeService + '\'' +
                '}';
    }
}
