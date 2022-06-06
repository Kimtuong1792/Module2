package BAI_TAP_LAM_THEM.BAI_3.Controller;

import BAI_TAP_LAM_THEM.BAI_3.Servies.PersonServiceIMPL;

import java.util.Scanner;

public class ABCManagement {
    static Scanner scanner = new Scanner(System.in);
    static PersonServiceIMPL personServiceIMPL = new PersonServiceIMPL();

    public static int checkException() {
        boolean check = false;
        int inputChoose = 0;
        do {
            try {
                inputChoose = Integer.parseInt(scanner.nextLine());
                check = false;
            } catch (NumberFormatException e) {
                System.out.println("Bạn đã nhập sai định dạng, vui lòng nhập lại: ");
                check = true;
            }
        } while (check);
        return inputChoose;
    }

    public void displayMainMenu() {
        do {

            System.out.println("1. display list");
            System.out.println("2. Add new");
            System.out.println("3. delete ");
            System.out.println("4. search");
            System.out.println("5. exit");
            System.out.println("Choose options : ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    personServiceIMPL.display();
                    break;
                case 2:
                    add();
                    break;
                case 3:
                    personServiceIMPL.delete();
                    break;
                case 4:
                    personServiceIMPL.search();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Please input menu correct again!!!");
            }
        } while (true);

    }

    public void add() {

        do {
            System.out.println("1. Thêm mới nhân viên quản lý");
            System.out.println("2. Thêm mới nhân viên sản xuất");
            System.out.println("3. Quay lại menu chính");
            int choose = checkException();
            switch (choose) {
                case 1:
                    personServiceIMPL.addNewManagement();
                    break;
                case 2:
                    personServiceIMPL.addNewProduct();
                    break;
                case 3:
                    displayMainMenu();
                default:
                    System.out.println("Không có chức năng này!! Bạn chọn lại đi");
            }
        } while (true);
    }

}
