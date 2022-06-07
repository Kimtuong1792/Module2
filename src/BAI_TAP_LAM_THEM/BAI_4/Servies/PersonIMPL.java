package BAI_TAP_LAM_THEM.BAI_4.Servies;

import java.util.Collections;
import java.util.Scanner;

public class PersonIMPL implements IPerson {
    static Scanner scanner = new Scanner(System.in);
    StudentIMPL studentIMPL = new StudentIMPL();
    TeacherIMPL teacherIMPL = new TeacherIMPL();

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

    @Override
    public void add() {
        do {
            System.out.println("1. Thêm mới Sinh viên");
            System.out.println("2. Thêm mới giáo viên");
            System.out.println("3. Quay lại menu chính");
            int choose = checkException();
            switch (choose) {
                case 1:
                    studentIMPL.addNew();
                    break;
                case 2:
                    teacherIMPL.addNew();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Không có chức năng này!! Bạn chọn lại đi");
            }
        } while (true);
    }


    @Override
    public void display() {
        do {
            System.out.println("1. display strudentList");
            System.out.println("2. display teacherList");
            System.out.println("3. return menu");
            int choose = checkException();
            switch (choose) {
                case 1:
                    studentIMPL.displayList();
                    break;
                case 2:
                    teacherIMPL.displayList();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Không có chức năng này!! Bạn chọn lại đi");
            }
        } while (true);

    }

    @Override
    public void delete() {
        do {
            System.out.println("1. display student");
            System.out.println("2. display teacher");
            System.out.println("3. return menu");
            int choose = checkException();
            switch (choose) {
                case 1:
                    studentIMPL.delete();
                    break;
                case 2:
                    teacherIMPL.delete();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Không có chức năng này!! Bạn chọn lại đi");
            }
        } while (true);


    }

    @Override
    public void sort() {
        do {
            System.out.println("1. sort student");
            System.out.println("2. sort teacher");
            System.out.println("3. return menu");
            int choose = checkException();
            switch (choose) {
                case 1:
                    studentIMPL.sort();
                    break;
                case 2:
                    teacherIMPL.sort();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Không có chức năng này!! Bạn chọn lại đi");
            }
        } while (true);


    }

    @Override
    public void update() {
        do {
            System.out.println("1. update student");
            System.out.println("2. update teacher");
            System.out.println("3. return menu");
            int choose = checkException();
            switch (choose) {
                case 1:
                    studentIMPL.update();
                    break;
                case 2:
                    teacherIMPL.update();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Không có chức năng này!! Bạn chọn lại đi");
            }
        } while (true);

    }
}
