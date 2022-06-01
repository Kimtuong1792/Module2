package CASESTUDY.Services.IMPL;

import CASESTUDY.Models.Facility;
import CASESTUDY.Models.House;
import CASESTUDY.Models.Room;
import CASESTUDY.Models.Villa;
import CASESTUDY.Services.FacilityService;
import CASESTUDY.until.RegexData;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
    public static final String REGEX_STR = "[A-Z][a-z]+";
    public static final String REGEX_ID_VILLA = "(SVVL)[-][\\d]{4}";
    public static final String REGEX_ID_HOUSE = "(SVHO)[-][\\d]{4}";
    public static final String REGEX_ID_ROOM = "(SVRO)[-][\\d]{4}";
    public static final String REGEX_AMOUNT = "^[1-9]|([1][0-9])|(20)$";
    public static final String REGEX_INT = "^[0-9]+$";
    public static final String REGEX_AREA = "^([3-9]\\d|[1-9]\\d{2,})$";

    private static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    private static Scanner scanner = new Scanner(System.in);


    @Override
    public void display() {
        for (Map.Entry<Facility, Integer> element : facilityIntegerMap.entrySet()) {
            System.out.println("service =" + element.getKey() + " số lầ thuê = " + element.getValue());
        }

    }

    @Override
    public void addNewVilla() {
        String id = inputIDVilla();

        String nameService = name();

        double area = Double.parseDouble(inputArea());

        double rentalCosts = Double.parseDouble(inputRentalCosts());

        int maximumNumberOfPeople = Integer.parseInt(inputMax());


        String rentalType = rentalType();

        String standardVilla = standard();

        double poolArea = Double.parseDouble(inputArea());

        int numberFloor = Integer.parseInt(inputRentalCosts());
        Villa villa = new Villa(id, nameService, area, rentalCosts, maximumNumberOfPeople, rentalType, poolArea, standardVilla, numberFloor);
        facilityIntegerMap.put(villa, 0);
        System.out.println("đã thêm mới thành công");
    }

    private String inputIDVilla()  {
        System.out.println("nhập mã dịch vụ");

        return RegexData.idVilla(REGEX_ID_VILLA);
    }

    private String inputIDRoom() {
        System.out.println("nhập mã dịch vụ");
        return RegexData.idRoom(REGEX_ID_ROOM);
    }

    private String inputIDHouse() {
        System.out.println("nhập mã dịch vụ");
        return RegexData.idHouse(REGEX_ID_HOUSE);
    }

    private String name() {
        System.out.println(" nhập tên dịch vụ");
        return RegexData.stringException(REGEX_STR);
    }

    private String inputArea() {
        System.out.println("nhập diện tích hppf bơi");
        return RegexData.areaExecption(REGEX_AREA);
    }

    private String inputRentalCosts() {
        System.out.println("nhập chi phí thuê");
        return RegexData.intException(REGEX_INT);
    }

    private String inputMax() {
        System.out.println("nhập số lượng người tối đa");
        return RegexData.amountException(REGEX_AMOUNT);

    }
    private String rentalType(){
        System.out.println("nhập kiểu thuê");
        return RegexData.stringException(REGEX_STR);
    }
    private String standard(){
        System.out.println("nhập tiêu chuẩn phòng");
        return RegexData.stringException(REGEX_STR);
    }
    private String freeService(){
        System.out.println("nhập dịch vụ kèm theo");
        return RegexData.stringException(REGEX_STR);
    }

    @Override

    public void addNewHouse() {
        String id = inputIDHouse();

        String nameService = name();

        double area = Double.parseDouble(inputArea());

        double rentalCosts = Double.parseDouble(inputRentalCosts());

        int maximumNumberOfPeople = Integer.parseInt(inputMax());

        String rentalType = rentalType();

        String standardHouse = standard();

        int floor = Integer.parseInt(inputRentalCosts());
        House house = new House(id, nameService, area, rentalCosts, maximumNumberOfPeople, rentalType, standardHouse, floor);
        facilityIntegerMap.put(house, 0);
        System.out.println("đã thêm mới thành công");

    }

    @Override
    public void addNewRoom() {
        String id = inputIDRoom();

        String nameService = name();

        double area = Double.parseDouble(inputArea());

        double rentalCosts = Double.parseDouble(inputRentalCosts());

        int maximumNumberOfPeople = Integer.parseInt(inputMax());

        String rentalType = rentalType();

        String freeService = freeService();
        Room room = new Room(id, nameService, area, rentalCosts, maximumNumberOfPeople, rentalType, freeService);
        facilityIntegerMap.put(room, 0);
        System.out.println("đã thêm mới thành công");

    }
}
