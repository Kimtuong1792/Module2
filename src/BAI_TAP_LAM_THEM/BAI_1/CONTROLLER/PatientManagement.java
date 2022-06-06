package BAI_TAP_LAM_THEM.BAI_1.CONTROLLER;

import BAI_TAP_LAM_THEM.BAI_1.SERVICES.PatientIMPL;

import java.util.Scanner;

public class PatientManagement {
    static Scanner scanner = new Scanner(System.in);
    PatientIMPL patientIMPL = new PatientIMPL();

    public void displayMainMenu() {
        do {

            System.out.println("1. add new");
            System.out.println("2 .delete");
            System.out.println("3. display list");
            System.out.println("4. exit");
            System.out.println("Choose options : ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    displayList();
                    break;
                case 2:
                    patientIMPL.delete();
                    break;
                case 3:
                    patientIMPL.display();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Please input menu correct again!!!");
            }
        } while (true);

    }

    public void displayList() {
        System.out.println("bạn muốn thêm vào bệnh nhân nào");
        System.out.println(" 1. Thêm bệnh nhân thường");
        System.out.println(" 2. Thêm bệnh nhân VIP");
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                patientIMPL.addNewNomal();
                break;
            case 2:
                patientIMPL.addNewVIP();
                break;
            default:
                System.out.println("nhập lại 1 hoặc 2");
        }
    }

}
