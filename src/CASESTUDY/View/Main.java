package CASESTUDY.View;

import CASESTUDY.Controller.FuramaController;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        FuramaController furamaController = new FuramaController();

        do {
            furamaController.displayMainMenu();
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    furamaController.displayEmployee();
                    break;
                case 2:
                    furamaController.displayCustomerManagement();
                    break;
                case 3:
                    furamaController.facilityManagement();
                    break;
                case 4:
                    furamaController.bookingManagement();
                    break;
                case 5:
                    furamaController.promotionManagement();
                    break;
                case 6:
                    System.exit(0);


            }
        } while (true);


    }
}
