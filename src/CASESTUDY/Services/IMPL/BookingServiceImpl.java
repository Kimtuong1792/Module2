package CASESTUDY.Services.IMPL;

import CASESTUDY.Models.Booking;
import CASESTUDY.Models.Customer;
import CASESTUDY.Models.Facility;
import CASESTUDY.Services.BookingService;
import CASESTUDY.until.BookingComparator;

import java.util.*;

public class BookingServiceImpl implements BookingService {
    static  Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());
    static List<Customer> customerList = new ArrayList<>();
    static Map<Facility,Integer> facilityIntegerMap = new LinkedHashMap<>();
    static {
        
    }
    @Override
    public void display() {

    }

    @Override
    public void addNew() {

    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }
}
