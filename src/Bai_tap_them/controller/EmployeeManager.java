package Bai_tap_them.controller;

import Bai_tap_them.bai_3.Model.Manager;
import Bai_tap_them.bai_3.Model.ProductionStaff;
import Bai_tap_them.bai_3.Model.Staff;
import Bai_tap_them.bai_3.Model.Worker;
import Bai_tap_them.bai_3.util.ComparatorSalary;
import Bai_tap_them.bai_3.util.SortUpSalary;

import java.util.*;

public class EmployeeManager {
    public static Staff[] staff = new Staff[1000];
    static List<Staff> employmentList = new ArrayList<>();
    static List<Staff> employmentLists = new LinkedList<>();
    static Map<Integer,Staff> list = new TreeMap<>();
    public static Scanner scanner = new Scanner(System.in);

    static {
        staff[0] = new Worker("nguyen van A", 2000, "đà  nẵng", 30);
        staff[1] = new Worker("nguyen van B", 2001, "đà  nẵng", 20);
        staff[2] = new Worker("nguyen van C", 2002, "đà  nẵng", 25);
        staff[3] = new Manager("nguyen van D", 1991, "HCM", 1000, 1.5);
        staff[4] = new Manager("nguyen van E", 1990, "HCM", 1000, 1.5);
        staff[5] = new ProductionStaff("tran van F", 1990, "quang nam", 100);
        staff[6] = new ProductionStaff("tran van G", 1991, "quang nam", 100);
        staff[7] = new ProductionStaff("tran van H", 1992, "quang nam", 100);

        employmentList.add(new Worker("le van Hung", 1995, "quang ngai", 30));
        employmentList.add(new Worker("le van An", 1997, "quang ngai", 20));
        employmentList.add(new Worker("le van Duc", 1999, "quang ngai", 30));
        employmentList.add(new Manager("tran van Loc", 1990, "HN", 70000, 1.3));
        employmentList.add(new ProductionStaff("le van Kha", 2001, "ĐN", 100));

        employmentLists.add(new Worker("dinh van A", 1989, "ĐN", 30));
        employmentLists.add(new Manager("tran van tra", 1999, "hcm", 500, 2.1));
        employmentLists.add(new ProductionStaff("tran van tinh", 1992, "hcm", 200));

        list.put(1,(new Worker("le van Hung", 1995, "quang ngai", 30)));
        list.put(6,( new Worker("le van An", 1997, "quang ngai", 20)));
        list.put(3,( new Worker("le van Duc", 1999, "quang ngai", 30)));
        list.put(2,(new Manager("tran van Loc", 1990, "HN", 70000, 1.3)));
        list.put(5,(new ProductionStaff("le van Kha", 2001, "ĐN", 100)));


    }

    public static void displayList() {
        // for (Staff item : staff) {
        //  if (item != null) {
        //      System.out.println(item);
        //  }

        //}
        for (Staff item : employmentList) {
            if (item != null) {
                System.out.println(item);
            }

        }
    }

    public static void displayStaffOfArray() {
        System.out.println(" 1. print Worker");
        System.out.println(" 2. print Manager");
        System.out.println(" 3. print ProductionStaff");

        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                for (Staff item : staff) {
                    if (item instanceof Worker) {
                        System.out.println(item);
                    }
                }
                break;
            case 2:
                for (Staff item : staff) {
                    if (item instanceof Manager) {
                        System.out.println(item);
                    }
                }
                break;
            case 3:
                for (Staff item : staff) {
                    if (item instanceof ProductionStaff) {
                        System.out.println(item);
                    }
                }
                break;


        }
    }
    public static void displayMap(){
        for (Integer item: list.keySet()) {
            System.out.println("nhân viên: " + item+ " . "+ list.get(item));
        }
    }

    public static void displayStaffOfArrayList() {
        System.out.println(" 1. print Worker");
        System.out.println(" 2. print Manager");
        System.out.println(" 3. print ProductionStaff");
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                for (Staff item : employmentList) {
                    if (item instanceof Worker) {
                        System.out.println(item);
                    }
                }
                break;
            case 2:
                for (Staff item : employmentList) {
                    if (item instanceof Manager) {
                        System.out.println(item);
                    }
                }
                break;
            case 3:
                for (Staff item : employmentList) {
                    if (item instanceof ProductionStaff) {
                        System.out.println(item);
                    }
                }
                break;
        }
    }
public static void sort(){
    System.out.println(" 1. sort up by salary");
    System.out.println(" 2. sout up by name");

        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose){
            case 1:
                System.out.println(" 1. sort up by salary");
                employmentList.sort( new SortUpSalary());
                break;
            case 2:
                System.out.println(" 2. sout up by name");
                Collections.sort(employmentList);
                break;
        }

}
public void findById(){
        
}
    public static void main(String[] args) {
        do {
            System.out.println(" print employee list");
            System.out.println(" 1. print in array");
            System.out.println(" 2. print in arraylist");
            System.out.println(" 3. print all ");
            System.out.println(" 4. sort in salary");
            System.out.println(" 5. Sort by request");
            System.out.println(" 6. display by Map");
            System.out.println(" 7. Exit");
            System.out.println("Choose options : ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    displayStaffOfArray();
                    break;
                case 2:
                    displayStaffOfArrayList();
                    break;
                case 3:
                    displayList();
                    break;
                case 4:
                    employmentList.sort(new ComparatorSalary());

                    displayList();
                    break;
                case 5:
                   sort();
                   displayList();
                    break;
                case 6:
                    displayMap();
                    break;


            }

        } while (true);

    }
}
