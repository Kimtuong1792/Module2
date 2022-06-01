package thi_thu.controller;

import thi_thu.service.Customer;
import thi_thu.service.CustomerIMPL;

import java.util.Scanner;

public class CheckManager {
    static Scanner scanner = new Scanner(System.in);
    static Customer customer = new CustomerIMPL();

    public static void mainMenu() {

        do {
            System.out.println("1. add new customer");
            System.out.println("2. display information");
            System.out.println("3. search customer");
            System.out.println("4. add new check");
            System.out.println("5. edit check");
            System.out.println("6. display check");
            System.out.println("7. exit");
            System.out.println(" your choose: ");
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    System.out.println("1. add new customer");
                    addNew();
                    break;
                case "2":
                    System.out.println("2. display information");
                    customer.display();
                    break;
                case "3":
                    System.out.println("3. search customer");
                    customer.search();
                    break;
                case "4":
                    System.out.println("4. add new check");
                    break;
                case "5":
                    System.out.println("5. edit check");
                    break;
                case "6":
                    System.out.println("6. display check");
                    break;
                case "7":
                    System.out.println("7. exit");
                    System.exit(0);
                default:
                    System.out.println("This function is not available, please re-enter");

            }
        } while (true);

    }

    public static void addNew() {
        do {
            System.out.println("1. thêm mới khách VN");

            System.out.println("2. thêm mới khách quốc tế");
            System.out.println("3. return menu");
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    System.out.println(" thêm mới khách VN");
                    customer.addNewVN();
                    break;
                case "2":
                    System.out.println(" thêm mới khách quốc tế");
                    customer.addNewInternational();
                    break;
                case "3":
                    return;
                default:
                    System.out.println(" vui lòng nhập từ 1 hoặc 2");
            }
        } while (true);

    }
}
