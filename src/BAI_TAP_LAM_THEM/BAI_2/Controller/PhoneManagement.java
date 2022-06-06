package BAI_TAP_LAM_THEM.BAI_2.Controller;

import BAI_TAP_LAM_THEM.BAI_2.Servies.PhoneIMPL;

import java.util.Scanner;

public class PhoneManagement {
    Scanner scanner = new Scanner(System.in);
    PhoneIMPL phoneIMPL = new PhoneIMPL();

    public void displayMainMenu() {
        do {

            System.out.println("1. add new");
            System.out.println("2 .delete");
            System.out.println("3. display list");
            System.out.println("4. search");
            System.out.println("5. exit");
            System.out.println("Choose options : ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    addNew();
                    break;
                case 2:
                    phoneIMPL.delete();
                    break;
                case 3:
                    phoneIMPL.display();
                    break;
                case 4:

                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Please input menu correct again!!!");
            }
        } while (true);

    }

    public void addNew() {
        System.out.println("bạn muốn thêm vào điện thoại loại nào");
        System.out.println(" 1. Thêm bệnh quốc tế");
        System.out.println(" 2. Thêm bệnh nhân chính hãng");
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                phoneIMPL.addXT();
                break;
            case 2:
                phoneIMPL.addCH();
                break;
            default:
                System.out.println("nhập lại 1 hoặc 2");
        }
    }
}
