package CASESTUDY.Models;

public class Booking {
    private String codeBooking;
      private String starDate;
      private String endDate;
      private String IDCode;
      private String nameService;
      private String typeService;

    public Booking() {
    }

    public Booking(String codeBooking, String starDate, String endDate, String IDCode, String nameService, String typeService) {
        this.codeBooking = codeBooking;
        this.starDate = starDate;
        this.endDate = endDate;
        this.IDCode = IDCode;
        this.nameService = nameService;
        this.typeService = typeService;
    }



    public Booking(String id, String startDate, String endDate, String idCode, Customer customer, Customer facility) {
    }

    public String getCodeBooking() {
        return codeBooking;
    }

    public void setCodeBooking(String codeBooking) {
        this.codeBooking = codeBooking;
    }

    public String getStarDate() {
        return starDate;
    }

    public void setStarDate(String starDate) {
        this.starDate = starDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getIDCode() {
        return IDCode;
    }

    public void setIDCode(String IDCode) {
        this.IDCode = IDCode;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public String getTypeService() {
        return typeService;
    }

    public void setTypeService(String typeService) {
        this.typeService = typeService;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "codeBooking='" + codeBooking + '\'' +
                ", starDate='" + starDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", IDCode='" + IDCode + '\'' +
                ", nameService='" + nameService + '\'' +
                ", typeService='" + typeService + '\'' +
                '}';
    }
}
