package CASESTUDY.Services.IMPL;

import CASESTUDY.Models.Facility;
import CASESTUDY.Models.Villa;
import CASESTUDY.Services.FacilityService;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
    private static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    private static Scanner scanner = new Scanner(System.in);


    @Override
    public void display() {

    }

    //    public Villa(String nameService,
//                 double area,
//                 double rentalCosts,
//                 int maximumNumberOfPeople,
//                 String rentalType,
//                 double poolArea,
//                 String standardVilla,
//                 int floor) {
//        super(nameService, area, rentalCosts, maximumNumberOfPeople, rentalType);
//        this.poolArea = poolArea;
//        this.standardVilla = standardVilla;
//        this.floor = floor;
//    }
    @Override
    public void addNewVilla() {
        System.out.println("nhâp dịch vụ");
        String nameService = scanner.nextLine();

        System.out.println("diện tích sử dụng");
        double area = Double.parseDouble(scanner.nextLine());

        System.out.println("nhập chi phí thuê");
        double rentalCosts = Double.parseDouble(scanner.nextLine());

        System.out.println("nhập số lượng người tối đa");
        int maximumNumberOfPeople = Integer.parseInt(scanner.nextLine());

        System.out.println("nhập kiểu thuê");
        String rentalType = scanner.nextLine();

        System.out.println("nhập tiêu chuẩn phòng");
        String standardVilla = scanner.nextLine();

        System.out.println("nhâp diện tích hồ bơi");
        double poolArea = Double.parseDouble(scanner.nextLine());


        System.out.println("nhâp số tầng");
        int numberFloor = Integer.parseInt(scanner.nextLine());
        Villa villa = new Villa(nameService, area, rentalCosts, maximumNumberOfPeople, rentalType, poolArea, standardVilla, numberFloor);
        facilityIntegerMap.put(villa, 0);
        System.out.println("đã thêm mới thành công");
    }

    @Override
    public void addNewHouse() {

    }

    @Override
    public void addNewRoom() {

    }
}
