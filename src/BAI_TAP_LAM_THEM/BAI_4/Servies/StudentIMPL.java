package BAI_TAP_LAM_THEM.BAI_4.Servies;


import BAI_TAP_LAM_THEM.BAI_4.Model.Student;
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

public class StudentIMPL implements IStudent {
    public static final String REGEX_TIME = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
    public static final String REGEX_MSV = "^\\d{8}$";


    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    static Scanner scanner = new Scanner(System.in);
    List<Student> studentList = new ArrayList<>();

    public void readFileStudent() {
        studentList.clear();
        List<String[]> listStr = ReadAndWrite.readFile("src\\BAI_TAP_LAM_THEM\\BAI_4\\Data\\student.csv");
        for (String[] item : listStr) {
            studentList.add(new Student(Integer.parseInt(item[0]), item[1], item[2], LocalDate.parse(item[3]), item[4], Integer.parseInt(item[5]), Double.parseDouble(item[6])));
        }
    }

    public void writeFileStudent() {
        ReadAndWrite.deleteFile("src\\BAI_TAP_LAM_THEM\\BAI_4\\Data\\student.csv");
        for (Student item : studentList) {
            String line = item.getInFor();
            ReadAndWrite.writeFile("src\\BAI_TAP_LAM_THEM\\BAI_4\\Data\\student.csv", line);
        }
    }

    @Override
    public void displayList() {
        readFileStudent();
        System.out.println("display personlist");
        for (Student student : studentList) {
            System.out.println(student);
        }

    }

    @Override
    public void addNew() {
        readFileStudent();
        int id = 0;
        int max = id;

        for (Student student : studentList) {
            if (max < student.getId()) {
                max = student.getId();
            }

        }
        id = max +1;


        System.out.println("Nhập họ và tên");
        String name = check1();
        String gender = gender();

        System.out.println("Nhập ngày tháng năm sinh");
        LocalDate birthDay = LocalDate.parse(RegexData.regexAge(scanner.nextLine(), REGEX_TIME), formatter);

        System.out.println("Nhập địa chỉ");
        String address = check1();

        System.out.println("nhập Mã SV");
        int studentCode;

        boolean checkCode;
        do {
            checkCode = false;
            studentCode = Integer.parseInt(RegexData.regexStr(scanner.nextLine(), REGEX_MSV, "mã sinh viên phải 8 số"));

            for (Student item : studentList) {
                if(item.getStudentCode() == studentCode){
                    System.out.println("mã sinh viên bị trùng");
                    checkCode = true;
                }
            }
        } while (checkCode);

        System.out.println("nhập điểm trung bình");
        double mediumScore = point();


        Student student = new Student(id, name, gender, birthDay, address, studentCode, mediumScore);
        studentList.add(student);
        writeFileStudent();

        System.out.println("Đã thêm mới thành công");

    }

    public String check1(){
        do {
            String check = scanner.nextLine();
            if (check.equals("")) {
                System.out.println("không được để trống");

            }else {
                return check;
            }
        } while (true);
    }

    public Double point() {

        do {
            double mediumScore = Double.parseDouble(scanner.nextLine());
            if (mediumScore > 10 || mediumScore < 0) {
                System.out.println("nhập lại điểm ");

            }else {
                return mediumScore;
            }
        } while (true);
    }

    public String gender() {
        do {
            System.out.println("Chọn giới tính");
            System.out.println("1.Nam");
            System.out.println("2.Nữ");
            System.out.println("3.Giới tính thứ 3");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    return "Nam";
                case 2:
                    return "Nữ";
                case 3:
                    return "Giới tính thứ 3";
                default:
                    System.out.println("Bạn chọn lại nha!! Sai rồi");
                    gender();
            }
        } while (true);
    }

    @Override
    public void delete() {

        do {
            readFileStudent();
            System.out.println("Nhập mã nhân viên cần xóa: ");
            int check = Integer.parseInt(scanner.nextLine());
            for (Student student : studentList) {
                if (student.getId() == check) {
                    System.out.println("Bạn có muốn xóa hay không? 1.Yes ; 2. No");
                    int choose = Integer.parseInt(scanner.nextLine());
                    switch (choose) {
                        case 1:
                            studentList.remove(student);
                            writeFileStudent();
                            displayList();
                            return;
                        case 2:
                            return;
                        default:
                            System.out.println("Chọn lại đi!!");
                            return;
                    }
                }
            }
            try {
                throw new NotFoundEmployeeException("Mã sinh viên không tồn tại");
            } catch (NotFoundEmployeeException e) {
                System.out.println(e.getMessage());
            }
        } while (true);
    }


    @Override
    public void sort() {
        readFileStudent();
        Collections.sort(studentList,new SortByBirthday());
        displayList();
        writeFileStudent();

    }

    @Override
    public void update() {
        readFileStudent();
        System.out.println("Nhập id muốn sửa");
        int inputId = Integer.parseInt(scanner.nextLine());
        for (Student student : studentList) {
            if (student.getId() == inputId) {
                System.out.println("Nhập họ và tên");
                String name = scanner.nextLine();
                student.setName(name);

                String gender = gender();
                student.setGender(gender);

                System.out.println("Nhập ngày tháng năm sinh");
                LocalDate dateOfBirth = LocalDate.parse(scanner.nextLine());
                student.setBirthday(dateOfBirth);

                System.out.println("Nhập địa chỉ");
                String address = scanner.nextLine();
                student.setAddress(address);

                System.out.println("Nhập mã sinh viên");
                int studentCode = Integer.parseInt(scanner.nextLine());
                student.setStudentCode(studentCode);

                System.out.println("Nhập trung bình");
                double point = Double.parseDouble(scanner.nextLine());
                student.setMediumScore(point);

                System.out.println(studentList);
            }
        }
        writeFileStudent();
    }
}
