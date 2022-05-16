package Bai_tap_them.bai_2;

import java.util.Scanner;

public class TestPerson {
    public static Person[] personList = new Person[100];
    public static int count;
    public static Scanner scanner = new Scanner(System.in);


    static {
        personList[0] = new Teacher(1, "đỗ thị hà", 26, false, 500);
        personList[1] = new Teacher(2, "Đỗ Mỹ Linh", 30, false, 300);
        personList[2] = new Teacher(3, "Nguyễn Tất Lợi", 31, true, 1000);
        personList[3] = new Student(4, "Thiên Minh", 8, true, 8);
        personList[4] = new Student(5, "Bình An", 8, true, 10);
        count = 5;
    }

    public static void displayList() {
        for (Person item : personList) {
            if (item != null) {
                System.out.println(item);
            }

        }
    }

    public static void addPerson() {

        System.out.println("1. add person teacher");
        System.out.println("2. add person student");
        int check = Integer.parseInt(scanner.nextLine());
        switch (check) {
            case 1:

                System.out.println("nhập tên");
                String name = scanner.nextLine();
                System.out.println("nhập tuổi");
                int age = Integer.parseInt(scanner.nextLine());
                System.out.println("giới tính");
                boolean gender = Boolean.parseBoolean(scanner.nextLine());
                System.out.println("nhập Lương");
                double salary = Integer.parseInt(scanner.nextLine());
                Teacher teacher = new Teacher(count + 1, name, age, gender, salary) {
                };
                personList[count] = teacher;
                count++;
                break;

            case 2:
                System.out.println("add person student");
                System.out.println("nhập tên");
                name = scanner.nextLine();
                System.out.println("nhập tuổi");
                age = Integer.parseInt(scanner.nextLine());
                System.out.println("giới tính");
                gender = Boolean.parseBoolean(scanner.nextLine());
                System.out.println("nhập điểm");
                int point = Integer.parseInt(scanner.nextLine());
                Student student = new Student(count + 1, name, age, gender, point) {
                };
                personList[count] = student;
                count++;
                break;
        }
    }

    public static void search() {
        int countCheck = 0;
        System.out.println("nhập tên cần tìm kiếm");
        String check = scanner.nextLine();
        for (Person item : personList) {
            if (item != null && item.getName().contains(check)) {
                System.out.println(item);
                countCheck++;
            }

        }
        System.out.println("số lượng tìm thấy: " + countCheck);
    }

    public static void delete() {
        int temp = 0;
        System.out.println("Nhập id muốn xóa");
        int inputDel = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < personList.length; i++) {
            if (personList[i] != null && personList[i].getId() == inputDel) {

                for (int j = i; j < personList.length && personList[j] != null; j++) {
                    personList[j] = personList[j + 1];
                }
                System.out.println("Xoá thành công");
                temp++;
            }

        }
        if (temp == 0) {
            System.out.println("xóa không thành công");

        }

    }

    public static void update() {

        System.out.println("id bạn muốn sửa");
        int id = Integer.parseInt(scanner.nextLine());
        boolean flag = false;
        int index = 0;
        for (int i = 0; i < personList.length; i++) {
            if (personList[i] != null && personList[i].getId() == id) {
                flag = true;
                index = i;
            }

        }
        if (flag) {
            if (personList[index] instanceof Teacher) {
                Teacher teacher = (Teacher) personList[index];
                System.out.println("nhập tên");
                String name = scanner.nextLine();
                System.out.println("nhập tuổi");
                int age = Integer.parseInt(scanner.nextLine());
                System.out.println("giới tính");
                boolean gender = Boolean.parseBoolean(scanner.nextLine());
                System.out.println("nhập Lương");
                double salary = Integer.parseInt(scanner.nextLine());
                teacher.setName(name);
                teacher.setAge(age);
                teacher.setSalary(salary);
                teacher.setGender(gender);
                System.out.println("update thành công");
            } else {
                Student student = (Student) personList[index];
                System.out.println("nhập tên");
                String name = scanner.nextLine();
                System.out.println("nhập tuổi");
                int age = Integer.parseInt(scanner.nextLine());
                System.out.println("giới tính");
                boolean gender = Boolean.parseBoolean(scanner.nextLine());
                System.out.println("nhập điểm");
                double point = Integer.parseInt(scanner.nextLine());
                student.setName(name);
                student.setAge(age);
                student.setPoint(point);
                student.setGender(gender);
                System.out.println("update thành công");
            }
        } else {
            System.out.println("id ko có");
        }
    }
    public static void main(String[] args) {
        do {
            System.out.println("---------product Management--------");
            System.out.println("1.Display list person list");
            System.out.println("2. Add new person");
            System.out.println("3. Search person");
            System.out.println("4. Delete person");
            System.out.println("5. update person ");
            System.out.println("6. Exit");
            System.out.println("Choose options : ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Display list");
                    displayList();
                    break;
                case 2:
                    System.out.println("Add new person");
                    addPerson();
                    break;
                case 3:
                    System.out.println(" Search person");
                    search();
                    break;
                case 4:
                    System.out.println(" delete person");
                    delete();
                    break;
                case 5:
                    System.out.println("update person");
                    update();
                    break;
                case 6:
                    System.exit(0);
            }

        } while (true);
    }

}
