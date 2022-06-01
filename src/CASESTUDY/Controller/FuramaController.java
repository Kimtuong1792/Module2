package CASESTUDY.Controller;

import CASESTUDY.Services.EmployeeService;
import CASESTUDY.Services.IMPL.CustomerServiceImpl;
import CASESTUDY.Services.IMPL.EmploymentServiceImpl;
import CASESTUDY.Services.IMPL.FacilityServiceImpl;

import java.util.Scanner;

public class FuramaController {
    public Scanner scanner = new Scanner(System.in);

    public EmploymentServiceImpl employmentService = new EmploymentServiceImpl();
    public CustomerServiceImpl customerService = new CustomerServiceImpl();
    public FacilityServiceImpl facilityService = new FacilityServiceImpl();


    public void displayMainMenu() {
        do{
        System.out.println("1.Employee Management");
        System.out.println("2.Customer Management");
        System.out.println("3.Facility Management ");
        System.out.println("4.Booking Management");
        System.out.println("5.Promotion Management");
        System.out.println("6.Exit");
        System.out.println("Choose options : ");
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
               displayEmployee();
                break;
            case 2:
               displayCustomerManagement();
                break;
            case 3:
                facilityManagement();
                break;
            case 4:
                bookingManagement();
                break;
            case 5:
                promotionManagement();
                break;
            case 6:
                System.exit(0);
            default:
                System.out.println("Please input menu correct again!!!");
        }
    } while (true);

}

    public void displayEmployee() {
        do {
            System.out.println("1. Display list employees");
            System.out.println("2. Add new employee");
            System.out.println("3. Edit employee");
            System.out.println("4. Return main menu");
            System.out.println("Choose options : ");
            int check = Integer.parseInt(scanner.nextLine());
            switch (check) {
                case 1:
                    System.out.println("1. Display list employees");
                    employmentService.display();
                    break;
                case 2:
                    System.out.println("2. Add new employee");
                    employmentService.addNew();
                    employmentService.display();
                    break;
                case 3:
                    System.out.println("3. Edit employee");
                    employmentService.edit();
                    employmentService.display();
                    break;
                case 4:
                    System.out.println("4. Return main menu");
                    displayMainMenu();
            }
        } while (true);
    }


    public void displayCustomerManagement() {
        do {
            System.out.println("1. Display list customers");
            System.out.println("2. Add new customer");
            System.out.println("3. Edit customer");
            System.out.println("4. Return main menu");
            System.out.println("Choose options : ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("1. Display list customers");
                    customerService.display();
                    break;
                case 2:
                    System.out.println("2. Add new customer");
                    customerService.addNew();
                    customerService.display();
                    break;
                case 3:
                    System.out.println("3. Edit customer");
                    customerService.edit();
                    customerService.display();
                    break;
                case 4:
                    System.out.println("4. Return main menu");
                    displayMainMenu();

            }
        } while (true);
    }

    public void facilityManagement() {
        System.out.println("1. Display list facility");
        System.out.println("2. Add new facility");
        System.out.println("3. Display list facility maintenance");
        System.out.println("4. Return main menu");
        System.out.println("Choose options : ");
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                System.out.println("1. Display list facility");
                facilityService.display();
                break;
            case 2:
                System.out.println("2. Add new facility");
                facilityMenu();
                break;
            case 3:
                System.out.println("3. Display list facility maintenance");
                break;
            case 4:
                System.out.println("4. Return main menu");
                displayMainMenu();
                break;

        }
    }

    public void facilityMenu() {
        System.out.println("1. add new Villa");
        System.out.println("2. Add new house");
        System.out.println("3. Add new room");
        System.out.println("4. Return main menu");
        System.out.println("Choose options : ");
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                System.out.println("1. add new Villa");
                facilityService.addNewVilla();
                facilityMenu();
                break;
            case 2:
                System.out.println("2. Add new house");
                facilityService.addNewHouse();
                break;
            case 3:
                System.out.println("3. Add new room");
                facilityService.addNewRoom();
                break;
            case 4:
                System.out.println("4. Return main menu");
                facilityManagement();
                break;

        }
    }


    public void bookingManagement() {
        System.out.println("1. Add new booking");
        System.out.println("2. Display list booking");
        System.out.println("3. Create new contracts");
        System.out.println("4. Display list contracts");
        System.out.println("5. Edit contracts");
        System.out.println("6. Return main menu");
        System.out.println("Choose options : ");
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
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

    public void promotionManagement() {
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
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

