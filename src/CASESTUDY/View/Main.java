package CASESTUDY.View;

import CASESTUDY.Controller.FuramaController;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        do {
            FuramaController.displayMainMenu();
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    FuramaController.displayEmployee();
                    break;
                case 2:
                    FuramaController.displayCustomerManagement();
                    break;
                case 3:
                    FuramaController.facilityManagement();
                    break;
                case 4:
                    FuramaController.bookingManagement();
                    break;
                case 5:
                    FuramaController.promotionManagement();
                    break;
                case 6:
                    System.exit(0);


            }
        } while (true);


    }
}
