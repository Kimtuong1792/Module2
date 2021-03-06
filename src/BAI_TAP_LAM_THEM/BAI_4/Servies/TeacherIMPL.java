package BAI_TAP_LAM_THEM.BAI_4.Servies;

import BAI_TAP_LAM_THEM.BAI_4.Model.Student;
import BAI_TAP_LAM_THEM.BAI_4.Model.Teacher;
import BAI_TAP_LAM_THEM.BAI_4.Util.NotFoundEmployeeException;
import BAI_TAP_LAM_THEM.BAI_4.Util.ReadAndWrite;
import BAI_TAP_LAM_THEM.BAI_4.Util.RegexData;
import BAI_TAP_LAM_THEM.BAI_4.Util.SortByBirthday;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TeacherIMPL implements ITeacher {
    public static final String REGEX_TIME = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";

    public static final String REGEX_POSITIVE_NUMBER = "[1-9][0-9]*";

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    static Scanner scanner = new Scanner(System.in);
    List<Teacher> teacherList = new ArrayList<>();

    public void readFileTeacher() {
        teacherList.clear();
        List<String[]> listStr = ReadAndWrite.readFile("src\\BAI_TAP_LAM_THEM\\BAI_4\\Data\\teacher.csv");
        for (String[] item : listStr) {
            teacherList.add(new Teacher(Integer.parseInt(item[0]), item[1], item[2], LocalDate.parse(item[3]), item[4], item[5], Double.parseDouble(item[6]), Double.parseDouble(item[7])));
        }
    }

    public void writeFileTeacher() {
        ReadAndWrite.deleteFile("src\\BAI_TAP_LAM_THEM\\BAI_4\\Data\\teacher.csv");
        for (Teacher item : teacherList) {
            String line = item.getInFor();
            ReadAndWrite.writeFile("src\\BAI_TAP_LAM_THEM\\BAI_4\\Data\\teacher.csv", line);
        }
    }

    public String STR() {
        do {
            String check = scanner.nextLine();
            if (check.equals("")) {
                System.out.println("kh??ng ???????c ????? tr???ng");

            } else {
                return check;
            }
        } while (true);
    }

    @Override
    public void displayList() {
        readFileTeacher();
        System.out.println("display personlist");
        for (Teacher item : teacherList) {
            System.out.println(item);
        }

    }

    @Override
    public void addNew() {
        readFileTeacher();
        int id = 1;
        int max = id;

        for (Teacher item : teacherList) {
            if (max < item.getId()) {
                max = item.getId();
            }
        }
        id = max + 1;


        System.out.println("Nh???p h??? v?? t??n");
        String name = STR();
        String gender = gender();

        System.out.println("Nh???p ng??y th??ng n??m sinh");
        LocalDate birthDay = LocalDate.parse(RegexData.regexAge(scanner.nextLine(), REGEX_TIME), formatter);

        System.out.println("Nh???p ?????a ch???");
        String address = STR();

        System.out.println("nh???p l???p d???y");
        String teachingClass = scanner.nextLine();


        System.out.println("nh???p l????ng d???y theo gi???");
        double salary = Double.parseDouble(RegexData.regexStr(scanner.nextLine(), REGEX_POSITIVE_NUMBER, "Gi?? tr??? nh???p ph???i l???n h??n 0"));
        System.out.println("nh???p s??? gi??? d???y");
        double time = Double.parseDouble(RegexData.regexStr(scanner.nextLine(), REGEX_POSITIVE_NUMBER, "Gi?? tr??? nh???p ph???i l???n h??n 0"));

        Teacher teacher = new Teacher(id, name, gender, birthDay, address, teachingClass, salary, time);
        teacherList.add(teacher);
        writeFileTeacher();
        System.out.println("???? th??m m???i th??nh c??ng");
    }

    public String gender() {
        do {
            System.out.println("Ch???n gi???i t??nh");
            System.out.println("1.Nam");
            System.out.println("2.N???");
            System.out.println("3.Gi???i t??nh th??? 3");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    return "Nam";
                case 2:
                    return "N???";
                case 3:
                    return "Gi???i t??nh th??? 3";
                default:
                    System.out.println("B???n ch???n l???i nha!! Sai r???i");
                    gender();
            }
        } while (true);
    }

    @Override
    public void delete() {
        do {
            readFileTeacher();
            System.out.println("Nh???p m?? nh??n vi??n c???n x??a: ");
            int check = Integer.parseInt(scanner.nextLine());
            for (Teacher teacher : teacherList) {
                if (teacher.getId() == check) {
                    System.out.println("B???n c?? mu???n x??a hay kh??ng? 1.Yes ; 2. No");
                    int choose = Integer.parseInt(scanner.nextLine());
                    switch (choose) {
                        case 1:
                            teacherList.remove(teacher);
                            writeFileTeacher();
                            displayList();
                            return;
                        case 2:
                            return;
                        default:
                            System.out.println("Ch???n l???i ??i!!");
                            return;
                    }
                }
            }
            try {
                throw new NotFoundEmployeeException("M?? sinh vi??n kh??ng t???n t???i");
            } catch (NotFoundEmployeeException e) {
                System.out.println(e.getMessage());
            }
        } while (true);
    }

    @Override
    public void sort() {
        readFileTeacher();
        Collections.sort(teacherList, new SortByBirthday());
        displayList();
        writeFileTeacher();
    }

    @Override
    public void update() {
        readFileTeacher();
        System.out.println("Nh???p id mu???n s???a");
        int inputId = Integer.parseInt(scanner.nextLine());
        for (Teacher teacher : teacherList) {
            if (teacher.getId() == inputId) {

                System.out.println("Nh???p h??? v?? t??n");
                String name = scanner.nextLine();
                teacher.setName(name);

                String gender = gender();
                teacher.setGender(gender);

                System.out.println("Nh???p ng??y th??ng n??m sinh");
                LocalDate dateOfBirth = LocalDate.parse(scanner.nextLine());
                teacher.setBirthday(dateOfBirth);

                System.out.println("Nh???p ?????a ch???");
                String address = scanner.nextLine();
                teacher.setAddress(address);

                System.out.println("l???p d???y");
                String teachingclass = scanner.nextLine();
                teacher.setTeachingClass(teachingclass);

                System.out.println("Nh???p l????ng 1 gi???");
                double salary = Double.parseDouble(scanner.nextLine());
                teacher.setSalaryOneHour(salary);
                System.out.println("nh???p s??? gi??? d???y");
                double point = Double.parseDouble(scanner.nextLine());
                teacher.setTime(point);
                System.out.println(teacherList);
            }
        }
        writeFileTeacher();
    }
}
