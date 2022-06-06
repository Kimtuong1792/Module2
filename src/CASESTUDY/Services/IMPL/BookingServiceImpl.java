package CASESTUDY.Services.IMPL;

import CASESTUDY.Models.Booking;
import CASESTUDY.Models.Customer;
import CASESTUDY.Models.Facility;
import CASESTUDY.Models.Villa;
import CASESTUDY.Services.BookingService;
import CASESTUDY.until.BookingComparator;

import java.util.*;

public class BookingServiceImpl implements BookingService {
    Scanner scanner = new Scanner(System.in);
    static  Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());
    static List<Customer> customerList = new ArrayList<>();
    static Map<Facility,Integer> facilityIntegerMap = new LinkedHashMap<>();
    static {
        customerList.add(new Customer(1, "Huyền", "18", true, 12345, 678, "huyen@", "vip", "dn"));
        customerList.add(new Customer(2, "An", "10", false,12905, 67882, "an@", "vip", "qn"));
//        facilityIntegerMap.put(new Villa("1", "Vila1", 123, 45000, 2, "Day", 30, "vip", 2), 0);
//        facilityIntegerMap.put(new Villa("2", "Vila2", 453, 78000, 9, "Day", 30, "vip", 9), 0);
    }
    public Set<Booking> sendBooking(){
        return bookingSet;
    }
    @Override
    public void display() {
        for (Booking booking : bookingSet) {
            System.out.println(booking.toString());
        }
    }

    @Override
    public void addNew() {
        String id = "1";
        if (!bookingSet.isEmpty()) {
            id = String.valueOf(bookingSet.size());
        }
        Customer customer = chooseCustomer();
        Customer facility = chooseFacility();
        System.out.println("Nhập ngày bắt đầu thuê : ");
        String startDate = scanner.nextLine();
        System.out.println("Nhập ngày trả phòng : ");
        String endDate = scanner.nextLine();
        System.out.println("nhập IDCode");
        String IDCode = scanner.nextLine();
        Booking booking = new Booking(id, startDate, endDate,IDCode, customer, facility);
        bookingSet.add(booking);
        System.out.println("Đã booking thành công ");
    }

    private Customer chooseFacility() {
        System.out.println("Danh sách khách hàng: ");
        for (Customer customer : customerList) {
            System.out.println(customer.toString());
        }
        System.out.println("Nhập id khách hàng: ");
        boolean check = true;
       int id = Integer.parseInt(scanner.nextLine());
        while (true) {
            for (Customer customer : customerList) {
                if (customer.getId()==id) {
                    check = false;
                    return customer;
                }
            }
            if (check) {
                System.out.println("Bạn nhập sai, vui lòng nhập lại id khách hàng: ");
                id = Integer.parseInt(scanner.nextLine());
            }
        }
    }

    private Customer chooseCustomer() {
        System.out.println("Danh sách dịch vụ: ");
        for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()) {
            System.out.println(entry.getKey().toString());
        }
        System.out.println("Nhập id dịch vụ: ");
        boolean check = true;
        String id = scanner.nextLine();
        while (check) {
            for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()) {
                if (id.equals(entry.getKey().getIdFacility())) {
                    check = false;
                    return chooseCustomer();
                }
            }
            if (check) {
                System.out.println("Bạn nhập sai, vui lòng nhập lại id dịch vụ: ");
                id = scanner.nextLine();
            }
        }
        return null;
    }


    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }
}
