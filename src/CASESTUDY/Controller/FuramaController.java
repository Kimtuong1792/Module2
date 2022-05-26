package CASESTUDY.Controller;

import java.util.Scanner;

public class FuramaController {
    public static Scanner scanner = new Scanner(System.in);

    public static void displayMainMenu() {
        System.out.println("1.Employee Management");
        System.out.println("2.Customer Management");
        System.out.println("3.Facility Management ");
        System.out.println("4.Booking Management");
        System.out.println("5.Promotion Management");
        System.out.println("6.Exit");
        System.out.println("Choose options : ");
    }

    public static void displayEmployee() {
        System.out.println("1. Display list employees");
        System.out.println("2. Add new employee");
        System.out.println("3. Edit employee");
        System.out.println("4. Return main menu");
        System.out.println("Choose options : ");
        int check = Integer.parseInt(scanner.nextLine());
        switch (check) {
            case 1:
                System.out.println("1. Display list employees");
                break;
            case 2:
                System.out.println("2. Add new employee");
                break;
            case 3:
                System.out.println("3. Edit employee");
                break;
            case 4:
                System.out.println("4. Return main menu");
        }
    }

    public static void displayCustomerManagement() {
        System.out.println("1. Display list customers");
        System.out.println("2. Add new customer");
        System.out.println("3. Edit customer");
        System.out.println("4. Return main menu");
        System.out.println("Choose options : ");
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                System.out.println("1. Display list customers");
                break;
            case 2:
                System.out.println("2. Add new customer");
                break;
            case 3:
                System.out.println("3. Edit customer");
                break;
            case 4:
                System.out.println("4. Return main menu");

        }
    }
    public static void facilityManagement(){
        System.out.println("1. Display list facility");
        System.out.println("2. Add new facility");
        System.out.println("3. Display list facility maintenance");
        System.out.println("4. Return main menu");
        System.out.println("Choose options : ");
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose){
            case 1:
                System.out.println("1. Display list facility");
                break;
            case 2:
                System.out.println("2. Add new facility");
                break;
            case 3:
                System.out.println("3. Display list facility maintenance");
                break;
            case 4:
                System.out.println("4. Return main menu");
                break;

        }
    }
    public static void bookingManagement(){
        System.out.println("1. Add new booking");
        System.out.println("2. Display list booking");
        System.out.println("3. Create new contracts");
        System.out.println("4. Display list contracts");
        System.out.println("5. Edit contracts");
        System.out.println("6. Return main menu");
        System.out.println("Choose options : ");
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose){
            case 1:
                System.out.println("1. Add new booking");
                break;
            case 2:
                System.out.println("2. Display list booking");
                break;
            case 3:
                System.out.println("3. Create new contracts");
                break;
            case 4:
                System.out.println("4. Display list contracts");
                break;
            case 5:
                System.out.println("5. Edit contracts");
                break;
            case 6:
                System.out.println("6. Return main menu");
        }
    }
    public static void  promotionManagement(){
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose){
            case 1:
                System.out.println("1. Display list customers use service");
                break;
            case 2:
                System.out.println("2. Display list customers get voucher");
                break;
            case 3:
                System.out.println("3. Return main menu");
                break;
        }
    }
}

