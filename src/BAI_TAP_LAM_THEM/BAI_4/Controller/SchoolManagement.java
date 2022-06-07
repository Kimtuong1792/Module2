package BAI_TAP_LAM_THEM.BAI_4.Controller;

import BAI_TAP_LAM_THEM.BAI_4.Servies.PersonIMPL;

import java.util.Scanner;

public class SchoolManagement {
    static Scanner scanner = new Scanner(System.in);
    PersonIMPL personIMPL = new PersonIMPL();

    public int checkException() {
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
            System.out.println("4. sort");
            System.out.println("5. update ");
            System.out.println("6. exit");
            System.out.println("Choose options : ");
            int choose = checkException();
            switch (choose) {
                case 1:
                    personIMPL.display();
                    break;
                case 2:
                    personIMPL.add();
                    break;
                case 3:
                    personIMPL.delete();
                    break;
                case 4:
                    personIMPL.sort();
                    break;
                case 5:
                    personIMPL.update();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Please input menu correct again!!!");
            }
        } while (true);

    }
}
