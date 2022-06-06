package BAI_TAP_LAM_THEM.BAI_3.Servies;

import BAI_TAP_LAM_THEM.BAI_3.Model.ManagementStaff;
import BAI_TAP_LAM_THEM.BAI_3.Model.Person;
import BAI_TAP_LAM_THEM.BAI_3.Model.ProductionStaff;
import BAI_TAP_LAM_THEM.BAI_3.util.NotFoundEmployeeException;
import BAI_TAP_LAM_THEM.BAI_3.util.ReadAndWrite;
import BAI_TAP_LAM_THEM.BAI_3.util.RegexData;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonServiceIMPL implements IPersonService {
    static Scanner scanner = new Scanner(System.in);
    List<Person> personList = new ArrayList<>();
    public static final String REGEX_TIME = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
    public static final String REGEX_MANAGER = "^NVQL-\\d{3}$";
    public static final String REGEX_PRODUCE = "^NVSX-\\d{3}$";
    public static final String REGEX_POSITIVE_NUMBER = "[1-9][0-9]*";

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public void readFile() {
        personList.clear();
        List<String[]> listStr = ReadAndWrite.readFile("src\\BAI_TAP_LAM_THEM\\BAI_3\\data\\nhan_vien.csv");
        for (String[] item : listStr) {
            if (item[1].substring(0,4).equals("NVQL")) {
                personList.add(new ManagementStaff(Integer.parseInt(item[0]), item[1], item[2], LocalDate.parse(item[3]), item[4], Double.parseDouble(item[5]),
                        Double.parseDouble(item[6])));
            } else if (item[1].substring(0,4).equals("NVSX")){
                personList.add(new ProductionStaff(Integer.parseInt(item[0]), item[1], item[2], LocalDate.parse(item[3]), item[4], Integer.parseInt(item[5]),
                        Double.parseDouble(item[6])));
            }
        }
    }
    public void writeFile() {
        ReadAndWrite.deleteFile("src\\BAI_TAP_LAM_THEM\\BAI_3\\data\\nhan_vien.csv");
        for (Person item : personList) {
            String line = item.getInFor();
            ReadAndWrite.writeFile("src\\BAI_TAP_LAM_THEM\\BAI_3\\data\\nhan_vien.csv", line);
        }
    }

    @Override
    public void addNewProduct() {
        readFile();

//        int id = personList.get(personList.size()-1).getId() + 1;

        int id = 1;
        int max = id;

        for (int i = 0; i < personList.size(); i++) {
            if (max < personList.get(i).getId()) {
                max= personList.get(i).getId();
            }
        }

        id = max + 1;
//        if (personList.size() == 0) {
//            id = 1;
//        } else {
//            for (int i = 1; i < personList.size(); i++) {
//                if (personList.get(i).getId() > max) {
//                    max = personList.get(i).getId();
//                }
//            }
//            id = max + 1;
//        }

        System.out.println("Nhập mã nhân viên");
        String employeeCode = RegexData.regexStr(scanner.nextLine(),REGEX_PRODUCE,"Nhập theo định dạng NVSX-XXX");

        System.out.println("Nhập họ và tên");
        String name = scanner.nextLine();

        System.out.println("Nhập ngày tháng năm sinh");
       LocalDate birthDay = LocalDate.parse(RegexData.regexAge(scanner.nextLine(),REGEX_TIME),formatter);

        System.out.println("Nhập địa chỉ");
        String address = scanner.nextLine();

        System.out.println("Nhập số sản phẩm");
        int productNumber = Integer.parseInt(RegexData.regexStr(scanner.nextLine(),REGEX_POSITIVE_NUMBER,"Giá trị nhập phải lớn hơn 0"));

        System.out.println("Nhập giá");
        double price = Double.parseDouble(RegexData.regexStr(scanner.nextLine(),REGEX_POSITIVE_NUMBER,"Giá trị nhập phải lớn hơn 0"));

        ProductionStaff productionStaff = new ProductionStaff(id, employeeCode, name,birthDay, address, productNumber, price);
        personList.add(productionStaff);
        writeFile();
        System.out.println("Đã thêm mới thành công");

    }

    @Override
    public void addNewManagement() {
        readFile();
        int id = 1;
        int max = id;

        for (int i = 0; i < personList.size(); i++) {
            if (max < personList.get(i).getId()) {
                max= personList.get(i).getId();
            }
        }

        System.out.println("Nhập mã nhân viên");
        String employeeCode = RegexData.regexStr(scanner.nextLine(),REGEX_MANAGER,"Nhập theo định dạng NVQL-XXX");

        System.out.println("Nhập họ và tên");
        String name = scanner.nextLine();

        System.out.println("Nhập ngày tháng năm sinh");
        LocalDate birthDay = LocalDate.parse(RegexData.regexAge(scanner.nextLine(),REGEX_TIME),formatter);

        System.out.println("Nhập địa chỉ");
        String address = scanner.nextLine();

        System.out.println("Nhập lương cơ bản");
        double wage = Double.parseDouble(RegexData.regexStr(scanner.nextLine(),REGEX_POSITIVE_NUMBER,"Giá trị nhập phải lớn hơn 0"));

        System.out.println("Nhập hệ số lương");
        double coefficientsSalary = Double.parseDouble(RegexData.regexStr(scanner.nextLine(),REGEX_POSITIVE_NUMBER,"Giá trị nhập phải lớn hơn 0"));

        ManagementStaff managementStaff = new ManagementStaff(id, employeeCode, name, birthDay, address, wage, coefficientsSalary);
        personList.add(managementStaff);
        writeFile();
        System.out.println("Đã thêm mới thành công");

    }

    @Override
    public void display() {
        readFile();
        System.out.println("display personlist");
        for (Person item: personList) {
            System.out.println(item);
        }
    }

    @Override
    public void search() {
        readFile();
        System.out.println("Nhập tên muốn tìm kiếm");
        String inputName = scanner.nextLine();
        for (Person person : personList) {
            if (person.getEmployeeCode().contains(inputName)) {
                System.out.println("Tên cần tìm:" + person);
            }
        }
        System.out.println("Không tìm thấy tên này");
    }

    @Override
    public void delete() {
        do {
            readFile();
            System.out.println("Nhập mã nhân viên cần xóa: ");
            String inputEmployeeCode = scanner.nextLine();
            for (Person person : personList) {
                if (person.getEmployeeCode().equals(inputEmployeeCode)) {
                    System.out.println("Bạn có muốn xóa hay không? 1.Yes ; 2. No");
                    int choose = Integer.parseInt(scanner.nextLine());
                    switch (choose) {
                        case 1:
                            personList.remove(person);
                            writeFile();
                            display();
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
                throw new NotFoundEmployeeException("Mã nhân viên không tồn tại");
            } catch (NotFoundEmployeeException e) {
                System.out.println(e.getMessage());
            }
        } while (true);
    }
}
